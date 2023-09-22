import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("web-driver.chrome.driver", "C:/Users/Coditas/Desktop/Automation Contents/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        Thread.sleep(3000);
        Actions a =new Actions(driver);
        WebElement move = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));

        a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();

        //Moves to specific element
        a.moveToElement(move).contextClick().build().perform();

    }
}
