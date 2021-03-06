// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/api.proto

package org.thethingsnetwork.api;

/**
 * Protobuf type {@code api.Rates}
 */
public  final class Rates extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.Rates)
    RatesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Rates.newBuilder() to construct.
  private Rates(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Rates() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Rates();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Rates(
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
          case 13: {

            rate1_ = input.readFloat();
            break;
          }
          case 21: {

            rate5_ = input.readFloat();
            break;
          }
          case 29: {

            rate15_ = input.readFloat();
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
    return org.thethingsnetwork.api.APIProto.internal_static_api_Rates_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.thethingsnetwork.api.APIProto.internal_static_api_Rates_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.thethingsnetwork.api.Rates.class, org.thethingsnetwork.api.Rates.Builder.class);
  }

  public static final int RATE1_FIELD_NUMBER = 1;
  private float rate1_;
  /**
   * <code>float rate1 = 1;</code>
   * @return The rate1.
   */
  public float getRate1() {
    return rate1_;
  }

  public static final int RATE5_FIELD_NUMBER = 2;
  private float rate5_;
  /**
   * <code>float rate5 = 2;</code>
   * @return The rate5.
   */
  public float getRate5() {
    return rate5_;
  }

  public static final int RATE15_FIELD_NUMBER = 3;
  private float rate15_;
  /**
   * <code>float rate15 = 3;</code>
   * @return The rate15.
   */
  public float getRate15() {
    return rate15_;
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
    if (rate1_ != 0F) {
      output.writeFloat(1, rate1_);
    }
    if (rate5_ != 0F) {
      output.writeFloat(2, rate5_);
    }
    if (rate15_ != 0F) {
      output.writeFloat(3, rate15_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (rate1_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, rate1_);
    }
    if (rate5_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, rate5_);
    }
    if (rate15_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, rate15_);
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
    if (!(obj instanceof org.thethingsnetwork.api.Rates)) {
      return super.equals(obj);
    }
    org.thethingsnetwork.api.Rates other = (org.thethingsnetwork.api.Rates) obj;

    if (java.lang.Float.floatToIntBits(getRate1())
        != java.lang.Float.floatToIntBits(
            other.getRate1())) return false;
    if (java.lang.Float.floatToIntBits(getRate5())
        != java.lang.Float.floatToIntBits(
            other.getRate5())) return false;
    if (java.lang.Float.floatToIntBits(getRate15())
        != java.lang.Float.floatToIntBits(
            other.getRate15())) return false;
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
    hash = (37 * hash) + RATE1_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getRate1());
    hash = (37 * hash) + RATE5_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getRate5());
    hash = (37 * hash) + RATE15_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getRate15());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.thethingsnetwork.api.Rates parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.Rates parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.Rates parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.Rates parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.Rates parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.Rates parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.Rates parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.Rates parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.thethingsnetwork.api.Rates parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.Rates parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.thethingsnetwork.api.Rates parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.Rates parseFrom(
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
  public static Builder newBuilder(org.thethingsnetwork.api.Rates prototype) {
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
   * Protobuf type {@code api.Rates}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.Rates)
      org.thethingsnetwork.api.RatesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.thethingsnetwork.api.APIProto.internal_static_api_Rates_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.thethingsnetwork.api.APIProto.internal_static_api_Rates_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.thethingsnetwork.api.Rates.class, org.thethingsnetwork.api.Rates.Builder.class);
    }

    // Construct using org.thethingsnetwork.api.Rates.newBuilder()
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
      rate1_ = 0F;

      rate5_ = 0F;

      rate15_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.thethingsnetwork.api.APIProto.internal_static_api_Rates_descriptor;
    }

    @java.lang.Override
    public org.thethingsnetwork.api.Rates getDefaultInstanceForType() {
      return org.thethingsnetwork.api.Rates.getDefaultInstance();
    }

    @java.lang.Override
    public org.thethingsnetwork.api.Rates build() {
      org.thethingsnetwork.api.Rates result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.thethingsnetwork.api.Rates buildPartial() {
      org.thethingsnetwork.api.Rates result = new org.thethingsnetwork.api.Rates(this);
      result.rate1_ = rate1_;
      result.rate5_ = rate5_;
      result.rate15_ = rate15_;
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
      if (other instanceof org.thethingsnetwork.api.Rates) {
        return mergeFrom((org.thethingsnetwork.api.Rates)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.thethingsnetwork.api.Rates other) {
      if (other == org.thethingsnetwork.api.Rates.getDefaultInstance()) return this;
      if (other.getRate1() != 0F) {
        setRate1(other.getRate1());
      }
      if (other.getRate5() != 0F) {
        setRate5(other.getRate5());
      }
      if (other.getRate15() != 0F) {
        setRate15(other.getRate15());
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
      org.thethingsnetwork.api.Rates parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.thethingsnetwork.api.Rates) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private float rate1_ ;
    /**
     * <code>float rate1 = 1;</code>
     * @return The rate1.
     */
    public float getRate1() {
      return rate1_;
    }
    /**
     * <code>float rate1 = 1;</code>
     * @param value The rate1 to set.
     * @return This builder for chaining.
     */
    public Builder setRate1(float value) {
      
      rate1_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float rate1 = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRate1() {
      
      rate1_ = 0F;
      onChanged();
      return this;
    }

    private float rate5_ ;
    /**
     * <code>float rate5 = 2;</code>
     * @return The rate5.
     */
    public float getRate5() {
      return rate5_;
    }
    /**
     * <code>float rate5 = 2;</code>
     * @param value The rate5 to set.
     * @return This builder for chaining.
     */
    public Builder setRate5(float value) {
      
      rate5_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float rate5 = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRate5() {
      
      rate5_ = 0F;
      onChanged();
      return this;
    }

    private float rate15_ ;
    /**
     * <code>float rate15 = 3;</code>
     * @return The rate15.
     */
    public float getRate15() {
      return rate15_;
    }
    /**
     * <code>float rate15 = 3;</code>
     * @param value The rate15 to set.
     * @return This builder for chaining.
     */
    public Builder setRate15(float value) {
      
      rate15_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float rate15 = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRate15() {
      
      rate15_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:api.Rates)
  }

  // @@protoc_insertion_point(class_scope:api.Rates)
  private static final org.thethingsnetwork.api.Rates DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.thethingsnetwork.api.Rates();
  }

  public static org.thethingsnetwork.api.Rates getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Rates>
      PARSER = new com.google.protobuf.AbstractParser<Rates>() {
    @java.lang.Override
    public Rates parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Rates(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Rates> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Rates> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.thethingsnetwork.api.Rates getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

