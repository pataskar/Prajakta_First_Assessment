import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class assignment1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web-driver.chrome.driver", "C:/Users/Coditas/Desktop/Automation Contents/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice");

        driver.findElement(By.cssSelector("input[id*='Option1']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='Option1']")).isSelected());
        System.out.println(driver.findElement(By.cssSelector("input[id*='Option1']")).isSelected());
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='checkbox']")).click();
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='Option1']")).isSelected());
        System.out.println(driver.findElement(By.cssSelector("input[id*='Option1']")).isSelected());

        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
    }
}
