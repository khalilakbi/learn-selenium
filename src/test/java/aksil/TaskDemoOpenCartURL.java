package aksil;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskDemoOpenCartURL {
    public static void main(String[] args) throws InterruptedException {
        // Set up the ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the OpenCart demo URL
        driver.get("https://demo.opencart.com/");

        // Retrieve the current URL of the page
        String isCorrect = driver.getCurrentUrl();

        // Check if the current URL matches the expected URL
        if (isCorrect.equals("https://demo.opencart.com/")) {
            // If the URL is correct, print a confirmation message
            System.out.println("is correct");

        } else {
            // If the URL is not correct, print an error message
            System.out.println("not correct");
        }
        // Wait for 2 seconds to observe the result before closing the browser
        Thread.sleep(2000);

        // Close the browser
        driver.close();
    }
}
