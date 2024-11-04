package nassiba.home_work;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }
@Test
public void testpositivelogin(){
        HomePage homePage = new HomePage(driver);
       homePage.enterusername("admin");
}
@Test
public  void positivelogin(){

        HomePage homePage = new HomePage(driver);
        homePage.enterpassword("admin123");
}
@Test
    public void login(){

        HomePage homePage = new HomePage(driver);
        homePage.clicklogin();
}
}
