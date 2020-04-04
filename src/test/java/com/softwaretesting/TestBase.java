package com.softwaretesting;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {
    public WebDriver driver = null;
    public WebDriverWait wait;

    @Before
    public void openChrome() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
    }

    @After
    public void closeChrome() {
        driver.quit();
        driver = null;
    }
}


