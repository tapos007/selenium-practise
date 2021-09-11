package TestCase;

import BasicPackage.DriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static BasicPackage.DriverSetup.driver;

public class TC03_02_DropDownMultiSelect extends DriverSetup {

    private static String baseUrl = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple";

    @Test(priority = 1)
    public static void DropDownMultiSelect() throws InterruptedException {
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        Thread.sleep(3000);
        driver.switchTo().frame(0);
        Select laura = new Select(driver.findElement(By.id("cars")));
        //   fruits.selectByVisibleText("Audi");
        laura.selectByIndex(1);
        laura.selectByIndex(3);

        Thread.sleep(3000);
        laura.deselectAll();

        Thread.sleep(3000);



        if(laura.isMultiple()){
            System.out.println("multi select");
        }else{
            System.out.println("its not multiselect");
        }

        Thread.sleep(3000);
        driver.switchTo().defaultContent();
    }
}
