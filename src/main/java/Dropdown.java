import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("web-driver.chrome.driver","C:/Users/Coditas/Desktop/Automation Contents/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        //  //a[@value='MAA'] - Xpath for Chennai
        //  //a[@value='BLR'] - Xpath for Bengaluru

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(2000);

        //driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();

        //  //div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA'] --> Xpath --> Parent child relationship

        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();


    }
}
