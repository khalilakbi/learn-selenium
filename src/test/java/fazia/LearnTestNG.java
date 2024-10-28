package fazia;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LearnTestNG {
    @Test// periority1
    public void testLogin(){
        String expectedURL = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebDriverWait webDriverWait = new WebDriverWait(driver,30);
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.tagName("button")).click();
        String actualURL = driver.getCurrentUrl();
        // assertion
        Assert.assertEquals(expectedURL,actualURL);
    }
    @Test// periority2 // if we don't put periority the system will run the case by order Alphabetic
    public void logout() throws InterruptedException {
        String expectedResult = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebDriverWait webDriverWait = new WebDriverWait(driver,30);
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.tagName("button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Logout")).click();
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(expectedResult,actualURL);



    }

}
