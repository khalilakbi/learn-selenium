package aksil.system;

import aksil.base.Base;
import aksil.pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_object_model_pagefactory.HomePageHRM;

import static aksil.base.Base.driver;

public class TestLogin extends Base {
    String validUsername = "Admin";
    String validPassword = "admin123";
    String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";

    public void validLogin() {

        HomePage homePage = new HomePage();
        homePage.enterUsername(validUsername);
        homePage.enterPassword(validPassword);
        homePage.clickOnLogin();
        String actualUrl = driver.getCurrentUrl();
        //Assertion
        Assert.assertEquals(expectedUrl, actualUrl);
    }
    @Test
    public void invalidLogin() {
        HomePage homePage = new HomePage();
        homePage.enterUsername("Admin");
        // homePage.enterPassword("");
        homePage.clickOnLogin();
        homePage.isRequiredMSGDisplay();
        // assertion
        Assert.assertTrue(homePage.isRequiredMSGDisplay());
    }
    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}