package open_browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class UseWebDriverManager {
    public static void main(String[] args) {
        // with web driver manager we don't need browser driver
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.walmart.com/");
        driver.manage().window().maximize();

    }
}
