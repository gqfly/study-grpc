// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: news.proto

package com.gqfly.springboot.server.proto.news;

public final class NewsProto {
  private NewsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_news_StringRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_news_StringRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_news_StringResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_news_StringResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nnews.proto\022\004news\"\035\n\rStringRequest\022\014\n\004n" +
      "ame\030\001 \001(\t\" \n\016StringResponse\022\016\n\006result\030\001 " +
      "\001(\t2A\n\013NewsService\0222\n\005hello\022\023.news.Strin" +
      "gRequest\032\024.news.StringResponseB5\n&com.gq" +
      "fly.springboot.server.proto.newsB\tNewsPr" +
      "otoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_news_StringRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_news_StringRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_news_StringRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_news_StringResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_news_StringResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_news_StringResponse_descriptor,
        new java.lang.String[] { "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
