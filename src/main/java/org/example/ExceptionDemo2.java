package org.example;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        try {
            // som part of the code may throw an exception
            int result = divide(10, 0);
            System.out.println("result" + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught here" + e.getMessage());
        }
        System.out.println("Normal flow should not be interrupted yet");
    }

    private static int divide(int divided, int divisor) throws ArithmeticException {
        if (divisor == 0) {
            System.out.println("You cant divide by zero");
        }
        return divided / divisor;
    }
}
