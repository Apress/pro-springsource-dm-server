package com.apress.prodmserver.bank.interest.simple;

import com.apress.prodmserver.bank.interest.InterestCalculator;
import com.apress.prodmserver.bank.rate.RateCalculator;

public class SimpleInterestCalculator implements InterestCalculator {

    private RateCalculator rateCalculator;

    public void setRateCalculator(RateCalculator rateCalculator) {
        this.rateCalculator = rateCalculator;
    }

    public double calculate(double principal, double year) {
        return principal * year * rateCalculator.getAnnualRate();
    }
}
