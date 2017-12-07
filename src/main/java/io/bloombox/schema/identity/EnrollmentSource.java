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
// source: identity/User.proto

package io.bloombox.schema.identity;

/**
 * <pre>
 * Enumerates sources for user enrollments.
 * </pre>
 *
 * Protobuf enum {@code identity.EnrollmentSource}
 */
public enum EnrollmentSource
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Unknown or unspecified enrollment source.
   * </pre>
   *
   * <code>UNSPECIFIED = 0;</code>
   */
  UNSPECIFIED(0),
  /**
   * <pre>
   * Online enrollment.
   * </pre>
   *
   * <code>ONLINE = 1;</code>
   */
  ONLINE(1),
  /**
   * <pre>
   * Internal application to Bloombox.
   * </pre>
   *
   * <code>INTERNAL_APP = 2;</code>
   */
  INTERNAL_APP(2),
  /**
   * <pre>
   * Partner application integration.
   * </pre>
   *
   * <code>PARTNER_APP = 3;</code>
   */
  PARTNER_APP(3),
  /**
   * <pre>
   * In-store physical sign up.
   * </pre>
   *
   * <code>IN_STORE = 4;</code>
   */
  IN_STORE(4),
  /**
   * <pre>
   * Internally imported user.
   * </pre>
   *
   * <code>IMPORT = 5;</code>
   */
  IMPORT(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Unknown or unspecified enrollment source.
   * </pre>
   *
   * <code>UNSPECIFIED = 0;</code>
   */
  public static final int UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Online enrollment.
   * </pre>
   *
   * <code>ONLINE = 1;</code>
   */
  public static final int ONLINE_VALUE = 1;
  /**
   * <pre>
   * Internal application to Bloombox.
   * </pre>
   *
   * <code>INTERNAL_APP = 2;</code>
   */
  public static final int INTERNAL_APP_VALUE = 2;
  /**
   * <pre>
   * Partner application integration.
   * </pre>
   *
   * <code>PARTNER_APP = 3;</code>
   */
  public static final int PARTNER_APP_VALUE = 3;
  /**
   * <pre>
   * In-store physical sign up.
   * </pre>
   *
   * <code>IN_STORE = 4;</code>
   */
  public static final int IN_STORE_VALUE = 4;
  /**
   * <pre>
   * Internally imported user.
   * </pre>
   *
   * <code>IMPORT = 5;</code>
   */
  public static final int IMPORT_VALUE = 5;


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
  public static EnrollmentSource valueOf(int value) {
    return forNumber(value);
  }

  public static EnrollmentSource forNumber(int value) {
    switch (value) {
      case 0: return UNSPECIFIED;
      case 1: return ONLINE;
      case 2: return INTERNAL_APP;
      case 3: return PARTNER_APP;
      case 4: return IN_STORE;
      case 5: return IMPORT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<EnrollmentSource>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      EnrollmentSource> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<EnrollmentSource>() {
          public EnrollmentSource findValueByNumber(int number) {
            return EnrollmentSource.forNumber(number);
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
    return io.bloombox.schema.identity.UserOuterClass.getDescriptor().getEnumTypes().get(2);
  }

  private static final EnrollmentSource[] VALUES = values();

  public static EnrollmentSource valueOf(
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

  private EnrollmentSource(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:identity.EnrollmentSource)
}

