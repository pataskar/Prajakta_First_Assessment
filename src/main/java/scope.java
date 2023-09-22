import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class scope {
    public static void main(String[] args) throws InterruptedException {

        //1. Give me the count of links present on the page
        //2. Count of footer section

        System.setProperty("web-driver.chrome.driver", "C:/Users/Coditas/Desktop/Automation Contents/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.findElements(By.tagName("a")).size());
        WebElement footerDriver = driver.findElement(By.id("gf-BIG")); // Limiting webdriver scope
        System.out.println(footerDriver.findElements(By.tagName("a")).size());

        //3. How many links are present in the first column.
         WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(columnDriver.findElements(By.tagName("a")).size());

        //4. Click on each link in the column and check if the pages are opening.
        for (int i=1; i<columnDriver.findElements(By.tagName("a")).size(); i++)
        {
            String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
            columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
            Thread.sleep(2000);
        } // Opens all the tabs

            Set<String> abc = driver.getWindowHandles();  //4
            Iterator<String> it = abc.iterator();

            while (it.hasNext())
            {
                driver.switchTo().window(it.next());
                System.out.println(driver.getTitle());
            }


        }


    }

