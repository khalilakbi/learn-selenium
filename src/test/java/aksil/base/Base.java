package aksil.base;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class Base {
    public static WebDriver driver;
    public static JavascriptExecutor javascriptExecutor;
    public static WebDriverWait wait;


    @Parameters({"browser", "url"})
    @BeforeMethod(alwaysRun = true)
    public void setUp(@Optional("chrome") String browser, @Optional("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login") String url) {
        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();

        }
        driver.get(url);
        driver.manage().window().maximize();

    }
//    @AfterMethod(alwaysRun = true)
//    public void cleanUp(){
//        driver.close();
//        driver.quit();
//    }
    //selenium api
    public void clickOnElement(WebElement element){
      element.click();
    }
}
