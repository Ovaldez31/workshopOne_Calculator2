package com.ps;

public class Main {
    public static void main(String[] args) {

        double principal = 2500.0;
        double annualInterestRate = 0.0275;
        int matureInterestYears = 10;

        String dailyCompound = "daily"; // dailyCompound represents how often interest is compounded //
        double futureValue = 0.0;

        switch ("") {
            case "daily":
                futureValue = principal * Math.pow(1 + (annualInterestRate / 365), 365 * matureInterestYears);
                break;
            case "monthly":
                futureValue = principal * Math.pow(1 + (annualInterestRate / 12), 12 * matureInterestYears);
                break;
            case "yearly":
                futureValue = principal * Math.pow(1 + annualInterestRate, matureInterestYears);
                break;
            default:
                System.out.println("Daily payment is invalid.");
                futureValue = principal * Math.pow(1 + (annualInterestRate / 365), (365 * matureInterestYears));
                break;
        }

        double interestEarned = futureValue - principal;

        System.out.printf("Original Deposit: $% .2f%n", principal);
        System.out.printf("Annual Interest Rate: % .4f%%%n", annualInterestRate * 100);
        System.out.printf("Years of Interest: %d%n", matureInterestYears);
        System.out.printf("Ending Balance: $% .2f%n", futureValue);
        System.out.printf("Total Interest Earned: $% .2f%n", interestEarned);










    }
}