import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class liveDemoFilter3 {
    public static void main(String[] args) {

        System.setProperty("web-driver.chrome.driver", "C:/Users/Coditas/Desktop/Automation Contents/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

        driver.findElement(By.id("search-field")).sendKeys("Rice");
        List<WebElement> veggies = driver.findElements(By.xpath("//tr/td[1]"));
        //1 Result
        List<WebElement> filteredList = veggies.stream().filter(veggie->veggie.getText().contains("Rice"))
                .collect(Collectors.toList());
        //1 Result
        Assert.assertEquals(veggies.size(), filteredList.size());


    }
}
