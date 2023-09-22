package TestNG;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class listeners implements ITestListener {
    //@Override
    public void onTestStarts(ITestResult result)
    {
        System.out.println("I successfully Listeners Pass code");
    }
}
