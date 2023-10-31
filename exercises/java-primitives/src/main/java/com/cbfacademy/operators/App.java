package com.cbfacademy.operators;

public class App {
    public static void main(String[] args) {
        double operand1 = 20.3;
        double operand2 = 3.0;
        double additionResult = add(operand1, operand2);
        double subtractionResult = subtract(operand1, operand2);
        double multiplicationResult = multiply(operand1, operand2);
        Boolean equalityResult = areEqual(operand1, operand2);
        Boolean lessThanResult = isLessThan(operand1, operand2);
        Boolean moreThanResult = isMoreThan(operand1, operand2);

        System.out.println(" Addition: " + additionResult);
        System.out.println(" Subtraction: " + subtractionResult);
        System.out.println(" Multiplication: " + multiplicationResult);
        System.out.println(" Equality: " + equalityResult);
        System.out.println(" Less than: " + lessThanResult);
        System.out.println(" More than: " + moreThanResult);
    }

    public static double add(double operand1, double operand2) {
        return operand1 + operand2;
    }

    public static double subtract(double operand1, double operand2) {
        return operand1 - operand2;
    }

    public static double multiply(double operand1, double operand2) {
        return operand1 * operand2;
    }

    public static Boolean areEqual(double operand1, double operand2) {
        return operand1 == operand2;
    }

    public static Boolean isLessThan(double operand1, double operand2) {
        return operand1 < operand2;
    }

    public static Boolean isMoreThan(double operand1, double operand2) {
        return operand1 > operand2;
    }
}
