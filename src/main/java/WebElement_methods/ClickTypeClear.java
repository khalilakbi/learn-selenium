package WebElement_methods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickTypeClear {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.lambdatest.com/selenium-playground/simple-form-demo");
        // findElement return WebElement located by locator in web page
        WebElement inputText = driver.findElement(By.xpath("//input[@placeholder = 'Please enter your Message']"));
        // type in an input sendKeys
        String data = "rachida";
        inputText.sendKeys(data);

        //clear text typed clear()
        //inputText.clear();

        // click on web element click()
        WebElement button = driver.findElement(By.id("showInput"));
        button.click();
        //submit() work only with form if there attribute  type = submit

        WebElement text = driver.findElement(By.id("message"));

        String actual = text.getText();
        if (data.equals(actual)) {
            System.out.println("test case pass");
        } else {
            System.out.println("test case fail");
        }


    }

}

