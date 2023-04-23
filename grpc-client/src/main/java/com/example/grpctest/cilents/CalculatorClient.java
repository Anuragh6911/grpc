package com.example.grpctest.cilents;

import com.performancetest.AdditionRequest;
import com.performancetest.AdditionResponse;
import com.performancetest.CalculationServiceGrpc;
import org.springframework.stereotype.Component;


@Component
public class CalculatorClient {
    private final CalculationServiceGrpc.CalculationServiceBlockingStub calculationServiceBlockingStub;

    public CalculatorClient(CalculationServiceGrpc.CalculationServiceBlockingStub calculationServiceBlockingStub) {
        this.calculationServiceBlockingStub = calculationServiceBlockingStub;
    }

    public void addTwoNumbers(int firstNumber, int secondNumber) {
        try {
            AdditionRequest additionRequest = AdditionRequest.newBuilder()
                    .setFirstNumber(firstNumber)
                    .setSecondNumber(secondNumber)
                    .build();
            AdditionResponse response = calculationServiceBlockingStub.add(additionRequest);
            int sum = response.getSum();
            System.out.println("The sum of the given number is " + sum);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

}
