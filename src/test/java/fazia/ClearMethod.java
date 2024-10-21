package fazia;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.lambdatest.com/selenium-playground/simple-form-demo");
        // on the web element
        WebElement inputText = driver.findElement
                (By.xpath("//input[@placeholder ='Please enter your Message']"));
        //type in an input
        String data = "Fazia";
        inputText.sendKeys(data);
        // clear value fro input
        inputText.clear();
        // is selected check box
        driver.get("https://www.lambdatest.com/selenium-playground/checkbox-demo");
        WebElement checkBox= driver.findElement(By.id("isAgeSelected"));
        //return true if element clickable- if we can click on element
        System.out.println(checkBox.isEnabled());
        checkBox.click(); // here it will check the checkbox
        // submit () works only with form if type= submit
        // return true if element is selected
        boolean isSel= checkBox.isSelected();
        System.out.println(isSel);// if i don't click(checkBox.click())it will print false




    }
}
