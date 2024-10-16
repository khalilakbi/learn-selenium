package fazia;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypeTextMethod {
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
      // inputText.sendKeys("Fazia");
        // click on webElement
       WebElement button= driver.findElement(By.id("showInput"));
       button.click();

       WebElement text= driver.findElement(By.id("message"));
       String actual= text.getText();
       if (data.equals(actual)) {
           System.out.println("Pass");
       }else{
           System.out.println("test case Faild");
       }




    }
}
