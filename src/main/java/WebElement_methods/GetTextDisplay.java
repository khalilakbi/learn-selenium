package WebElement_methods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextDisplay {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.lambdatest.com/selenium-playground/");
        // find web element
        WebElement h = driver.findElement(By.tagName("h1"));
        //get web element text
        String text = h.getText();
        System.out.println(text);

        // isDisplayed() return true if web element present in web page
        boolean isPresent = h.isDisplayed();
        System.out.println(isPresent);

        driver.get("https://www.lambdatest.com/selenium-playground/simple-form-demo");
        WebElement inputText = driver.findElement(By.xpath("//input[@placeholder = 'Please enter your Message']"));
        // get web element attribute
        String idValue = inputText.getAttribute("placeholder");
        System.out.println(idValue);
        // get css value
        System.out.println(inputText.getCssValue("width"));
    }
}
