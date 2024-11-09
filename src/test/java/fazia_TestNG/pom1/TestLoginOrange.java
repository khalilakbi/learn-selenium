package fazia_TestNG.pom1;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class TestLoginOrange {
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

//    public void setUp() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }

    @Parameters({"user", "pass"})
    @Test(groups = {"smoke", "regression"})
// we can also add regression (groups={"smoke, "regression"}and it will run together

    // public void TestValidLogin() {
    public void TestValidLogin(@Optional("Admin") String user,@Optional("admin123") String pass) {

        // HomeOrange homeOrange = new HomeOrange(driver);// we have to do it global to have access to the methods in HomeOrange
        String username = "Admin";
        String password = "admin123";
        HomeOrange homeOrange = new HomeOrange(driver);
        homeOrange.enterUserName(username);
        homeOrange.enterPassword(password);
        homeOrange.clickOnLoginButton();
    }

    @Test(groups = {"regression"}, dataProvider = "Login_credential")
    public void testInvalidLogin(String username, String password) {
        //String username = "Admin";
     //   String password = "admin12";
        HomeOrange homeOrange = new HomeOrange(driver);
        homeOrange.enterUserName(username);
        homeOrange.enterPassword(password);
        homeOrange.clickOnLoginButton();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.close();

    }
    @DataProvider(name="Login_credential")
    public Object[][] getLoginData(){
        return new Object[][]{{"rachida","1234"},{"nassiba","234"},{"fazia","567"},{"axsil","0001"}};


    }
}





