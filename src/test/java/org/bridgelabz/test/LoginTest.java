package org.bridgelabz.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.bridgelabz.pageobjectmodel.LoginElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    public  static WebDriver driver = null;

    @Test
    public void verifyFbLogin() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://en-gb.facebook.com/login/");

        LoginElements loginelements = new LoginElements(driver);

        loginelements.userEmailId("ary1@gmail.com");
        Thread.sleep(2000);
        loginelements.userPassword("gatepassword");
        Thread.sleep(2000);
        loginelements.loginbuttonClick();
        Thread.sleep(5000);
         //driver.quit();
    }
}
