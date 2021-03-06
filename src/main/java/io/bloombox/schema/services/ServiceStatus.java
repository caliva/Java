/*
 * Copyright 2017, Bloombox, LLC. All rights reserved.
 *
 * Source and object computer code contained herein is the private intellectual property
 * of Bloombox, a California Limited Liability Corporation. Use of this code in source form
 * requires permission in writing before use or the publishing of derivative works, for
 * commercial purposes or any other purpose, from a duly authorized officer of Momentum
 * Ideas Co.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/ServiceStatus.proto

package io.bloombox.schema.services;

/**
 * <pre>
 * Specifies the status of this service in PING responses.
 * </pre>
 *
 * Protobuf enum {@code services.ServiceStatus}
 */
public enum ServiceStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * The state of the service is not known.
   * </pre>
   *
   * <code>UNKNOWN = 0;</code>
   */
  UNKNOWN(0),
  /**
   * <pre>
   * The service is up and functioning normally.
   * </pre>
   *
   * <code>UP = 1;</code>
   */
  UP(1),
  /**
   * <pre>
   * The service is down.
   * </pre>
   *
   * <code>DOWN = 2;</code>
   */
  DOWN(2),
  /**
   * <pre>
   * The service is under maintenance.
   * </pre>
   *
   * <code>MAINTENANCE = 3;</code>
   */
  MAINTENANCE(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * The state of the service is not known.
   * </pre>
   *
   * <code>UNKNOWN = 0;</code>
   */
  public static final int UNKNOWN_VALUE = 0;
  /**
   * <pre>
   * The service is up and functioning normally.
   * </pre>
   *
   * <code>UP = 1;</code>
   */
  public static final int UP_VALUE = 1;
  /**
   * <pre>
   * The service is down.
   * </pre>
   *
   * <code>DOWN = 2;</code>
   */
  public static final int DOWN_VALUE = 2;
  /**
   * <pre>
   * The service is under maintenance.
   * </pre>
   *
   * <code>MAINTENANCE = 3;</code>
   */
  public static final int MAINTENANCE_VALUE = 3;


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
  public static ServiceStatus valueOf(int value) {
    return forNumber(value);
  }

  public static ServiceStatus forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN;
      case 1: return UP;
      case 2: return DOWN;
      case 3: return MAINTENANCE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ServiceStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ServiceStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ServiceStatus>() {
          public ServiceStatus findValueByNumber(int number) {
            return ServiceStatus.forNumber(number);
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
    return io.bloombox.schema.services.ServiceStatusOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final ServiceStatus[] VALUES = values();

  public static ServiceStatus valueOf(
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

  private ServiceStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:services.ServiceStatus)
}

