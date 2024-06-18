// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneNpcInfo.proto

package emu.grasscutter.net.proto;

public final class SceneNpcInfoOuterClass {
  private SceneNpcInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneNpcInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneNpcInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 npc_id = 1;</code>
     * @return The npcId.
     */
    int getNpcId();

    /**
     * <code>uint32 room_id = 2;</code>
     * @return The roomId.
     */
    int getRoomId();

    /**
     * <code>uint32 parent_quest_id = 3;</code>
     * @return The parentQuestId.
     */
    int getParentQuestId();

    /**
     * <code>uint32 block_id = 4;</code>
     * @return The blockId.
     */
    int getBlockId();
  }
  /**
   * <pre>
   * 4.7.0
   * </pre>
   *
   * Protobuf type {@code SceneNpcInfo}
   */
  public static final class SceneNpcInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneNpcInfo)
      SceneNpcInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneNpcInfo.newBuilder() to construct.
    private SceneNpcInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneNpcInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneNpcInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SceneNpcInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              npcId_ = input.readUInt32();
              break;
            }
            case 16: {

              roomId_ = input.readUInt32();
              break;
            }
            case 24: {

              parentQuestId_ = input.readUInt32();
              break;
            }
            case 32: {

              blockId_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SceneNpcInfoOuterClass.internal_static_SceneNpcInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SceneNpcInfoOuterClass.internal_static_SceneNpcInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SceneNpcInfoOuterClass.SceneNpcInfo.class, emu.grasscutter.net.proto.SceneNpcInfoOuterClass.SceneNpcInfo.Builder.class);
    }

    public static final int NPC_ID_FIELD_NUMBER = 1;
    private int npcId_;
    /**
     * <code>uint32 npc_id = 1;</code>
     * @return The npcId.
     */
    @java.lang.Override
    public int getNpcId() {
      return npcId_;
    }

    public static final int ROOM_ID_FIELD_NUMBER = 2;
    private int roomId_;
    /**
     * <code>uint32 room_id = 2;</code>
     * @return The roomId.
     */
    @java.lang.Override
    public int getRoomId() {
      return roomId_;
    }

    public static final int PARENT_QUEST_ID_FIELD_NUMBER = 3;
    private int parentQuestId_;
    /**
     * <code>uint32 parent_quest_id = 3;</code>
     * @return The parentQuestId.
     */
    @java.lang.Override
    public int getParentQuestId() {
      return parentQuestId_;
    }

    public static final int BLOCK_ID_FIELD_NUMBER = 4;
    private int blockId_;
    /**
     * <code>uint32 block_id = 4;</code>
     * @return The blockId.
     */
    @java.lang.Override
    public int getBlockId() {
      return blockId_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (npcId_ != 0) {
        output.writeUInt32(1, npcId_);
      }
      if (roomId_ != 0) {
        output.writeUInt32(2, roomId_);
      }
      if (parentQuestId_ != 0) {
        output.writeUInt32(3, parentQuestId_);
      }
      if (blockId_ != 0) {
        output.writeUInt32(4, blockId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (npcId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, npcId_);
      }
      if (roomId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, roomId_);
      }
      if (parentQuestId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, parentQuestId_);
      }
      if (blockId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, blockId_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.SceneNpcInfoOuterClass.SceneNpcInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SceneNpcInfoOuterClass.SceneNpcInfo other = (emu.grasscutter.net.proto.SceneNpcInfoOuterClass.SceneNpcInfo) obj;

      if (getNpcId()
          != other.getNpcId()) return false;
      if (getRoomId()
          != other.getRoomId()) return false;
      if (getParentQuestId()
          != other.getParentQuestId()) return false;
      if (getBlockId()
          != other.getBlockId()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + NPC_ID_FIELD_NUMBER;
      hash = (53 * hash) + getNpcId();
      hash = (37 * hash) + ROOM_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRoomId();
      hash = (37 * hash) + PARENT_QUEST_ID_FIELD_NUMBER;
      hash = (53 * hash) + getParentQuestId();
      hash = (37 * hash) + BLOCK_ID_FIELD_NUMBER;
      hash = (53 * hash) + getBlockId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SceneNpcInfoOuterClass.SceneNpcInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneNpcInfoOuterClass.SceneNpcInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneNpcInfoOuterClass.SceneNpcInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneNpcInfoOuterClass.SceneNpcInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneNpcInfoOuterClass.SceneNpcInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneNpcInfoOuterClass.SceneNpcInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneNpcInfoOuterClass.SceneNpcInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneNpcInfoOuterClass.SceneNpcInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneNpcInfoOuterClass.SceneNpcInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneNpcInfoOuterClass.SceneNpcInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneNpcInfoOuterClass.SceneNpcInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneNpcInfoOuterClass.SceneNpcInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.SceneNpcInfoOuterClass.SceneNpcInfo prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * 4.7.0
     * </pre>
     *
     * Protobuf type {@code SceneNpcInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneNpcInfo)
        emu.grasscutter.net.proto.SceneNpcInfoOuterClass.SceneNpcInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SceneNpcInfoOuterClass.internal_static_SceneNpcInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SceneNpcInfoOuterClass.internal_static_SceneNpcInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SceneNpcInfoOuterClass.SceneNpcInfo.class, emu.grasscutter.net.proto.SceneNpcInfoOuterClass.SceneNpcInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SceneNpcInfoOuterClass.SceneNpcInfo.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        npcId_ = 0;

        roomId_ = 0;

        parentQuestId_ = 0;

        blockId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SceneNpcInfoOuterClass.internal_static_SceneNpcInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneNpcInfoOuterClass.SceneNpcInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SceneNpcInfoOuterClass.SceneNpcInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneNpcInfoOuterClass.SceneNpcInfo build() {
        emu.grasscutter.net.proto.SceneNpcInfoOuterClass.SceneNpcInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneNpcInfoOuterClass.SceneNpcInfo buildPartial() {
        emu.grasscutter.net.proto.SceneNpcInfoOuterClass.SceneNpcInfo result = new emu.grasscutter.net.proto.SceneNpcInfoOuterClass.SceneNpcInfo(this);
        result.npcId_ = npcId_;
        result.roomId_ = roomId_;
        result.parentQuestId_ = parentQuestId_;
        result.blockId_ = blockId_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.SceneNpcInfoOuterClass.SceneNpcInfo) {
          return mergeFrom((emu.grasscutter.net.proto.SceneNpcInfoOuterClass.SceneNpcInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SceneNpcInfoOuterClass.SceneNpcInfo other) {
        if (other == emu.grasscutter.net.proto.SceneNpcInfoOuterClass.SceneNpcInfo.getDefaultInstance()) return this;
        if (other.getNpcId() != 0) {
          setNpcId(other.getNpcId());
        }
        if (other.getRoomId() != 0) {
          setRoomId(other.getRoomId());
        }
        if (other.getParentQuestId() != 0) {
          setParentQuestId(other.getParentQuestId());
        }
        if (other.getBlockId() != 0) {
          setBlockId(other.getBlockId());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.SceneNpcInfoOuterClass.SceneNpcInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SceneNpcInfoOuterClass.SceneNpcInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int npcId_ ;
      /**
       * <code>uint32 npc_id = 1;</code>
       * @return The npcId.
       */
      @java.lang.Override
      public int getNpcId() {
        return npcId_;
      }
      /**
       * <code>uint32 npc_id = 1;</code>
       * @param value The npcId to set.
       * @return This builder for chaining.
       */
      public Builder setNpcId(int value) {
        
        npcId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 npc_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearNpcId() {
        
        npcId_ = 0;
        onChanged();
        return this;
      }

      private int roomId_ ;
      /**
       * <code>uint32 room_id = 2;</code>
       * @return The roomId.
       */
      @java.lang.Override
      public int getRoomId() {
        return roomId_;
      }
      /**
       * <code>uint32 room_id = 2;</code>
       * @param value The roomId to set.
       * @return This builder for chaining.
       */
      public Builder setRoomId(int value) {
        
        roomId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 room_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearRoomId() {
        
        roomId_ = 0;
        onChanged();
        return this;
      }

      private int parentQuestId_ ;
      /**
       * <code>uint32 parent_quest_id = 3;</code>
       * @return The parentQuestId.
       */
      @java.lang.Override
      public int getParentQuestId() {
        return parentQuestId_;
      }
      /**
       * <code>uint32 parent_quest_id = 3;</code>
       * @param value The parentQuestId to set.
       * @return This builder for chaining.
       */
      public Builder setParentQuestId(int value) {
        
        parentQuestId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 parent_quest_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearParentQuestId() {
        
        parentQuestId_ = 0;
        onChanged();
        return this;
      }

      private int blockId_ ;
      /**
       * <code>uint32 block_id = 4;</code>
       * @return The blockId.
       */
      @java.lang.Override
      public int getBlockId() {
        return blockId_;
      }
      /**
       * <code>uint32 block_id = 4;</code>
       * @param value The blockId to set.
       * @return This builder for chaining.
       */
      public Builder setBlockId(int value) {
        
        blockId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 block_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearBlockId() {
        
        blockId_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:SceneNpcInfo)
    }

    // @@protoc_insertion_point(class_scope:SceneNpcInfo)
    private static final emu.grasscutter.net.proto.SceneNpcInfoOuterClass.SceneNpcInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SceneNpcInfoOuterClass.SceneNpcInfo();
    }

    public static emu.grasscutter.net.proto.SceneNpcInfoOuterClass.SceneNpcInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneNpcInfo>
        PARSER = new com.google.protobuf.AbstractParser<SceneNpcInfo>() {
      @java.lang.Override
      public SceneNpcInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SceneNpcInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SceneNpcInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneNpcInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SceneNpcInfoOuterClass.SceneNpcInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneNpcInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneNpcInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022SceneNpcInfo.proto\"Z\n\014SceneNpcInfo\022\016\n\006" +
      "npc_id\030\001 \001(\r\022\017\n\007room_id\030\002 \001(\r\022\027\n\017parent_" +
      "quest_id\030\003 \001(\r\022\020\n\010block_id\030\004 \001(\rB\033\n\031emu." +
      "grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SceneNpcInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneNpcInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneNpcInfo_descriptor,
        new java.lang.String[] { "NpcId", "RoomId", "ParentQuestId", "BlockId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
