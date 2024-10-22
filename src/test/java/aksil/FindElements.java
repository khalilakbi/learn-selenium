package aksil;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElements {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        List<WebElement> checkBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
        Thread.sleep(2000);
        checkBox.get(0).click();
        checkBox.get(0).click();
        Thread.sleep(2000);
        checkBox.get(1).click();
    }
}
