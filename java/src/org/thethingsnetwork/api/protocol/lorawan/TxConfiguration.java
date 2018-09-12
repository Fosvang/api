// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/protocol/lorawan/lorawan.proto

package org.thethingsnetwork.api.protocol.lorawan;

/**
 * Protobuf type {@code lorawan.TxConfiguration}
 */
public  final class TxConfiguration extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:lorawan.TxConfiguration)
    TxConfigurationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TxConfiguration.newBuilder() to construct.
  private TxConfiguration(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TxConfiguration() {
    modulation_ = 0;
    dataRate_ = "";
    bitRate_ = 0;
    codingRate_ = "";
    fCnt_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TxConfiguration(
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 88: {
            int rawValue = input.readEnum();

            modulation_ = rawValue;
            break;
          }
          case 98: {
            java.lang.String s = input.readStringRequireUtf8();

            dataRate_ = s;
            break;
          }
          case 104: {

            bitRate_ = input.readUInt32();
            break;
          }
          case 114: {
            java.lang.String s = input.readStringRequireUtf8();

            codingRate_ = s;
            break;
          }
          case 120: {

            fCnt_ = input.readUInt32();
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
    return org.thethingsnetwork.api.protocol.lorawan.LoRaWANProto.internal_static_lorawan_TxConfiguration_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.thethingsnetwork.api.protocol.lorawan.LoRaWANProto.internal_static_lorawan_TxConfiguration_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.thethingsnetwork.api.protocol.lorawan.TxConfiguration.class, org.thethingsnetwork.api.protocol.lorawan.TxConfiguration.Builder.class);
  }

  public static final int MODULATION_FIELD_NUMBER = 11;
  private int modulation_;
  /**
   * <code>.lorawan.Modulation modulation = 11;</code>
   */
  public int getModulationValue() {
    return modulation_;
  }
  /**
   * <code>.lorawan.Modulation modulation = 11;</code>
   */
  public org.thethingsnetwork.api.protocol.lorawan.Modulation getModulation() {
    org.thethingsnetwork.api.protocol.lorawan.Modulation result = org.thethingsnetwork.api.protocol.lorawan.Modulation.valueOf(modulation_);
    return result == null ? org.thethingsnetwork.api.protocol.lorawan.Modulation.UNRECOGNIZED : result;
  }

  public static final int DATA_RATE_FIELD_NUMBER = 12;
  private volatile java.lang.Object dataRate_;
  /**
   * <pre>
   * LoRa data rate - SF{spreadingfactor}BW{bandwidth}
   * </pre>
   *
   * <code>string data_rate = 12;</code>
   */
  public java.lang.String getDataRate() {
    java.lang.Object ref = dataRate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dataRate_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * LoRa data rate - SF{spreadingfactor}BW{bandwidth}
   * </pre>
   *
   * <code>string data_rate = 12;</code>
   */
  public com.google.protobuf.ByteString
      getDataRateBytes() {
    java.lang.Object ref = dataRate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dataRate_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BIT_RATE_FIELD_NUMBER = 13;
  private int bitRate_;
  /**
   * <pre>
   * FSK bit rate in bit/s
   * </pre>
   *
   * <code>uint32 bit_rate = 13;</code>
   */
  public int getBitRate() {
    return bitRate_;
  }

  public static final int CODING_RATE_FIELD_NUMBER = 14;
  private volatile java.lang.Object codingRate_;
  /**
   * <pre>
   * LoRa coding rate
   * </pre>
   *
   * <code>string coding_rate = 14;</code>
   */
  public java.lang.String getCodingRate() {
    java.lang.Object ref = codingRate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      codingRate_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * LoRa coding rate
   * </pre>
   *
   * <code>string coding_rate = 14;</code>
   */
  public com.google.protobuf.ByteString
      getCodingRateBytes() {
    java.lang.Object ref = codingRate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      codingRate_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int F_CNT_FIELD_NUMBER = 15;
  private int fCnt_;
  /**
   * <pre>
   * Store the full 32 bit FCnt (deprecated; do not use)
   * </pre>
   *
   * <code>uint32 f_cnt = 15;</code>
   */
  public int getFCnt() {
    return fCnt_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (modulation_ != org.thethingsnetwork.api.protocol.lorawan.Modulation.LORA.getNumber()) {
      output.writeEnum(11, modulation_);
    }
    if (!getDataRateBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 12, dataRate_);
    }
    if (bitRate_ != 0) {
      output.writeUInt32(13, bitRate_);
    }
    if (!getCodingRateBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 14, codingRate_);
    }
    if (fCnt_ != 0) {
      output.writeUInt32(15, fCnt_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (modulation_ != org.thethingsnetwork.api.protocol.lorawan.Modulation.LORA.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(11, modulation_);
    }
    if (!getDataRateBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(12, dataRate_);
    }
    if (bitRate_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(13, bitRate_);
    }
    if (!getCodingRateBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(14, codingRate_);
    }
    if (fCnt_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(15, fCnt_);
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
    if (!(obj instanceof org.thethingsnetwork.api.protocol.lorawan.TxConfiguration)) {
      return super.equals(obj);
    }
    org.thethingsnetwork.api.protocol.lorawan.TxConfiguration other = (org.thethingsnetwork.api.protocol.lorawan.TxConfiguration) obj;

    boolean result = true;
    result = result && modulation_ == other.modulation_;
    result = result && getDataRate()
        .equals(other.getDataRate());
    result = result && (getBitRate()
        == other.getBitRate());
    result = result && getCodingRate()
        .equals(other.getCodingRate());
    result = result && (getFCnt()
        == other.getFCnt());
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
    hash = (37 * hash) + MODULATION_FIELD_NUMBER;
    hash = (53 * hash) + modulation_;
    hash = (37 * hash) + DATA_RATE_FIELD_NUMBER;
    hash = (53 * hash) + getDataRate().hashCode();
    hash = (37 * hash) + BIT_RATE_FIELD_NUMBER;
    hash = (53 * hash) + getBitRate();
    hash = (37 * hash) + CODING_RATE_FIELD_NUMBER;
    hash = (53 * hash) + getCodingRate().hashCode();
    hash = (37 * hash) + F_CNT_FIELD_NUMBER;
    hash = (53 * hash) + getFCnt();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.thethingsnetwork.api.protocol.lorawan.TxConfiguration parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.TxConfiguration parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.TxConfiguration parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.TxConfiguration parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.TxConfiguration parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.TxConfiguration parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.TxConfiguration parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.TxConfiguration parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.TxConfiguration parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.TxConfiguration parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.TxConfiguration parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.TxConfiguration parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.thethingsnetwork.api.protocol.lorawan.TxConfiguration prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code lorawan.TxConfiguration}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:lorawan.TxConfiguration)
      org.thethingsnetwork.api.protocol.lorawan.TxConfigurationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.thethingsnetwork.api.protocol.lorawan.LoRaWANProto.internal_static_lorawan_TxConfiguration_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.thethingsnetwork.api.protocol.lorawan.LoRaWANProto.internal_static_lorawan_TxConfiguration_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.thethingsnetwork.api.protocol.lorawan.TxConfiguration.class, org.thethingsnetwork.api.protocol.lorawan.TxConfiguration.Builder.class);
    }

    // Construct using org.thethingsnetwork.api.protocol.lorawan.TxConfiguration.newBuilder()
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
    public Builder clear() {
      super.clear();
      modulation_ = 0;

      dataRate_ = "";

      bitRate_ = 0;

      codingRate_ = "";

      fCnt_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.thethingsnetwork.api.protocol.lorawan.LoRaWANProto.internal_static_lorawan_TxConfiguration_descriptor;
    }

    public org.thethingsnetwork.api.protocol.lorawan.TxConfiguration getDefaultInstanceForType() {
      return org.thethingsnetwork.api.protocol.lorawan.TxConfiguration.getDefaultInstance();
    }

    public org.thethingsnetwork.api.protocol.lorawan.TxConfiguration build() {
      org.thethingsnetwork.api.protocol.lorawan.TxConfiguration result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.thethingsnetwork.api.protocol.lorawan.TxConfiguration buildPartial() {
      org.thethingsnetwork.api.protocol.lorawan.TxConfiguration result = new org.thethingsnetwork.api.protocol.lorawan.TxConfiguration(this);
      result.modulation_ = modulation_;
      result.dataRate_ = dataRate_;
      result.bitRate_ = bitRate_;
      result.codingRate_ = codingRate_;
      result.fCnt_ = fCnt_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.thethingsnetwork.api.protocol.lorawan.TxConfiguration) {
        return mergeFrom((org.thethingsnetwork.api.protocol.lorawan.TxConfiguration)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.thethingsnetwork.api.protocol.lorawan.TxConfiguration other) {
      if (other == org.thethingsnetwork.api.protocol.lorawan.TxConfiguration.getDefaultInstance()) return this;
      if (other.modulation_ != 0) {
        setModulationValue(other.getModulationValue());
      }
      if (!other.getDataRate().isEmpty()) {
        dataRate_ = other.dataRate_;
        onChanged();
      }
      if (other.getBitRate() != 0) {
        setBitRate(other.getBitRate());
      }
      if (!other.getCodingRate().isEmpty()) {
        codingRate_ = other.codingRate_;
        onChanged();
      }
      if (other.getFCnt() != 0) {
        setFCnt(other.getFCnt());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.thethingsnetwork.api.protocol.lorawan.TxConfiguration parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.thethingsnetwork.api.protocol.lorawan.TxConfiguration) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int modulation_ = 0;
    /**
     * <code>.lorawan.Modulation modulation = 11;</code>
     */
    public int getModulationValue() {
      return modulation_;
    }
    /**
     * <code>.lorawan.Modulation modulation = 11;</code>
     */
    public Builder setModulationValue(int value) {
      modulation_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.lorawan.Modulation modulation = 11;</code>
     */
    public org.thethingsnetwork.api.protocol.lorawan.Modulation getModulation() {
      org.thethingsnetwork.api.protocol.lorawan.Modulation result = org.thethingsnetwork.api.protocol.lorawan.Modulation.valueOf(modulation_);
      return result == null ? org.thethingsnetwork.api.protocol.lorawan.Modulation.UNRECOGNIZED : result;
    }
    /**
     * <code>.lorawan.Modulation modulation = 11;</code>
     */
    public Builder setModulation(org.thethingsnetwork.api.protocol.lorawan.Modulation value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      modulation_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.lorawan.Modulation modulation = 11;</code>
     */
    public Builder clearModulation() {
      
      modulation_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object dataRate_ = "";
    /**
     * <pre>
     * LoRa data rate - SF{spreadingfactor}BW{bandwidth}
     * </pre>
     *
     * <code>string data_rate = 12;</code>
     */
    public java.lang.String getDataRate() {
      java.lang.Object ref = dataRate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dataRate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * LoRa data rate - SF{spreadingfactor}BW{bandwidth}
     * </pre>
     *
     * <code>string data_rate = 12;</code>
     */
    public com.google.protobuf.ByteString
        getDataRateBytes() {
      java.lang.Object ref = dataRate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dataRate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * LoRa data rate - SF{spreadingfactor}BW{bandwidth}
     * </pre>
     *
     * <code>string data_rate = 12;</code>
     */
    public Builder setDataRate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dataRate_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * LoRa data rate - SF{spreadingfactor}BW{bandwidth}
     * </pre>
     *
     * <code>string data_rate = 12;</code>
     */
    public Builder clearDataRate() {
      
      dataRate_ = getDefaultInstance().getDataRate();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * LoRa data rate - SF{spreadingfactor}BW{bandwidth}
     * </pre>
     *
     * <code>string data_rate = 12;</code>
     */
    public Builder setDataRateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dataRate_ = value;
      onChanged();
      return this;
    }

    private int bitRate_ ;
    /**
     * <pre>
     * FSK bit rate in bit/s
     * </pre>
     *
     * <code>uint32 bit_rate = 13;</code>
     */
    public int getBitRate() {
      return bitRate_;
    }
    /**
     * <pre>
     * FSK bit rate in bit/s
     * </pre>
     *
     * <code>uint32 bit_rate = 13;</code>
     */
    public Builder setBitRate(int value) {
      
      bitRate_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * FSK bit rate in bit/s
     * </pre>
     *
     * <code>uint32 bit_rate = 13;</code>
     */
    public Builder clearBitRate() {
      
      bitRate_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object codingRate_ = "";
    /**
     * <pre>
     * LoRa coding rate
     * </pre>
     *
     * <code>string coding_rate = 14;</code>
     */
    public java.lang.String getCodingRate() {
      java.lang.Object ref = codingRate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        codingRate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * LoRa coding rate
     * </pre>
     *
     * <code>string coding_rate = 14;</code>
     */
    public com.google.protobuf.ByteString
        getCodingRateBytes() {
      java.lang.Object ref = codingRate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        codingRate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * LoRa coding rate
     * </pre>
     *
     * <code>string coding_rate = 14;</code>
     */
    public Builder setCodingRate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      codingRate_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * LoRa coding rate
     * </pre>
     *
     * <code>string coding_rate = 14;</code>
     */
    public Builder clearCodingRate() {
      
      codingRate_ = getDefaultInstance().getCodingRate();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * LoRa coding rate
     * </pre>
     *
     * <code>string coding_rate = 14;</code>
     */
    public Builder setCodingRateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      codingRate_ = value;
      onChanged();
      return this;
    }

    private int fCnt_ ;
    /**
     * <pre>
     * Store the full 32 bit FCnt (deprecated; do not use)
     * </pre>
     *
     * <code>uint32 f_cnt = 15;</code>
     */
    public int getFCnt() {
      return fCnt_;
    }
    /**
     * <pre>
     * Store the full 32 bit FCnt (deprecated; do not use)
     * </pre>
     *
     * <code>uint32 f_cnt = 15;</code>
     */
    public Builder setFCnt(int value) {
      
      fCnt_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Store the full 32 bit FCnt (deprecated; do not use)
     * </pre>
     *
     * <code>uint32 f_cnt = 15;</code>
     */
    public Builder clearFCnt() {
      
      fCnt_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:lorawan.TxConfiguration)
  }

  // @@protoc_insertion_point(class_scope:lorawan.TxConfiguration)
  private static final org.thethingsnetwork.api.protocol.lorawan.TxConfiguration DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.thethingsnetwork.api.protocol.lorawan.TxConfiguration();
  }

  public static org.thethingsnetwork.api.protocol.lorawan.TxConfiguration getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TxConfiguration>
      PARSER = new com.google.protobuf.AbstractParser<TxConfiguration>() {
    public TxConfiguration parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TxConfiguration(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TxConfiguration> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TxConfiguration> getParserForType() {
    return PARSER;
  }

  public org.thethingsnetwork.api.protocol.lorawan.TxConfiguration getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

