// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: calculation.proto

package com.performancetest;

public final class Calculation {
  private Calculation() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpctest_AdditionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpctest_AdditionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpctest_AdditionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpctest_AdditionResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021calculation.proto\022\024com.example.grpctes" +
      "t\"<\n\017AdditionRequest\022\023\n\013firstNumber\030\001 \001(" +
      "\005\022\024\n\014secondNumber\030\002 \001(\005\"\037\n\020AdditionRespo" +
      "nse\022\013\n\003sum\030\001 \001(\0052j\n\022CalculationService\022T" +
      "\n\003add\022%.com.example.grpctest.AdditionReq" +
      "uest\032&.com.example.grpctest.AdditionResp" +
      "onseB\027\n\023com.performancetestP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_example_grpctest_AdditionRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_example_grpctest_AdditionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpctest_AdditionRequest_descriptor,
        new java.lang.String[] { "FirstNumber", "SecondNumber", });
    internal_static_com_example_grpctest_AdditionResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_example_grpctest_AdditionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpctest_AdditionResponse_descriptor,
        new java.lang.String[] { "Sum", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
