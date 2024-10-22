package page_object_model_pagefactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_object_model.HomePage;

public class TestLogin {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }

    @Test(priority = 0)
    public void testInvalidLogin() throws InterruptedException {

        page_object_model.HomePage homePage = new HomePage(driver);
        homePage.enterUsername("rachida");
        homePage.enterPassword("aksil");
        homePage.clickOnLoginButton();

    }
    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
