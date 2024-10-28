package fazia;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightDoubleClick {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/buttons");
        WebElement doubleClick = driver.findElement(By.id("doubleClickBtn"));
        //if we do doubleClick.click() it won't work
        //action class to do double_click on web element
        Actions actions= new Actions(driver);
        actions.doubleClick(doubleClick).perform();
        // Locate WebElement to do right click
       WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
       //Actions actions1= new Actions(driver); since we have the object we don't need to create a new one
       actions.contextClick(rightClick).perform();

    }
}