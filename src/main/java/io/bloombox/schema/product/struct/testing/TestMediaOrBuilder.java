/*
 * Copyright 2017, Bloombox, LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: structs/labtesting/TestValue.proto

package io.bloombox.schema.product.struct.testing;

public interface TestMediaOrBuilder extends
    // @@protoc_insertion_point(interface_extends:structs.labtesting.TestMedia)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.structs.labtesting.TestMediaType type = 1;</code>
   */
  int getTypeValue();
  /**
   * <code>.structs.labtesting.TestMediaType type = 1;</code>
   */
  io.bloombox.schema.product.struct.testing.TestMediaType getType();

  /**
   * <code>.media.MediaItem media_item = 2;</code>
   */
  boolean hasMediaItem();
  /**
   * <code>.media.MediaItem media_item = 2;</code>
   */
  io.bloombox.schema.media.MediaItem getMediaItem();
  /**
   * <code>.media.MediaItem media_item = 2;</code>
   */
  io.bloombox.schema.media.MediaItemOrBuilder getMediaItemOrBuilder();
}
