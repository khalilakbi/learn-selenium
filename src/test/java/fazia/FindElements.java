package fazia;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElements {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        List<WebElement> checkBox= driver.findElements
                (By.xpath("// input[@type='checkbox']"));
        //checkBox.get(0).click();
        //checkBox.get(0).click();
        checkBox.get(1).click();//
        driver.get("https://www.lambdatest.com/selenium-playground/");
       List<WebElement> link= driver.findElements
               (By.xpath("//ul[@class='list-disc pl-10 pb-30 grid grid-cols-4 w-full gap-10 mt-30 smtablet:grid-cols-1']//a"));
            //   link.get(23).click();
        // reusability method
        String lickToClick= "Drag and Drop";
        for (WebElement element: link){
            if (element.getText().equals(lickToClick)){
                element.click();
            }
        }
    }
}
