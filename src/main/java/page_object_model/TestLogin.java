package page_object_model;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLogin {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void testValidLogin() throws InterruptedException {
        String expectedTitle = "OrangeHRM";
        HomePage homePage = new HomePage(driver);
        AccountPage accountPage = new AccountPage(driver);
        homePage.enterUsername("Admin");
        homePage.enterPassword("admin123");
        homePage.clickOnLoginButton();
        String actualTitle = accountPage.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test (priority = 0)
    public void testInvalidLogin() throws InterruptedException {
        String expectedMSG = "Invalid credentials";
        HomePage homePage = new HomePage(driver);
        homePage.enterUsername("rachida");
        homePage.enterPassword("aksil");
        homePage.clickOnLoginButton();
        String actualNSG = homePage.getWarningMSG();
        Assert.assertEquals(expectedMSG,actualNSG);
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }


}
