package solution.aksil;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        String expectedTitle = "Your Store";
        String url = "https://demo.opencart.com/";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String currentTitle = driver.getTitle();
        if (expectedTitle.equals(currentTitle)) {
            System.out.println("title are the same");
        } else {
            System.out.println("title are not the same");
        }

        String currentUrl = driver.getCurrentUrl();
        if (url.equals(currentUrl)) {
            System.out.println("url are the same");
        } else {
            System.out.println("url are not the same");
        }

        driver.close();
    }

}
