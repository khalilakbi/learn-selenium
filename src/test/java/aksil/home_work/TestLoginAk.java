package aksil.home_work;

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

public class TestLoginAk {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));


    }
    @Test(priority = 0)
    public void tesValidLogin() throws InterruptedException {
        String expectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        HomePageHRM homePageHRM = new HomePageHRM(driver);
        homePageHRM.enterUsername("Admin");
        homePageHRM.enterPassword("admin123");
        homePageHRM.clickOnLogin();
        String actualUrl=driver.getCurrentUrl();
        //Assertion
        Assert.assertEquals(expectedUrl, actualUrl);


    }

    @Test(priority = 1)
    public void testInvalidLogin() throws InterruptedException {
        String expectedURL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        HomePageHRM homePageHRM = new HomePageHRM(driver);
        homePageHRM.enterUsername("abcdef");
        homePageHRM.enterPassword("abcez");
        homePageHRM.clickOnLogin();
        String actualURL = driver.getCurrentUrl();
        // assertion
        Assert.assertEquals(expectedURL, actualURL);
//"//p[text()='Invalid credentials']"


    }
    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}