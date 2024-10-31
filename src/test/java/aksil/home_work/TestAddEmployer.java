package aksil.home_work;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        EmployerPage employerPage = new EmployerPage(driver);
        employerPage.enterUsername("Admin");
        employerPage.enterPassword("admin123");
        employerPage.clickOnLogin();

        // wait
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='PIM']")));
        employerPage.setClickPIM();


        WebDriverWait wait1 = new WebDriverWait(driver, 30);
        wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")));
        employerPage.setClickAdd();

        WebDriverWait wait2 = new WebDriverWait(driver, 30);
        wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='firstName']")));
        employerPage.enterName(user);
        employerPage.enterMiddleName(lastName);
        employerPage.enterLastname("LastNameTest");

        employerPage.setClickSave();

        ////h6[text()='peter LastNameTest']
//        Thread.sleep(2000);
//        WebElement employeeName=driver.findElement(By.xpath("//div[@class='orangehrm-edit-employee-name']"));
//        Thread.sleep(2000);
//        Assert.assertTrue(employeeName.isDisplayed(),"is not the same name");


    }

    @Test(priority = 1)
    public void addEmployeeError() throws InterruptedException {

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

        ////span[text()='Required']
//        WebElement requiredMessage=driver.findElement(By.xpath("//span[text()='Required']"));
//        Assert.assertTrue(requiredMessage.isDisplayed(),"'Required' message is not displayed");


    }
//    @AfterMethod
//    public void tearDown() {
//        driver.close();
//    }
}