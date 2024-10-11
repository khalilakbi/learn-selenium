package WebElement_methods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlert {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.lambdatest.com/selenium-playground/javascript-alert-box-demo");
        driver.findElement(By.xpath("//*[@id=\"__next\"]/section[3]/div/div/div/div[3]/p[1]/button")).click();
        Alert a = driver.switchTo().alert();
       // a.dismiss();
//        System.out.println(a.getText());

        a.sendKeys("nassiba");
        a.accept();

    }
}
