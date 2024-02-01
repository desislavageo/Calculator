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
        System.out.println("The result is ok");

        // THEN
        // Expected Result (pass/fail criteria)
        int expectedResult = 1;

        assert result == expectedResult: "Wrong result! Expected: " + expectedResult + "Actual: " + result;
        System.out.println("End of test!");
        Thread.sleep(1000);
    }

}
