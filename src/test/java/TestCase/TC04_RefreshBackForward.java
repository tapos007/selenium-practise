package TestCase;

import BasicPackage.DriverSetup;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC04_RefreshBackForward extends DriverSetup {

    private static String baseUrl = "https://www.banglatribune.com/";
    @Test
    public static void refeshBackForward() throws InterruptedException {
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        Thread.sleep(5000);

        driver.navigate().refresh();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
        Thread.sleep(5000);

        driver.navigate().back();

        Thread.sleep(5000);

        driver.navigate().forward();

        Thread.sleep(5000);

        driver.navigate().to("https://www.prothomalo.com/");


    }
}
