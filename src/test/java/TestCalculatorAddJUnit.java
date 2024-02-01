import org.junit.jupiter.api.Test;

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
        System.out.println("The result is ok");

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
        System.out.println("The result is ok");

        // THEN
        // Expected Result (pass/fail criteria)
        int expectedResult = 2;

        assert result == expectedResult: "Wrong result! Expected: " + expectedResult + "Actual: " + result;
        System.out.println("End of test!");
        Thread.sleep(1000);

    }
}
