package rachida;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskOne {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        String d = driver.getTitle();
        if(d.equals("Your Store")){
            System.out.println("pass");
        } else {
            System.out.println("failed");
        }
        driver.get("https://demo.opencart.com/");
        String correct = driver.getCurrentUrl();
        if (correct.equals("https://demo.opencart.com/")) {
            System.out.println("correct");
        } else {
            System.out.println("not correct");
        }
        driver.close();
    }



}
