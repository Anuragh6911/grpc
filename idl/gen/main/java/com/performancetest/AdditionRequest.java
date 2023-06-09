// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: calculation.proto

package com.performancetest;

/**
 * Protobuf type {@code com.example.grpctest.AdditionRequest}
 */
public  final class AdditionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.example.grpctest.AdditionRequest)
    AdditionRequestOrBuilder {
  // Use AdditionRequest.newBuilder() to construct.
  private AdditionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AdditionRequest() {
    firstNumber_ = 0;
    secondNumber_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private AdditionRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            firstNumber_ = input.readInt32();
            break;
          }
          case 16: {

            secondNumber_ = input.readInt32();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.performancetest.Calculation.internal_static_com_example_grpctest_AdditionRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.performancetest.Calculation.internal_static_com_example_grpctest_AdditionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.performancetest.AdditionRequest.class, com.performancetest.AdditionRequest.Builder.class);
  }

  public static final int FIRSTNUMBER_FIELD_NUMBER = 1;
  private int firstNumber_;
  /**
   * <code>int32 firstNumber = 1;</code>
   */
  public int getFirstNumber() {
    return firstNumber_;
  }

  public static final int SECONDNUMBER_FIELD_NUMBER = 2;
  private int secondNumber_;
  /**
   * <code>int32 secondNumber = 2;</code>
   */
  public int getSecondNumber() {
    return secondNumber_;
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
    if (firstNumber_ != 0) {
      output.writeInt32(1, firstNumber_);
    }
    if (secondNumber_ != 0) {
      output.writeInt32(2, secondNumber_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (firstNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, firstNumber_);
    }
    if (secondNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, secondNumber_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.performancetest.AdditionRequest)) {
      return super.equals(obj);
    }
    com.performancetest.AdditionRequest other = (com.performancetest.AdditionRequest) obj;

    boolean result = true;
    result = result && (getFirstNumber()
        == other.getFirstNumber());
    result = result && (getSecondNumber()
        == other.getSecondNumber());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + FIRSTNUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getFirstNumber();
    hash = (37 * hash) + SECONDNUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getSecondNumber();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.performancetest.AdditionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.performancetest.AdditionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.performancetest.AdditionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.performancetest.AdditionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.performancetest.AdditionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.performancetest.AdditionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.performancetest.AdditionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.performancetest.AdditionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.performancetest.AdditionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.performancetest.AdditionRequest parseFrom(
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
  public static Builder newBuilder(com.performancetest.AdditionRequest prototype) {
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
   * Protobuf type {@code com.example.grpctest.AdditionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.example.grpctest.AdditionRequest)
      com.performancetest.AdditionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.performancetest.Calculation.internal_static_com_example_grpctest_AdditionRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.performancetest.Calculation.internal_static_com_example_grpctest_AdditionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.performancetest.AdditionRequest.class, com.performancetest.AdditionRequest.Builder.class);
    }

    // Construct using com.performancetest.AdditionRequest.newBuilder()
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
      firstNumber_ = 0;

      secondNumber_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.performancetest.Calculation.internal_static_com_example_grpctest_AdditionRequest_descriptor;
    }

    public com.performancetest.AdditionRequest getDefaultInstanceForType() {
      return com.performancetest.AdditionRequest.getDefaultInstance();
    }

    public com.performancetest.AdditionRequest build() {
      com.performancetest.AdditionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.performancetest.AdditionRequest buildPartial() {
      com.performancetest.AdditionRequest result = new com.performancetest.AdditionRequest(this);
      result.firstNumber_ = firstNumber_;
      result.secondNumber_ = secondNumber_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
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
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.performancetest.AdditionRequest) {
        return mergeFrom((com.performancetest.AdditionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.performancetest.AdditionRequest other) {
      if (other == com.performancetest.AdditionRequest.getDefaultInstance()) return this;
      if (other.getFirstNumber() != 0) {
        setFirstNumber(other.getFirstNumber());
      }
      if (other.getSecondNumber() != 0) {
        setSecondNumber(other.getSecondNumber());
      }
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
      com.performancetest.AdditionRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.performancetest.AdditionRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int firstNumber_ ;
    /**
     * <code>int32 firstNumber = 1;</code>
     */
    public int getFirstNumber() {
      return firstNumber_;
    }
    /**
     * <code>int32 firstNumber = 1;</code>
     */
    public Builder setFirstNumber(int value) {
      
      firstNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 firstNumber = 1;</code>
     */
    public Builder clearFirstNumber() {
      
      firstNumber_ = 0;
      onChanged();
      return this;
    }

    private int secondNumber_ ;
    /**
     * <code>int32 secondNumber = 2;</code>
     */
    public int getSecondNumber() {
      return secondNumber_;
    }
    /**
     * <code>int32 secondNumber = 2;</code>
     */
    public Builder setSecondNumber(int value) {
      
      secondNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 secondNumber = 2;</code>
     */
    public Builder clearSecondNumber() {
      
      secondNumber_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.example.grpctest.AdditionRequest)
  }

  // @@protoc_insertion_point(class_scope:com.example.grpctest.AdditionRequest)
  private static final com.performancetest.AdditionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.performancetest.AdditionRequest();
  }

  public static com.performancetest.AdditionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AdditionRequest>
      PARSER = new com.google.protobuf.AbstractParser<AdditionRequest>() {
    public AdditionRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new AdditionRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AdditionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AdditionRequest> getParserForType() {
    return PARSER;
  }

  public com.performancetest.AdditionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

