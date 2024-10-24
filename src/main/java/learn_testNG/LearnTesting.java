//package learn_testNG;
//
////import io.github.bonigarcia.wdm.WebDriverManager;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.chrome.ChromeDriver;
//////import org.openqa.selenium.support.ui.ExpectedConditions;
//////import org.openqa.selenium.support.ui.WebDriverWait;
//////import org.testng.Assert;
////import org.testng.annotations.*;
//
//public class LearnTesting {
//    WebDriver driver;
//
//    @BeforeMethod
//    public void setUp() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        driver.manage().window().maximize();
//    }
//
//    @Test(priority = 1)
//    public void testLogin() {
//        String expectedURL = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
//        WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
//        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
//        driver.findElement(By.name("username")).sendKeys("Admin");
//        driver.findElement(By.name("password")).sendKeys("admin123");
//        driver.findElement(By.tagName("button")).click();
//        String actualURL = driver.getCurrentUrl();
//        // assertion
//        Assert.assertEquals(expectedURL, actualURL);
//
//    }
//
//    @Test(priority = 2)
//    public void testLogOut() throws InterruptedException {
//        String expectedResult = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
//        WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
//        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
//        driver.findElement(By.name("username")).sendKeys("Admin");
//        driver.findElement(By.name("password")).sendKeys("admin123");
//        driver.findElement(By.tagName("button")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//p[@class = 'oxd-userdropdown-name']")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.linkText("Logout")).click();
//        String actualURL = driver.getCurrentUrl();
//        //assertion
//        Assert.assertEquals(expectedResult, actualURL);
//    }
//
//    @AfterMethod
//    public void tearDown() {
//        driver.close();
//    }
//
//
//}
