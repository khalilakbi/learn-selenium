package aksil.home_work;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSearchEmployee {
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

    @Test
    public void validSearchEmployee() throws InterruptedException {
        //String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        HomePage homePage = new HomePage(driver);
        EmployerPage employerPage = new EmployerPage(driver);
        homePage.enterUsername("Admin");
        homePage.enterPassword("admin123");
        homePage.clickOnLogin();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='PIM']")));
        employerPage.setClickPIM();


//        WebDriverWait wait1 = new WebDriverWait(driver, 30);
//        wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[text()='Employee Name']")));
//        homePage.enterEmployeeName("Amelia  Brown");

        WebDriverWait wait2 = new WebDriverWait(driver, 30);
        wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type='submit']")));
        homePage.clickSearchButton();
    }
}
