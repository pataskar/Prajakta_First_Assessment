import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class liveDemo2 {
    public static void main(String[] args) {

        System.setProperty("web-driver.chrome.driver", "C:/Users/Coditas/Desktop/Automation Contents/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

        //Click on column
        driver.findElement(By.xpath("//tr/th[1]")).click();

        //Capture all webElements into list
        List<WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));

        //Capture text of all webElements into new (original) list
        List<String> sortedList = elementList.stream().map(s->s.getText()).collect(Collectors.toList());

        //Sort on the original list of step 3 -> sorted list
        //List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());


        //Compare original list Vs sorted list
        //Assert.assertTrue(originalList.equals(sortedList));
        List<String> price;

        //Scan the name column with get text -> Rice -> print the price of Rice
        do {
            List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
            price = rows.stream().filter(s -> s.getText().contains("Rice"))
                    .map(s -> getPriceVeggie(s)).collect(Collectors.toList());

            price.forEach(a -> System.out.println(a));
            if (price.size() < 1) {
                driver.findElement(By.cssSelector("[aria-label='Next']")).click();
            }
        }
        while (price.size() < 1);
    }

    private static String getPriceVeggie(WebElement s)
    {
        String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
        return pricevalue;
    }
    }



