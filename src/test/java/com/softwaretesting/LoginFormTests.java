package com.softwaretesting;

import org.junit.Test;
import org.openqa.selenium.By;

public class LoginFormTests extends TestBase{
    String adminLoginPageURL = "http://localhost/litecard/admin/login.php";
    String userNameInputLocator = "username";
    String userPasswordInputLocator = "password";
    String loginButtonNameLocator = "login";
    String errorNotificationNameLocator = "notices";
    String validUserName = "admin";
    String validUserPassword = "admin";
    String checkboxLocator = "remember_me";


    @Test
    public void loginWithBothValidInputs() {
        driver.navigate().to(adminLoginPageURL);
        driver.findElement(By.name(userNameInputLocator)).sendKeys(validUserName);
        driver.findElement(By.name(userPasswordInputLocator)).sendKeys(validUserPassword);
        driver.findElement(By.name(loginButtonNameLocator)).click();
    }

    @Test
    public void loginWithBothEmptyInputs() {
        driver.navigate().to(adminLoginPageURL);
        driver.findElement(By.name(loginButtonNameLocator)).click();
        driver.findElement(By.id(errorNotificationNameLocator));
    }

    @Test
    public void loginWithEmptyNameInput() {
        driver.navigate().to(adminLoginPageURL);
        driver.findElement(By.name(userPasswordInputLocator)).sendKeys(validUserPassword);
        driver.findElement(By.name(loginButtonNameLocator)).click();
        driver.findElement(By.id(errorNotificationNameLocator));
    }

    @Test
    public void loginWithEmptyPasswordInput() {
        driver.navigate().to(adminLoginPageURL);
        driver.findElement(By.name(userNameInputLocator)).sendKeys(validUserName);
        driver.findElement(By.name(loginButtonNameLocator)).click();
        driver.findElement(By.id(errorNotificationNameLocator));
    }

    @Test
    public void loginWithCheckedRememberMe() {
        driver.navigate().to(adminLoginPageURL);
        driver.findElement(By.name(userNameInputLocator)).sendKeys(validUserName);
        driver.findElement(By.name(userPasswordInputLocator)).sendKeys(validUserPassword);
        driver.findElement(By.name(checkboxLocator)).click();
        driver.findElement(By.name(loginButtonNameLocator)).click();
    }

}

