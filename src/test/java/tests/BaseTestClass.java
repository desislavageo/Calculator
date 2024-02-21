package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class BaseTestClass {

    @BeforeAll
    public static void beforeAllTestsParent (){
        System.out.println("Before All Basic tests in Parent class");
    }

    @AfterAll
    public static void afterAllTestsParent (){
        System.out.println("After All Basic tests in Parent class");
    }
}
