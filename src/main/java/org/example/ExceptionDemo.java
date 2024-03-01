package org.example;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("result" + result);
        } catch (ArithmeticException ex) {
            System.out.println("Exception" + ex.getMessage());
        }
        System.out.println("This is nornal flow conditionning"); // we haev to make it more that this line will get executed
    }

    private static int divide(int divided, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("there is no way a number can be devided by zero");
        }
        return divided / divisor;
    }
}
