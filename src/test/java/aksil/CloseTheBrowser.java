package aksil;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseTheBrowser {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        String isCorrect=driver.getCurrentUrl();
        if (isCorrect.equals("https://demo.opencart.com/")){
            System.out.println("is correct");
        }else {
            System.out.println("not correct");

        }
        driver.close();
    }
}
