package WebElement_methods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        WebElement dropDown = driver.findElement(By.name("my-select"));
        Select select = new Select(dropDown);
        List<WebElement> options= select.getOptions();
        System.out.println(options.get(1).getText());

//         select by text
//        select.selectByVisibleText("Three");

       // select.selectByValue("2");
//        select.selectByIndex(1);
//       // System.out.println(select.isMultiple());
//        System.out.println(select.getOptions().get(1).getText());


    }
}
