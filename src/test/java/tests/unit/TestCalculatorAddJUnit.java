package tests.unit;

import calculator.Calculator;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.MethodName.class) // if we want to order tests in alphabetical
public class TestCalculatorAddJUnit {

    //methods are NOT static
    @Test
    public void testCalculatorAdd() throws InterruptedException {

        // GIVEN
        // Preconditions
        Calculator calculator = new Calculator();

        // WHEN
        // Steps
        int result = calculator.add(2,3);

        // THEN
        // Expected Result (pass/fail criteria)
        int expectedResult = 5;

        assert result == expectedResult: "Wrong result! Expected: " + expectedResult + "Actual: " + result;
        System.out.println("End of test!");
        Thread.sleep(1000);

    }

    @Test
    public void testAdd0() throws InterruptedException {

        // GIVEN
        // Preconditions
        Calculator calculator = new Calculator();

        // WHEN
        // Steps
        int result = calculator.add(2,0);

        // THEN
        // Expected Result (pass/fail criteria)
        int expectedResult = 2;

        assert result == expectedResult: "Wrong result! Expected: " + expectedResult + "Actual: " + result;
        System.out.println("End of test!");
        Thread.sleep(1000);

    }
}
