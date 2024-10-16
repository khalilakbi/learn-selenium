package WebElement_methods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.lambdatest.com/selenium-playground/iframe-demo/");
//        driver.switchTo().frame("iFrame1");

        WebElement frame = driver.findElement(By.id("iFrame1"));
        driver.switchTo().frame(frame);
//        driver.findElement(By.xpath("//div[@class='rsw-ce']")).sendKeys("aksil");

        driver.switchTo().defaultContent();
        String  text = driver.findElement(By.xpath("//*[@id=\"__next\"]/section[2]/div/div/h1")).getText();
        System.out.println(text);
    }
}
