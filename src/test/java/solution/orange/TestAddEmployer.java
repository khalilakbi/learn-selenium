package solution.orange;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_object_model_pagefactory.HomePageHRM;

public class TestAddEmployer {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }

    @Test
    public void tesAddEmployer() throws InterruptedException {
        String firstName = GenerateData.firstName();
        String lastName = GenerateData.lastName();
        Home home = new Home(driver);
        Account account = new Account(driver);
        Employer employer = new Employer(driver);

        home.doLogin("Admin","admin123");
        account.clickOnMenu("PIM");
        Thread.sleep(1000);
        employer.setClickAdd();
        Thread.sleep(1000);
        employer.enterName(firstName);
        employer.enterLastname(lastName);
        employer.setClickSave();


    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
