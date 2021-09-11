package BasicPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public abstract class DriverSetup {

    public static WebDriver driver;

    @BeforeSuite
    public static void setDriver(){
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
    }

    @AfterSuite
    public static void close(){
        driver.close();
    }

}
