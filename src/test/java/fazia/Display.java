package fazia;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Display {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.lambdatest.com/selenium-playground/");
        WebElement h = driver.findElement(By.tagName("h1"));
        boolean ispresent= h.isDisplayed();
        System.out.println(ispresent);
        // get inner text of webElement


    }
}
