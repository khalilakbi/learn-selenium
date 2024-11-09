package fazia_TestNG.pom1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {
    public void onTestStart(ITestResult result) {

        System.out.println("test case start");
    }

    public void onTestSuccess(ITestResult result) {

        System.out.println("test case pass");
    }

    public void onTestFailure(ITestResult result) {

        System.out.println("test case fail");
    }

    public void onTestSkipped(ITestResult result) {
    }



    public void onStart(ITestContext context) {
    }

    public void onFinish(ITestContext context) {
    }
}


