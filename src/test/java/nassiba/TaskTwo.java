package nassiba;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskTwo {


    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.lambdatest.com/selenium-playground/");
        // find element:
        Thread.sleep(2000);
        driver.findElement(By.linkText("Boostrap Alert")).click();
        // back to home page:
        Thread.sleep(2000);
        driver.navigate().back();
        // forward :
        Thread.sleep(2000);
        driver.navigate().forward();
        // Refresh the page:
        Thread.sleep(2000);
        driver.navigate().refresh();
        // Close the browser:
        Thread.sleep(2000);
        driver.close();


    }
}