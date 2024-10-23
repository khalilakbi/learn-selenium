package page_object_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    // var region
    WebDriver driver;
    By inputUserName = By.name("username");
    By inputPassword = By.name("password");
    By loginButton = By.xpath("//button");

    By warningLoginMSG = By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']");

    // constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //methods region
    public void enterUsername(String username) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(inputUserName).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(inputPassword).sendKeys(password);
    }
    public void clickOnLoginButton(){
        driver.findElement(loginButton).click();
    }
    public String getWarningMSG() throws InterruptedException {
        Thread.sleep(1000);
        return driver.findElement(warningLoginMSG).getText();
    }
}
