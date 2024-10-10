package fazia;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageTitle {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.opencart.com/");
       //String title driver.getTitle();
        if (driver.getTitle().equals("Your Store")){
            System.out.println("is the same");
        }else{
            System.out.println("is not the same");
        }

    }
}
