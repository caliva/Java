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

public final class BaseTestingSpec {
  private BaseTestingSpec() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_structs_labtesting_TestValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_structs_labtesting_TestValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_structs_labtesting_TestMedia_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_structs_labtesting_TestMedia_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"structs/labtesting/TestValue.proto\022\022st" +
      "ructs.labtesting\032\025media/MediaItem.proto\"" +
      "o\n\tTestValue\022/\n\004type\030\001 \001(\0162!.structs.lab" +
      "testing.TestValueType\022\025\n\013measurement\030\n \001" +
      "(\001H\000\022\021\n\007present\030\024 \001(\010H\000B\007\n\005value\"b\n\tTest" +
      "Media\022/\n\004type\030\001 \001(\0162!.structs.labtesting" +
      ".TestMediaType\022$\n\nmedia_item\030\002 \001(\0132\020.med" +
      "ia.MediaItem*=\n\rTestValueType\022\016\n\nMILLIGR" +
      "AMS\020\000\022\016\n\nPERCENTAGE\020\001\022\014\n\010PRESENCE\020\003*@\n\rT" +
      "estMediaType\022\017\n\013CERTIFICATE\020\000\022\013\n\007RESULTS",
      "\020\001\022\021\n\rPRODUCT_IMAGE\020\002BC\n)io.bloombox.sch" +
      "ema.product.struct.testingB\017BaseTestingS" +
      "pecH\001P\001\370\001\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.bloombox.schema.media.AttachedMedia.getDescriptor(),
        }, assigner);
    internal_static_structs_labtesting_TestValue_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_structs_labtesting_TestValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_structs_labtesting_TestValue_descriptor,
        new java.lang.String[] { "Type", "Measurement", "Present", "Value", });
    internal_static_structs_labtesting_TestMedia_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_structs_labtesting_TestMedia_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_structs_labtesting_TestMedia_descriptor,
        new java.lang.String[] { "Type", "MediaItem", });
    io.bloombox.schema.media.AttachedMedia.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
