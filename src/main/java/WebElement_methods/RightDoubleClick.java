package WebElement_methods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightDoubleClick {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://demoqa.com/buttons");
        driver.manage().window().maximize();
        WebElement actionsDoubleClick=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
        Actions actions= new Actions(driver);
        actions.doubleClick(actionsDoubleClick).perform();

        WebElement rightClick=driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(rightClick).perform();

    }
}
