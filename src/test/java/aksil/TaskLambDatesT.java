package aksil;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskLambDatesT {
    public static void main(String[] args) throws InterruptedException {
        // Set up the ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the OpenCart demo URL
        driver.get("https://www.lambdatest.com/selenium-playground/");

        // Locate the link with the text "Bootstrap Alerts" and click on it.
        driver.findElement(By.linkText("Bootstrap Alerts")).click();

        //Pause the execution for 2 seconds to allow the page to load
        Thread.sleep(2000);

        // using the back method
        driver.navigate().back();

        //Pause the execution for 2 seconds to allow the page to load
        Thread.sleep(2000);

        // using the forward method
        driver.navigate().forward();

        //Pause the execution for 2 seconds to allow the page to load
        Thread.sleep(2000);

        // using the refresh method
        driver.navigate().refresh();

        //Pause the execution for 2 seconds to allow the page to load
        Thread.sleep(2000);

        // then we close the browser
        driver.close();
    }
}
