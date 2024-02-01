package tests.unit;

import calculator.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.DisplayName.class) // if we want to order tests in alphabetical by display name
public class TestCalculatorMultiply {

    @DisplayName("Test Calculator Multiply")
    @Test
    public void testCalculatorMultiply() throws InterruptedException {

        // GIVEN
        // Preconditions
        Calculator calculator = new Calculator();

        // WHEN
        // Steps
        int result = calculator.multiply(2,3);

        // THEN
        // Expected Result (pass/fail criteria)
        int expectedResult = 6;

        assert result == expectedResult: "Wrong result! Expected: " + expectedResult + "Actual: " + result;
        System.out.println("End of test!");
        Thread.sleep(1000);

    }

    @DisplayName("Test Multiply Zero")
    @Test
    public void testMultiply0() throws InterruptedException {

        // GIVEN
        // Preconditions
        Calculator calculator = new Calculator();

        // WHEN
        // Steps
        int result = calculator.multiply(2,0);

        // THEN
        // Expected Result (pass/fail criteria)
        int expectedResult = 0;

        assert result == expectedResult: "Wrong result! Expected: " + expectedResult + "Actual: " + result;
        System.out.println("End of test!");
        Thread.sleep(1000);

    }

}
