/*
 *   COPYRIGHT (C) QUALITY SPECTRUM.  OPEN LICENSE FOR PUBLIC USE.
 *   COMPANY CREATED THIS DOCUMENT FOR KNOWLEDGE SHARING PURPOSE
 */
/*====================================================================================================================*/
/*                                    FILE INFORMATION                                                                */
/*====================================================================================================================*/
/*
 *   @file: TestListener
 *   @date: 26-July-2016
 *   @version: 1.0
 *   @author: Ehsen Raza
 */
/*====================================================================================================================*/


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
    public static GlobalParameters globals;
    private Browsers driver = null;
    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {
        globals = new GlobalParameters();
        driver = new Browsers(globals);
        globals.webDrivers = driver.Browser("Chrome");

    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        globals.webDrivers.close();
        globals.webDrivers.quit();
    }
}
