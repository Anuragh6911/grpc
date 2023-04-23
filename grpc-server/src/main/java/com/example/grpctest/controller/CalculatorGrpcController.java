package com.example.grpctest.controller;


import com.performancetest.AdditionRequest;
import com.performancetest.AdditionResponse;
import com.performancetest.CalculationServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

@GRpcService
public class CalculatorGrpcController extends CalculationServiceGrpc.CalculationServiceImplBase {
    @Override
    public void add(AdditionRequest request, StreamObserver<AdditionResponse> responseObserver) {
        int firstNumber = request.getFirstNumber();
        int secondNumber = request.getSecondNumber();

        //this calculation logic is normally placed in service directory.
        int sum = firstNumber + secondNumber;

        AdditionResponse response = AdditionResponse.newBuilder()
                .setSum(sum)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
