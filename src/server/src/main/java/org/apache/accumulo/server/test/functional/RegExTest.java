package org.apache.accumulo.server.test.functional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.accumulo.core.Constants;
import org.apache.accumulo.core.client.BatchScanner;
import org.apache.accumulo.core.client.BatchWriter;
import org.apache.accumulo.core.client.Scanner;
import org.apache.accumulo.core.client.ScannerBase;
import org.apache.accumulo.core.data.Key;
import org.apache.accumulo.core.data.Mutation;
import org.apache.accumulo.core.data.Range;
import org.apache.accumulo.core.data.Value;
import org.apache.hadoop.io.Text;

public class RegExTest extends FunctionalTest {
  
  @Override
  public void cleanup() {}
  
  @Override
  public Map<String,String> getInitialConfig() {
    return Collections.emptyMap();
  }
  
  @Override
  public List<TableSetup> getTablesToCreate() {
    TableSetup ts = new TableSetup("ret");
    return Collections.singletonList(ts);
  }
  
  @Override
  public void run() throws Exception {
    BatchWriter bw = getConnector().createBatchWriter("ret", 100000l, 60l, 1);
    
    ArrayList<Character> chars = new ArrayList<Character>();
    for (char c = 'a'; c <= 'z'; c++)
      chars.add(c);
    
    for (char c = '0'; c <= '9'; c++)
      chars.add(c);
    
    // insert some data into accumulo
    for (Character rc : chars) {
      Mutation m = new Mutation(new Text("r" + rc));
      for (Character cfc : chars) {
        for (Character cqc : chars) {
          Value v = new Value(("v" + rc + cfc + cqc).getBytes());
          m.put(new Text("cf" + cfc), new Text("cq" + cqc), v);
        }
      }
      
      bw.addMutation(m);
    }
    
    bw.close();
    
    runTest1();
    runTest2();
    runTest3();
    runTest4();
    runTest5();
    
  }
  
  private void check(String regex, String val) throws Exception {
    if (regex != null && !val.matches(regex)) throw new Exception(" " + val + " does not match " + regex);
  }
  
  private void check(String regex, Text val) throws Exception {
    check(regex, val.toString());
  }
  
  private void check(String regex, Value val) throws Exception {
    check(regex, val.toString());
  }
  
  private void runTest1() throws Exception {
    // try setting all regex
    Range range = new Range(new Text("rf"), true, new Text("rl"), true);
    runTest(range, "r[g-k]", "cf[1-5]", "cq[x-z]", "v[g-k][1-5][t-y]", 5 * 5 * (3 - 1));
  }
  
  private void runTest2() throws Exception {
    // try setting only a row regex
    Range range = new Range(new Text("rf"), true, new Text("rl"), true);
    runTest(range, "r[g-k]", null, null, null, 5 * 36 * 36);
  }
  
  private void runTest3() throws Exception {
    // try setting only a col fam regex
    Range range = new Range((Key) null, (Key) null);
    runTest(range, null, "cf[a-f]", null, null, 36 * 6 * 36);
  }
  
  private void runTest4() throws Exception {
    // try setting only a col qual regex
    Range range = new Range((Key) null, (Key) null);
    runTest(range, null, null, "cq[1-7]", null, 36 * 36 * 7);
  }
  
  private void runTest5() throws Exception {
    // try setting only a value regex
    Range range = new Range((Key) null, (Key) null);
    runTest(range, null, null, null, "v[a-c][d-f][g-i]", 3 * 3 * 3);
  }
  
  private void runTest(Range range, String rowRegEx, String cfRegEx, String cqRegEx, String valRegEx, int expected) throws Exception {
    
    Scanner s = getConnector().createScanner("ret", Constants.NO_AUTHS);
    s.setRange(range);
    setRegexs(s, rowRegEx, cfRegEx, cqRegEx, valRegEx);
    runTest(s, rowRegEx, cfRegEx, cqRegEx, valRegEx, expected);
    
    BatchScanner bs = getConnector().createBatchScanner("ret", Constants.NO_AUTHS, 1);
    bs.setRanges(Collections.singletonList(range));
    setRegexs(bs, rowRegEx, cfRegEx, cqRegEx, valRegEx);
    runTest(bs, rowRegEx, cfRegEx, cqRegEx, valRegEx, expected);
    bs.close();
  }
  
  private void setRegexs(ScannerBase scanner, String rowRegEx, String cfRegEx, String cqRegEx, String valRegEx) {
    if (rowRegEx != null) scanner.setRowRegex(rowRegEx);
    if (cfRegEx != null) scanner.setColumnFamilyRegex(cfRegEx);
    if (cqRegEx != null) scanner.setColumnQualifierRegex(cqRegEx);
    if (valRegEx != null) scanner.setValueRegex(valRegEx);
  }
  
  private void runTest(Iterable<Entry<Key,Value>> scanner, String rowRegEx, String cfRegEx, String cqRegEx, String valRegEx, int expected) throws Exception {
    
    int counter = 0;
    
    for (Entry<Key,Value> entry : scanner) {
      Key k = entry.getKey();
      
      check(rowRegEx, k.getRow());
      check(cfRegEx, k.getColumnFamily());
      check(cqRegEx, k.getColumnQualifier());
      check(valRegEx, entry.getValue());
      
      counter++;
    }
    
    if (counter != expected) {
      throw new Exception("scan did not return the expected number of entries " + counter + " " + expected);
    }
  }
}