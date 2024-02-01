package tests.integration;

import calculator.Calculator;

import org.junit.jupiter.api.Test;

public class CalculatorFactorialITCase {

    @Test
    public void testFactorial0() throws InterruptedException {
        // GIVEN
        // Preconditions
        Calculator calculator = new Calculator();

        // WHEN
        // Steps
        long result = calculator.factorial(0);

        // THEN
        // Expected Result (pass/fail criteria)
        int expectedResult = 1;

        assert result == expectedResult : "Wrong result! Expected: " + expectedResult + "Actual: " + result;
        System.out.println("End of test!");
        Thread.sleep(1000);
    }

    // Functional integration test
    // When the name of class contains "ITCase" we can trigger the tests from Failsafe Maven Plugin verify Lifecycle - and exclude and include rule in dependency
    @Test
    public void testIntegrationFactorialAndAdd() throws InterruptedException {
        Calculator calculator = new Calculator();

        // Factorial
        long result = calculator.factorial(0);
        int expectedResult = 1;
        assert result == expectedResult : "Wrong result! Expected: " + expectedResult + "Actual: " + result;

        // Take a value from Factorial method and include in Add calculation
        int resultCombination = calculator.add((int) result, 1);
        int expectedFromAdd = 2;
        assert resultCombination == expectedFromAdd : "Wrong result after factorial calculation and add " + expectedFromAdd + "Actual: " + resultCombination;
        System.out.println("End of test!");
        Thread.sleep(1000);
    }

}
