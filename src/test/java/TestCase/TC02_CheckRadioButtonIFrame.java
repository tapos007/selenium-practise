package TestCase;

import BasicPackage.DriverSetup;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC02_CheckRadioButtonIFrame extends DriverSetup {

    private static String baseUrl = "https://jqueryui.com/checkboxradio/";

    @Test(priority = 1)
    public static void RadioTest() throws InterruptedException {
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        Thread.sleep(5000);

        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//body/div/fieldset[1]/label[3]")).click();
        Thread.sleep(5000);
        driver.switchTo().defaultContent();
    }

    @Test(priority = 2)
    public static void CheckBoxTest() throws InterruptedException {
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        Thread.sleep(5000);

        driver.switchTo().frame( 0);
        driver.findElement(By.xpath("//body/div[1]/fieldset[2]/label[2]")).click();
        driver.findElement(By.xpath("//body/div[1]/fieldset[2]/label[4]")).click();

        Thread.sleep(5000);
        driver.switchTo().defaultContent();
    }
}
