package aksil;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCart {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");

        String actualText = driver.getTitle();

        if (actualText.equals("Your Store")) {
            System.out.println("is the same ");
        } else {
            System.out.println("not the same");
        }

    }
}
