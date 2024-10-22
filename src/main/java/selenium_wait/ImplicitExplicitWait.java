package selenium_wait;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ImplicitExplicitWait {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // implicit wait. going to wait 30 seconds before performing any action
//         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//         driver.findElement(By.name("username")).sendKeys("Admin");
//         driver.findElement(By.name("password")).sendKeys("admin123");
//         driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();

        // explicit wait
        WebDriverWait webDriverWait= new WebDriverWait(driver, 30);
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
         driver.findElement(By.name("username")).sendKeys("Admin");
         driver.findElement(By.name("password")).sendKeys("admin123");
         driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();

        //Assertion
        if (driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index")){
            System.out.println("Test case passed");
        }else {
            System.out.println("Test case is failed");
        }


    }
}