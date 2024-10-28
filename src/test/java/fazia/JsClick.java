package fazia;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JsClick {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.lambdatest.com/selenium-playground/");
       // driver.findElement(By.xpath("//a[text()='Ajax Form Submit']")).click(); // if this one is not working we will use

        //javaScriptExecutor
        WebElement link = driver.findElement(By.xpath("//a[text()='Ajax Form Submit']"));
        // using java script executor
        JavascriptExecutor javascriptExecutor= (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].click();",link);



            }
        }




