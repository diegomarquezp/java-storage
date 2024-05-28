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
 * Specifies a requested range of bytes to download.
 * </pre>
 *
 * Protobuf type {@code google.storage.v2.ContentRange}
 */
public final class ContentRange extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.storage.v2.ContentRange)
    ContentRangeOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ContentRange.newBuilder() to construct.
  private ContentRange(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ContentRange() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ContentRange();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.storage.v2.StorageProto
        .internal_static_google_storage_v2_ContentRange_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.storage.v2.StorageProto
        .internal_static_google_storage_v2_ContentRange_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.storage.v2.ContentRange.class,
            com.google.storage.v2.ContentRange.Builder.class);
  }

  public static final int START_FIELD_NUMBER = 1;
  private long start_ = 0L;
  /**
   *
   *
   * <pre>
   * The starting offset of the object data. This value is inclusive.
   * </pre>
   *
   * <code>int64 start = 1;</code>
   *
   * @return The start.
   */
  @java.lang.Override
  public long getStart() {
    return start_;
  }

  public static final int END_FIELD_NUMBER = 2;
  private long end_ = 0L;
  /**
   *
   *
   * <pre>
   * The ending offset of the object data. This value is exclusive.
   * </pre>
   *
   * <code>int64 end = 2;</code>
   *
   * @return The end.
   */
  @java.lang.Override
  public long getEnd() {
    return end_;
  }

  public static final int COMPLETE_LENGTH_FIELD_NUMBER = 3;
  private long completeLength_ = 0L;
  /**
   *
   *
   * <pre>
   * The complete length of the object data.
   * </pre>
   *
   * <code>int64 complete_length = 3;</code>
   *
   * @return The completeLength.
   */
  @java.lang.Override
  public long getCompleteLength() {
    return completeLength_;
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
    if (start_ != 0L) {
      output.writeInt64(1, start_);
    }
    if (end_ != 0L) {
      output.writeInt64(2, end_);
    }
    if (completeLength_ != 0L) {
      output.writeInt64(3, completeLength_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (start_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, start_);
    }
    if (end_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(2, end_);
    }
    if (completeLength_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(3, completeLength_);
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
    if (!(obj instanceof com.google.storage.v2.ContentRange)) {
      return super.equals(obj);
    }
    com.google.storage.v2.ContentRange other = (com.google.storage.v2.ContentRange) obj;

    if (getStart() != other.getStart()) return false;
    if (getEnd() != other.getEnd()) return false;
    if (getCompleteLength() != other.getCompleteLength()) return false;
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
    hash = (37 * hash) + START_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getStart());
    hash = (37 * hash) + END_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getEnd());
    hash = (37 * hash) + COMPLETE_LENGTH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getCompleteLength());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.storage.v2.ContentRange parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.storage.v2.ContentRange parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.storage.v2.ContentRange parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.storage.v2.ContentRange parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.storage.v2.ContentRange parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.storage.v2.ContentRange parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.storage.v2.ContentRange parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.storage.v2.ContentRange parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.storage.v2.ContentRange parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.storage.v2.ContentRange parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.storage.v2.ContentRange parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.storage.v2.ContentRange parseFrom(
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

  public static Builder newBuilder(com.google.storage.v2.ContentRange prototype) {
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
   * Specifies a requested range of bytes to download.
   * </pre>
   *
   * Protobuf type {@code google.storage.v2.ContentRange}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.storage.v2.ContentRange)
      com.google.storage.v2.ContentRangeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.storage.v2.StorageProto
          .internal_static_google_storage_v2_ContentRange_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.storage.v2.StorageProto
          .internal_static_google_storage_v2_ContentRange_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.storage.v2.ContentRange.class,
              com.google.storage.v2.ContentRange.Builder.class);
    }

    // Construct using com.google.storage.v2.ContentRange.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      start_ = 0L;
      end_ = 0L;
      completeLength_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.storage.v2.StorageProto
          .internal_static_google_storage_v2_ContentRange_descriptor;
    }

    @java.lang.Override
    public com.google.storage.v2.ContentRange getDefaultInstanceForType() {
      return com.google.storage.v2.ContentRange.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.storage.v2.ContentRange build() {
      com.google.storage.v2.ContentRange result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.storage.v2.ContentRange buildPartial() {
      com.google.storage.v2.ContentRange result = new com.google.storage.v2.ContentRange(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.storage.v2.ContentRange result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.start_ = start_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.end_ = end_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.completeLength_ = completeLength_;
      }
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
      if (other instanceof com.google.storage.v2.ContentRange) {
        return mergeFrom((com.google.storage.v2.ContentRange) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.storage.v2.ContentRange other) {
      if (other == com.google.storage.v2.ContentRange.getDefaultInstance()) return this;
      if (other.getStart() != 0L) {
        setStart(other.getStart());
      }
      if (other.getEnd() != 0L) {
        setEnd(other.getEnd());
      }
      if (other.getCompleteLength() != 0L) {
        setCompleteLength(other.getCompleteLength());
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
            case 8:
              {
                start_ = input.readInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                end_ = input.readInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 24:
              {
                completeLength_ = input.readInt64();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
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

    private long start_;
    /**
     *
     *
     * <pre>
     * The starting offset of the object data. This value is inclusive.
     * </pre>
     *
     * <code>int64 start = 1;</code>
     *
     * @return The start.
     */
    @java.lang.Override
    public long getStart() {
      return start_;
    }
    /**
     *
     *
     * <pre>
     * The starting offset of the object data. This value is inclusive.
     * </pre>
     *
     * <code>int64 start = 1;</code>
     *
     * @param value The start to set.
     * @return This builder for chaining.
     */
    public Builder setStart(long value) {

      start_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The starting offset of the object data. This value is inclusive.
     * </pre>
     *
     * <code>int64 start = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearStart() {
      bitField0_ = (bitField0_ & ~0x00000001);
      start_ = 0L;
      onChanged();
      return this;
    }

    private long end_;
    /**
     *
     *
     * <pre>
     * The ending offset of the object data. This value is exclusive.
     * </pre>
     *
     * <code>int64 end = 2;</code>
     *
     * @return The end.
     */
    @java.lang.Override
    public long getEnd() {
      return end_;
    }
    /**
     *
     *
     * <pre>
     * The ending offset of the object data. This value is exclusive.
     * </pre>
     *
     * <code>int64 end = 2;</code>
     *
     * @param value The end to set.
     * @return This builder for chaining.
     */
    public Builder setEnd(long value) {

      end_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The ending offset of the object data. This value is exclusive.
     * </pre>
     *
     * <code>int64 end = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnd() {
      bitField0_ = (bitField0_ & ~0x00000002);
      end_ = 0L;
      onChanged();
      return this;
    }

    private long completeLength_;
    /**
     *
     *
     * <pre>
     * The complete length of the object data.
     * </pre>
     *
     * <code>int64 complete_length = 3;</code>
     *
     * @return The completeLength.
     */
    @java.lang.Override
    public long getCompleteLength() {
      return completeLength_;
    }
    /**
     *
     *
     * <pre>
     * The complete length of the object data.
     * </pre>
     *
     * <code>int64 complete_length = 3;</code>
     *
     * @param value The completeLength to set.
     * @return This builder for chaining.
     */
    public Builder setCompleteLength(long value) {

      completeLength_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The complete length of the object data.
     * </pre>
     *
     * <code>int64 complete_length = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCompleteLength() {
      bitField0_ = (bitField0_ & ~0x00000004);
      completeLength_ = 0L;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.storage.v2.ContentRange)
  }

  // @@protoc_insertion_point(class_scope:google.storage.v2.ContentRange)
  private static final com.google.storage.v2.ContentRange DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.storage.v2.ContentRange();
  }

  public static com.google.storage.v2.ContentRange getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ContentRange> PARSER =
      new com.google.protobuf.AbstractParser<ContentRange>() {
        @java.lang.Override
        public ContentRange parsePartialFrom(
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

  public static com.google.protobuf.Parser<ContentRange> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ContentRange> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.storage.v2.ContentRange getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
