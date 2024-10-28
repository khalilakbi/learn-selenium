package fazia;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShot {
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.lambdatest.com/selenium-playground/");
        // use ScreenShot to capture Screen
        TakesScreenshot takesScreenshot= (TakesScreenshot) driver;
        // Save picture
        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
        // path where to save our picture
        String path = System.getProperty("user.dir")+File.separator+"Screen_shot"+File.separator+"Selenium.png";
        FileUtils.copyFile(source,new File(path));



    }
}
