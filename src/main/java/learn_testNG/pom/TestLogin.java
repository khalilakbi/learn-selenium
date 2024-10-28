package learn_testNG.pom;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class TestLogin {
    WebDriver driver;

    @Parameters("browser")
    @BeforeMethod(alwaysRun = true)
    public void setUp(@Optional("chrome") String browser) {
        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }

    @Parameters({"user", "pass"})
    @Test(groups = {"smoke", "regression"})
    public void testValidLogin(String user, String pass) {
        String username = "Admin";
        String password = "admin123";
        Home home = new Home(driver);
        home.enterUsername(username);
        home.enterPassword(password);
        home.clickOnLoginButton();
    }


    @Test(groups = {"regression"}, dataProvider = "login_credential")
    public void testInvalidLogin(String username, String password) {
//        String username = "Ad";
//        String password = "admin123";
        Home home = new Home(driver);
        home.enterUsername(username);
        home.enterPassword(password);
        home.clickOnLoginButton();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.close();
    }

    @DataProvider(name = "login_credential")
    public Object[][] getLoginData() {
        return new Object[][]{{"rachida", "1234"}, {"nassiba", "1234"}, {"soraya", "098"}, {"fazia", "000"}};
    }
}
