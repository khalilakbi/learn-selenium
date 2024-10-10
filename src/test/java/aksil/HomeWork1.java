package aksil;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        // Web form
//        WebElement h = driver.findElement(By.className("display-6"));
//        String text = h.getText();
//        System.out.println(text);

        // Text input
        WebElement ele = driver.findElement(By.xpath("//input[@id='my-text-id']"));
        ele.sendKeys("Selenium Test");
        String text = ele.getAttribute("value");
        System.out.println(text);



        //Password



    }
}
