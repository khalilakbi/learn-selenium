package webdriver_methods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseQuit {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");

        //code to click on button
        driver.findElement(By.id("tabButton")).click();

        //// close current window
        driver.close();
        //close all opening window
        //driver.quit();
    }
}
