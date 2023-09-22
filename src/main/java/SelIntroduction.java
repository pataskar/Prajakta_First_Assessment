import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {
    public static void main(String[] args) {

        //Invoking Browser
        //Chrome - ChromeDriver exten -> Methods close get
        //Firefox - FirefoxDriver exten -> Methods close get
        //Safari - SafariDriver exten -> Methods close get
        //WebDriver close get
        //WebDriver methods = class methods

        //chromedriver.exten -> chrome browser
        //System.setProperty("web-driver.chrome.driver","C:/Users/Coditas/Desktop/Automation Contents/chromedriver.exe");

        //webdriver.chrome.driver -> value of path
        //WebDriver driver = new ChromeDriver();

        //Firefox launch
        //geckodriver
        //webdriver.gecko.driver

        //System.setProperty("web-driver.gecko.driver","C:/Users/Coditas/Desktop/Automation Contents/geckodriver.exe");
        //WebDriver driver = new FirefoxDriver();

        //Microsoft edge
        System.setProperty("web-driver.edge.driver","C:/Users/Coditas/Desktop/Automation Contents/edge.exe");
        WebDriver driver = new EdgeDriver();

        driver.get("https://rahulshettyacademy.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        //driver.close();
        //driver.quit();


    }
}
