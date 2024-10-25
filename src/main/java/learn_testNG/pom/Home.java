package learn_testNG.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Policy;

public class Home {
    // var region (web element in the web page )

    WebDriver driver;

    @FindBy(name = "username")
    WebElement inputUsername;

    @FindBy(name = "password")
    WebElement inputPassword;

    @FindBy(tagName = "button")
    WebElement loginButton;


    //constructor
    public Home(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // methods region (action that we perform on the web page)

    public void enterUsername(String username) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));

        inputUsername.sendKeys(username);
    }

    public void enterPassword(String password) {
        inputPassword.sendKeys(password);
    }

    public void clickOnLoginButton() {
        loginButton.click();
    }

    public void doLogin(String username, String password) {
        enterPassword(username);
        enterPassword(password);
        clickOnLoginButton();
    }


}
