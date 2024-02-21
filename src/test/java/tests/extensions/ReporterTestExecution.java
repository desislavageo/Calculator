package tests.extensions;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class ReporterTestExecution implements BeforeTestExecutionCallback, AfterTestExecutionCallback {

    @Override
    public void afterTestExecution(ExtensionContext extensionContext) throws Exception {
        String testClass = extensionContext.getTestClass().get().getName();
        String testMethod = extensionContext.getTestMethod().get().getName();
        System.out.println("Starting test " + testMethod + "from " + testClass);

    }

    @Override
    public void beforeTestExecution(ExtensionContext extensionContext) throws Exception {
        String testClass = extensionContext.getTestClass().get().getName();
        String testMethod = extensionContext.getTestMethod().get().getName();
        System.out.println("Ending test " + testMethod + "from " + testClass);
    }
}
