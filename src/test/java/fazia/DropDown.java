package fazia;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) {

    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        WebElement dropDown= driver.findElement(By.xpath("//select[@class='form-select']"));
        Select select= new Select(dropDown);
        // Select by text
       // select.selectByVisibleText("Three");
        //select.selectByValue("2");
        select.selectByIndex(2);
       // select.isMultiple();
       // System.out.println(select.isMultiple());
        System.out.println(select.getOptions().get(2).getText());



    }
}
