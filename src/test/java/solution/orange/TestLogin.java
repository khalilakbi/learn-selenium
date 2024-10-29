package solution.orange;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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

    @Test(priority = 0)
    public void tesValidLogin() throws InterruptedException {

        Home home = new Home(driver);
        home.enterUsername("Admin");
        home.enterPassword("admin123");
        home.clickOnLogin();

    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

}
