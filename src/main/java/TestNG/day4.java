package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
    @Test
    public void webLoginHomeLoan()
    {
        //selenium
        System.out.println("WebLoginHome");
    }

    @Parameters({"URL"})
    @Test
    public void mobileLoginHomeLoan(String urlName)
    {
        //appium
        System.out.println("MobileLoginHome");
        System.out.println(urlName);
    }

    @Test(dependsOnMethods = {"webLoginHomeLoan"})
    public void apiLoginHomeLoan()
    {
        //Rest API automation
        System.out.println("ApiLoginHome");
    }
}
