package com.gqfly.news.server.proto.sms;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.0)",
    comments = "Source: sms.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SmsServiceGrpc {

  private SmsServiceGrpc() {}

  public static final String SERVICE_NAME = "sms.SmsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.gqfly.news.server.proto.sms.SmsRequest,
      com.gqfly.news.server.proto.sms.SmsResponse> getSendSmsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendSms",
      requestType = com.gqfly.news.server.proto.sms.SmsRequest.class,
      responseType = com.gqfly.news.server.proto.sms.SmsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.gqfly.news.server.proto.sms.SmsRequest,
      com.gqfly.news.server.proto.sms.SmsResponse> getSendSmsMethod() {
    io.grpc.MethodDescriptor<com.gqfly.news.server.proto.sms.SmsRequest, com.gqfly.news.server.proto.sms.SmsResponse> getSendSmsMethod;
    if ((getSendSmsMethod = SmsServiceGrpc.getSendSmsMethod) == null) {
      synchronized (SmsServiceGrpc.class) {
        if ((getSendSmsMethod = SmsServiceGrpc.getSendSmsMethod) == null) {
          SmsServiceGrpc.getSendSmsMethod = getSendSmsMethod =
              io.grpc.MethodDescriptor.<com.gqfly.news.server.proto.sms.SmsRequest, com.gqfly.news.server.proto.sms.SmsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sendSms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gqfly.news.server.proto.sms.SmsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gqfly.news.server.proto.sms.SmsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmsServiceMethodDescriptorSupplier("sendSms"))
              .build();
        }
      }
    }
    return getSendSmsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gqfly.news.server.proto.sms.PhoneNumberRequest,
      com.gqfly.news.server.proto.sms.PhoneNumberResponse> getCreatePhoneNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createPhoneNumber",
      requestType = com.gqfly.news.server.proto.sms.PhoneNumberRequest.class,
      responseType = com.gqfly.news.server.proto.sms.PhoneNumberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.gqfly.news.server.proto.sms.PhoneNumberRequest,
      com.gqfly.news.server.proto.sms.PhoneNumberResponse> getCreatePhoneNumberMethod() {
    io.grpc.MethodDescriptor<com.gqfly.news.server.proto.sms.PhoneNumberRequest, com.gqfly.news.server.proto.sms.PhoneNumberResponse> getCreatePhoneNumberMethod;
    if ((getCreatePhoneNumberMethod = SmsServiceGrpc.getCreatePhoneNumberMethod) == null) {
      synchronized (SmsServiceGrpc.class) {
        if ((getCreatePhoneNumberMethod = SmsServiceGrpc.getCreatePhoneNumberMethod) == null) {
          SmsServiceGrpc.getCreatePhoneNumberMethod = getCreatePhoneNumberMethod =
              io.grpc.MethodDescriptor.<com.gqfly.news.server.proto.sms.PhoneNumberRequest, com.gqfly.news.server.proto.sms.PhoneNumberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createPhoneNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gqfly.news.server.proto.sms.PhoneNumberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gqfly.news.server.proto.sms.PhoneNumberResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmsServiceMethodDescriptorSupplier("createPhoneNumber"))
              .build();
        }
      }
    }
    return getCreatePhoneNumberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gqfly.news.server.proto.sms.PhoneNumberRequest,
      com.gqfly.news.server.proto.sms.PhoneNumberResponse> getCreateAndSendSmsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createAndSendSms",
      requestType = com.gqfly.news.server.proto.sms.PhoneNumberRequest.class,
      responseType = com.gqfly.news.server.proto.sms.PhoneNumberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.gqfly.news.server.proto.sms.PhoneNumberRequest,
      com.gqfly.news.server.proto.sms.PhoneNumberResponse> getCreateAndSendSmsMethod() {
    io.grpc.MethodDescriptor<com.gqfly.news.server.proto.sms.PhoneNumberRequest, com.gqfly.news.server.proto.sms.PhoneNumberResponse> getCreateAndSendSmsMethod;
    if ((getCreateAndSendSmsMethod = SmsServiceGrpc.getCreateAndSendSmsMethod) == null) {
      synchronized (SmsServiceGrpc.class) {
        if ((getCreateAndSendSmsMethod = SmsServiceGrpc.getCreateAndSendSmsMethod) == null) {
          SmsServiceGrpc.getCreateAndSendSmsMethod = getCreateAndSendSmsMethod =
              io.grpc.MethodDescriptor.<com.gqfly.news.server.proto.sms.PhoneNumberRequest, com.gqfly.news.server.proto.sms.PhoneNumberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createAndSendSms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gqfly.news.server.proto.sms.PhoneNumberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gqfly.news.server.proto.sms.PhoneNumberResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmsServiceMethodDescriptorSupplier("createAndSendSms"))
              .build();
        }
      }
    }
    return getCreateAndSendSmsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SmsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmsServiceStub>() {
        @java.lang.Override
        public SmsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmsServiceStub(channel, callOptions);
        }
      };
    return SmsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SmsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmsServiceBlockingStub>() {
        @java.lang.Override
        public SmsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmsServiceBlockingStub(channel, callOptions);
        }
      };
    return SmsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SmsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmsServiceFutureStub>() {
        @java.lang.Override
        public SmsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmsServiceFutureStub(channel, callOptions);
        }
      };
    return SmsServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SmsServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sendSms(com.gqfly.news.server.proto.sms.SmsRequest request,
        io.grpc.stub.StreamObserver<com.gqfly.news.server.proto.sms.SmsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendSmsMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.gqfly.news.server.proto.sms.PhoneNumberRequest> createPhoneNumber(
        io.grpc.stub.StreamObserver<com.gqfly.news.server.proto.sms.PhoneNumberResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getCreatePhoneNumberMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.gqfly.news.server.proto.sms.PhoneNumberRequest> createAndSendSms(
        io.grpc.stub.StreamObserver<com.gqfly.news.server.proto.sms.PhoneNumberResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getCreateAndSendSmsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendSmsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.gqfly.news.server.proto.sms.SmsRequest,
                com.gqfly.news.server.proto.sms.SmsResponse>(
                  this, METHODID_SEND_SMS)))
          .addMethod(
            getCreatePhoneNumberMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.gqfly.news.server.proto.sms.PhoneNumberRequest,
                com.gqfly.news.server.proto.sms.PhoneNumberResponse>(
                  this, METHODID_CREATE_PHONE_NUMBER)))
          .addMethod(
            getCreateAndSendSmsMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.gqfly.news.server.proto.sms.PhoneNumberRequest,
                com.gqfly.news.server.proto.sms.PhoneNumberResponse>(
                  this, METHODID_CREATE_AND_SEND_SMS)))
          .build();
    }
  }

  /**
   */
  public static final class SmsServiceStub extends io.grpc.stub.AbstractAsyncStub<SmsServiceStub> {
    private SmsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmsServiceStub(channel, callOptions);
    }

    /**
     */
    public void sendSms(com.gqfly.news.server.proto.sms.SmsRequest request,
        io.grpc.stub.StreamObserver<com.gqfly.news.server.proto.sms.SmsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSendSmsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.gqfly.news.server.proto.sms.PhoneNumberRequest> createPhoneNumber(
        io.grpc.stub.StreamObserver<com.gqfly.news.server.proto.sms.PhoneNumberResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getCreatePhoneNumberMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.gqfly.news.server.proto.sms.PhoneNumberRequest> createAndSendSms(
        io.grpc.stub.StreamObserver<com.gqfly.news.server.proto.sms.PhoneNumberResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getCreateAndSendSmsMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class SmsServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SmsServiceBlockingStub> {
    private SmsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.gqfly.news.server.proto.sms.SmsResponse> sendSms(
        com.gqfly.news.server.proto.sms.SmsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSendSmsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SmsServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SmsServiceFutureStub> {
    private SmsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmsServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SEND_SMS = 0;
  private static final int METHODID_CREATE_PHONE_NUMBER = 1;
  private static final int METHODID_CREATE_AND_SEND_SMS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SmsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SmsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_SMS:
          serviceImpl.sendSms((com.gqfly.news.server.proto.sms.SmsRequest) request,
              (io.grpc.stub.StreamObserver<com.gqfly.news.server.proto.sms.SmsResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_PHONE_NUMBER:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.createPhoneNumber(
              (io.grpc.stub.StreamObserver<com.gqfly.news.server.proto.sms.PhoneNumberResponse>) responseObserver);
        case METHODID_CREATE_AND_SEND_SMS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.createAndSendSms(
              (io.grpc.stub.StreamObserver<com.gqfly.news.server.proto.sms.PhoneNumberResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SmsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.gqfly.news.server.proto.sms.SmsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SmsService");
    }
  }

  private static final class SmsServiceFileDescriptorSupplier
      extends SmsServiceBaseDescriptorSupplier {
    SmsServiceFileDescriptorSupplier() {}
  }

  private static final class SmsServiceMethodDescriptorSupplier
      extends SmsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SmsServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SmsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SmsServiceFileDescriptorSupplier())
              .addMethod(getSendSmsMethod())
              .addMethod(getCreatePhoneNumberMethod())
              .addMethod(getCreateAndSendSmsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
