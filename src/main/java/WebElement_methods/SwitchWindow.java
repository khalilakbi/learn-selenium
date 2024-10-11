package WebElement_methods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class SwitchWindow {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo");
        driver.findElement(By.linkText("Like us On Facebook")).click();
        driver.findElement(By.linkText("Follow On Twitter")).click();
        Thread.sleep(2000);
        // return current tab id
//        String id = driver.getWindowHandle();
        Set<String> ids = driver.getWindowHandles();
//        System.out.println(id);
//        for (String  s : ids){
//            if(!s.equals(id)){
//                driver.switchTo().window(s);
//            }
//        }
        // when we have more than 2 window
        for(String s : ids){
            driver.switchTo().window(s);
            if(driver.getCurrentUrl().equals("https://www.facebook.com/lambdatest/")){
               break;
            }
        }

        System.out.println(driver.getCurrentUrl());

    }
}
