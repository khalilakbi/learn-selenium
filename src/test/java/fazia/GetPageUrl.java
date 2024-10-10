package fazia;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageUrl {
    public static void main(String[] args) {

    WebDriverManager.chromedriver().setup();
    WebDriver driver= new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        String url= driver.getCurrentUrl();
        System.out.println(url);

    }

}


