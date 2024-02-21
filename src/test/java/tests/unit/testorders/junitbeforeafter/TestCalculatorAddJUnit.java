package tests.unit.testorders.junitbeforeafter;

import calculator.Calculator;

import org.junit.jupiter.api.*;
import tests.BaseTestClass;

@TestMethodOrder(MethodOrderer.MethodName.class) // if we want to order tests in alphabetical
public class TestCalculatorAddJUnit extends BaseTestClass {

    @BeforeEach
    public void beforeEachTest (){
        System.out.println("Before each test");
    }

    @AfterEach
    public void afterEachTest (){
        System.out.println("After each test");
    }

    @BeforeAll
    public static void beforeAllTestsInClass (){
        System.out.println("Before All tests in class");
    }

    @AfterAll
    public static void afterAllTestsInClass (){
        System.out.println("After All tests in class");
    }

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
