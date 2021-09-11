package TestCase;

import BasicPackage.DriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC03_DropDown extends DriverSetup {
    private static String baseUrl = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select";

    @Test(priority = 1)
    public static void RadioTest() throws InterruptedException {
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        Thread.sleep(3000);
        driver.switchTo().frame(0);
        Select laura = new Select(driver.findElement(By.id("cars")));
     //   fruits.selectByVisibleText("Audi");
        laura.selectByIndex(2);

        if(laura.isMultiple()){
            System.out.println("multi select");
        }else{
            System.out.println("its not multiselect");
        }

        Thread.sleep(3000);
        driver.switchTo().defaultContent();
    }
}
