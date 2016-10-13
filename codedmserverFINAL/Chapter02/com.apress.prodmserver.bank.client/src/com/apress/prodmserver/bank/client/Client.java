package com.apress.prodmserver.bank.client;

import com.apress.prodmserver.bank.interest.InterestCalculator;

public class Client {

    private InterestCalculator interestCalculator;

    public void setInterestCalculator(InterestCalculator interestCalculator) {
        this.interestCalculator = interestCalculator;
    }

    public void printInterestTable() {
        double principal = 1000;
        double[] years = new double[] { 0.5, 1, 2, 5, 10 };
        System.out.println("Principal\tYear\tInterest");
        for (double year : years) {
            double interest = interestCalculator.calculate(principal, year);
            System.out.println(principal + "\t" + year + "\t" + interest);
        }
    }
}
