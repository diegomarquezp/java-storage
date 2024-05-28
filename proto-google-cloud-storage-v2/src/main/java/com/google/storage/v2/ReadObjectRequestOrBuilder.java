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

public interface ReadObjectRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.storage.v2.ReadObjectRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the bucket containing the object to read.
   * </pre>
   *
   * <code>
   * string bucket = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bucket.
   */
  java.lang.String getBucket();
  /**
   *
   *
   * <pre>
   * Required. The name of the bucket containing the object to read.
   * </pre>
   *
   * <code>
   * string bucket = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for bucket.
   */
  com.google.protobuf.ByteString getBucketBytes();

  /**
   *
   *
   * <pre>
   * Required. The name of the object to read.
   * </pre>
   *
   * <code>string object = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The object.
   */
  java.lang.String getObject();
  /**
   *
   *
   * <pre>
   * Required. The name of the object to read.
   * </pre>
   *
   * <code>string object = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for object.
   */
  com.google.protobuf.ByteString getObjectBytes();

  /**
   *
   *
   * <pre>
   * If present, selects a specific revision of this object (as opposed
   * to the latest version, the default).
   * </pre>
   *
   * <code>int64 generation = 3;</code>
   *
   * @return The generation.
   */
  long getGeneration();

  /**
   *
   *
   * <pre>
   * The offset for the first byte to return in the read, relative to the start
   * of the object.
   *
   * A negative `read_offset` value will be interpreted as the number of bytes
   * back from the end of the object to be returned. For example, if an object's
   * length is 15 bytes, a ReadObjectRequest with `read_offset` = -5 and
   * `read_limit` = 3 would return bytes 10 through 12 of the object. Requesting
   * a negative offset with magnitude larger than the size of the object will
   * return the entire object.
   * </pre>
   *
   * <code>int64 read_offset = 4;</code>
   *
   * @return The readOffset.
   */
  long getReadOffset();

  /**
   *
   *
   * <pre>
   * The maximum number of `data` bytes the server is allowed to return in the
   * sum of all `Object` messages. A `read_limit` of zero indicates that there
   * is no limit, and a negative `read_limit` will cause an error.
   *
   * If the stream returns fewer bytes than allowed by the `read_limit` and no
   * error occurred, the stream includes all data from the `read_offset` to the
   * end of the resource.
   * </pre>
   *
   * <code>int64 read_limit = 5;</code>
   *
   * @return The readLimit.
   */
  long getReadLimit();

  /**
   *
   *
   * <pre>
   * Makes the operation conditional on whether the object's current generation
   * matches the given value. Setting to 0 makes the operation succeed only if
   * there are no live versions of the object.
   * </pre>
   *
   * <code>optional int64 if_generation_match = 6;</code>
   *
   * @return Whether the ifGenerationMatch field is set.
   */
  boolean hasIfGenerationMatch();
  /**
   *
   *
   * <pre>
   * Makes the operation conditional on whether the object's current generation
   * matches the given value. Setting to 0 makes the operation succeed only if
   * there are no live versions of the object.
   * </pre>
   *
   * <code>optional int64 if_generation_match = 6;</code>
   *
   * @return The ifGenerationMatch.
   */
  long getIfGenerationMatch();

  /**
   *
   *
   * <pre>
   * Makes the operation conditional on whether the object's live generation
   * does not match the given value. If no live object exists, the precondition
   * fails. Setting to 0 makes the operation succeed only if there is a live
   * version of the object.
   * </pre>
   *
   * <code>optional int64 if_generation_not_match = 7;</code>
   *
   * @return Whether the ifGenerationNotMatch field is set.
   */
  boolean hasIfGenerationNotMatch();
  /**
   *
   *
   * <pre>
   * Makes the operation conditional on whether the object's live generation
   * does not match the given value. If no live object exists, the precondition
   * fails. Setting to 0 makes the operation succeed only if there is a live
   * version of the object.
   * </pre>
   *
   * <code>optional int64 if_generation_not_match = 7;</code>
   *
   * @return The ifGenerationNotMatch.
   */
  long getIfGenerationNotMatch();

  /**
   *
   *
   * <pre>
   * Makes the operation conditional on whether the object's current
   * metageneration matches the given value.
   * </pre>
   *
   * <code>optional int64 if_metageneration_match = 8;</code>
   *
   * @return Whether the ifMetagenerationMatch field is set.
   */
  boolean hasIfMetagenerationMatch();
  /**
   *
   *
   * <pre>
   * Makes the operation conditional on whether the object's current
   * metageneration matches the given value.
   * </pre>
   *
   * <code>optional int64 if_metageneration_match = 8;</code>
   *
   * @return The ifMetagenerationMatch.
   */
  long getIfMetagenerationMatch();

  /**
   *
   *
   * <pre>
   * Makes the operation conditional on whether the object's current
   * metageneration does not match the given value.
   * </pre>
   *
   * <code>optional int64 if_metageneration_not_match = 9;</code>
   *
   * @return Whether the ifMetagenerationNotMatch field is set.
   */
  boolean hasIfMetagenerationNotMatch();
  /**
   *
   *
   * <pre>
   * Makes the operation conditional on whether the object's current
   * metageneration does not match the given value.
   * </pre>
   *
   * <code>optional int64 if_metageneration_not_match = 9;</code>
   *
   * @return The ifMetagenerationNotMatch.
   */
  long getIfMetagenerationNotMatch();

  /**
   *
   *
   * <pre>
   * A set of parameters common to Storage API requests concerning an object.
   * </pre>
   *
   * <code>.google.storage.v2.CommonObjectRequestParams common_object_request_params = 10;</code>
   *
   * @return Whether the commonObjectRequestParams field is set.
   */
  boolean hasCommonObjectRequestParams();
  /**
   *
   *
   * <pre>
   * A set of parameters common to Storage API requests concerning an object.
   * </pre>
   *
   * <code>.google.storage.v2.CommonObjectRequestParams common_object_request_params = 10;</code>
   *
   * @return The commonObjectRequestParams.
   */
  com.google.storage.v2.CommonObjectRequestParams getCommonObjectRequestParams();
  /**
   *
   *
   * <pre>
   * A set of parameters common to Storage API requests concerning an object.
   * </pre>
   *
   * <code>.google.storage.v2.CommonObjectRequestParams common_object_request_params = 10;</code>
   */
  com.google.storage.v2.CommonObjectRequestParamsOrBuilder getCommonObjectRequestParamsOrBuilder();

  /**
   *
   *
   * <pre>
   * Mask specifying which fields to read.
   * The checksummed_data field and its children will always be present.
   * If no mask is specified, will default to all fields except metadata.owner
   * and metadata.acl.
   * * may be used to mean "all fields".
   * </pre>
   *
   * <code>optional .google.protobuf.FieldMask read_mask = 12;</code>
   *
   * @return Whether the readMask field is set.
   */
  boolean hasReadMask();
  /**
   *
   *
   * <pre>
   * Mask specifying which fields to read.
   * The checksummed_data field and its children will always be present.
   * If no mask is specified, will default to all fields except metadata.owner
   * and metadata.acl.
   * * may be used to mean "all fields".
   * </pre>
   *
   * <code>optional .google.protobuf.FieldMask read_mask = 12;</code>
   *
   * @return The readMask.
   */
  com.google.protobuf.FieldMask getReadMask();
  /**
   *
   *
   * <pre>
   * Mask specifying which fields to read.
   * The checksummed_data field and its children will always be present.
   * If no mask is specified, will default to all fields except metadata.owner
   * and metadata.acl.
   * * may be used to mean "all fields".
   * </pre>
   *
   * <code>optional .google.protobuf.FieldMask read_mask = 12;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getReadMaskOrBuilder();
}
