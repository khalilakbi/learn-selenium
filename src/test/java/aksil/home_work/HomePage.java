package aksil.home_work;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;
    // web element
    @FindBy(name = "username")
    WebElement inputUsername;
    @FindBy(name = "password")
    WebElement inputPassword;
    @FindBy(xpath = "//button")
    WebElement loginButton;
    @FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
    WebElement clickDropDown;
    @FindBy(xpath = "//a[text()='Logout']")
    WebElement selectLogOutOption;
    @FindBy(xpath = "label[text()='Employee Name']")
    WebElement inputEmployeeName;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement clickSearch;
////label[text()='Employee Name']
    //button[@type='submit']

    // constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String username) {

        inputUsername.sendKeys(username);
    }

    public void enterPassword(String password) {

        inputPassword.sendKeys(password);
    }

    public void clickOnLogin() {

        loginButton.click();
    }

    public void clickOnDropdown() {
        clickDropDown.click();
    }

    public void selectLogOut() {
        selectLogOutOption.click();
    }
    public void enterEmployeeName(String employeeName){
        inputEmployeeName.sendKeys(employeeName);
    }
    public void clickSearchButton(){
        clickSearch.click();
    }

    public void doLogin(String username, String password, String employeeName) {
        enterUsername(username);
        enterPassword(password);
        clickOnLogin();
        enterEmployeeName(employeeName);

    }

}