package com.apress.prodmserver.calculator.client;

import com.apress.prodmserver.calculator.service.CalculatorService;

public class Client {

    private CalculatorService calculatorService;

    public void setCalculatorService(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    public void calculate() {
        calculatorService.add(3, 2);
        calculatorService.sub(3, 2);
        calculatorService.mul(3, 2);
        calculatorService.div(3, 2);
    }
}

