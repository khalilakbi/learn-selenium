package fazia_TestNG.Hadle_WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestWebElement2 {// this class is related to HandleWebElement
    WebDriver driver;

    @BeforeMethod
    public void setUP() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.lambdatest.com/selenium-playground/select-dropdown-demo");
        driver.manage().window().maximize();
    }

    @Test
    public void testSelect() {
        HandleSelectWebElement handleWebElementF = new HandleSelectWebElement(driver);
        handleWebElementF.selectDay("Monday");
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
