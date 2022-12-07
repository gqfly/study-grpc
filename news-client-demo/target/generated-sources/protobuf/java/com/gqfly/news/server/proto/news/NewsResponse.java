// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: news.proto

package com.gqfly.news.server.proto.news;

/**
 * Protobuf type {@code news.NewsResponse}
 */
public final class NewsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:news.NewsResponse)
    NewsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NewsResponse.newBuilder() to construct.
  private NewsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NewsResponse() {
    news_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NewsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NewsResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              news_ = new java.util.ArrayList<com.gqfly.news.server.proto.news.News>();
              mutable_bitField0_ |= 0x00000001;
            }
            news_.add(
                input.readMessage(com.gqfly.news.server.proto.news.News.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        news_ = java.util.Collections.unmodifiableList(news_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.gqfly.news.server.proto.news.NewsProto.internal_static_news_NewsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.gqfly.news.server.proto.news.NewsProto.internal_static_news_NewsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.gqfly.news.server.proto.news.NewsResponse.class, com.gqfly.news.server.proto.news.NewsResponse.Builder.class);
  }

  public static final int NEWS_FIELD_NUMBER = 1;
  private java.util.List<com.gqfly.news.server.proto.news.News> news_;
  /**
   * <code>repeated .news.News news = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.gqfly.news.server.proto.news.News> getNewsList() {
    return news_;
  }
  /**
   * <code>repeated .news.News news = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.gqfly.news.server.proto.news.NewsOrBuilder> 
      getNewsOrBuilderList() {
    return news_;
  }
  /**
   * <code>repeated .news.News news = 1;</code>
   */
  @java.lang.Override
  public int getNewsCount() {
    return news_.size();
  }
  /**
   * <code>repeated .news.News news = 1;</code>
   */
  @java.lang.Override
  public com.gqfly.news.server.proto.news.News getNews(int index) {
    return news_.get(index);
  }
  /**
   * <code>repeated .news.News news = 1;</code>
   */
  @java.lang.Override
  public com.gqfly.news.server.proto.news.NewsOrBuilder getNewsOrBuilder(
      int index) {
    return news_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < news_.size(); i++) {
      output.writeMessage(1, news_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < news_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, news_.get(i));
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
    if (!(obj instanceof com.gqfly.news.server.proto.news.NewsResponse)) {
      return super.equals(obj);
    }
    com.gqfly.news.server.proto.news.NewsResponse other = (com.gqfly.news.server.proto.news.NewsResponse) obj;

    if (!getNewsList()
        .equals(other.getNewsList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getNewsCount() > 0) {
      hash = (37 * hash) + NEWS_FIELD_NUMBER;
      hash = (53 * hash) + getNewsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.gqfly.news.server.proto.news.NewsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gqfly.news.server.proto.news.NewsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gqfly.news.server.proto.news.NewsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gqfly.news.server.proto.news.NewsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gqfly.news.server.proto.news.NewsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gqfly.news.server.proto.news.NewsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gqfly.news.server.proto.news.NewsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.gqfly.news.server.proto.news.NewsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.gqfly.news.server.proto.news.NewsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.gqfly.news.server.proto.news.NewsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.gqfly.news.server.proto.news.NewsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.gqfly.news.server.proto.news.NewsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.gqfly.news.server.proto.news.NewsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code news.NewsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:news.NewsResponse)
      com.gqfly.news.server.proto.news.NewsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.gqfly.news.server.proto.news.NewsProto.internal_static_news_NewsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.gqfly.news.server.proto.news.NewsProto.internal_static_news_NewsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.gqfly.news.server.proto.news.NewsResponse.class, com.gqfly.news.server.proto.news.NewsResponse.Builder.class);
    }

    // Construct using com.gqfly.news.server.proto.news.NewsResponse.newBuilder()
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
        getNewsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (newsBuilder_ == null) {
        news_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        newsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.gqfly.news.server.proto.news.NewsProto.internal_static_news_NewsResponse_descriptor;
    }

    @java.lang.Override
    public com.gqfly.news.server.proto.news.NewsResponse getDefaultInstanceForType() {
      return com.gqfly.news.server.proto.news.NewsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.gqfly.news.server.proto.news.NewsResponse build() {
      com.gqfly.news.server.proto.news.NewsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.gqfly.news.server.proto.news.NewsResponse buildPartial() {
      com.gqfly.news.server.proto.news.NewsResponse result = new com.gqfly.news.server.proto.news.NewsResponse(this);
      int from_bitField0_ = bitField0_;
      if (newsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          news_ = java.util.Collections.unmodifiableList(news_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.news_ = news_;
      } else {
        result.news_ = newsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.gqfly.news.server.proto.news.NewsResponse) {
        return mergeFrom((com.gqfly.news.server.proto.news.NewsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.gqfly.news.server.proto.news.NewsResponse other) {
      if (other == com.gqfly.news.server.proto.news.NewsResponse.getDefaultInstance()) return this;
      if (newsBuilder_ == null) {
        if (!other.news_.isEmpty()) {
          if (news_.isEmpty()) {
            news_ = other.news_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureNewsIsMutable();
            news_.addAll(other.news_);
          }
          onChanged();
        }
      } else {
        if (!other.news_.isEmpty()) {
          if (newsBuilder_.isEmpty()) {
            newsBuilder_.dispose();
            newsBuilder_ = null;
            news_ = other.news_;
            bitField0_ = (bitField0_ & ~0x00000001);
            newsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getNewsFieldBuilder() : null;
          } else {
            newsBuilder_.addAllMessages(other.news_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.gqfly.news.server.proto.news.NewsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.gqfly.news.server.proto.news.NewsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.gqfly.news.server.proto.news.News> news_ =
      java.util.Collections.emptyList();
    private void ensureNewsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        news_ = new java.util.ArrayList<com.gqfly.news.server.proto.news.News>(news_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.gqfly.news.server.proto.news.News, com.gqfly.news.server.proto.news.News.Builder, com.gqfly.news.server.proto.news.NewsOrBuilder> newsBuilder_;

    /**
     * <code>repeated .news.News news = 1;</code>
     */
    public java.util.List<com.gqfly.news.server.proto.news.News> getNewsList() {
      if (newsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(news_);
      } else {
        return newsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .news.News news = 1;</code>
     */
    public int getNewsCount() {
      if (newsBuilder_ == null) {
        return news_.size();
      } else {
        return newsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .news.News news = 1;</code>
     */
    public com.gqfly.news.server.proto.news.News getNews(int index) {
      if (newsBuilder_ == null) {
        return news_.get(index);
      } else {
        return newsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .news.News news = 1;</code>
     */
    public Builder setNews(
        int index, com.gqfly.news.server.proto.news.News value) {
      if (newsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNewsIsMutable();
        news_.set(index, value);
        onChanged();
      } else {
        newsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .news.News news = 1;</code>
     */
    public Builder setNews(
        int index, com.gqfly.news.server.proto.news.News.Builder builderForValue) {
      if (newsBuilder_ == null) {
        ensureNewsIsMutable();
        news_.set(index, builderForValue.build());
        onChanged();
      } else {
        newsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .news.News news = 1;</code>
     */
    public Builder addNews(com.gqfly.news.server.proto.news.News value) {
      if (newsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNewsIsMutable();
        news_.add(value);
        onChanged();
      } else {
        newsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .news.News news = 1;</code>
     */
    public Builder addNews(
        int index, com.gqfly.news.server.proto.news.News value) {
      if (newsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNewsIsMutable();
        news_.add(index, value);
        onChanged();
      } else {
        newsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .news.News news = 1;</code>
     */
    public Builder addNews(
        com.gqfly.news.server.proto.news.News.Builder builderForValue) {
      if (newsBuilder_ == null) {
        ensureNewsIsMutable();
        news_.add(builderForValue.build());
        onChanged();
      } else {
        newsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .news.News news = 1;</code>
     */
    public Builder addNews(
        int index, com.gqfly.news.server.proto.news.News.Builder builderForValue) {
      if (newsBuilder_ == null) {
        ensureNewsIsMutable();
        news_.add(index, builderForValue.build());
        onChanged();
      } else {
        newsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .news.News news = 1;</code>
     */
    public Builder addAllNews(
        java.lang.Iterable<? extends com.gqfly.news.server.proto.news.News> values) {
      if (newsBuilder_ == null) {
        ensureNewsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, news_);
        onChanged();
      } else {
        newsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .news.News news = 1;</code>
     */
    public Builder clearNews() {
      if (newsBuilder_ == null) {
        news_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        newsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .news.News news = 1;</code>
     */
    public Builder removeNews(int index) {
      if (newsBuilder_ == null) {
        ensureNewsIsMutable();
        news_.remove(index);
        onChanged();
      } else {
        newsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .news.News news = 1;</code>
     */
    public com.gqfly.news.server.proto.news.News.Builder getNewsBuilder(
        int index) {
      return getNewsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .news.News news = 1;</code>
     */
    public com.gqfly.news.server.proto.news.NewsOrBuilder getNewsOrBuilder(
        int index) {
      if (newsBuilder_ == null) {
        return news_.get(index);  } else {
        return newsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .news.News news = 1;</code>
     */
    public java.util.List<? extends com.gqfly.news.server.proto.news.NewsOrBuilder> 
         getNewsOrBuilderList() {
      if (newsBuilder_ != null) {
        return newsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(news_);
      }
    }
    /**
     * <code>repeated .news.News news = 1;</code>
     */
    public com.gqfly.news.server.proto.news.News.Builder addNewsBuilder() {
      return getNewsFieldBuilder().addBuilder(
          com.gqfly.news.server.proto.news.News.getDefaultInstance());
    }
    /**
     * <code>repeated .news.News news = 1;</code>
     */
    public com.gqfly.news.server.proto.news.News.Builder addNewsBuilder(
        int index) {
      return getNewsFieldBuilder().addBuilder(
          index, com.gqfly.news.server.proto.news.News.getDefaultInstance());
    }
    /**
     * <code>repeated .news.News news = 1;</code>
     */
    public java.util.List<com.gqfly.news.server.proto.news.News.Builder> 
         getNewsBuilderList() {
      return getNewsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.gqfly.news.server.proto.news.News, com.gqfly.news.server.proto.news.News.Builder, com.gqfly.news.server.proto.news.NewsOrBuilder> 
        getNewsFieldBuilder() {
      if (newsBuilder_ == null) {
        newsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.gqfly.news.server.proto.news.News, com.gqfly.news.server.proto.news.News.Builder, com.gqfly.news.server.proto.news.NewsOrBuilder>(
                news_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        news_ = null;
      }
      return newsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:news.NewsResponse)
  }

  // @@protoc_insertion_point(class_scope:news.NewsResponse)
  private static final com.gqfly.news.server.proto.news.NewsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.gqfly.news.server.proto.news.NewsResponse();
  }

  public static com.gqfly.news.server.proto.news.NewsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NewsResponse>
      PARSER = new com.google.protobuf.AbstractParser<NewsResponse>() {
    @java.lang.Override
    public NewsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NewsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NewsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NewsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.gqfly.news.server.proto.news.NewsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
