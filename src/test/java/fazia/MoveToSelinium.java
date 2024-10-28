package fazia;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToSelinium{
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.lambdatest.com/selenium-playground/");
        // locate the webElement
        WebElement developerButton  = driver.findElement(By.xpath("//button[text()='Developers ']"));
        // we call it developerButton if is the link we call it link....
        //actions class to hover over  web element
        Actions actions= new Actions(driver);
        actions.moveToElement(developerButton).perform();


    }
}
