import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.reporters.Files;

import java.io.File;
import java.io.IOException;

public class misclleanous {
    public static void main(String[] args) throws IOException {

        System.setProperty("web-driver.chrome.driver", "C:/Users/Coditas/Desktop/Automation Contents/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        //driver.manage().deleteCookieNamed("sessionKey");

        //click on any link
        //login page verify url

        driver.get("https://google.com");


        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:/Users/Coditas/Desktop/Automation Contents/screenshot.png"));

    }
}
