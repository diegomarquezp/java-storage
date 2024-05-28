/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/storage/v2/storage.proto

// Protobuf Java Version: 3.25.2
package com.google.storage.v2;

/**
 *
 *
 * <pre>
 * Request object for `QueryWriteStatus`.
 * </pre>
 *
 * Protobuf type {@code google.storage.v2.QueryWriteStatusRequest}
 */
public final class QueryWriteStatusRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.storage.v2.QueryWriteStatusRequest)
    QueryWriteStatusRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use QueryWriteStatusRequest.newBuilder() to construct.
  private QueryWriteStatusRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private QueryWriteStatusRequest() {
    uploadId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new QueryWriteStatusRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.storage.v2.StorageProto
        .internal_static_google_storage_v2_QueryWriteStatusRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.storage.v2.StorageProto
        .internal_static_google_storage_v2_QueryWriteStatusRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.storage.v2.QueryWriteStatusRequest.class,
            com.google.storage.v2.QueryWriteStatusRequest.Builder.class);
  }

  private int bitField0_;
  public static final int UPLOAD_ID_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object uploadId_ = "";
  /**
   *
   *
   * <pre>
   * Required. The name of the resume token for the object whose write status is
   * being requested.
   * </pre>
   *
   * <code>string upload_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The uploadId.
   */
  @java.lang.Override
  public java.lang.String getUploadId() {
    java.lang.Object ref = uploadId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uploadId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The name of the resume token for the object whose write status is
   * being requested.
   * </pre>
   *
   * <code>string upload_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for uploadId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getUploadIdBytes() {
    java.lang.Object ref = uploadId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      uploadId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COMMON_OBJECT_REQUEST_PARAMS_FIELD_NUMBER = 2;
  private com.google.storage.v2.CommonObjectRequestParams commonObjectRequestParams_;
  /**
   *
   *
   * <pre>
   * A set of parameters common to Storage API requests concerning an object.
   * </pre>
   *
   * <code>.google.storage.v2.CommonObjectRequestParams common_object_request_params = 2;</code>
   *
   * @return Whether the commonObjectRequestParams field is set.
   */
  @java.lang.Override
  public boolean hasCommonObjectRequestParams() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * A set of parameters common to Storage API requests concerning an object.
   * </pre>
   *
   * <code>.google.storage.v2.CommonObjectRequestParams common_object_request_params = 2;</code>
   *
   * @return The commonObjectRequestParams.
   */
  @java.lang.Override
  public com.google.storage.v2.CommonObjectRequestParams getCommonObjectRequestParams() {
    return commonObjectRequestParams_ == null
        ? com.google.storage.v2.CommonObjectRequestParams.getDefaultInstance()
        : commonObjectRequestParams_;
  }
  /**
   *
   *
   * <pre>
   * A set of parameters common to Storage API requests concerning an object.
   * </pre>
   *
   * <code>.google.storage.v2.CommonObjectRequestParams common_object_request_params = 2;</code>
   */
  @java.lang.Override
  public com.google.storage.v2.CommonObjectRequestParamsOrBuilder
      getCommonObjectRequestParamsOrBuilder() {
    return commonObjectRequestParams_ == null
        ? com.google.storage.v2.CommonObjectRequestParams.getDefaultInstance()
        : commonObjectRequestParams_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uploadId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, uploadId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getCommonObjectRequestParams());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uploadId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, uploadId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, getCommonObjectRequestParams());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.storage.v2.QueryWriteStatusRequest)) {
      return super.equals(obj);
    }
    com.google.storage.v2.QueryWriteStatusRequest other =
        (com.google.storage.v2.QueryWriteStatusRequest) obj;

    if (!getUploadId().equals(other.getUploadId())) return false;
    if (hasCommonObjectRequestParams() != other.hasCommonObjectRequestParams()) return false;
    if (hasCommonObjectRequestParams()) {
      if (!getCommonObjectRequestParams().equals(other.getCommonObjectRequestParams()))
        return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + UPLOAD_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUploadId().hashCode();
    if (hasCommonObjectRequestParams()) {
      hash = (37 * hash) + COMMON_OBJECT_REQUEST_PARAMS_FIELD_NUMBER;
      hash = (53 * hash) + getCommonObjectRequestParams().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.storage.v2.QueryWriteStatusRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.storage.v2.QueryWriteStatusRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.storage.v2.QueryWriteStatusRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.storage.v2.QueryWriteStatusRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.storage.v2.QueryWriteStatusRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.storage.v2.QueryWriteStatusRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.storage.v2.QueryWriteStatusRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.storage.v2.QueryWriteStatusRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.storage.v2.QueryWriteStatusRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.storage.v2.QueryWriteStatusRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.storage.v2.QueryWriteStatusRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.storage.v2.QueryWriteStatusRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.storage.v2.QueryWriteStatusRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request object for `QueryWriteStatus`.
   * </pre>
   *
   * Protobuf type {@code google.storage.v2.QueryWriteStatusRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.storage.v2.QueryWriteStatusRequest)
      com.google.storage.v2.QueryWriteStatusRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.storage.v2.StorageProto
          .internal_static_google_storage_v2_QueryWriteStatusRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.storage.v2.StorageProto
          .internal_static_google_storage_v2_QueryWriteStatusRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.storage.v2.QueryWriteStatusRequest.class,
              com.google.storage.v2.QueryWriteStatusRequest.Builder.class);
    }

    // Construct using com.google.storage.v2.QueryWriteStatusRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getCommonObjectRequestParamsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      uploadId_ = "";
      commonObjectRequestParams_ = null;
      if (commonObjectRequestParamsBuilder_ != null) {
        commonObjectRequestParamsBuilder_.dispose();
        commonObjectRequestParamsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.storage.v2.StorageProto
          .internal_static_google_storage_v2_QueryWriteStatusRequest_descriptor;
    }

    @java.lang.Override
    public com.google.storage.v2.QueryWriteStatusRequest getDefaultInstanceForType() {
      return com.google.storage.v2.QueryWriteStatusRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.storage.v2.QueryWriteStatusRequest build() {
      com.google.storage.v2.QueryWriteStatusRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.storage.v2.QueryWriteStatusRequest buildPartial() {
      com.google.storage.v2.QueryWriteStatusRequest result =
          new com.google.storage.v2.QueryWriteStatusRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.storage.v2.QueryWriteStatusRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.uploadId_ = uploadId_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.commonObjectRequestParams_ =
            commonObjectRequestParamsBuilder_ == null
                ? commonObjectRequestParams_
                : commonObjectRequestParamsBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.storage.v2.QueryWriteStatusRequest) {
        return mergeFrom((com.google.storage.v2.QueryWriteStatusRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.storage.v2.QueryWriteStatusRequest other) {
      if (other == com.google.storage.v2.QueryWriteStatusRequest.getDefaultInstance()) return this;
      if (!other.getUploadId().isEmpty()) {
        uploadId_ = other.uploadId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasCommonObjectRequestParams()) {
        mergeCommonObjectRequestParams(other.getCommonObjectRequestParams());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                uploadId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(
                    getCommonObjectRequestParamsFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private java.lang.Object uploadId_ = "";
    /**
     *
     *
     * <pre>
     * Required. The name of the resume token for the object whose write status is
     * being requested.
     * </pre>
     *
     * <code>string upload_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The uploadId.
     */
    public java.lang.String getUploadId() {
      java.lang.Object ref = uploadId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uploadId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the resume token for the object whose write status is
     * being requested.
     * </pre>
     *
     * <code>string upload_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for uploadId.
     */
    public com.google.protobuf.ByteString getUploadIdBytes() {
      java.lang.Object ref = uploadId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        uploadId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the resume token for the object whose write status is
     * being requested.
     * </pre>
     *
     * <code>string upload_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The uploadId to set.
     * @return This builder for chaining.
     */
    public Builder setUploadId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      uploadId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the resume token for the object whose write status is
     * being requested.
     * </pre>
     *
     * <code>string upload_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUploadId() {
      uploadId_ = getDefaultInstance().getUploadId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the resume token for the object whose write status is
     * being requested.
     * </pre>
     *
     * <code>string upload_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for uploadId to set.
     * @return This builder for chaining.
     */
    public Builder setUploadIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      uploadId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.storage.v2.CommonObjectRequestParams commonObjectRequestParams_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.storage.v2.CommonObjectRequestParams,
            com.google.storage.v2.CommonObjectRequestParams.Builder,
            com.google.storage.v2.CommonObjectRequestParamsOrBuilder>
        commonObjectRequestParamsBuilder_;
    /**
     *
     *
     * <pre>
     * A set of parameters common to Storage API requests concerning an object.
     * </pre>
     *
     * <code>.google.storage.v2.CommonObjectRequestParams common_object_request_params = 2;</code>
     *
     * @return Whether the commonObjectRequestParams field is set.
     */
    public boolean hasCommonObjectRequestParams() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * A set of parameters common to Storage API requests concerning an object.
     * </pre>
     *
     * <code>.google.storage.v2.CommonObjectRequestParams common_object_request_params = 2;</code>
     *
     * @return The commonObjectRequestParams.
     */
    public com.google.storage.v2.CommonObjectRequestParams getCommonObjectRequestParams() {
      if (commonObjectRequestParamsBuilder_ == null) {
        return commonObjectRequestParams_ == null
            ? com.google.storage.v2.CommonObjectRequestParams.getDefaultInstance()
            : commonObjectRequestParams_;
      } else {
        return commonObjectRequestParamsBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * A set of parameters common to Storage API requests concerning an object.
     * </pre>
     *
     * <code>.google.storage.v2.CommonObjectRequestParams common_object_request_params = 2;</code>
     */
    public Builder setCommonObjectRequestParams(
        com.google.storage.v2.CommonObjectRequestParams value) {
      if (commonObjectRequestParamsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        commonObjectRequestParams_ = value;
      } else {
        commonObjectRequestParamsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A set of parameters common to Storage API requests concerning an object.
     * </pre>
     *
     * <code>.google.storage.v2.CommonObjectRequestParams common_object_request_params = 2;</code>
     */
    public Builder setCommonObjectRequestParams(
        com.google.storage.v2.CommonObjectRequestParams.Builder builderForValue) {
      if (commonObjectRequestParamsBuilder_ == null) {
        commonObjectRequestParams_ = builderForValue.build();
      } else {
        commonObjectRequestParamsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A set of parameters common to Storage API requests concerning an object.
     * </pre>
     *
     * <code>.google.storage.v2.CommonObjectRequestParams common_object_request_params = 2;</code>
     */
    public Builder mergeCommonObjectRequestParams(
        com.google.storage.v2.CommonObjectRequestParams value) {
      if (commonObjectRequestParamsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && commonObjectRequestParams_ != null
            && commonObjectRequestParams_
                != com.google.storage.v2.CommonObjectRequestParams.getDefaultInstance()) {
          getCommonObjectRequestParamsBuilder().mergeFrom(value);
        } else {
          commonObjectRequestParams_ = value;
        }
      } else {
        commonObjectRequestParamsBuilder_.mergeFrom(value);
      }
      if (commonObjectRequestParams_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A set of parameters common to Storage API requests concerning an object.
     * </pre>
     *
     * <code>.google.storage.v2.CommonObjectRequestParams common_object_request_params = 2;</code>
     */
    public Builder clearCommonObjectRequestParams() {
      bitField0_ = (bitField0_ & ~0x00000002);
      commonObjectRequestParams_ = null;
      if (commonObjectRequestParamsBuilder_ != null) {
        commonObjectRequestParamsBuilder_.dispose();
        commonObjectRequestParamsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A set of parameters common to Storage API requests concerning an object.
     * </pre>
     *
     * <code>.google.storage.v2.CommonObjectRequestParams common_object_request_params = 2;</code>
     */
    public com.google.storage.v2.CommonObjectRequestParams.Builder
        getCommonObjectRequestParamsBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getCommonObjectRequestParamsFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * A set of parameters common to Storage API requests concerning an object.
     * </pre>
     *
     * <code>.google.storage.v2.CommonObjectRequestParams common_object_request_params = 2;</code>
     */
    public com.google.storage.v2.CommonObjectRequestParamsOrBuilder
        getCommonObjectRequestParamsOrBuilder() {
      if (commonObjectRequestParamsBuilder_ != null) {
        return commonObjectRequestParamsBuilder_.getMessageOrBuilder();
      } else {
        return commonObjectRequestParams_ == null
            ? com.google.storage.v2.CommonObjectRequestParams.getDefaultInstance()
            : commonObjectRequestParams_;
      }
    }
    /**
     *
     *
     * <pre>
     * A set of parameters common to Storage API requests concerning an object.
     * </pre>
     *
     * <code>.google.storage.v2.CommonObjectRequestParams common_object_request_params = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.storage.v2.CommonObjectRequestParams,
            com.google.storage.v2.CommonObjectRequestParams.Builder,
            com.google.storage.v2.CommonObjectRequestParamsOrBuilder>
        getCommonObjectRequestParamsFieldBuilder() {
      if (commonObjectRequestParamsBuilder_ == null) {
        commonObjectRequestParamsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.storage.v2.CommonObjectRequestParams,
                com.google.storage.v2.CommonObjectRequestParams.Builder,
                com.google.storage.v2.CommonObjectRequestParamsOrBuilder>(
                getCommonObjectRequestParams(), getParentForChildren(), isClean());
        commonObjectRequestParams_ = null;
      }
      return commonObjectRequestParamsBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.storage.v2.QueryWriteStatusRequest)
  }

  // @@protoc_insertion_point(class_scope:google.storage.v2.QueryWriteStatusRequest)
  private static final com.google.storage.v2.QueryWriteStatusRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.storage.v2.QueryWriteStatusRequest();
  }

  public static com.google.storage.v2.QueryWriteStatusRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryWriteStatusRequest> PARSER =
      new com.google.protobuf.AbstractParser<QueryWriteStatusRequest>() {
        @java.lang.Override
        public QueryWriteStatusRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<QueryWriteStatusRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryWriteStatusRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.storage.v2.QueryWriteStatusRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
