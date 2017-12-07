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
// source: structs/labtesting/TestResults.proto

package io.bloombox.schema.product.struct.testing;

/**
 * <pre>
 * -- Testing: Cannabinoids
 * </pre>
 *
 * Protobuf enum {@code structs.labtesting.Cannabinoid}
 */
public enum Cannabinoid
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>THC = 0;</code>
   */
  THC(0),
  /**
   * <code>THC_A = 1;</code>
   */
  THC_A(1),
  /**
   * <code>THC_V = 2;</code>
   */
  THC_V(2),
  /**
   * <code>CBD = 10;</code>
   */
  CBD(10),
  /**
   * <code>CBD_A = 11;</code>
   */
  CBD_A(11),
  /**
   * <code>CBD_V = 12;</code>
   */
  CBD_V(12),
  /**
   * <code>CBD_VA = 13;</code>
   */
  CBD_VA(13),
  /**
   * <code>CBC = 20;</code>
   */
  CBC(20),
  /**
   * <code>CBG = 30;</code>
   */
  CBG(30),
  /**
   * <code>CBG_A = 31;</code>
   */
  CBG_A(31),
  /**
   * <code>CBN = 40;</code>
   */
  CBN(40),
  /**
   * <code>CBV = 50;</code>
   */
  CBV(50),
  /**
   * <code>CBV_A = 51;</code>
   */
  CBV_A(51),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>THC = 0;</code>
   */
  public static final int THC_VALUE = 0;
  /**
   * <code>THC_A = 1;</code>
   */
  public static final int THC_A_VALUE = 1;
  /**
   * <code>THC_V = 2;</code>
   */
  public static final int THC_V_VALUE = 2;
  /**
   * <code>CBD = 10;</code>
   */
  public static final int CBD_VALUE = 10;
  /**
   * <code>CBD_A = 11;</code>
   */
  public static final int CBD_A_VALUE = 11;
  /**
   * <code>CBD_V = 12;</code>
   */
  public static final int CBD_V_VALUE = 12;
  /**
   * <code>CBD_VA = 13;</code>
   */
  public static final int CBD_VA_VALUE = 13;
  /**
   * <code>CBC = 20;</code>
   */
  public static final int CBC_VALUE = 20;
  /**
   * <code>CBG = 30;</code>
   */
  public static final int CBG_VALUE = 30;
  /**
   * <code>CBG_A = 31;</code>
   */
  public static final int CBG_A_VALUE = 31;
  /**
   * <code>CBN = 40;</code>
   */
  public static final int CBN_VALUE = 40;
  /**
   * <code>CBV = 50;</code>
   */
  public static final int CBV_VALUE = 50;
  /**
   * <code>CBV_A = 51;</code>
   */
  public static final int CBV_A_VALUE = 51;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Cannabinoid valueOf(int value) {
    return forNumber(value);
  }

  public static Cannabinoid forNumber(int value) {
    switch (value) {
      case 0: return THC;
      case 1: return THC_A;
      case 2: return THC_V;
      case 10: return CBD;
      case 11: return CBD_A;
      case 12: return CBD_V;
      case 13: return CBD_VA;
      case 20: return CBC;
      case 30: return CBG;
      case 31: return CBG_A;
      case 40: return CBN;
      case 50: return CBV;
      case 51: return CBV_A;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Cannabinoid>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Cannabinoid> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Cannabinoid>() {
          public Cannabinoid findValueByNumber(int number) {
            return Cannabinoid.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return io.bloombox.schema.product.struct.testing.LabTesting.getDescriptor().getEnumTypes().get(0);
  }

  private static final Cannabinoid[] VALUES = values();

  public static Cannabinoid valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Cannabinoid(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:structs.labtesting.Cannabinoid)
}
