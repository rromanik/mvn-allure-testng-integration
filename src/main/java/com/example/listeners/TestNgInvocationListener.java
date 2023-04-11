package com.example.listeners;

import io.qameta.allure.Attachment;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestContext;
import org.testng.ITestResult;

public class TestNgInvocationListener implements IInvokedMethodListener {
    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {

    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        System.out.println("After Invocation");
        attachMe("After Invocation");
    }

    public void beforeInvocation(IInvokedMethod method, ITestResult testResult, ITestContext context) {

    }

    public void afterInvocation(IInvokedMethod method, ITestResult testResult, ITestContext context) {

    }

    @Attachment(value = "Invoked Method Listener attachment")
    private String attachMe(String text) {
        return text;
    }
}
