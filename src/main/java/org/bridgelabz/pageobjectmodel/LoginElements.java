package org.bridgelabz.pageobjectmodel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginElements {

    WebDriver driver;
    By emailId = By.xpath("//INPUT[@id='email']");
    By passwd = By.xpath("//INPUT[@id='pass']");
    By loginbutton = By.xpath("//INPUT[@id='email']");

    public LoginElements(WebDriver driver) {
        this.driver = driver;
    }

    public void userEmailId(String email){
        driver.findElement(emailId).sendKeys(email);
    }
    public void userPassword(String userpasswd){
        driver.findElement(passwd).sendKeys(userpasswd);
    }

    public void loginbuttonClick(){
        driver.findElement(loginbutton).click();
    }

}
