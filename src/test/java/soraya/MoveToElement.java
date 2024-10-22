package soraya;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver .get("https://www.lambdatest.com/selenium-playground/");
        WebElement developerButton = driver.findElement(By.xpath("//button[text()='Developers ']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(developerButton).perform();
    }
}
