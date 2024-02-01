package calculator;

public class Calculator {


    public int add(int a, int b) {
        int result = a + b;
        System.out.println("The result of add is: " + result);
        return result;
    }

    public int subtract(int a, int b) {
        int result = a - b;
        System.out.println("The result of subtract is: " + result);
        return result;
    }
    public int subtractOnlyForPositiveNumbers(int a, int b) {
        if (a < b) {
            throw new IllegalArgumentException("For this positive subtract method the negative number as a first value is not possible");
        }
        int result = a - b;
        System.out.println("The result of subtract is: " + result);
        return result;
    }

    public double divide(double a, double b) {
        double result = a / b;
        System.out.println("The result of divide is: " + result);
        return result;
    }


    public int multiply(int a, int b) {
        int result = a * b;
        System.out.println("The result of multiply is: " + result);
        return result;
    }

    public static double calculateSquareRoot(double number) {
        if (number < 0) {
            return Double.NaN;
        }
        return Math.sqrt(number);
    }

    public int power(int base, int exponent) {
        if (exponent < 0) {
            System.out.println("Error: negative exponent number is not possible.");
            return -1;
        }
        int result = 1;
        // Calculate power
        for (int i = 0; i < exponent; i++) {
            result = result * base;
        }
        return result;
    }

    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("For factorial the negative number is not possible");
        }
        long factorial = 1;

        for (int i = 1; i <= n; ++i) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
