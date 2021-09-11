package TestCase;

import BasicPackage.DriverSetup;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC01_VerifyPageTitle extends DriverSetup {
    private static String baseUrl = "http://shvachko.net/?p=2401&lang=en";

    @Test(priority = 1)
    public static void verifyTitle(){
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        String title = driver.getTitle();

        Assert.assertEquals(title,"W3Schools Online Web Tutorials");
    }

    @Test(priority = 2)
    public static void isWebsiteSecured(){
        driver.get(baseUrl);
       var url =  driver.getCurrentUrl();

       boolean isHttpsPresent = url.contains("https");
//       if(url.contains("https")){
//           System.out.println("https enable");
//       }else{
//           System.out.println("not enable ");
//       }

        Assert.assertEquals(isHttpsPresent,true);

    }

}
