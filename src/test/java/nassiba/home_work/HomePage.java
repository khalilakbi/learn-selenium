package nassiba.home_work;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    WebDriver driver;
    @FindBy(name = "username")
    WebElement inputusername;

    // constructeur:
    public HomePage(WebDriver driver){
      this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    // region:
    public void enterusername(String username){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
        inputusername.sendKeys(username);
    }
    @FindBy(name = "password")
    WebElement inputpassword;
public void enterpassword(String password){
    WebDriverWait wait = new WebDriverWait(driver,30);
    wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
        inputpassword.sendKeys(password);
}
@FindBy(xpath = "//*[@type='submit']")
    WebElement loginbotton;
public void clicklogin(){
    WebDriverWait wait = new WebDriverWait(driver,30);
    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@type='submit']")));
    loginbotton.click();
}

    }

