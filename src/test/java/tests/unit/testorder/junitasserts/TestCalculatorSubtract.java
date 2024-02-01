package tests.unit.testorder.junitasserts;

import calculator.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class) // if we want to order tests by numbers of order annotation
public class TestCalculatorSubtract {


    @Order(1)
    @Test
    public void testCalculatorSubtract() throws InterruptedException {

        // GIVEN
        // Preconditions
        Calculator calculator = new Calculator();

        // WHEN
        // Steps
        int result = calculator.subtract(3, 2);

        // THEN
        // Expected Result (pass/fail criteria)
        int expectedResult = 1;

        assert result == expectedResult : "Wrong result! Expected: " + expectedResult + "Actual: " + result;
        System.out.println("End of test!");
        Thread.sleep(1000);

    }

    @Order(2)
    @Test
    public void testSubtract0() throws InterruptedException {

        // GIVEN
        // Preconditions
        Calculator calculator = new Calculator();

        // WHEN
        // Steps
        int result = calculator.subtract(2, 0);

        // THEN
        // Expected Result (pass/fail criteria)
        int expectedResult = 2;

        assert result == expectedResult : "Wrong result! Expected: " + expectedResult + "Actual: " + result;
        System.out.println("End of test!");
        Thread.sleep(1000);

    }

    @Order(3)
    @Test
    public void testCalculatorSubtractNegativeNumber() throws InterruptedException {

        Calculator calculator = new Calculator();
        String expectedErrorMessageForSpecificMethod = "For this positive subtract method the negative number as a first value is not possible";
        boolean exceptionThrown = false;

        // Approach for exceptions with Java assert mechanism
        try {
            int result = calculator.subtractOnlyForPositiveNumbers(2, 3);
        } catch (IllegalArgumentException e) {
            exceptionThrown = true;
            assert e.getClass().equals(IllegalArgumentException.class) : "Wrong Exception is thrown! Expected: IllegalArgumentException. Actual: " + e.getClass().getSimpleName();
            String actualMessageFromExecution = e.getMessage();
            assert expectedErrorMessageForSpecificMethod.equals(actualMessageFromExecution) : "Wrong Exception Message! Expected: " + expectedErrorMessageForSpecificMethod + "Actual: " + actualMessageFromExecution;
        } catch (Exception e) { //here we check if the exception is different type to IllegalArgumentException
            assert false : "Wrong Exception is thrown! Expected: IllegalArgumentException. Actual: " + e.getClass();
            assert exceptionThrown : "IllegalArgumentException is NOT thrown!";
        }
    }

    @Order(4)
    @Test
    public void testCalculatorSubtractWhitBigNumbersAndJUnitAsserts() throws InterruptedException {

        Calculator calculator = new Calculator();

        int result = calculator.subtract(22, 11);
        int expectedResult = 11;
        System.out.println(result + "Result is: ");
        // JUnit 5 Asserts
        assertEquals(expectedResult, result, "Wrong result");

        System.out.println("End of test!");
        Thread.sleep(1000);

    }
}



