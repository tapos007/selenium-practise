package TestCase;

import BasicPackage.DriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC06_RightAndDoubleClick extends DriverSetup {
    private static String baseUrl = "https://www.banglatribune.com/";

    @Test
    public static void ScrollTest() throws InterruptedException {
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        WebElement elementLocator = driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]"));
        actions.contextClick(elementLocator).perform();

        Thread.sleep(3000);
        driver.switchTo().defaultContent();
    }
}
