package aksil;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskOrangeHRM {
    public static void main(String[] args) throws InterruptedException {
        // Set up the ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the login page of the Open Source HRM application
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Pause the execution for 2 seconds to allow the page to load completely
        Thread.sleep(2000);


        // Locate the username input field using its placeholder attribute and insert the username
        driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");

        // Pause the execution for 2 seconds to allow the page to load completely
        Thread.sleep(2000);

        // Locate the password input field using its placeholder attribute and insert the password
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");

        // Pause the execution for 2 seconds to allow for any necessary loading or processing
        Thread.sleep(2000);

        // Locate the login button using its type attribute and click it to log in
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }
}
