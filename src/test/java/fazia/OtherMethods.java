package fazia;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OtherMethods {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.lambdatest.com/selenium-playground/simple-form-demo");
        // on the web element
        WebElement inputText = driver.findElement
                (By.xpath("//input[@placeholder ='Please enter your Message']"));
        // get webElement attribute
         String idValue = inputText.getAttribute("placeHolder");
        System.out.println(idValue);
        System.out.println(inputText.getCssValue("width"));
    }
}
