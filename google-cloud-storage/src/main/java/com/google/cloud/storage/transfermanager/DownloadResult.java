/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.storage.transfermanager;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkState;

import com.google.cloud.storage.BlobInfo;
import com.google.common.base.MoreObjects;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.MonotonicNonNull;
import org.checkerframework.checker.nullness.qual.NonNull;

public final class DownloadResult {
  static final Comparator<DownloadResult> COMPARATOR =
      Comparator.comparingInt(dr -> dr.getStatus().ordinal());

  @NonNull private final BlobInfo input;
  @MonotonicNonNull private final Path outputDestination;
  @NonNull private final TransferStatus status;
  @MonotonicNonNull private final Exception exception;

  private DownloadResult(
      @NonNull BlobInfo input,
      Path outputDestination,
      @NonNull TransferStatus status,
      Exception exception) {
    this.input = input;
    this.outputDestination = outputDestination;
    this.status = status;
    this.exception = exception;
  }

  public @NonNull BlobInfo getInput() {
    return input;
  }

  public @NonNull Path getOutputDestination() {
    checkState(
        status == TransferStatus.SUCCESS,
        "getOutputDestination() is only valid when status is SUCCESS but status was %s",
        status);
    return outputDestination;
  }

  public @NonNull TransferStatus getStatus() {
    return status;
  }

  public @NonNull Exception getException() {
    checkState(
        status == TransferStatus.FAILED_TO_FINISH || status == TransferStatus.FAILED_TO_START,
        "getException() is only valid when an unexpected error has occurred but status was %s",
        status);
    return exception;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DownloadResult that = (DownloadResult) o;
    return input.equals(that.input)
        && outputDestination.equals(that.outputDestination)
        && status == that.status
        && exception.equals(that.exception);
  }

  @Override
  public int hashCode() {
    return Objects.hash(input, outputDestination, status, exception);
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("input", input)
        .add("outputDestination", outputDestination)
        .add("status", status)
        .add("exception", exception)
        .toString();
  }

  public static Builder newBuilder(@NonNull BlobInfo blobInfo, @NonNull TransferStatus status) {
    return new Builder(blobInfo, status);
  }

  public static final class Builder {

    private @NonNull BlobInfo input;
    private @MonotonicNonNull Path outputDestination;
    private @NonNull TransferStatus status;
    private @MonotonicNonNull Exception exception;

    private Builder(@NonNull BlobInfo input, @NonNull TransferStatus status) {
      this.input = input;
      this.status = status;
    }

    public Builder setInput(@NonNull BlobInfo input) {
      this.input = input;
      return this;
    }

    public Builder setOutputDestination(@NonNull Path outputDestination) {
      this.outputDestination = outputDestination;
      return this;
    }

    public Builder setStatus(@NonNull TransferStatus status) {
      this.status = status;
      return this;
    }

    public Builder setException(@NonNull Exception exception) {
      this.exception = exception;
      return this;
    }

    public DownloadResult build() {
      checkNotNull(input);
      checkNotNull(status);
      if (status == TransferStatus.SUCCESS) {
        checkNotNull(outputDestination);
      } else if (status == TransferStatus.FAILED_TO_START
          || status == TransferStatus.FAILED_TO_FINISH) {
        checkNotNull(exception);
      }
      return new DownloadResult(input, outputDestination, status, exception);
    }
  }
}
