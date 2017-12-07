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
// source: telemetry/v1beta2/commerce/ShopEvents_Beta2.proto

package io.bloombox.schema.services.telemetry.v1beta2;

/**
 * <pre>
 * Specifies an impression event for a physical or digital storefront or shop. For brick-and-mortar locations, this
 * would be passers-by. For a digital storefront, this would be an ad online, an email pixel, or some other prompt.
 * </pre>
 *
 * Protobuf type {@code services.telemetry.v1beta2.ShopImpression}
 */
public  final class ShopImpression extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:services.telemetry.v1beta2.ShopImpression)
    ShopImpressionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ShopImpression.newBuilder() to construct.
  private ShopImpression(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ShopImpression() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ShopImpression(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            io.bloombox.schema.telemetry.AnalyticsContext.Context.Builder subBuilder = null;
            if (context_ != null) {
              subBuilder = context_.toBuilder();
            }
            context_ = input.readMessage(io.bloombox.schema.telemetry.AnalyticsContext.Context.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(context_);
              context_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            io.bloombox.schema.analytics.shop.ShopAnalytics.Impression.Builder subBuilder = null;
            if (impression_ != null) {
              subBuilder = impression_.toBuilder();
            }
            impression_ = input.readMessage(io.bloombox.schema.analytics.shop.ShopAnalytics.Impression.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(impression_);
              impression_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.bloombox.schema.services.telemetry.v1beta2.ShopEventsBeta2.internal_static_services_telemetry_v1beta2_ShopImpression_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.bloombox.schema.services.telemetry.v1beta2.ShopEventsBeta2.internal_static_services_telemetry_v1beta2_ShopImpression_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.bloombox.schema.services.telemetry.v1beta2.ShopImpression.class, io.bloombox.schema.services.telemetry.v1beta2.ShopImpression.Builder.class);
  }

  public static final int CONTEXT_FIELD_NUMBER = 1;
  private io.bloombox.schema.telemetry.AnalyticsContext.Context context_;
  /**
   * <pre>
   * Event context.
   * </pre>
   *
   * <code>.analytics.Context context = 1;</code>
   */
  public boolean hasContext() {
    return context_ != null;
  }
  /**
   * <pre>
   * Event context.
   * </pre>
   *
   * <code>.analytics.Context context = 1;</code>
   */
  public io.bloombox.schema.telemetry.AnalyticsContext.Context getContext() {
    return context_ == null ? io.bloombox.schema.telemetry.AnalyticsContext.Context.getDefaultInstance() : context_;
  }
  /**
   * <pre>
   * Event context.
   * </pre>
   *
   * <code>.analytics.Context context = 1;</code>
   */
  public io.bloombox.schema.telemetry.AnalyticsContext.ContextOrBuilder getContextOrBuilder() {
    return getContext();
  }

  public static final int IMPRESSION_FIELD_NUMBER = 2;
  private io.bloombox.schema.analytics.shop.ShopAnalytics.Impression impression_;
  /**
   * <pre>
   * Shop impression data to submit.
   * </pre>
   *
   * <code>.analytics.shop.Impression impression = 2;</code>
   */
  public boolean hasImpression() {
    return impression_ != null;
  }
  /**
   * <pre>
   * Shop impression data to submit.
   * </pre>
   *
   * <code>.analytics.shop.Impression impression = 2;</code>
   */
  public io.bloombox.schema.analytics.shop.ShopAnalytics.Impression getImpression() {
    return impression_ == null ? io.bloombox.schema.analytics.shop.ShopAnalytics.Impression.getDefaultInstance() : impression_;
  }
  /**
   * <pre>
   * Shop impression data to submit.
   * </pre>
   *
   * <code>.analytics.shop.Impression impression = 2;</code>
   */
  public io.bloombox.schema.analytics.shop.ShopAnalytics.ImpressionOrBuilder getImpressionOrBuilder() {
    return getImpression();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (context_ != null) {
      output.writeMessage(1, getContext());
    }
    if (impression_ != null) {
      output.writeMessage(2, getImpression());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (context_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getContext());
    }
    if (impression_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getImpression());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.bloombox.schema.services.telemetry.v1beta2.ShopImpression)) {
      return super.equals(obj);
    }
    io.bloombox.schema.services.telemetry.v1beta2.ShopImpression other = (io.bloombox.schema.services.telemetry.v1beta2.ShopImpression) obj;

    boolean result = true;
    result = result && (hasContext() == other.hasContext());
    if (hasContext()) {
      result = result && getContext()
          .equals(other.getContext());
    }
    result = result && (hasImpression() == other.hasImpression());
    if (hasImpression()) {
      result = result && getImpression()
          .equals(other.getImpression());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasContext()) {
      hash = (37 * hash) + CONTEXT_FIELD_NUMBER;
      hash = (53 * hash) + getContext().hashCode();
    }
    if (hasImpression()) {
      hash = (37 * hash) + IMPRESSION_FIELD_NUMBER;
      hash = (53 * hash) + getImpression().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.bloombox.schema.services.telemetry.v1beta2.ShopImpression parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.services.telemetry.v1beta2.ShopImpression parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.services.telemetry.v1beta2.ShopImpression parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.services.telemetry.v1beta2.ShopImpression parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.services.telemetry.v1beta2.ShopImpression parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.services.telemetry.v1beta2.ShopImpression parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.services.telemetry.v1beta2.ShopImpression parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.services.telemetry.v1beta2.ShopImpression parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.services.telemetry.v1beta2.ShopImpression parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.services.telemetry.v1beta2.ShopImpression parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.services.telemetry.v1beta2.ShopImpression parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.services.telemetry.v1beta2.ShopImpression parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.bloombox.schema.services.telemetry.v1beta2.ShopImpression prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Specifies an impression event for a physical or digital storefront or shop. For brick-and-mortar locations, this
   * would be passers-by. For a digital storefront, this would be an ad online, an email pixel, or some other prompt.
   * </pre>
   *
   * Protobuf type {@code services.telemetry.v1beta2.ShopImpression}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:services.telemetry.v1beta2.ShopImpression)
      io.bloombox.schema.services.telemetry.v1beta2.ShopImpressionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.bloombox.schema.services.telemetry.v1beta2.ShopEventsBeta2.internal_static_services_telemetry_v1beta2_ShopImpression_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.services.telemetry.v1beta2.ShopEventsBeta2.internal_static_services_telemetry_v1beta2_ShopImpression_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.services.telemetry.v1beta2.ShopImpression.class, io.bloombox.schema.services.telemetry.v1beta2.ShopImpression.Builder.class);
    }

    // Construct using io.bloombox.schema.services.telemetry.v1beta2.ShopImpression.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      if (contextBuilder_ == null) {
        context_ = null;
      } else {
        context_ = null;
        contextBuilder_ = null;
      }
      if (impressionBuilder_ == null) {
        impression_ = null;
      } else {
        impression_ = null;
        impressionBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.bloombox.schema.services.telemetry.v1beta2.ShopEventsBeta2.internal_static_services_telemetry_v1beta2_ShopImpression_descriptor;
    }

    public io.bloombox.schema.services.telemetry.v1beta2.ShopImpression getDefaultInstanceForType() {
      return io.bloombox.schema.services.telemetry.v1beta2.ShopImpression.getDefaultInstance();
    }

    public io.bloombox.schema.services.telemetry.v1beta2.ShopImpression build() {
      io.bloombox.schema.services.telemetry.v1beta2.ShopImpression result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.bloombox.schema.services.telemetry.v1beta2.ShopImpression buildPartial() {
      io.bloombox.schema.services.telemetry.v1beta2.ShopImpression result = new io.bloombox.schema.services.telemetry.v1beta2.ShopImpression(this);
      if (contextBuilder_ == null) {
        result.context_ = context_;
      } else {
        result.context_ = contextBuilder_.build();
      }
      if (impressionBuilder_ == null) {
        result.impression_ = impression_;
      } else {
        result.impression_ = impressionBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.bloombox.schema.services.telemetry.v1beta2.ShopImpression) {
        return mergeFrom((io.bloombox.schema.services.telemetry.v1beta2.ShopImpression)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.bloombox.schema.services.telemetry.v1beta2.ShopImpression other) {
      if (other == io.bloombox.schema.services.telemetry.v1beta2.ShopImpression.getDefaultInstance()) return this;
      if (other.hasContext()) {
        mergeContext(other.getContext());
      }
      if (other.hasImpression()) {
        mergeImpression(other.getImpression());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.bloombox.schema.services.telemetry.v1beta2.ShopImpression parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.bloombox.schema.services.telemetry.v1beta2.ShopImpression) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.bloombox.schema.telemetry.AnalyticsContext.Context context_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.telemetry.AnalyticsContext.Context, io.bloombox.schema.telemetry.AnalyticsContext.Context.Builder, io.bloombox.schema.telemetry.AnalyticsContext.ContextOrBuilder> contextBuilder_;
    /**
     * <pre>
     * Event context.
     * </pre>
     *
     * <code>.analytics.Context context = 1;</code>
     */
    public boolean hasContext() {
      return contextBuilder_ != null || context_ != null;
    }
    /**
     * <pre>
     * Event context.
     * </pre>
     *
     * <code>.analytics.Context context = 1;</code>
     */
    public io.bloombox.schema.telemetry.AnalyticsContext.Context getContext() {
      if (contextBuilder_ == null) {
        return context_ == null ? io.bloombox.schema.telemetry.AnalyticsContext.Context.getDefaultInstance() : context_;
      } else {
        return contextBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Event context.
     * </pre>
     *
     * <code>.analytics.Context context = 1;</code>
     */
    public Builder setContext(io.bloombox.schema.telemetry.AnalyticsContext.Context value) {
      if (contextBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        context_ = value;
        onChanged();
      } else {
        contextBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Event context.
     * </pre>
     *
     * <code>.analytics.Context context = 1;</code>
     */
    public Builder setContext(
        io.bloombox.schema.telemetry.AnalyticsContext.Context.Builder builderForValue) {
      if (contextBuilder_ == null) {
        context_ = builderForValue.build();
        onChanged();
      } else {
        contextBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Event context.
     * </pre>
     *
     * <code>.analytics.Context context = 1;</code>
     */
    public Builder mergeContext(io.bloombox.schema.telemetry.AnalyticsContext.Context value) {
      if (contextBuilder_ == null) {
        if (context_ != null) {
          context_ =
            io.bloombox.schema.telemetry.AnalyticsContext.Context.newBuilder(context_).mergeFrom(value).buildPartial();
        } else {
          context_ = value;
        }
        onChanged();
      } else {
        contextBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Event context.
     * </pre>
     *
     * <code>.analytics.Context context = 1;</code>
     */
    public Builder clearContext() {
      if (contextBuilder_ == null) {
        context_ = null;
        onChanged();
      } else {
        context_ = null;
        contextBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Event context.
     * </pre>
     *
     * <code>.analytics.Context context = 1;</code>
     */
    public io.bloombox.schema.telemetry.AnalyticsContext.Context.Builder getContextBuilder() {
      
      onChanged();
      return getContextFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Event context.
     * </pre>
     *
     * <code>.analytics.Context context = 1;</code>
     */
    public io.bloombox.schema.telemetry.AnalyticsContext.ContextOrBuilder getContextOrBuilder() {
      if (contextBuilder_ != null) {
        return contextBuilder_.getMessageOrBuilder();
      } else {
        return context_ == null ?
            io.bloombox.schema.telemetry.AnalyticsContext.Context.getDefaultInstance() : context_;
      }
    }
    /**
     * <pre>
     * Event context.
     * </pre>
     *
     * <code>.analytics.Context context = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.telemetry.AnalyticsContext.Context, io.bloombox.schema.telemetry.AnalyticsContext.Context.Builder, io.bloombox.schema.telemetry.AnalyticsContext.ContextOrBuilder> 
        getContextFieldBuilder() {
      if (contextBuilder_ == null) {
        contextBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.bloombox.schema.telemetry.AnalyticsContext.Context, io.bloombox.schema.telemetry.AnalyticsContext.Context.Builder, io.bloombox.schema.telemetry.AnalyticsContext.ContextOrBuilder>(
                getContext(),
                getParentForChildren(),
                isClean());
        context_ = null;
      }
      return contextBuilder_;
    }

    private io.bloombox.schema.analytics.shop.ShopAnalytics.Impression impression_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.analytics.shop.ShopAnalytics.Impression, io.bloombox.schema.analytics.shop.ShopAnalytics.Impression.Builder, io.bloombox.schema.analytics.shop.ShopAnalytics.ImpressionOrBuilder> impressionBuilder_;
    /**
     * <pre>
     * Shop impression data to submit.
     * </pre>
     *
     * <code>.analytics.shop.Impression impression = 2;</code>
     */
    public boolean hasImpression() {
      return impressionBuilder_ != null || impression_ != null;
    }
    /**
     * <pre>
     * Shop impression data to submit.
     * </pre>
     *
     * <code>.analytics.shop.Impression impression = 2;</code>
     */
    public io.bloombox.schema.analytics.shop.ShopAnalytics.Impression getImpression() {
      if (impressionBuilder_ == null) {
        return impression_ == null ? io.bloombox.schema.analytics.shop.ShopAnalytics.Impression.getDefaultInstance() : impression_;
      } else {
        return impressionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Shop impression data to submit.
     * </pre>
     *
     * <code>.analytics.shop.Impression impression = 2;</code>
     */
    public Builder setImpression(io.bloombox.schema.analytics.shop.ShopAnalytics.Impression value) {
      if (impressionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        impression_ = value;
        onChanged();
      } else {
        impressionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Shop impression data to submit.
     * </pre>
     *
     * <code>.analytics.shop.Impression impression = 2;</code>
     */
    public Builder setImpression(
        io.bloombox.schema.analytics.shop.ShopAnalytics.Impression.Builder builderForValue) {
      if (impressionBuilder_ == null) {
        impression_ = builderForValue.build();
        onChanged();
      } else {
        impressionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Shop impression data to submit.
     * </pre>
     *
     * <code>.analytics.shop.Impression impression = 2;</code>
     */
    public Builder mergeImpression(io.bloombox.schema.analytics.shop.ShopAnalytics.Impression value) {
      if (impressionBuilder_ == null) {
        if (impression_ != null) {
          impression_ =
            io.bloombox.schema.analytics.shop.ShopAnalytics.Impression.newBuilder(impression_).mergeFrom(value).buildPartial();
        } else {
          impression_ = value;
        }
        onChanged();
      } else {
        impressionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Shop impression data to submit.
     * </pre>
     *
     * <code>.analytics.shop.Impression impression = 2;</code>
     */
    public Builder clearImpression() {
      if (impressionBuilder_ == null) {
        impression_ = null;
        onChanged();
      } else {
        impression_ = null;
        impressionBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Shop impression data to submit.
     * </pre>
     *
     * <code>.analytics.shop.Impression impression = 2;</code>
     */
    public io.bloombox.schema.analytics.shop.ShopAnalytics.Impression.Builder getImpressionBuilder() {
      
      onChanged();
      return getImpressionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Shop impression data to submit.
     * </pre>
     *
     * <code>.analytics.shop.Impression impression = 2;</code>
     */
    public io.bloombox.schema.analytics.shop.ShopAnalytics.ImpressionOrBuilder getImpressionOrBuilder() {
      if (impressionBuilder_ != null) {
        return impressionBuilder_.getMessageOrBuilder();
      } else {
        return impression_ == null ?
            io.bloombox.schema.analytics.shop.ShopAnalytics.Impression.getDefaultInstance() : impression_;
      }
    }
    /**
     * <pre>
     * Shop impression data to submit.
     * </pre>
     *
     * <code>.analytics.shop.Impression impression = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.analytics.shop.ShopAnalytics.Impression, io.bloombox.schema.analytics.shop.ShopAnalytics.Impression.Builder, io.bloombox.schema.analytics.shop.ShopAnalytics.ImpressionOrBuilder> 
        getImpressionFieldBuilder() {
      if (impressionBuilder_ == null) {
        impressionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.bloombox.schema.analytics.shop.ShopAnalytics.Impression, io.bloombox.schema.analytics.shop.ShopAnalytics.Impression.Builder, io.bloombox.schema.analytics.shop.ShopAnalytics.ImpressionOrBuilder>(
                getImpression(),
                getParentForChildren(),
                isClean());
        impression_ = null;
      }
      return impressionBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:services.telemetry.v1beta2.ShopImpression)
  }

  // @@protoc_insertion_point(class_scope:services.telemetry.v1beta2.ShopImpression)
  private static final io.bloombox.schema.services.telemetry.v1beta2.ShopImpression DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.bloombox.schema.services.telemetry.v1beta2.ShopImpression();
  }

  public static io.bloombox.schema.services.telemetry.v1beta2.ShopImpression getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ShopImpression>
      PARSER = new com.google.protobuf.AbstractParser<ShopImpression>() {
    public ShopImpression parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ShopImpression(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ShopImpression> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ShopImpression> getParserForType() {
    return PARSER;
  }

  public io.bloombox.schema.services.telemetry.v1beta2.ShopImpression getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

