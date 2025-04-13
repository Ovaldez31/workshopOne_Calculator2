package com.ps;

public class Main {
    public static void main(String[] args) {

        double principal = 2500.0;
        double annualInterestRate = 0.0275;
        int matureInterestYears = 10;


        // Calculate total number of days  //
        double numberOfDays = matureInterestYears * 365;

        // Calculate daily interest rate //
        double dailyInterestRate =  annualInterestRate / 365;

        // Calculate the future value formula //
        double futureValue = principal * Math.pow(1 + dailyInterestRate, numberOfDays);

        // Calculate total interest earned //
        double totalInterestEarned = futureValue - principal;












    }
}