package webdriver_methods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowMethods {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.lambdatest.com/selenium-playground/");

        // to maximize to window
        //driver.manage().window().maximize();

//        Dimension d = driver.manage().window().getSize();
//        System.out.println(d.getHeight());
//        System.out.println(d.getWidth());

        Dimension dimension = new Dimension(100, 500);
        driver.manage().window().setSize(dimension);

        Point p = driver.manage().window().getPosition();
        System.out.println(p.getX());
        System.out.println(p.getY());
    }
}
