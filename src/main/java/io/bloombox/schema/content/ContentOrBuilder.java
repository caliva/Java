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
// source: content/Content.proto

package io.bloombox.schema.content;

public interface ContentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:content.Content)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.content.Content.Type type = 1;</code>
   */
  int getTypeValue();
  /**
   * <code>.content.Content.Type type = 1;</code>
   */
  io.bloombox.schema.content.Content.Type getType();

  /**
   * <code>.content.Content.Encoding encoding = 2;</code>
   */
  int getEncodingValue();
  /**
   * <code>.content.Content.Encoding encoding = 2;</code>
   */
  io.bloombox.schema.content.Content.Encoding getEncoding();

  /**
   * <code>bytes content = 3;</code>
   */
  com.google.protobuf.ByteString getContent();

  /**
   * <code>.base.Language language = 4;</code>
   */
  int getLanguageValue();
  /**
   * <code>.base.Language language = 4;</code>
   */
  io.bloombox.schema.base.Language getLanguage();

  /**
   * <code>.base.Compression compression = 5;</code>
   */
  boolean hasCompression();
  /**
   * <code>.base.Compression compression = 5;</code>
   */
  io.bloombox.schema.base.Compression getCompression();
  /**
   * <code>.base.Compression compression = 5;</code>
   */
  io.bloombox.schema.base.CompressionOrBuilder getCompressionOrBuilder();
}
