/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.accumulo.cloudtrace.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all") public class RemoteSpan implements org.apache.thrift.TBase<RemoteSpan, RemoteSpan._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RemoteSpan");

  private static final org.apache.thrift.protocol.TField SENDER_FIELD_DESC = new org.apache.thrift.protocol.TField("sender", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SVC_FIELD_DESC = new org.apache.thrift.protocol.TField("svc", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TRACE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("traceId", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField SPAN_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("spanId", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField PARENT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("parentId", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField START_FIELD_DESC = new org.apache.thrift.protocol.TField("start", org.apache.thrift.protocol.TType.I64, (short)6);
  private static final org.apache.thrift.protocol.TField STOP_FIELD_DESC = new org.apache.thrift.protocol.TField("stop", org.apache.thrift.protocol.TType.I64, (short)7);
  private static final org.apache.thrift.protocol.TField DESCRIPTION_FIELD_DESC = new org.apache.thrift.protocol.TField("description", org.apache.thrift.protocol.TType.STRING, (short)8);
  private static final org.apache.thrift.protocol.TField DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("data", org.apache.thrift.protocol.TType.MAP, (short)9);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RemoteSpanStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RemoteSpanTupleSchemeFactory());
  }

  public String sender; // required
  public String svc; // required
  public long traceId; // required
  public long spanId; // required
  public long parentId; // required
  public long start; // required
  public long stop; // required
  public String description; // required
  public Map<String,String> data; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SENDER((short)1, "sender"),
    SVC((short)2, "svc"),
    TRACE_ID((short)3, "traceId"),
    SPAN_ID((short)4, "spanId"),
    PARENT_ID((short)5, "parentId"),
    START((short)6, "start"),
    STOP((short)7, "stop"),
    DESCRIPTION((short)8, "description"),
    DATA((short)9, "data");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // SENDER
          return SENDER;
        case 2: // SVC
          return SVC;
        case 3: // TRACE_ID
          return TRACE_ID;
        case 4: // SPAN_ID
          return SPAN_ID;
        case 5: // PARENT_ID
          return PARENT_ID;
        case 6: // START
          return START;
        case 7: // STOP
          return STOP;
        case 8: // DESCRIPTION
          return DESCRIPTION;
        case 9: // DATA
          return DATA;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __TRACEID_ISSET_ID = 0;
  private static final int __SPANID_ISSET_ID = 1;
  private static final int __PARENTID_ISSET_ID = 2;
  private static final int __START_ISSET_ID = 3;
  private static final int __STOP_ISSET_ID = 4;
  private BitSet __isset_bit_vector = new BitSet(5);
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SENDER, new org.apache.thrift.meta_data.FieldMetaData("sender", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SVC, new org.apache.thrift.meta_data.FieldMetaData("svc", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TRACE_ID, new org.apache.thrift.meta_data.FieldMetaData("traceId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.SPAN_ID, new org.apache.thrift.meta_data.FieldMetaData("spanId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.PARENT_ID, new org.apache.thrift.meta_data.FieldMetaData("parentId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.START, new org.apache.thrift.meta_data.FieldMetaData("start", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.STOP, new org.apache.thrift.meta_data.FieldMetaData("stop", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.DESCRIPTION, new org.apache.thrift.meta_data.FieldMetaData("description", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DATA, new org.apache.thrift.meta_data.FieldMetaData("data", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RemoteSpan.class, metaDataMap);
  }

  public RemoteSpan() {
  }

  public RemoteSpan(
    String sender,
    String svc,
    long traceId,
    long spanId,
    long parentId,
    long start,
    long stop,
    String description,
    Map<String,String> data)
  {
    this();
    this.sender = sender;
    this.svc = svc;
    this.traceId = traceId;
    setTraceIdIsSet(true);
    this.spanId = spanId;
    setSpanIdIsSet(true);
    this.parentId = parentId;
    setParentIdIsSet(true);
    this.start = start;
    setStartIsSet(true);
    this.stop = stop;
    setStopIsSet(true);
    this.description = description;
    this.data = data;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RemoteSpan(RemoteSpan other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetSender()) {
      this.sender = other.sender;
    }
    if (other.isSetSvc()) {
      this.svc = other.svc;
    }
    this.traceId = other.traceId;
    this.spanId = other.spanId;
    this.parentId = other.parentId;
    this.start = other.start;
    this.stop = other.stop;
    if (other.isSetDescription()) {
      this.description = other.description;
    }
    if (other.isSetData()) {
      Map<String,String> __this__data = new HashMap<String,String>();
      for (Map.Entry<String, String> other_element : other.data.entrySet()) {

        String other_element_key = other_element.getKey();
        String other_element_value = other_element.getValue();

        String __this__data_copy_key = other_element_key;

        String __this__data_copy_value = other_element_value;

        __this__data.put(__this__data_copy_key, __this__data_copy_value);
      }
      this.data = __this__data;
    }
  }

  public RemoteSpan deepCopy() {
    return new RemoteSpan(this);
  }

  @Override
  public void clear() {
    this.sender = null;
    this.svc = null;
    setTraceIdIsSet(false);
    this.traceId = 0;
    setSpanIdIsSet(false);
    this.spanId = 0;
    setParentIdIsSet(false);
    this.parentId = 0;
    setStartIsSet(false);
    this.start = 0;
    setStopIsSet(false);
    this.stop = 0;
    this.description = null;
    this.data = null;
  }

  public String getSender() {
    return this.sender;
  }

  public RemoteSpan setSender(String sender) {
    this.sender = sender;
    return this;
  }

  public void unsetSender() {
    this.sender = null;
  }

  /** Returns true if field sender is set (has been assigned a value) and false otherwise */
  public boolean isSetSender() {
    return this.sender != null;
  }

  public void setSenderIsSet(boolean value) {
    if (!value) {
      this.sender = null;
    }
  }

  public String getSvc() {
    return this.svc;
  }

  public RemoteSpan setSvc(String svc) {
    this.svc = svc;
    return this;
  }

  public void unsetSvc() {
    this.svc = null;
  }

  /** Returns true if field svc is set (has been assigned a value) and false otherwise */
  public boolean isSetSvc() {
    return this.svc != null;
  }

  public void setSvcIsSet(boolean value) {
    if (!value) {
      this.svc = null;
    }
  }

  public long getTraceId() {
    return this.traceId;
  }

  public RemoteSpan setTraceId(long traceId) {
    this.traceId = traceId;
    setTraceIdIsSet(true);
    return this;
  }

  public void unsetTraceId() {
    __isset_bit_vector.clear(__TRACEID_ISSET_ID);
  }

  /** Returns true if field traceId is set (has been assigned a value) and false otherwise */
  public boolean isSetTraceId() {
    return __isset_bit_vector.get(__TRACEID_ISSET_ID);
  }

  public void setTraceIdIsSet(boolean value) {
    __isset_bit_vector.set(__TRACEID_ISSET_ID, value);
  }

  public long getSpanId() {
    return this.spanId;
  }

  public RemoteSpan setSpanId(long spanId) {
    this.spanId = spanId;
    setSpanIdIsSet(true);
    return this;
  }

  public void unsetSpanId() {
    __isset_bit_vector.clear(__SPANID_ISSET_ID);
  }

  /** Returns true if field spanId is set (has been assigned a value) and false otherwise */
  public boolean isSetSpanId() {
    return __isset_bit_vector.get(__SPANID_ISSET_ID);
  }

  public void setSpanIdIsSet(boolean value) {
    __isset_bit_vector.set(__SPANID_ISSET_ID, value);
  }

  public long getParentId() {
    return this.parentId;
  }

  public RemoteSpan setParentId(long parentId) {
    this.parentId = parentId;
    setParentIdIsSet(true);
    return this;
  }

  public void unsetParentId() {
    __isset_bit_vector.clear(__PARENTID_ISSET_ID);
  }

  /** Returns true if field parentId is set (has been assigned a value) and false otherwise */
  public boolean isSetParentId() {
    return __isset_bit_vector.get(__PARENTID_ISSET_ID);
  }

  public void setParentIdIsSet(boolean value) {
    __isset_bit_vector.set(__PARENTID_ISSET_ID, value);
  }

  public long getStart() {
    return this.start;
  }

  public RemoteSpan setStart(long start) {
    this.start = start;
    setStartIsSet(true);
    return this;
  }

  public void unsetStart() {
    __isset_bit_vector.clear(__START_ISSET_ID);
  }

  /** Returns true if field start is set (has been assigned a value) and false otherwise */
  public boolean isSetStart() {
    return __isset_bit_vector.get(__START_ISSET_ID);
  }

  public void setStartIsSet(boolean value) {
    __isset_bit_vector.set(__START_ISSET_ID, value);
  }

  public long getStop() {
    return this.stop;
  }

  public RemoteSpan setStop(long stop) {
    this.stop = stop;
    setStopIsSet(true);
    return this;
  }

  public void unsetStop() {
    __isset_bit_vector.clear(__STOP_ISSET_ID);
  }

  /** Returns true if field stop is set (has been assigned a value) and false otherwise */
  public boolean isSetStop() {
    return __isset_bit_vector.get(__STOP_ISSET_ID);
  }

  public void setStopIsSet(boolean value) {
    __isset_bit_vector.set(__STOP_ISSET_ID, value);
  }

  public String getDescription() {
    return this.description;
  }

  public RemoteSpan setDescription(String description) {
    this.description = description;
    return this;
  }

  public void unsetDescription() {
    this.description = null;
  }

  /** Returns true if field description is set (has been assigned a value) and false otherwise */
  public boolean isSetDescription() {
    return this.description != null;
  }

  public void setDescriptionIsSet(boolean value) {
    if (!value) {
      this.description = null;
    }
  }

  public int getDataSize() {
    return (this.data == null) ? 0 : this.data.size();
  }

  public void putToData(String key, String val) {
    if (this.data == null) {
      this.data = new HashMap<String,String>();
    }
    this.data.put(key, val);
  }

  public Map<String,String> getData() {
    return this.data;
  }

  public RemoteSpan setData(Map<String,String> data) {
    this.data = data;
    return this;
  }

  public void unsetData() {
    this.data = null;
  }

  /** Returns true if field data is set (has been assigned a value) and false otherwise */
  public boolean isSetData() {
    return this.data != null;
  }

  public void setDataIsSet(boolean value) {
    if (!value) {
      this.data = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SENDER:
      if (value == null) {
        unsetSender();
      } else {
        setSender((String)value);
      }
      break;

    case SVC:
      if (value == null) {
        unsetSvc();
      } else {
        setSvc((String)value);
      }
      break;

    case TRACE_ID:
      if (value == null) {
        unsetTraceId();
      } else {
        setTraceId((Long)value);
      }
      break;

    case SPAN_ID:
      if (value == null) {
        unsetSpanId();
      } else {
        setSpanId((Long)value);
      }
      break;

    case PARENT_ID:
      if (value == null) {
        unsetParentId();
      } else {
        setParentId((Long)value);
      }
      break;

    case START:
      if (value == null) {
        unsetStart();
      } else {
        setStart((Long)value);
      }
      break;

    case STOP:
      if (value == null) {
        unsetStop();
      } else {
        setStop((Long)value);
      }
      break;

    case DESCRIPTION:
      if (value == null) {
        unsetDescription();
      } else {
        setDescription((String)value);
      }
      break;

    case DATA:
      if (value == null) {
        unsetData();
      } else {
        setData((Map<String,String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SENDER:
      return getSender();

    case SVC:
      return getSvc();

    case TRACE_ID:
      return Long.valueOf(getTraceId());

    case SPAN_ID:
      return Long.valueOf(getSpanId());

    case PARENT_ID:
      return Long.valueOf(getParentId());

    case START:
      return Long.valueOf(getStart());

    case STOP:
      return Long.valueOf(getStop());

    case DESCRIPTION:
      return getDescription();

    case DATA:
      return getData();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SENDER:
      return isSetSender();
    case SVC:
      return isSetSvc();
    case TRACE_ID:
      return isSetTraceId();
    case SPAN_ID:
      return isSetSpanId();
    case PARENT_ID:
      return isSetParentId();
    case START:
      return isSetStart();
    case STOP:
      return isSetStop();
    case DESCRIPTION:
      return isSetDescription();
    case DATA:
      return isSetData();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RemoteSpan)
      return this.equals((RemoteSpan)that);
    return false;
  }

  public boolean equals(RemoteSpan that) {
    if (that == null)
      return false;

    boolean this_present_sender = true && this.isSetSender();
    boolean that_present_sender = true && that.isSetSender();
    if (this_present_sender || that_present_sender) {
      if (!(this_present_sender && that_present_sender))
        return false;
      if (!this.sender.equals(that.sender))
        return false;
    }

    boolean this_present_svc = true && this.isSetSvc();
    boolean that_present_svc = true && that.isSetSvc();
    if (this_present_svc || that_present_svc) {
      if (!(this_present_svc && that_present_svc))
        return false;
      if (!this.svc.equals(that.svc))
        return false;
    }

    boolean this_present_traceId = true;
    boolean that_present_traceId = true;
    if (this_present_traceId || that_present_traceId) {
      if (!(this_present_traceId && that_present_traceId))
        return false;
      if (this.traceId != that.traceId)
        return false;
    }

    boolean this_present_spanId = true;
    boolean that_present_spanId = true;
    if (this_present_spanId || that_present_spanId) {
      if (!(this_present_spanId && that_present_spanId))
        return false;
      if (this.spanId != that.spanId)
        return false;
    }

    boolean this_present_parentId = true;
    boolean that_present_parentId = true;
    if (this_present_parentId || that_present_parentId) {
      if (!(this_present_parentId && that_present_parentId))
        return false;
      if (this.parentId != that.parentId)
        return false;
    }

    boolean this_present_start = true;
    boolean that_present_start = true;
    if (this_present_start || that_present_start) {
      if (!(this_present_start && that_present_start))
        return false;
      if (this.start != that.start)
        return false;
    }

    boolean this_present_stop = true;
    boolean that_present_stop = true;
    if (this_present_stop || that_present_stop) {
      if (!(this_present_stop && that_present_stop))
        return false;
      if (this.stop != that.stop)
        return false;
    }

    boolean this_present_description = true && this.isSetDescription();
    boolean that_present_description = true && that.isSetDescription();
    if (this_present_description || that_present_description) {
      if (!(this_present_description && that_present_description))
        return false;
      if (!this.description.equals(that.description))
        return false;
    }

    boolean this_present_data = true && this.isSetData();
    boolean that_present_data = true && that.isSetData();
    if (this_present_data || that_present_data) {
      if (!(this_present_data && that_present_data))
        return false;
      if (!this.data.equals(that.data))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(RemoteSpan other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    RemoteSpan typedOther = (RemoteSpan)other;

    lastComparison = Boolean.valueOf(isSetSender()).compareTo(typedOther.isSetSender());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSender()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sender, typedOther.sender);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSvc()).compareTo(typedOther.isSetSvc());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSvc()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.svc, typedOther.svc);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTraceId()).compareTo(typedOther.isSetTraceId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTraceId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.traceId, typedOther.traceId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSpanId()).compareTo(typedOther.isSetSpanId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSpanId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.spanId, typedOther.spanId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetParentId()).compareTo(typedOther.isSetParentId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParentId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.parentId, typedOther.parentId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStart()).compareTo(typedOther.isSetStart());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStart()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.start, typedOther.start);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStop()).compareTo(typedOther.isSetStop());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStop()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stop, typedOther.stop);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDescription()).compareTo(typedOther.isSetDescription());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDescription()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.description, typedOther.description);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetData()).compareTo(typedOther.isSetData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetData()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.data, typedOther.data);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("RemoteSpan(");
    boolean first = true;

    sb.append("sender:");
    if (this.sender == null) {
      sb.append("null");
    } else {
      sb.append(this.sender);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("svc:");
    if (this.svc == null) {
      sb.append("null");
    } else {
      sb.append(this.svc);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("traceId:");
    sb.append(this.traceId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("spanId:");
    sb.append(this.spanId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("parentId:");
    sb.append(this.parentId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("start:");
    sb.append(this.start);
    first = false;
    if (!first) sb.append(", ");
    sb.append("stop:");
    sb.append(this.stop);
    first = false;
    if (!first) sb.append(", ");
    sb.append("description:");
    if (this.description == null) {
      sb.append("null");
    } else {
      sb.append(this.description);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("data:");
    if (this.data == null) {
      sb.append("null");
    } else {
      sb.append(this.data);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class RemoteSpanStandardSchemeFactory implements SchemeFactory {
    public RemoteSpanStandardScheme getScheme() {
      return new RemoteSpanStandardScheme();
    }
  }

  private static class RemoteSpanStandardScheme extends StandardScheme<RemoteSpan> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RemoteSpan struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SENDER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.sender = iprot.readString();
              struct.setSenderIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SVC
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.svc = iprot.readString();
              struct.setSvcIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TRACE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.traceId = iprot.readI64();
              struct.setTraceIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SPAN_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.spanId = iprot.readI64();
              struct.setSpanIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // PARENT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.parentId = iprot.readI64();
              struct.setParentIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // START
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.start = iprot.readI64();
              struct.setStartIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // STOP
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.stop = iprot.readI64();
              struct.setStopIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // DESCRIPTION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.description = iprot.readString();
              struct.setDescriptionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 9: // DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
                struct.data = new HashMap<String,String>(2*_map0.size);
                for (int _i1 = 0; _i1 < _map0.size; ++_i1)
                {
                  String _key2; // required
                  String _val3; // required
                  _key2 = iprot.readString();
                  _val3 = iprot.readString();
                  struct.data.put(_key2, _val3);
                }
                iprot.readMapEnd();
              }
              struct.setDataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, RemoteSpan struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.sender != null) {
        oprot.writeFieldBegin(SENDER_FIELD_DESC);
        oprot.writeString(struct.sender);
        oprot.writeFieldEnd();
      }
      if (struct.svc != null) {
        oprot.writeFieldBegin(SVC_FIELD_DESC);
        oprot.writeString(struct.svc);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(TRACE_ID_FIELD_DESC);
      oprot.writeI64(struct.traceId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SPAN_ID_FIELD_DESC);
      oprot.writeI64(struct.spanId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(PARENT_ID_FIELD_DESC);
      oprot.writeI64(struct.parentId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(START_FIELD_DESC);
      oprot.writeI64(struct.start);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(STOP_FIELD_DESC);
      oprot.writeI64(struct.stop);
      oprot.writeFieldEnd();
      if (struct.description != null) {
        oprot.writeFieldBegin(DESCRIPTION_FIELD_DESC);
        oprot.writeString(struct.description);
        oprot.writeFieldEnd();
      }
      if (struct.data != null) {
        oprot.writeFieldBegin(DATA_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.data.size()));
          for (Map.Entry<String, String> _iter4 : struct.data.entrySet())
          {
            oprot.writeString(_iter4.getKey());
            oprot.writeString(_iter4.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RemoteSpanTupleSchemeFactory implements SchemeFactory {
    public RemoteSpanTupleScheme getScheme() {
      return new RemoteSpanTupleScheme();
    }
  }

  private static class RemoteSpanTupleScheme extends TupleScheme<RemoteSpan> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RemoteSpan struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetSender()) {
        optionals.set(0);
      }
      if (struct.isSetSvc()) {
        optionals.set(1);
      }
      if (struct.isSetTraceId()) {
        optionals.set(2);
      }
      if (struct.isSetSpanId()) {
        optionals.set(3);
      }
      if (struct.isSetParentId()) {
        optionals.set(4);
      }
      if (struct.isSetStart()) {
        optionals.set(5);
      }
      if (struct.isSetStop()) {
        optionals.set(6);
      }
      if (struct.isSetDescription()) {
        optionals.set(7);
      }
      if (struct.isSetData()) {
        optionals.set(8);
      }
      oprot.writeBitSet(optionals, 9);
      if (struct.isSetSender()) {
        oprot.writeString(struct.sender);
      }
      if (struct.isSetSvc()) {
        oprot.writeString(struct.svc);
      }
      if (struct.isSetTraceId()) {
        oprot.writeI64(struct.traceId);
      }
      if (struct.isSetSpanId()) {
        oprot.writeI64(struct.spanId);
      }
      if (struct.isSetParentId()) {
        oprot.writeI64(struct.parentId);
      }
      if (struct.isSetStart()) {
        oprot.writeI64(struct.start);
      }
      if (struct.isSetStop()) {
        oprot.writeI64(struct.stop);
      }
      if (struct.isSetDescription()) {
        oprot.writeString(struct.description);
      }
      if (struct.isSetData()) {
        {
          oprot.writeI32(struct.data.size());
          for (Map.Entry<String, String> _iter5 : struct.data.entrySet())
          {
            oprot.writeString(_iter5.getKey());
            oprot.writeString(_iter5.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RemoteSpan struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(9);
      if (incoming.get(0)) {
        struct.sender = iprot.readString();
        struct.setSenderIsSet(true);
      }
      if (incoming.get(1)) {
        struct.svc = iprot.readString();
        struct.setSvcIsSet(true);
      }
      if (incoming.get(2)) {
        struct.traceId = iprot.readI64();
        struct.setTraceIdIsSet(true);
      }
      if (incoming.get(3)) {
        struct.spanId = iprot.readI64();
        struct.setSpanIdIsSet(true);
      }
      if (incoming.get(4)) {
        struct.parentId = iprot.readI64();
        struct.setParentIdIsSet(true);
      }
      if (incoming.get(5)) {
        struct.start = iprot.readI64();
        struct.setStartIsSet(true);
      }
      if (incoming.get(6)) {
        struct.stop = iprot.readI64();
        struct.setStopIsSet(true);
      }
      if (incoming.get(7)) {
        struct.description = iprot.readString();
        struct.setDescriptionIsSet(true);
      }
      if (incoming.get(8)) {
        {
          org.apache.thrift.protocol.TMap _map6 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.data = new HashMap<String,String>(2*_map6.size);
          for (int _i7 = 0; _i7 < _map6.size; ++_i7)
          {
            String _key8; // required
            String _val9; // required
            _key8 = iprot.readString();
            _val9 = iprot.readString();
            struct.data.put(_key8, _val9);
          }
        }
        struct.setDataIsSet(true);
      }
    }
  }

}

