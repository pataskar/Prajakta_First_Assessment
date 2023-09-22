import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;

public class brokenLinks2 {
    public static void main(String[] args) throws IOException {

        System.setProperty("web-driver.chrome.driver", "C:/Users/Coditas/Desktop/Automation Contents/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //broken URL
        //Step 1 - is to get all urls ties up to the links using selenium
        //Java method will call URL's & gets you the status code
        //if status code > 400 then that url is not working -> link which is tied to url is broken

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));

        String url = null;
        for (WebElement link : links) {
            url = link.getAttribute("href");

            HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setRequestMethod("HEAD");
            conn.connect();
            int respCode = conn.getResponseCode();
            System.out.println(respCode);

        }

        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
        conn.setRequestMethod("HEAD");
        conn.connect();
        int respCode = conn.getResponseCode();
        System.out.println(respCode);

        if (respCode > 400) {
            //System.out.println("The link with text"+ link.gettext()+" is broken with code" + respCode);
            Assert.assertTrue(false);
        }

    }
}
