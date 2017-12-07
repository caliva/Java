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
// source: structs/pricing/PricingDescriptor.proto

package io.bloombox.schema.product.struct;

/**
 * <pre>
 * -- Pricing: Objects
 * </pre>
 *
 * Protobuf enum {@code structs.pricing.PricingType}
 */
public enum PricingType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNIT = 0;</code>
   */
  UNIT(0),
  /**
   * <code>WEIGHTED = 1;</code>
   */
  WEIGHTED(1),
  /**
   * <code>FREEBIE = 2;</code>
   */
  FREEBIE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UNIT = 0;</code>
   */
  public static final int UNIT_VALUE = 0;
  /**
   * <code>WEIGHTED = 1;</code>
   */
  public static final int WEIGHTED_VALUE = 1;
  /**
   * <code>FREEBIE = 2;</code>
   */
  public static final int FREEBIE_VALUE = 2;


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
  public static PricingType valueOf(int value) {
    return forNumber(value);
  }

  public static PricingType forNumber(int value) {
    switch (value) {
      case 0: return UNIT;
      case 1: return WEIGHTED;
      case 2: return FREEBIE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PricingType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PricingType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PricingType>() {
          public PricingType findValueByNumber(int number) {
            return PricingType.forNumber(number);
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
    return io.bloombox.schema.product.struct.ProductPricingSpec.getDescriptor().getEnumTypes().get(0);
  }

  private static final PricingType[] VALUES = values();

  public static PricingType valueOf(
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

  private PricingType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:structs.pricing.PricingType)
}
