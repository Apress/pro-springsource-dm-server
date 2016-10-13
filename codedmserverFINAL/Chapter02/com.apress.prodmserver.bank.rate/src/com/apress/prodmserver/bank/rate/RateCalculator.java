package com.apress.prodmserver.bank.rate;

public interface RateCalculator {

    public double getAnnualRate();
    public double getMonthlyRate();
    public double getDailyRate();
}
