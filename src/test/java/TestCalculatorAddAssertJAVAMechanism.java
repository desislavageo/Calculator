public class TestCalculatorAddAssertJAVAMechanism {

    public static void main(String[] args) {

        // create unit tests for specific feature in this case add method
        Calculator calculator = new Calculator();
        int result = calculator.add(2,3);
        System.out.println("The result is ok");
        // this assert is JAVA assert mechanism
        assert  result ==5: "Wrong result! Expected: 5, Actual: " + result;
        System.out.println("End of test!");



    }
}
