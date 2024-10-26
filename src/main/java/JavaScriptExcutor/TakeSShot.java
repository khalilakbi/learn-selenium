package JavaScriptExcutor;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class TakeSShot {
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.lambdatest.com/selenium-playground/");
        // we have to use another class called screenShot
        TakesScreenshot takesScreenshot=(TakesScreenshot) driver;
        //save the screenShot
        File source=takesScreenshot.getScreenshotAs(OutputType.FILE);
        // path where we have to save the screenshot
        String path= System.getProperty("user.dir")+ File.separator+"screen_shot"+File.separator+"First_Screen_Shot.png";
        FileUtils.copyFile(source,new File(path));
    }
}
