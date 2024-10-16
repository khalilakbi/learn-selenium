package nassiba;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HomeWork1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        // get and compare title:
        if (driver.getTitle().equals("your store")){
            System.out.println("is the same ");
        } else {
            System.out.println("is not the same");
        }
        // get URL of the page:
        String URL = driver.getCurrentUrl();
        System.out.println(URL);
        // close the browser
        driver.close();

    }
}
