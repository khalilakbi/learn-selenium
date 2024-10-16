package aksil;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElements2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.lambdatest.com/selenium-playground/");
        List<WebElement> link = driver.findElements(By.xpath("//ul[@class='list-disc pl-10 pb-30 grid grid-cols-4 w-full gap-10 mt-30 smtablet:grid-cols-1']//a"));
        String linkToClick = "Drag and Drop";
        String linkToClick2 = "JQuery List Box";

        switch (linkToClick) {
            case "Drag and Drop":
                for (WebElement element : link) {
                    if (element.getText().equals(linkToClick)) {
                        element.click();
                        Thread.sleep(2000);
                        driver.navigate().back();
                        Thread.sleep(2000);
                        break;
                    }
                }
            case "JQuery List Box":
                for (WebElement element : link) {
                    if (element.getText().equals(linkToClick2)) {
                        element.click();
                        Thread.sleep(2000);
                        driver.navigate().back();
                        Thread.sleep(2000);
                        break;
                    }
                }
        }
    }
}