import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class calender {
    public static void main(String[] args) {

        System.setProperty("web-driver.chrome.driver", "C:/Users/Coditas/Desktop/Automation Contents/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.path2usa.com/travel-companion");
        //October 15
        driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).click();

        while (!driver.findElement(By.cssSelector("[class='flatpickr-current-month'] [class='cur-month']")).getText().contains("October"))
            ;
        {
            driver.findElement(By.xpath("//body/div[10]/div[1]/span[2]/*[1]")).click();
        }
        while (true) //While loop keep on executing untill it becomes false
        {

        }

        //List<WebElement> dates = driver.findElements(By.className("flatpickr-day"));
        //Grab the common attribute //Put into List and iterate
        //int count = driver.findElements(By.className("flatpickr-day")).size();

        //for (int i=0; i<count; i++)
        //}{
        //String text = driver.findElements(By.className("flatpickr-day")).get(i).getText();
        //if (text.equalsIgnoreCase("15"));
        //{
        //driver.findElements(By.className("flatpickr-day")).get(i).click();
        // break;
        //}

        //}


        //}
    }
}

