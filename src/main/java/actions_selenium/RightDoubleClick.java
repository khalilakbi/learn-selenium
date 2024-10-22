package actions_selenium;

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
        //locate web element
        WebElement doubleClick = driver.findElement(By.id("doubleClickBtn"));
        //doubleClick.click();
        // actions class to do double_click on web element
        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClick).perform();

        // locate web element to do right click
        WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(rightClick).perform();
    }
}
