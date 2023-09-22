package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.URL;

public class day3 {
    @Parameters({"URL"})
    @Test
    public void webLoginCarLoan(String urlName)
    {
        //selenium
        System.out.println("WebLoginCar");
        System.out.println(urlName);
    }

    @Test
    public void mobileLoginCarLoan()
    {
        //appium
        System.out.println("MobileLoginCar");
    }
    @Test
    public void mobileSignUpCarLoan()
    {
        //appium
        System.out.println("MobileSignUpCar");
    }
    @Test
    public void mobileSignOutCarLoan()
    {
        //appium
        System.out.println("MobileSignOutCar");
    }

    @Test(groups = {"smoke"})
    public void apiLoginCarLoan()
    {
        //Rest API automation
        System.out.println("ApiLoginCar");
    }
}
