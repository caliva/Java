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
// source: content/ProductContent.proto

package io.bloombox.schema.content;

public interface ProductTimestampsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:content.ProductTimestamps)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * When the subject product was created.
   * </pre>
   *
   * <code>.temporal.Instant created = 1;</code>
   */
  boolean hasCreated();
  /**
   * <pre>
   * When the subject product was created.
   * </pre>
   *
   * <code>.temporal.Instant created = 1;</code>
   */
  io.bloombox.schema.temporal.Instant getCreated();
  /**
   * <pre>
   * When the subject product was created.
   * </pre>
   *
   * <code>.temporal.Instant created = 1;</code>
   */
  io.bloombox.schema.temporal.InstantOrBuilder getCreatedOrBuilder();

  /**
   * <pre>
   * When the subject product was last modified.
   * </pre>
   *
   * <code>.temporal.Instant modified = 2;</code>
   */
  boolean hasModified();
  /**
   * <pre>
   * When the subject product was last modified.
   * </pre>
   *
   * <code>.temporal.Instant modified = 2;</code>
   */
  io.bloombox.schema.temporal.Instant getModified();
  /**
   * <pre>
   * When the subject product was last modified.
   * </pre>
   *
   * <code>.temporal.Instant modified = 2;</code>
   */
  io.bloombox.schema.temporal.InstantOrBuilder getModifiedOrBuilder();

  /**
   * <pre>
   * When the subject product was last or first published.
   * </pre>
   *
   * <code>.temporal.Instant published = 3;</code>
   */
  boolean hasPublished();
  /**
   * <pre>
   * When the subject product was last or first published.
   * </pre>
   *
   * <code>.temporal.Instant published = 3;</code>
   */
  io.bloombox.schema.temporal.Instant getPublished();
  /**
   * <pre>
   * When the subject product was last or first published.
   * </pre>
   *
   * <code>.temporal.Instant published = 3;</code>
   */
  io.bloombox.schema.temporal.InstantOrBuilder getPublishedOrBuilder();
}
