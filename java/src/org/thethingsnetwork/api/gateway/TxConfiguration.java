// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/gateway/gateway.proto

package org.thethingsnetwork.api.gateway;

/**
 * Protobuf type {@code gateway.TxConfiguration}
 */
public  final class TxConfiguration extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:gateway.TxConfiguration)
    TxConfigurationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TxConfiguration.newBuilder() to construct.
  private TxConfiguration(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TxConfiguration() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TxConfiguration();
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
          case 88: {

            timestamp_ = input.readUInt32();
            break;
          }
          case 168: {

            rfChain_ = input.readUInt32();
            break;
          }
          case 176: {

            frequency_ = input.readUInt64();
            break;
          }
          case 184: {

            power_ = input.readInt32();
            break;
          }
          case 248: {

            polarizationInversion_ = input.readBool();
            break;
          }
          case 256: {

            frequencyDeviation_ = input.readUInt32();
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
    return org.thethingsnetwork.api.gateway.GatewayProto.internal_static_gateway_TxConfiguration_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.thethingsnetwork.api.gateway.GatewayProto.internal_static_gateway_TxConfiguration_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.thethingsnetwork.api.gateway.TxConfiguration.class, org.thethingsnetwork.api.gateway.TxConfiguration.Builder.class);
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 11;
  private int timestamp_;
  /**
   * <pre>
   * Timestamp (uptime of LoRa module) in microseconds with rollover
   * </pre>
   *
   * <code>uint32 timestamp = 11;</code>
   * @return The timestamp.
   */
  public int getTimestamp() {
    return timestamp_;
  }

  public static final int RF_CHAIN_FIELD_NUMBER = 21;
  private int rfChain_;
  /**
   * <code>uint32 rf_chain = 21;</code>
   * @return The rfChain.
   */
  public int getRfChain() {
    return rfChain_;
  }

  public static final int FREQUENCY_FIELD_NUMBER = 22;
  private long frequency_;
  /**
   * <pre>
   * Frequency in Hz
   * </pre>
   *
   * <code>uint64 frequency = 22;</code>
   * @return The frequency.
   */
  public long getFrequency() {
    return frequency_;
  }

  public static final int POWER_FIELD_NUMBER = 23;
  private int power_;
  /**
   * <pre>
   * Transmit power in dBm
   * </pre>
   *
   * <code>int32 power = 23;</code>
   * @return The power.
   */
  public int getPower() {
    return power_;
  }

  public static final int POLARIZATION_INVERSION_FIELD_NUMBER = 31;
  private boolean polarizationInversion_;
  /**
   * <pre>
   * LoRa polarization inversion (basically always true for messages from gateway to node)
   * </pre>
   *
   * <code>bool polarization_inversion = 31;</code>
   * @return The polarizationInversion.
   */
  public boolean getPolarizationInversion() {
    return polarizationInversion_;
  }

  public static final int FREQUENCY_DEVIATION_FIELD_NUMBER = 32;
  private int frequencyDeviation_;
  /**
   * <pre>
   * FSK frequency deviation in Hz
   * </pre>
   *
   * <code>uint32 frequency_deviation = 32;</code>
   * @return The frequencyDeviation.
   */
  public int getFrequencyDeviation() {
    return frequencyDeviation_;
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
    if (timestamp_ != 0) {
      output.writeUInt32(11, timestamp_);
    }
    if (rfChain_ != 0) {
      output.writeUInt32(21, rfChain_);
    }
    if (frequency_ != 0L) {
      output.writeUInt64(22, frequency_);
    }
    if (power_ != 0) {
      output.writeInt32(23, power_);
    }
    if (polarizationInversion_ != false) {
      output.writeBool(31, polarizationInversion_);
    }
    if (frequencyDeviation_ != 0) {
      output.writeUInt32(32, frequencyDeviation_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (timestamp_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(11, timestamp_);
    }
    if (rfChain_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(21, rfChain_);
    }
    if (frequency_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(22, frequency_);
    }
    if (power_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(23, power_);
    }
    if (polarizationInversion_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(31, polarizationInversion_);
    }
    if (frequencyDeviation_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(32, frequencyDeviation_);
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
    if (!(obj instanceof org.thethingsnetwork.api.gateway.TxConfiguration)) {
      return super.equals(obj);
    }
    org.thethingsnetwork.api.gateway.TxConfiguration other = (org.thethingsnetwork.api.gateway.TxConfiguration) obj;

    if (getTimestamp()
        != other.getTimestamp()) return false;
    if (getRfChain()
        != other.getRfChain()) return false;
    if (getFrequency()
        != other.getFrequency()) return false;
    if (getPower()
        != other.getPower()) return false;
    if (getPolarizationInversion()
        != other.getPolarizationInversion()) return false;
    if (getFrequencyDeviation()
        != other.getFrequencyDeviation()) return false;
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
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + getTimestamp();
    hash = (37 * hash) + RF_CHAIN_FIELD_NUMBER;
    hash = (53 * hash) + getRfChain();
    hash = (37 * hash) + FREQUENCY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFrequency());
    hash = (37 * hash) + POWER_FIELD_NUMBER;
    hash = (53 * hash) + getPower();
    hash = (37 * hash) + POLARIZATION_INVERSION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getPolarizationInversion());
    hash = (37 * hash) + FREQUENCY_DEVIATION_FIELD_NUMBER;
    hash = (53 * hash) + getFrequencyDeviation();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.thethingsnetwork.api.gateway.TxConfiguration parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.gateway.TxConfiguration parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.gateway.TxConfiguration parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.gateway.TxConfiguration parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.gateway.TxConfiguration parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.gateway.TxConfiguration parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.gateway.TxConfiguration parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.gateway.TxConfiguration parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.thethingsnetwork.api.gateway.TxConfiguration parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.gateway.TxConfiguration parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.thethingsnetwork.api.gateway.TxConfiguration parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.gateway.TxConfiguration parseFrom(
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
  public static Builder newBuilder(org.thethingsnetwork.api.gateway.TxConfiguration prototype) {
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
   * Protobuf type {@code gateway.TxConfiguration}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:gateway.TxConfiguration)
      org.thethingsnetwork.api.gateway.TxConfigurationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.thethingsnetwork.api.gateway.GatewayProto.internal_static_gateway_TxConfiguration_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.thethingsnetwork.api.gateway.GatewayProto.internal_static_gateway_TxConfiguration_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.thethingsnetwork.api.gateway.TxConfiguration.class, org.thethingsnetwork.api.gateway.TxConfiguration.Builder.class);
    }

    // Construct using org.thethingsnetwork.api.gateway.TxConfiguration.newBuilder()
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
      timestamp_ = 0;

      rfChain_ = 0;

      frequency_ = 0L;

      power_ = 0;

      polarizationInversion_ = false;

      frequencyDeviation_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.thethingsnetwork.api.gateway.GatewayProto.internal_static_gateway_TxConfiguration_descriptor;
    }

    @java.lang.Override
    public org.thethingsnetwork.api.gateway.TxConfiguration getDefaultInstanceForType() {
      return org.thethingsnetwork.api.gateway.TxConfiguration.getDefaultInstance();
    }

    @java.lang.Override
    public org.thethingsnetwork.api.gateway.TxConfiguration build() {
      org.thethingsnetwork.api.gateway.TxConfiguration result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.thethingsnetwork.api.gateway.TxConfiguration buildPartial() {
      org.thethingsnetwork.api.gateway.TxConfiguration result = new org.thethingsnetwork.api.gateway.TxConfiguration(this);
      result.timestamp_ = timestamp_;
      result.rfChain_ = rfChain_;
      result.frequency_ = frequency_;
      result.power_ = power_;
      result.polarizationInversion_ = polarizationInversion_;
      result.frequencyDeviation_ = frequencyDeviation_;
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
      if (other instanceof org.thethingsnetwork.api.gateway.TxConfiguration) {
        return mergeFrom((org.thethingsnetwork.api.gateway.TxConfiguration)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.thethingsnetwork.api.gateway.TxConfiguration other) {
      if (other == org.thethingsnetwork.api.gateway.TxConfiguration.getDefaultInstance()) return this;
      if (other.getTimestamp() != 0) {
        setTimestamp(other.getTimestamp());
      }
      if (other.getRfChain() != 0) {
        setRfChain(other.getRfChain());
      }
      if (other.getFrequency() != 0L) {
        setFrequency(other.getFrequency());
      }
      if (other.getPower() != 0) {
        setPower(other.getPower());
      }
      if (other.getPolarizationInversion() != false) {
        setPolarizationInversion(other.getPolarizationInversion());
      }
      if (other.getFrequencyDeviation() != 0) {
        setFrequencyDeviation(other.getFrequencyDeviation());
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
      org.thethingsnetwork.api.gateway.TxConfiguration parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.thethingsnetwork.api.gateway.TxConfiguration) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int timestamp_ ;
    /**
     * <pre>
     * Timestamp (uptime of LoRa module) in microseconds with rollover
     * </pre>
     *
     * <code>uint32 timestamp = 11;</code>
     * @return The timestamp.
     */
    public int getTimestamp() {
      return timestamp_;
    }
    /**
     * <pre>
     * Timestamp (uptime of LoRa module) in microseconds with rollover
     * </pre>
     *
     * <code>uint32 timestamp = 11;</code>
     * @param value The timestamp to set.
     * @return This builder for chaining.
     */
    public Builder setTimestamp(int value) {
      
      timestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Timestamp (uptime of LoRa module) in microseconds with rollover
     * </pre>
     *
     * <code>uint32 timestamp = 11;</code>
     * @return This builder for chaining.
     */
    public Builder clearTimestamp() {
      
      timestamp_ = 0;
      onChanged();
      return this;
    }

    private int rfChain_ ;
    /**
     * <code>uint32 rf_chain = 21;</code>
     * @return The rfChain.
     */
    public int getRfChain() {
      return rfChain_;
    }
    /**
     * <code>uint32 rf_chain = 21;</code>
     * @param value The rfChain to set.
     * @return This builder for chaining.
     */
    public Builder setRfChain(int value) {
      
      rfChain_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 rf_chain = 21;</code>
     * @return This builder for chaining.
     */
    public Builder clearRfChain() {
      
      rfChain_ = 0;
      onChanged();
      return this;
    }

    private long frequency_ ;
    /**
     * <pre>
     * Frequency in Hz
     * </pre>
     *
     * <code>uint64 frequency = 22;</code>
     * @return The frequency.
     */
    public long getFrequency() {
      return frequency_;
    }
    /**
     * <pre>
     * Frequency in Hz
     * </pre>
     *
     * <code>uint64 frequency = 22;</code>
     * @param value The frequency to set.
     * @return This builder for chaining.
     */
    public Builder setFrequency(long value) {
      
      frequency_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Frequency in Hz
     * </pre>
     *
     * <code>uint64 frequency = 22;</code>
     * @return This builder for chaining.
     */
    public Builder clearFrequency() {
      
      frequency_ = 0L;
      onChanged();
      return this;
    }

    private int power_ ;
    /**
     * <pre>
     * Transmit power in dBm
     * </pre>
     *
     * <code>int32 power = 23;</code>
     * @return The power.
     */
    public int getPower() {
      return power_;
    }
    /**
     * <pre>
     * Transmit power in dBm
     * </pre>
     *
     * <code>int32 power = 23;</code>
     * @param value The power to set.
     * @return This builder for chaining.
     */
    public Builder setPower(int value) {
      
      power_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Transmit power in dBm
     * </pre>
     *
     * <code>int32 power = 23;</code>
     * @return This builder for chaining.
     */
    public Builder clearPower() {
      
      power_ = 0;
      onChanged();
      return this;
    }

    private boolean polarizationInversion_ ;
    /**
     * <pre>
     * LoRa polarization inversion (basically always true for messages from gateway to node)
     * </pre>
     *
     * <code>bool polarization_inversion = 31;</code>
     * @return The polarizationInversion.
     */
    public boolean getPolarizationInversion() {
      return polarizationInversion_;
    }
    /**
     * <pre>
     * LoRa polarization inversion (basically always true for messages from gateway to node)
     * </pre>
     *
     * <code>bool polarization_inversion = 31;</code>
     * @param value The polarizationInversion to set.
     * @return This builder for chaining.
     */
    public Builder setPolarizationInversion(boolean value) {
      
      polarizationInversion_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * LoRa polarization inversion (basically always true for messages from gateway to node)
     * </pre>
     *
     * <code>bool polarization_inversion = 31;</code>
     * @return This builder for chaining.
     */
    public Builder clearPolarizationInversion() {
      
      polarizationInversion_ = false;
      onChanged();
      return this;
    }

    private int frequencyDeviation_ ;
    /**
     * <pre>
     * FSK frequency deviation in Hz
     * </pre>
     *
     * <code>uint32 frequency_deviation = 32;</code>
     * @return The frequencyDeviation.
     */
    public int getFrequencyDeviation() {
      return frequencyDeviation_;
    }
    /**
     * <pre>
     * FSK frequency deviation in Hz
     * </pre>
     *
     * <code>uint32 frequency_deviation = 32;</code>
     * @param value The frequencyDeviation to set.
     * @return This builder for chaining.
     */
    public Builder setFrequencyDeviation(int value) {
      
      frequencyDeviation_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * FSK frequency deviation in Hz
     * </pre>
     *
     * <code>uint32 frequency_deviation = 32;</code>
     * @return This builder for chaining.
     */
    public Builder clearFrequencyDeviation() {
      
      frequencyDeviation_ = 0;
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


    // @@protoc_insertion_point(builder_scope:gateway.TxConfiguration)
  }

  // @@protoc_insertion_point(class_scope:gateway.TxConfiguration)
  private static final org.thethingsnetwork.api.gateway.TxConfiguration DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.thethingsnetwork.api.gateway.TxConfiguration();
  }

  public static org.thethingsnetwork.api.gateway.TxConfiguration getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TxConfiguration>
      PARSER = new com.google.protobuf.AbstractParser<TxConfiguration>() {
    @java.lang.Override
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

  @java.lang.Override
  public org.thethingsnetwork.api.gateway.TxConfiguration getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

