package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    public WebDriver driver;

    public By usernameField = By.xpath("//input[@id='user-name']");
    public By passwordField = By.id("password");
    public By loginButton = By.xpath("//input[@type='submit' and @value='Login']");
    public By homePageText = By.xpath("//div[text()='Swag Labs']");
    public By lockedOutUserNoticeMessage = By.xpath("//h3[text()='Epic sadface: Sorry, this user has been locked out.']");
    public By missingUsernameNoticeMessage = By.xpath("//h3[text()='Epic sadface: Username is required']");
    public By missingPasswordNoticeMessage = By.xpath("//h3[text()='Epic sadface: Password is required']");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin(){
        driver.findElement(loginButton).click();
    }

    public String getHomePageText(){
        return driver.findElement(homePageText).getText();
    }

    public String getLockedOutUserNoticeMessage(){
        return driver.findElement(lockedOutUserNoticeMessage).getText();
    }

    public String getMissingUsernameNoticeMessage(){
        return driver.findElement(missingUsernameNoticeMessage).getText();
    }

    public String getMissingPasswordNoticeMessage(){
        return driver.findElement(missingPasswordNoticeMessage).getText();
    }
}
