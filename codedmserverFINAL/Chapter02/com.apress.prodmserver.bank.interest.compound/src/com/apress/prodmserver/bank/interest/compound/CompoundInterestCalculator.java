package com.apress.prodmserver.bank.interest.compound;

import com.apress.prodmserver.bank.interest.InterestCalculator;
import com.apress.prodmserver.bank.rate.RateCalculator;

public class CompoundInterestCalculator implements InterestCalculator {

    private RateCalculator rateCalculator;

    public void setRateCalculator(RateCalculator rateCalculator) {
        this.rateCalculator = rateCalculator;
    }

    public double calculate(double principal, double year) {
        return principal
                * (Math.pow(1 + rateCalculator.getMonthlyRate(), year * 12) - 1);
    }
}
