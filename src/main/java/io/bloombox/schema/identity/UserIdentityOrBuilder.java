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

public interface UserIdentityOrBuilder extends
    // @@protoc_insertion_point(interface_extends:identity.UserIdentity)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Provider for this external/foreign account.
   * </pre>
   *
   * <code>.identity.IdentityProvider provider = 1;</code>
   */
  int getProviderValue();
  /**
   * <pre>
   * Provider for this external/foreign account.
   * </pre>
   *
   * <code>.identity.IdentityProvider provider = 1;</code>
   */
  io.bloombox.schema.identity.IdentityProvider getProvider();

  /**
   * <pre>
   * Unique ID for this account with the specified provider.
   * </pre>
   *
   * <code>string id = 2;</code>
   */
  java.lang.String getId();
  /**
   * <pre>
   * Unique ID for this account with the specified provider.
   * </pre>
   *
   * <code>string id = 2;</code>
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Timestamp for when this identity was last user to authenticate the underlying user.
   * </pre>
   *
   * <code>.temporal.Instant seen = 3;</code>
   */
  boolean hasSeen();
  /**
   * <pre>
   * Timestamp for when this identity was last user to authenticate the underlying user.
   * </pre>
   *
   * <code>.temporal.Instant seen = 3;</code>
   */
  io.bloombox.schema.temporal.Instant getSeen();
  /**
   * <pre>
   * Timestamp for when this identity was last user to authenticate the underlying user.
   * </pre>
   *
   * <code>.temporal.Instant seen = 3;</code>
   */
  io.bloombox.schema.temporal.InstantOrBuilder getSeenOrBuilder();
}