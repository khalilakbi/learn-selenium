package fazia_TestNG.pom1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeOrange {
    WebDriver driver;
    @FindBy(name = "username")
    WebElement inputUsername;
    @FindBy(name = "password")
    WebElement inputPassword;
    @FindBy(tagName = "button")
    WebElement loginButton;

    //constructor
    public HomeOrange(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);


    }
    //methods region(action that we perform on the webpage)
    public void enterUserName (String username){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
        inputUsername.sendKeys(username);
    }
    public void enterPassword (String password) {
        inputPassword.sendKeys(password );

    }
public void clickOnLoginButton(){
        loginButton.click();

}
// we can use this in another test case elated exemple add employee
public void doLogin(String username, String password){
        enterUserName(username);
        enterPassword(password);
        clickOnLoginButton();



}
}
