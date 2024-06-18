// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AbilityScalarType.proto

package emu.grasscutter.net.proto;

public final class AbilityScalarTypeOuterClass {
  private AbilityScalarTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   * 4.7.0
   * </pre>
   *
   * Protobuf enum {@code AbilityScalarType}
   */
  public enum AbilityScalarType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>ABILITY_SCALAR_TYPE_UNKNOW = 0;</code>
     */
    ABILITY_SCALAR_TYPE_UNKNOW(0),
    /**
     * <code>ABILITY_SCALAR_TYPE_FLOAT = 1;</code>
     */
    ABILITY_SCALAR_TYPE_FLOAT(1),
    /**
     * <code>ABILITY_SCALAR_TYPE_INT = 2;</code>
     */
    ABILITY_SCALAR_TYPE_INT(2),
    /**
     * <code>ABILITY_SCALAR_TYPE_BOOL = 3;</code>
     */
    ABILITY_SCALAR_TYPE_BOOL(3),
    /**
     * <code>ABILITY_SCALAR_TYPE_TRIGGER = 4;</code>
     */
    ABILITY_SCALAR_TYPE_TRIGGER(4),
    /**
     * <code>ABILITY_SCALAR_TYPE_STRING = 5;</code>
     */
    ABILITY_SCALAR_TYPE_STRING(5),
    /**
     * <code>ABILITY_SCALAR_TYPE_UINT = 6;</code>
     */
    ABILITY_SCALAR_TYPE_UINT(6),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>ABILITY_SCALAR_TYPE_UNKNOW = 0;</code>
     */
    public static final int ABILITY_SCALAR_TYPE_UNKNOW_VALUE = 0;
    /**
     * <code>ABILITY_SCALAR_TYPE_FLOAT = 1;</code>
     */
    public static final int ABILITY_SCALAR_TYPE_FLOAT_VALUE = 1;
    /**
     * <code>ABILITY_SCALAR_TYPE_INT = 2;</code>
     */
    public static final int ABILITY_SCALAR_TYPE_INT_VALUE = 2;
    /**
     * <code>ABILITY_SCALAR_TYPE_BOOL = 3;</code>
     */
    public static final int ABILITY_SCALAR_TYPE_BOOL_VALUE = 3;
    /**
     * <code>ABILITY_SCALAR_TYPE_TRIGGER = 4;</code>
     */
    public static final int ABILITY_SCALAR_TYPE_TRIGGER_VALUE = 4;
    /**
     * <code>ABILITY_SCALAR_TYPE_STRING = 5;</code>
     */
    public static final int ABILITY_SCALAR_TYPE_STRING_VALUE = 5;
    /**
     * <code>ABILITY_SCALAR_TYPE_UINT = 6;</code>
     */
    public static final int ABILITY_SCALAR_TYPE_UINT_VALUE = 6;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AbilityScalarType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AbilityScalarType forNumber(int value) {
      switch (value) {
        case 0: return ABILITY_SCALAR_TYPE_UNKNOW;
        case 1: return ABILITY_SCALAR_TYPE_FLOAT;
        case 2: return ABILITY_SCALAR_TYPE_INT;
        case 3: return ABILITY_SCALAR_TYPE_BOOL;
        case 4: return ABILITY_SCALAR_TYPE_TRIGGER;
        case 5: return ABILITY_SCALAR_TYPE_STRING;
        case 6: return ABILITY_SCALAR_TYPE_UINT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AbilityScalarType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AbilityScalarType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AbilityScalarType>() {
            public AbilityScalarType findValueByNumber(int number) {
              return AbilityScalarType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.AbilityScalarTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final AbilityScalarType[] VALUES = values();

    public static AbilityScalarType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private AbilityScalarType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:AbilityScalarType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027AbilityScalarType.proto*\354\001\n\021AbilitySca" +
      "larType\022\036\n\032ABILITY_SCALAR_TYPE_UNKNOW\020\000\022" +
      "\035\n\031ABILITY_SCALAR_TYPE_FLOAT\020\001\022\033\n\027ABILIT" +
      "Y_SCALAR_TYPE_INT\020\002\022\034\n\030ABILITY_SCALAR_TY" +
      "PE_BOOL\020\003\022\037\n\033ABILITY_SCALAR_TYPE_TRIGGER" +
      "\020\004\022\036\n\032ABILITY_SCALAR_TYPE_STRING\020\005\022\034\n\030AB" +
      "ILITY_SCALAR_TYPE_UINT\020\006B\033\n\031emu.grasscut" +
      "ter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
