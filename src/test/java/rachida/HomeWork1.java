package rachida;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        String d = driver.getTitle();
        if(d.equals("Your Store")){
            System.out.println("pass");

        } else {
            System.out.println("failed");

        }

    }
}
