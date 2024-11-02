package fazia_TestNG.page_object_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    // Var region
    WebDriver driver;
    By inputUserName = By.name("username");
    By inputPassword = By.name("password");
    By loginButton = By.xpath("//button");
    By warningLoginMsg = By.xpath("//p[@class=\"oxd-text oxd-text--p oxd-alert-content-text\"]");


    // constroctor
    public HomePage(WebDriver driver) {
        this.driver = driver;

    }

    // Method Region
    public void enterUserName(String username) throws InterruptedException {
        driver.findElement(inputUserName).sendKeys(username);
        Thread.sleep(2000);
    }

    public void enterPassword(String password) {
        driver.findElement(inputPassword).sendKeys(password);
    }

    public void clickOnButton() {
        driver.findElement(loginButton).click();
    }

    public String getWarningMSG() {
        return driver.findElement(warningLoginMsg).getText();


    }
}
