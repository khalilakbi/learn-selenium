package JavaScriptExecutor;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class TakeShot {
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.lambdatest.com/selenium-playground/");
        // use TakeScreenShot to capture screen
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        //save pic
        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
        //path where to save pic
        String path = System.getProperty("user.dir") + File.separator + "screen_shot" + File.separator + "seleniumpic.png";
        FileUtils.copyFile(source,new File(path));

    }
}
