package fazia;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Homework2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.lambdatest.com/selenium-playground/");
        // find element
        Thread.sleep(2000);
        driver.findElement(By.linkText("Bootstrap Alerts")).click();
        // back method
        Thread.sleep(2000);
        driver.navigate().back();
        // forward
        Thread.sleep(2000);
        driver.navigate().forward();
        // refresh
        Thread.sleep(2000);
        driver.navigate().refresh();
        //close
        Thread.sleep(2000);
        driver.navigate().refresh();


    }
}
