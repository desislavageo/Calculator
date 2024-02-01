import org.junit.jupiter.api.Test;

public class TestCalculatorMultiply {

    @Test
    public void testCalculatorMultiply() throws InterruptedException {

        // GIVEN
        // Preconditions
        Calculator calculator = new Calculator();

        // WHEN
        // Steps
        int result = calculator.multiply(2,3);
        System.out.println("The result is ok");

        // THEN
        // Expected Result (pass/fail criteria)
        int expectedResult = 6;

        assert result == expectedResult: "Wrong result! Expected: " + expectedResult + "Actual: " + result;
        System.out.println("End of test!");
        Thread.sleep(1000);

    }

    @Test
    public void testMultiply0() throws InterruptedException {

        // GIVEN
        // Preconditions
        Calculator calculator = new Calculator();

        // WHEN
        // Steps
        int result = calculator.multiply(2,0);
        System.out.println("The result is ok");

        // THEN
        // Expected Result (pass/fail criteria)
        int expectedResult = 0;

        assert result == expectedResult: "Wrong result! Expected: " + expectedResult + "Actual: " + result;
        System.out.println("End of test!");
        Thread.sleep(1000);

    }
}
