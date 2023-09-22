package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class exercise {
    public static void main(String[] args) throws InterruptedException {

        //TestCase1
        //Invoking the OrangeHRM browser
        System.setProperty("web-driver.chrome.driver", "C:/Users/Coditas/Desktop/Automation Contents/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://narayantomar47-trials710.orangehrmlive.com/client/#/dashboard");
        Thread.sleep(3000);

        //Login using the provided credentials
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("E31IWcW@nk");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        System.out.println("The user is logged in successfully");

        //TestCase2

        //Click on Onboarding
        driver.findElement(By.xpath("//li[@id='left_menu_item_159']")).click();
        Thread.sleep(500);

        //Click on Add icon (+)
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//i[@class='large material-icons']")).click();

        //Fill the details like Name (Unique name-Onboarding)
        driver.findElement(By.xpath("//input[@id='OhrmJob_name']")).sendKeys("prajakta-Onboarding");
        driver.findElement(By.xpath("//input[@id='OhrmJob_newHires']")).sendKeys("Prajakta Pataskar");
        driver.findElement(By.xpath("//input[@id='OhrmJob_owners']")).sendKeys("Testfirst Testlast");

    }
}
