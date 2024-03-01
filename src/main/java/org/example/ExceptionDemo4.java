package org.example;

import java.util.Scanner;

public class ExceptionDemo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter Initial balance");
            double initialBalance = scanner.nextDouble();
            // nested try-catch block
            try {
                System.out.println("Enter amount to withdraw");
                double withDrawalAmount = scanner.nextDouble();
                validateWithDrawalAmount = update(initialBalance, withDrawalAmount);
                System.out.println("Updated balance after the withdrawal" + withDrawalAmount);
            } catch (InvalidWithDrawalException e) {
                System.out.println("Invalid withdrawal amount: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("An error occured" + e.getMessage());
            } finally {
                // this code will always get executed
                System.out.println("finally block executed");
                scanner.close();
            }
        }
    }
    private static void validateWithdrawalAmount(double withDrawalAmount) throws InvalidWithDrawalException {
        if (withDrawalAmount == 0) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal")
        }
    }

    private static void validateWithdrawalAmount(double withDrawalAmount) throws InvalidWithDrawalException {
        if (withDrawalAmount == 0) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal")
        }
    }
}
