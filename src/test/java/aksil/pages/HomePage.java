package aksil.pages;

import aksil.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Base {

    // web element
    @FindBy(name = "username")
    WebElement inputUsername;
    @FindBy(name = "password")
    WebElement inputPassword;
    @FindBy(xpath = "//button")
    WebElement loginButton;
    @FindBy(xpath = "//span[text()='Required']")
    WebElement requiredMSG;
    @FindBy(xpath = "//a[text()='Logout']")
    WebElement selectLogOutOption;
    @FindBy(xpath = "label[text()='Employee Name']")
    WebElement inputEmployeeName;
//    @FindBy(xpath = "//button[@type='submit']")
//    WebElement clickSearch;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div")
    WebElement clickSearch;

    ////*[@id="app"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div
////label[text()='Employee Name']
    //button[@type='submit']

    // constructor
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String username) {
        inputUsername.sendKeys(username);
    }

    public void enterPassword(String password) {
        inputPassword.sendKeys(password);
    }

    public void clickOnLogin() {
        //clickOnElement(inputUsername);
        loginButton.click();
    }
    public boolean isRequiredMSGDisplay(){
        return requiredMSG.isDisplayed();
    }


    public void selectLogOut() {
        selectLogOutOption.click();
    }
    public void enterEmployeeName(){
        inputEmployeeName.sendKeys("Amelia Brown");
    }
    public void clickSearchButton(){
        clickSearch.click();
    }

    public void doLogin(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickOnLogin();


    }

}