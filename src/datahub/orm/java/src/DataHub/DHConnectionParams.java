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

public class DHConnectionParams implements org.apache.thrift.TBase<DHConnectionParams, DHConnectionParams._Fields>, java.io.Serializable, Cloneable, Comparable<DHConnectionParams> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DHConnectionParams");

  private static final org.apache.thrift.protocol.TField USER_FIELD_DESC = new org.apache.thrift.protocol.TField("user", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField PASSWORD_FIELD_DESC = new org.apache.thrift.protocol.TField("password", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField DATABASE_FIELD_DESC = new org.apache.thrift.protocol.TField("database", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DHConnectionParamsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DHConnectionParamsTupleSchemeFactory());
  }

  public String user; // optional
  public String password; // optional
  public DHDatabase database; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USER((short)1, "user"),
    PASSWORD((short)2, "password"),
    DATABASE((short)3, "database");

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
        case 1: // USER
          return USER;
        case 2: // PASSWORD
          return PASSWORD;
        case 3: // DATABASE
          return DATABASE;
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
  private _Fields optionals[] = {_Fields.USER,_Fields.PASSWORD,_Fields.DATABASE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USER, new org.apache.thrift.meta_data.FieldMetaData("user", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PASSWORD, new org.apache.thrift.meta_data.FieldMetaData("password", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DATABASE, new org.apache.thrift.meta_data.FieldMetaData("database", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, DHDatabase.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DHConnectionParams.class, metaDataMap);
  }

  public DHConnectionParams() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DHConnectionParams(DHConnectionParams other) {
    if (other.isSetUser()) {
      this.user = other.user;
    }
    if (other.isSetPassword()) {
      this.password = other.password;
    }
    if (other.isSetDatabase()) {
      this.database = new DHDatabase(other.database);
    }
  }

  public DHConnectionParams deepCopy() {
    return new DHConnectionParams(this);
  }

  @Override
  public void clear() {
    this.user = null;
    this.password = null;
    this.database = null;
  }

  public String getUser() {
    return this.user;
  }

  public DHConnectionParams setUser(String user) {
    this.user = user;
    return this;
  }

  public void unsetUser() {
    this.user = null;
  }

  /** Returns true if field user is set (has been assigned a value) and false otherwise */
  public boolean isSetUser() {
    return this.user != null;
  }

  public void setUserIsSet(boolean value) {
    if (!value) {
      this.user = null;
    }
  }

  public String getPassword() {
    return this.password;
  }

  public DHConnectionParams setPassword(String password) {
    this.password = password;
    return this;
  }

  public void unsetPassword() {
    this.password = null;
  }

  /** Returns true if field password is set (has been assigned a value) and false otherwise */
  public boolean isSetPassword() {
    return this.password != null;
  }

  public void setPasswordIsSet(boolean value) {
    if (!value) {
      this.password = null;
    }
  }

  public DHDatabase getDatabase() {
    return this.database;
  }

  public DHConnectionParams setDatabase(DHDatabase database) {
    this.database = database;
    return this;
  }

  public void unsetDatabase() {
    this.database = null;
  }

  /** Returns true if field database is set (has been assigned a value) and false otherwise */
  public boolean isSetDatabase() {
    return this.database != null;
  }

  public void setDatabaseIsSet(boolean value) {
    if (!value) {
      this.database = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case USER:
      if (value == null) {
        unsetUser();
      } else {
        setUser((String)value);
      }
      break;

    case PASSWORD:
      if (value == null) {
        unsetPassword();
      } else {
        setPassword((String)value);
      }
      break;

    case DATABASE:
      if (value == null) {
        unsetDatabase();
      } else {
        setDatabase((DHDatabase)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case USER:
      return getUser();

    case PASSWORD:
      return getPassword();

    case DATABASE:
      return getDatabase();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case USER:
      return isSetUser();
    case PASSWORD:
      return isSetPassword();
    case DATABASE:
      return isSetDatabase();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DHConnectionParams)
      return this.equals((DHConnectionParams)that);
    return false;
  }

  public boolean equals(DHConnectionParams that) {
    if (that == null)
      return false;

    boolean this_present_user = true && this.isSetUser();
    boolean that_present_user = true && that.isSetUser();
    if (this_present_user || that_present_user) {
      if (!(this_present_user && that_present_user))
        return false;
      if (!this.user.equals(that.user))
        return false;
    }

    boolean this_present_password = true && this.isSetPassword();
    boolean that_present_password = true && that.isSetPassword();
    if (this_present_password || that_present_password) {
      if (!(this_present_password && that_present_password))
        return false;
      if (!this.password.equals(that.password))
        return false;
    }

    boolean this_present_database = true && this.isSetDatabase();
    boolean that_present_database = true && that.isSetDatabase();
    if (this_present_database || that_present_database) {
      if (!(this_present_database && that_present_database))
        return false;
      if (!this.database.equals(that.database))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(DHConnectionParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetUser()).compareTo(other.isSetUser());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUser()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.user, other.user);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPassword()).compareTo(other.isSetPassword());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPassword()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.password, other.password);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDatabase()).compareTo(other.isSetDatabase());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDatabase()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.database, other.database);
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
    StringBuilder sb = new StringBuilder("DHConnectionParams(");
    boolean first = true;

    if (isSetUser()) {
      sb.append("user:");
      if (this.user == null) {
        sb.append("null");
      } else {
        sb.append(this.user);
      }
      first = false;
    }
    if (isSetPassword()) {
      if (!first) sb.append(", ");
      sb.append("password:");
      if (this.password == null) {
        sb.append("null");
      } else {
        sb.append(this.password);
      }
      first = false;
    }
    if (isSetDatabase()) {
      if (!first) sb.append(", ");
      sb.append("database:");
      if (this.database == null) {
        sb.append("null");
      } else {
        sb.append(this.database);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (database != null) {
      database.validate();
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DHConnectionParamsStandardSchemeFactory implements SchemeFactory {
    public DHConnectionParamsStandardScheme getScheme() {
      return new DHConnectionParamsStandardScheme();
    }
  }

  private static class DHConnectionParamsStandardScheme extends StandardScheme<DHConnectionParams> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DHConnectionParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.user = iprot.readString();
              struct.setUserIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PASSWORD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.password = iprot.readString();
              struct.setPasswordIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DATABASE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.database = new DHDatabase();
              struct.database.read(iprot);
              struct.setDatabaseIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, DHConnectionParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.user != null) {
        if (struct.isSetUser()) {
          oprot.writeFieldBegin(USER_FIELD_DESC);
          oprot.writeString(struct.user);
          oprot.writeFieldEnd();
        }
      }
      if (struct.password != null) {
        if (struct.isSetPassword()) {
          oprot.writeFieldBegin(PASSWORD_FIELD_DESC);
          oprot.writeString(struct.password);
          oprot.writeFieldEnd();
        }
      }
      if (struct.database != null) {
        if (struct.isSetDatabase()) {
          oprot.writeFieldBegin(DATABASE_FIELD_DESC);
          struct.database.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DHConnectionParamsTupleSchemeFactory implements SchemeFactory {
    public DHConnectionParamsTupleScheme getScheme() {
      return new DHConnectionParamsTupleScheme();
    }
  }

  private static class DHConnectionParamsTupleScheme extends TupleScheme<DHConnectionParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DHConnectionParams struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetUser()) {
        optionals.set(0);
      }
      if (struct.isSetPassword()) {
        optionals.set(1);
      }
      if (struct.isSetDatabase()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetUser()) {
        oprot.writeString(struct.user);
      }
      if (struct.isSetPassword()) {
        oprot.writeString(struct.password);
      }
      if (struct.isSetDatabase()) {
        struct.database.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DHConnectionParams struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.user = iprot.readString();
        struct.setUserIsSet(true);
      }
      if (incoming.get(1)) {
        struct.password = iprot.readString();
        struct.setPasswordIsSet(true);
      }
      if (incoming.get(2)) {
        struct.database = new DHDatabase();
        struct.database.read(iprot);
        struct.setDatabaseIsSet(true);
      }
    }
  }

}

