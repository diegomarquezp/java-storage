/*
 * Copyright 2024 Google LLC
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

package com.example.storage.managedfolders;

import static com.google.common.truth.Truth.assertThat;

import com.example.storage.TestBase;
import java.util.UUID;
import org.junit.Test;

public class CreateManagedFolderTest extends TestBase {

  @Test
  public void testCreateManagedFolder() throws Exception {
    String managedFolderName = "new-managed-folder";
    String managedFolderId = "new-managed-folder-" + UUID.randomUUID();
    CreateManagedFolder.managedFolderCreate(bucketName, managedFolderName, managedFolderId);
    assertThat(stdOut.getCapturedOutputAsUtf8String()).contains(managedFolderName);
  }
}

