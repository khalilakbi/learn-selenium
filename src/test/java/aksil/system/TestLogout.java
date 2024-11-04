package aksil.system;

import aksil.base.Base;
import aksil.pages.AccountPage;
import aksil.pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestLogout extends Base {

      @Test
    public void testValidLogout() {
        String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        HomePage homePage = new HomePage();
        AccountPage accountPage= new AccountPage();
       // homePage.doLogin("Admin","admin123");
        homePage.enterUsername("Admin");
        homePage.enterPassword("admin123");
        homePage.clickOnLogin();


        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[@class='oxd-userdropdown-name']")));
        accountPage.clickOnDropdown();
        homePage.selectLogOut();
        String actualUrl = driver.getCurrentUrl();
        //Assertion
        Assert.assertEquals(expectedUrl, actualUrl);
    }

}
