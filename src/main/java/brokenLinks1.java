import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class brokenLinks1 {
    public static void main(String[] args) throws IOException {

        System.setProperty("web-driver.chrome.driver", "C:/Users/Coditas/Desktop/Automation Contents/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //broken URL
        //Step 1 - is to get all urls ties up to the links using selenium
        //Java method will call URL's & gets you the status code
        //if status code > 400 then that url is not working -> link which is tied to url is broken

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        String url =  driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");

        HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
        conn.setRequestMethod("HEAD");
        conn.connect();
        int respCode = conn.getResponseCode();
        System.out.println(respCode);



    }
}
