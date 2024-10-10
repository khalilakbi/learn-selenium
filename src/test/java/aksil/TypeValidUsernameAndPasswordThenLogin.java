package aksil;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypeValidUsernameAndPasswordThenLogin {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");// navigate to the webpage
        Thread.sleep(2000); // Pause the execution for 2 seconds to allow the page to load
        // insert the username
        driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
        Thread.sleep(2000);

        // insert the password
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        Thread.sleep(2000);

        // then click login
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }
}
