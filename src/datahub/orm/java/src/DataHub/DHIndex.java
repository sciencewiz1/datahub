package DataHub;
/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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

public class DHIndex implements org.apache.thrift.TBase<DHIndex, DHIndex._Fields>, java.io.Serializable, Cloneable, Comparable<DHIndex> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DHIndex");

  private static final org.apache.thrift.protocol.TField PRIMARY_FIELD_DESC = new org.apache.thrift.protocol.TField("primary", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField UNIQUE_FIELD_DESC = new org.apache.thrift.protocol.TField("unique", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField BTREE_INDEX_FIELD_DESC = new org.apache.thrift.protocol.TField("btree_index", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField FULLTEXT_INDEX_FIELD_DESC = new org.apache.thrift.protocol.TField("fulltext_index", org.apache.thrift.protocol.TType.BOOL, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DHIndexStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DHIndexTupleSchemeFactory());
  }

  public boolean primary; // optional
  public boolean unique; // optional
  public boolean btree_index; // optional
  public boolean fulltext_index; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PRIMARY((short)1, "primary"),
    UNIQUE((short)2, "unique"),
    BTREE_INDEX((short)3, "btree_index"),
    FULLTEXT_INDEX((short)4, "fulltext_index");

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
        case 1: // PRIMARY
          return PRIMARY;
        case 2: // UNIQUE
          return UNIQUE;
        case 3: // BTREE_INDEX
          return BTREE_INDEX;
        case 4: // FULLTEXT_INDEX
          return FULLTEXT_INDEX;
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
  private static final int __PRIMARY_ISSET_ID = 0;
  private static final int __UNIQUE_ISSET_ID = 1;
  private static final int __BTREE_INDEX_ISSET_ID = 2;
  private static final int __FULLTEXT_INDEX_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.PRIMARY,_Fields.UNIQUE,_Fields.BTREE_INDEX,_Fields.FULLTEXT_INDEX};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PRIMARY, new org.apache.thrift.meta_data.FieldMetaData("primary", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.UNIQUE, new org.apache.thrift.meta_data.FieldMetaData("unique", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.BTREE_INDEX, new org.apache.thrift.meta_data.FieldMetaData("btree_index", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.FULLTEXT_INDEX, new org.apache.thrift.meta_data.FieldMetaData("fulltext_index", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DHIndex.class, metaDataMap);
  }

  public DHIndex() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DHIndex(DHIndex other) {
    __isset_bitfield = other.__isset_bitfield;
    this.primary = other.primary;
    this.unique = other.unique;
    this.btree_index = other.btree_index;
    this.fulltext_index = other.fulltext_index;
  }

  public DHIndex deepCopy() {
    return new DHIndex(this);
  }

  @Override
  public void clear() {
    setPrimaryIsSet(false);
    this.primary = false;
    setUniqueIsSet(false);
    this.unique = false;
    setBtree_indexIsSet(false);
    this.btree_index = false;
    setFulltext_indexIsSet(false);
    this.fulltext_index = false;
  }

  public boolean isPrimary() {
    return this.primary;
  }

  public DHIndex setPrimary(boolean primary) {
    this.primary = primary;
    setPrimaryIsSet(true);
    return this;
  }

  public void unsetPrimary() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PRIMARY_ISSET_ID);
  }

  /** Returns true if field primary is set (has been assigned a value) and false otherwise */
  public boolean isSetPrimary() {
    return EncodingUtils.testBit(__isset_bitfield, __PRIMARY_ISSET_ID);
  }

  public void setPrimaryIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PRIMARY_ISSET_ID, value);
  }

  public boolean isUnique() {
    return this.unique;
  }

  public DHIndex setUnique(boolean unique) {
    this.unique = unique;
    setUniqueIsSet(true);
    return this;
  }

  public void unsetUnique() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __UNIQUE_ISSET_ID);
  }

  /** Returns true if field unique is set (has been assigned a value) and false otherwise */
  public boolean isSetUnique() {
    return EncodingUtils.testBit(__isset_bitfield, __UNIQUE_ISSET_ID);
  }

  public void setUniqueIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __UNIQUE_ISSET_ID, value);
  }

  public boolean isBtree_index() {
    return this.btree_index;
  }

  public DHIndex setBtree_index(boolean btree_index) {
    this.btree_index = btree_index;
    setBtree_indexIsSet(true);
    return this;
  }

  public void unsetBtree_index() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __BTREE_INDEX_ISSET_ID);
  }

  /** Returns true if field btree_index is set (has been assigned a value) and false otherwise */
  public boolean isSetBtree_index() {
    return EncodingUtils.testBit(__isset_bitfield, __BTREE_INDEX_ISSET_ID);
  }

  public void setBtree_indexIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __BTREE_INDEX_ISSET_ID, value);
  }

  public boolean isFulltext_index() {
    return this.fulltext_index;
  }

  public DHIndex setFulltext_index(boolean fulltext_index) {
    this.fulltext_index = fulltext_index;
    setFulltext_indexIsSet(true);
    return this;
  }

  public void unsetFulltext_index() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FULLTEXT_INDEX_ISSET_ID);
  }

  /** Returns true if field fulltext_index is set (has been assigned a value) and false otherwise */
  public boolean isSetFulltext_index() {
    return EncodingUtils.testBit(__isset_bitfield, __FULLTEXT_INDEX_ISSET_ID);
  }

  public void setFulltext_indexIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FULLTEXT_INDEX_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PRIMARY:
      if (value == null) {
        unsetPrimary();
      } else {
        setPrimary((Boolean)value);
      }
      break;

    case UNIQUE:
      if (value == null) {
        unsetUnique();
      } else {
        setUnique((Boolean)value);
      }
      break;

    case BTREE_INDEX:
      if (value == null) {
        unsetBtree_index();
      } else {
        setBtree_index((Boolean)value);
      }
      break;

    case FULLTEXT_INDEX:
      if (value == null) {
        unsetFulltext_index();
      } else {
        setFulltext_index((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PRIMARY:
      return Boolean.valueOf(isPrimary());

    case UNIQUE:
      return Boolean.valueOf(isUnique());

    case BTREE_INDEX:
      return Boolean.valueOf(isBtree_index());

    case FULLTEXT_INDEX:
      return Boolean.valueOf(isFulltext_index());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PRIMARY:
      return isSetPrimary();
    case UNIQUE:
      return isSetUnique();
    case BTREE_INDEX:
      return isSetBtree_index();
    case FULLTEXT_INDEX:
      return isSetFulltext_index();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DHIndex)
      return this.equals((DHIndex)that);
    return false;
  }

  public boolean equals(DHIndex that) {
    if (that == null)
      return false;

    boolean this_present_primary = true && this.isSetPrimary();
    boolean that_present_primary = true && that.isSetPrimary();
    if (this_present_primary || that_present_primary) {
      if (!(this_present_primary && that_present_primary))
        return false;
      if (this.primary != that.primary)
        return false;
    }

    boolean this_present_unique = true && this.isSetUnique();
    boolean that_present_unique = true && that.isSetUnique();
    if (this_present_unique || that_present_unique) {
      if (!(this_present_unique && that_present_unique))
        return false;
      if (this.unique != that.unique)
        return false;
    }

    boolean this_present_btree_index = true && this.isSetBtree_index();
    boolean that_present_btree_index = true && that.isSetBtree_index();
    if (this_present_btree_index || that_present_btree_index) {
      if (!(this_present_btree_index && that_present_btree_index))
        return false;
      if (this.btree_index != that.btree_index)
        return false;
    }

    boolean this_present_fulltext_index = true && this.isSetFulltext_index();
    boolean that_present_fulltext_index = true && that.isSetFulltext_index();
    if (this_present_fulltext_index || that_present_fulltext_index) {
      if (!(this_present_fulltext_index && that_present_fulltext_index))
        return false;
      if (this.fulltext_index != that.fulltext_index)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(DHIndex other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetPrimary()).compareTo(other.isSetPrimary());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrimary()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.primary, other.primary);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUnique()).compareTo(other.isSetUnique());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUnique()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.unique, other.unique);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBtree_index()).compareTo(other.isSetBtree_index());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBtree_index()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.btree_index, other.btree_index);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFulltext_index()).compareTo(other.isSetFulltext_index());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFulltext_index()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fulltext_index, other.fulltext_index);
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
    StringBuilder sb = new StringBuilder("DHIndex(");
    boolean first = true;

    if (isSetPrimary()) {
      sb.append("primary:");
      sb.append(this.primary);
      first = false;
    }
    if (isSetUnique()) {
      if (!first) sb.append(", ");
      sb.append("unique:");
      sb.append(this.unique);
      first = false;
    }
    if (isSetBtree_index()) {
      if (!first) sb.append(", ");
      sb.append("btree_index:");
      sb.append(this.btree_index);
      first = false;
    }
    if (isSetFulltext_index()) {
      if (!first) sb.append(", ");
      sb.append("fulltext_index:");
      sb.append(this.fulltext_index);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DHIndexStandardSchemeFactory implements SchemeFactory {
    public DHIndexStandardScheme getScheme() {
      return new DHIndexStandardScheme();
    }
  }

  private static class DHIndexStandardScheme extends StandardScheme<DHIndex> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DHIndex struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PRIMARY
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.primary = iprot.readBool();
              struct.setPrimaryIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // UNIQUE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.unique = iprot.readBool();
              struct.setUniqueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // BTREE_INDEX
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.btree_index = iprot.readBool();
              struct.setBtree_indexIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // FULLTEXT_INDEX
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.fulltext_index = iprot.readBool();
              struct.setFulltext_indexIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, DHIndex struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetPrimary()) {
        oprot.writeFieldBegin(PRIMARY_FIELD_DESC);
        oprot.writeBool(struct.primary);
        oprot.writeFieldEnd();
      }
      if (struct.isSetUnique()) {
        oprot.writeFieldBegin(UNIQUE_FIELD_DESC);
        oprot.writeBool(struct.unique);
        oprot.writeFieldEnd();
      }
      if (struct.isSetBtree_index()) {
        oprot.writeFieldBegin(BTREE_INDEX_FIELD_DESC);
        oprot.writeBool(struct.btree_index);
        oprot.writeFieldEnd();
      }
      if (struct.isSetFulltext_index()) {
        oprot.writeFieldBegin(FULLTEXT_INDEX_FIELD_DESC);
        oprot.writeBool(struct.fulltext_index);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DHIndexTupleSchemeFactory implements SchemeFactory {
    public DHIndexTupleScheme getScheme() {
      return new DHIndexTupleScheme();
    }
  }

  private static class DHIndexTupleScheme extends TupleScheme<DHIndex> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DHIndex struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetPrimary()) {
        optionals.set(0);
      }
      if (struct.isSetUnique()) {
        optionals.set(1);
      }
      if (struct.isSetBtree_index()) {
        optionals.set(2);
      }
      if (struct.isSetFulltext_index()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetPrimary()) {
        oprot.writeBool(struct.primary);
      }
      if (struct.isSetUnique()) {
        oprot.writeBool(struct.unique);
      }
      if (struct.isSetBtree_index()) {
        oprot.writeBool(struct.btree_index);
      }
      if (struct.isSetFulltext_index()) {
        oprot.writeBool(struct.fulltext_index);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DHIndex struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.primary = iprot.readBool();
        struct.setPrimaryIsSet(true);
      }
      if (incoming.get(1)) {
        struct.unique = iprot.readBool();
        struct.setUniqueIsSet(true);
      }
      if (incoming.get(2)) {
        struct.btree_index = iprot.readBool();
        struct.setBtree_indexIsSet(true);
      }
      if (incoming.get(3)) {
        struct.fulltext_index = iprot.readBool();
        struct.setFulltext_indexIsSet(true);
      }
    }
  }

}

