package com.performancetest;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: calculation.proto")
public final class CalculationServiceGrpc {

  private CalculationServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.grpctest.CalculationService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.performancetest.AdditionRequest,
      com.performancetest.AdditionResponse> METHOD_ADD =
      io.grpc.MethodDescriptor.<com.performancetest.AdditionRequest, com.performancetest.AdditionResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.example.grpctest.CalculationService", "add"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.performancetest.AdditionRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.performancetest.AdditionResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CalculationServiceStub newStub(io.grpc.Channel channel) {
    return new CalculationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CalculationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CalculationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CalculationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CalculationServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CalculationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void add(com.performancetest.AdditionRequest request,
        io.grpc.stub.StreamObserver<com.performancetest.AdditionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ADD, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_ADD,
            asyncUnaryCall(
              new MethodHandlers<
                com.performancetest.AdditionRequest,
                com.performancetest.AdditionResponse>(
                  this, METHODID_ADD)))
          .build();
    }
  }

  /**
   */
  public static final class CalculationServiceStub extends io.grpc.stub.AbstractStub<CalculationServiceStub> {
    private CalculationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CalculationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CalculationServiceStub(channel, callOptions);
    }

    /**
     */
    public void add(com.performancetest.AdditionRequest request,
        io.grpc.stub.StreamObserver<com.performancetest.AdditionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ADD, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CalculationServiceBlockingStub extends io.grpc.stub.AbstractStub<CalculationServiceBlockingStub> {
    private CalculationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CalculationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CalculationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.performancetest.AdditionResponse add(com.performancetest.AdditionRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ADD, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CalculationServiceFutureStub extends io.grpc.stub.AbstractStub<CalculationServiceFutureStub> {
    private CalculationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CalculationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CalculationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.performancetest.AdditionResponse> add(
        com.performancetest.AdditionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ADD, getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CalculationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CalculationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD:
          serviceImpl.add((com.performancetest.AdditionRequest) request,
              (io.grpc.stub.StreamObserver<com.performancetest.AdditionResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class CalculationServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.performancetest.Calculation.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CalculationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CalculationServiceDescriptorSupplier())
              .addMethod(METHOD_ADD)
              .build();
        }
      }
    }
    return result;
  }
}
