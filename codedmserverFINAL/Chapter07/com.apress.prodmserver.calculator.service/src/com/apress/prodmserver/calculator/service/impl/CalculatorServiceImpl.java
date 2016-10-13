package com.apress.prodmserver.calculator.service.impl;

import com.apress.prodmserver.calculator.service.CalculatorService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CalculatorServiceImpl implements CalculatorService {

    private Log log = LogFactory.getLog(this.getClass());

    public double add(double a, double b) {
        log.debug("The method add() begins with " + a + ", " + b);
        double result = a + b;
        log.info(a + " + " + b + " = " + result);
        log.debug("The method add() ends with " + result);
        return result;

    }
 
    public double sub(double a, double b) {
    	   log.debug("The method sub() begins with " + a + ", " + b);
           double result = a - b;
           log.info(a + " - " + b + " = " + result);
           log.debug("The method sub() ends with " + result);
           return result;

    }

    public double mul(double a, double b) {
        log.debug("The method mul() begins with " + a + ", " + b);
        double result = a * b;
        log.info(a + " * " + b + " = " + result);
        log.debug("The method mul() ends with " + result);
        return result;
    }

    public double div(double a, double b) {
        log.debug("The method div() begins with " + a + ", " + b);
        double result = a / b;
        log.info(a + " / " + b + " = " + result);
        log.debug("The method div() ends with " + result);
        return result;
    }
}

