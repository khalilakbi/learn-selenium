package solution.orangeHRM;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;




public class TestAddEmployer {
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
    public void addEmployee() throws InterruptedException {
        String user = "peter";
        String lastName = "test";
//        String expectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewPersonalDetails/empNumber/226";
        EmployerPage employerPage = new EmployerPage(driver);
        employerPage.enterUsername("Admin");
        employerPage.enterPassword("admin123");
        employerPage.clickOnLogin();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='PIM']")));
        employerPage.setClickPIM();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")));
        employerPage.setClickAdd();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='firstName']")));
        employerPage.enterName(user);
        employerPage.enterMiddleName(lastName);
        employerPage.enterLastname("LastNameTest");
        employerPage.setClickSave();
       //        String actualURL=driver.getCurrentUrl();
//        Assert.assertEquals(expectedUrl, actualURL);

      String actualUserText = employerPage.getUserNAme();
      Assert.assertTrue(actualUserText.contains(user));

    }

    @Test(priority = 1)
    public void addEmployeeError() throws InterruptedException {
        String expectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/pim/addEmployee";
        EmployerPage employerPage = new EmployerPage(driver);
        employerPage.enterUsername("Admin");
        employerPage.enterPassword("admin123");
        employerPage.clickOnLogin();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='PIM']")));
        employerPage.setClickPIM();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")));
        employerPage.setClickAdd();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='firstName']")));
        //employerPage.enterName("Petter");
        employerPage.enterMiddleName("MiddleTest");
        employerPage.enterLastname("LastNameTest");
        employerPage.setClickSave();
        String actualURL=driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualURL);


    }
//    @AfterMethod
//    public void tearDown() {
//        driver.close();
//    }
}