package solution.aksil;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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

        HomePageHRM homePageHRM = new HomePageHRM(driver);
        homePageHRM.enterUsername("Admin");
        homePageHRM.enterPassword("admin123");
        homePageHRM.clickOnLogin();

    }

    @Test(priority = 1)
    public void testInvalidLogin() throws InterruptedException {

        HomePageHRM homePageHRM = new HomePageHRM(driver);
        homePageHRM.enterUsername("abcdef");
        homePageHRM.enterPassword("abcez");
        homePageHRM.clickOnLogin();

    }
    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}