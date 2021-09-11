package TestCase;

import BasicPackage.DriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC05_ScrollingTest extends DriverSetup {

    private static String baseUrl = "https://www.banglatribune.com/";

    @Test
    public static void ScrollTest() throws InterruptedException {
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //go to the end of page
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        Thread.sleep(3000);

        // specific location scrolling
        WebElement element = driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[3]/div[1]/a[1]"));
        js.executeScript("arguments[0].scrollIntoView();", element);

        Thread.sleep(3000);

        js.executeScript("window.scrollTo(0,0)");
        Thread.sleep(3000);

    }
}
