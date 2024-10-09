package webdriver_methods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchWeb {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //open link with browser
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        // get title of page
        String title = driver.getTitle();
        System.out.println(title);
        // return the page url
        String url = driver.getCurrentUrl();
        System.out.println(url);

        // return source code page loaded
        String  code = driver.getPageSource();
        System.out.println(code);


    }
}
