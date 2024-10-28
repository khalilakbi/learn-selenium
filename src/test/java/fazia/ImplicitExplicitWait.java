package fazia;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ImplicitExplicitWait {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        //implicitWait
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // Explicit Wait
        WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeHolder='Username']")));
        //webDriverWait.until(ExpectedConditions.visibilityOf(By.xpath("//input[@placeHolder='Username']")));
        driver.findElement(By.xpath("//input[@placeHolder='Username']")).sendKeys("Admin");

        driver.findElement(By.xpath("//input[@placeHolder='Password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button")).click();
        //Assertion
        if (driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index")) {
            ;
            System.out.println("test pass");

        } else {
            System.out.println("test case not pass");


        }
    }
}

