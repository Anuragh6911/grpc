package com.example.grpctest;

import com.example.grpctest.cilents.CalculatorClient;
import org.springframework.stereotype.Component;

@Component
public class CallerClass {
    private final CalculatorClient calculatorClient;

    public CallerClass(CalculatorClient calculatorClient) {
        this.calculatorClient = calculatorClient;
    }

    public void calling(int firstNumber, int secondNumber){
        calculatorClient.addTwoNumbers(firstNumber,secondNumber);
    }

}
