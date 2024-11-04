package aksil;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestLogin {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebDriverWait wait= new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[text()=' Login ']")).click();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.linkText("PIM")).click();
        //WebDriverWait wait1= new WebDriverWait(driver,30);
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.name("PIM")));
        //List<WebElement>pimElement = driver.findElements(By.xpath("//ul[@class='oxd-main-menu']"));


        //pimElement.get(0).click();
//        Actions actions= new Actions(driver);
//        actions.click(pimElement).perform();



    }
}
