package tests.extensions.testwithextentions;

import calculator.Calculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import tests.extensions.ReporterTestExecution;

@ExtendWith(ReporterTestExecution.class)
public class TestCalculatorDivide {

    @Test
    public void testCalculatorDivide() throws InterruptedException {

        // GIVEN
        // Preconditions
        Calculator calculator = new Calculator();

        // WHEN
        // Steps
       double result = calculator.divide(6,2);

        // THEN
        // Expected Result (pass/fail criteria)
        int expectedResult = 3;

        assert result == expectedResult: "Wrong result! Expected: " + expectedResult + "Actual: " + result;
        System.out.println("End of test!");
        Thread.sleep(1000);

    }
}
