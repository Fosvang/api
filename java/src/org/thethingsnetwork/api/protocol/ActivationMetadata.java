// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/protocol/protocol.proto

package org.thethingsnetwork.api.protocol;

/**
 * Protobuf type {@code protocol.ActivationMetadata}
 */
public  final class ActivationMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protocol.ActivationMetadata)
    ActivationMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ActivationMetadata.newBuilder() to construct.
  private ActivationMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ActivationMetadata() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ActivationMetadata(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10: {
            org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata.Builder subBuilder = null;
            if (protocolCase_ == 1) {
              subBuilder = ((org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata) protocol_).toBuilder();
            }
            protocol_ =
                input.readMessage(org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata) protocol_);
              protocol_ = subBuilder.buildPartial();
            }
            protocolCase_ = 1;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
    return org.thethingsnetwork.api.protocol.ProtocolProto.internal_static_protocol_ActivationMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.thethingsnetwork.api.protocol.ProtocolProto.internal_static_protocol_ActivationMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.thethingsnetwork.api.protocol.ActivationMetadata.class, org.thethingsnetwork.api.protocol.ActivationMetadata.Builder.class);
  }

  private int protocolCase_ = 0;
  private java.lang.Object protocol_;
  public enum ProtocolCase
      implements com.google.protobuf.Internal.EnumLite {
    LORAWAN(1),
    PROTOCOL_NOT_SET(0);
    private final int value;
    private ProtocolCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ProtocolCase valueOf(int value) {
      return forNumber(value);
    }

    public static ProtocolCase forNumber(int value) {
      switch (value) {
        case 1: return LORAWAN;
        case 0: return PROTOCOL_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ProtocolCase
  getProtocolCase() {
    return ProtocolCase.forNumber(
        protocolCase_);
  }

  public static final int LORAWAN_FIELD_NUMBER = 1;
  /**
   * <code>.lorawan.ActivationMetadata lorawan = 1 [(.gogoproto.customname) = "LoRaWAN"];</code>
   */
  public boolean hasLorawan() {
    return protocolCase_ == 1;
  }
  /**
   * <code>.lorawan.ActivationMetadata lorawan = 1 [(.gogoproto.customname) = "LoRaWAN"];</code>
   */
  public org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata getLorawan() {
    if (protocolCase_ == 1) {
       return (org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata) protocol_;
    }
    return org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata.getDefaultInstance();
  }
  /**
   * <code>.lorawan.ActivationMetadata lorawan = 1 [(.gogoproto.customname) = "LoRaWAN"];</code>
   */
  public org.thethingsnetwork.api.protocol.lorawan.ActivationMetadataOrBuilder getLorawanOrBuilder() {
    if (protocolCase_ == 1) {
       return (org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata) protocol_;
    }
    return org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata.getDefaultInstance();
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
    if (protocolCase_ == 1) {
      output.writeMessage(1, (org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata) protocol_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (protocolCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata) protocol_);
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
    if (!(obj instanceof org.thethingsnetwork.api.protocol.ActivationMetadata)) {
      return super.equals(obj);
    }
    org.thethingsnetwork.api.protocol.ActivationMetadata other = (org.thethingsnetwork.api.protocol.ActivationMetadata) obj;

    boolean result = true;
    result = result && getProtocolCase().equals(
        other.getProtocolCase());
    if (!result) return false;
    switch (protocolCase_) {
      case 1:
        result = result && getLorawan()
            .equals(other.getLorawan());
        break;
      case 0:
      default:
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (protocolCase_) {
      case 1:
        hash = (37 * hash) + LORAWAN_FIELD_NUMBER;
        hash = (53 * hash) + getLorawan().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.thethingsnetwork.api.protocol.ActivationMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.protocol.ActivationMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.protocol.ActivationMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.protocol.ActivationMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.protocol.ActivationMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.protocol.ActivationMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.protocol.ActivationMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.protocol.ActivationMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.thethingsnetwork.api.protocol.ActivationMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.protocol.ActivationMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.thethingsnetwork.api.protocol.ActivationMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.protocol.ActivationMetadata parseFrom(
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
  public static Builder newBuilder(org.thethingsnetwork.api.protocol.ActivationMetadata prototype) {
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
   * Protobuf type {@code protocol.ActivationMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protocol.ActivationMetadata)
      org.thethingsnetwork.api.protocol.ActivationMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.thethingsnetwork.api.protocol.ProtocolProto.internal_static_protocol_ActivationMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.thethingsnetwork.api.protocol.ProtocolProto.internal_static_protocol_ActivationMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.thethingsnetwork.api.protocol.ActivationMetadata.class, org.thethingsnetwork.api.protocol.ActivationMetadata.Builder.class);
    }

    // Construct using org.thethingsnetwork.api.protocol.ActivationMetadata.newBuilder()
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
      protocolCase_ = 0;
      protocol_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.thethingsnetwork.api.protocol.ProtocolProto.internal_static_protocol_ActivationMetadata_descriptor;
    }

    @java.lang.Override
    public org.thethingsnetwork.api.protocol.ActivationMetadata getDefaultInstanceForType() {
      return org.thethingsnetwork.api.protocol.ActivationMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public org.thethingsnetwork.api.protocol.ActivationMetadata build() {
      org.thethingsnetwork.api.protocol.ActivationMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.thethingsnetwork.api.protocol.ActivationMetadata buildPartial() {
      org.thethingsnetwork.api.protocol.ActivationMetadata result = new org.thethingsnetwork.api.protocol.ActivationMetadata(this);
      if (protocolCase_ == 1) {
        if (lorawanBuilder_ == null) {
          result.protocol_ = protocol_;
        } else {
          result.protocol_ = lorawanBuilder_.build();
        }
      }
      result.protocolCase_ = protocolCase_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.thethingsnetwork.api.protocol.ActivationMetadata) {
        return mergeFrom((org.thethingsnetwork.api.protocol.ActivationMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.thethingsnetwork.api.protocol.ActivationMetadata other) {
      if (other == org.thethingsnetwork.api.protocol.ActivationMetadata.getDefaultInstance()) return this;
      switch (other.getProtocolCase()) {
        case LORAWAN: {
          mergeLorawan(other.getLorawan());
          break;
        }
        case PROTOCOL_NOT_SET: {
          break;
        }
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
      org.thethingsnetwork.api.protocol.ActivationMetadata parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.thethingsnetwork.api.protocol.ActivationMetadata) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int protocolCase_ = 0;
    private java.lang.Object protocol_;
    public ProtocolCase
        getProtocolCase() {
      return ProtocolCase.forNumber(
          protocolCase_);
    }

    public Builder clearProtocol() {
      protocolCase_ = 0;
      protocol_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata, org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata.Builder, org.thethingsnetwork.api.protocol.lorawan.ActivationMetadataOrBuilder> lorawanBuilder_;
    /**
     * <code>.lorawan.ActivationMetadata lorawan = 1 [(.gogoproto.customname) = "LoRaWAN"];</code>
     */
    public boolean hasLorawan() {
      return protocolCase_ == 1;
    }
    /**
     * <code>.lorawan.ActivationMetadata lorawan = 1 [(.gogoproto.customname) = "LoRaWAN"];</code>
     */
    public org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata getLorawan() {
      if (lorawanBuilder_ == null) {
        if (protocolCase_ == 1) {
          return (org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata) protocol_;
        }
        return org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata.getDefaultInstance();
      } else {
        if (protocolCase_ == 1) {
          return lorawanBuilder_.getMessage();
        }
        return org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata.getDefaultInstance();
      }
    }
    /**
     * <code>.lorawan.ActivationMetadata lorawan = 1 [(.gogoproto.customname) = "LoRaWAN"];</code>
     */
    public Builder setLorawan(org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata value) {
      if (lorawanBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        protocol_ = value;
        onChanged();
      } else {
        lorawanBuilder_.setMessage(value);
      }
      protocolCase_ = 1;
      return this;
    }
    /**
     * <code>.lorawan.ActivationMetadata lorawan = 1 [(.gogoproto.customname) = "LoRaWAN"];</code>
     */
    public Builder setLorawan(
        org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata.Builder builderForValue) {
      if (lorawanBuilder_ == null) {
        protocol_ = builderForValue.build();
        onChanged();
      } else {
        lorawanBuilder_.setMessage(builderForValue.build());
      }
      protocolCase_ = 1;
      return this;
    }
    /**
     * <code>.lorawan.ActivationMetadata lorawan = 1 [(.gogoproto.customname) = "LoRaWAN"];</code>
     */
    public Builder mergeLorawan(org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata value) {
      if (lorawanBuilder_ == null) {
        if (protocolCase_ == 1 &&
            protocol_ != org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata.getDefaultInstance()) {
          protocol_ = org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata.newBuilder((org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata) protocol_)
              .mergeFrom(value).buildPartial();
        } else {
          protocol_ = value;
        }
        onChanged();
      } else {
        if (protocolCase_ == 1) {
          lorawanBuilder_.mergeFrom(value);
        }
        lorawanBuilder_.setMessage(value);
      }
      protocolCase_ = 1;
      return this;
    }
    /**
     * <code>.lorawan.ActivationMetadata lorawan = 1 [(.gogoproto.customname) = "LoRaWAN"];</code>
     */
    public Builder clearLorawan() {
      if (lorawanBuilder_ == null) {
        if (protocolCase_ == 1) {
          protocolCase_ = 0;
          protocol_ = null;
          onChanged();
        }
      } else {
        if (protocolCase_ == 1) {
          protocolCase_ = 0;
          protocol_ = null;
        }
        lorawanBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.lorawan.ActivationMetadata lorawan = 1 [(.gogoproto.customname) = "LoRaWAN"];</code>
     */
    public org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata.Builder getLorawanBuilder() {
      return getLorawanFieldBuilder().getBuilder();
    }
    /**
     * <code>.lorawan.ActivationMetadata lorawan = 1 [(.gogoproto.customname) = "LoRaWAN"];</code>
     */
    public org.thethingsnetwork.api.protocol.lorawan.ActivationMetadataOrBuilder getLorawanOrBuilder() {
      if ((protocolCase_ == 1) && (lorawanBuilder_ != null)) {
        return lorawanBuilder_.getMessageOrBuilder();
      } else {
        if (protocolCase_ == 1) {
          return (org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata) protocol_;
        }
        return org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata.getDefaultInstance();
      }
    }
    /**
     * <code>.lorawan.ActivationMetadata lorawan = 1 [(.gogoproto.customname) = "LoRaWAN"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata, org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata.Builder, org.thethingsnetwork.api.protocol.lorawan.ActivationMetadataOrBuilder> 
        getLorawanFieldBuilder() {
      if (lorawanBuilder_ == null) {
        if (!(protocolCase_ == 1)) {
          protocol_ = org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata.getDefaultInstance();
        }
        lorawanBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata, org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata.Builder, org.thethingsnetwork.api.protocol.lorawan.ActivationMetadataOrBuilder>(
                (org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata) protocol_,
                getParentForChildren(),
                isClean());
        protocol_ = null;
      }
      protocolCase_ = 1;
      onChanged();;
      return lorawanBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:protocol.ActivationMetadata)
  }

  // @@protoc_insertion_point(class_scope:protocol.ActivationMetadata)
  private static final org.thethingsnetwork.api.protocol.ActivationMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.thethingsnetwork.api.protocol.ActivationMetadata();
  }

  public static org.thethingsnetwork.api.protocol.ActivationMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ActivationMetadata>
      PARSER = new com.google.protobuf.AbstractParser<ActivationMetadata>() {
    @java.lang.Override
    public ActivationMetadata parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ActivationMetadata(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ActivationMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ActivationMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.thethingsnetwork.api.protocol.ActivationMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

