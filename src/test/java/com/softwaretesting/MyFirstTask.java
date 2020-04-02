package com.softwaretesting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyFirstTask {

    private WebDriver driver = null;
    private WebDriverWait wait;

    @Before
    public void openChrome() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,40);
    }

    @Test
    public void openWebSite() {
        driver.get("https://dou.ua/");
    }

    @After
    public void closeChrome() {
        driver.quit();
        driver = null;
    }

}
