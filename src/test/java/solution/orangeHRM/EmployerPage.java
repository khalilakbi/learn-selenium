package solution.orangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployerPage {

    WebDriver driver;
    public EmployerPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "username")
    WebElement inputUsername;
    @FindBy(name = "password")
    WebElement inputPassword;
    @FindBy(xpath = "//button")
    WebElement loginButton;
    @FindBy(xpath = "//span[text()='PIM']")
    WebElement clickPIM;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    WebElement clickAdd;
    @FindBy(xpath = "//input[@name='firstName']")
    WebElement inputFirstName;
    @FindBy(xpath = "//input[@name='middleName']")
    WebElement inputMiddleName;
    @FindBy(xpath = "//input[@name='lastName']")
    WebElement inputLastName;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement clickSave;

    @FindBy (xpath = "//div[@class='orangehrm-edit-employee-name']//h6")
    WebElement userName;



    public void enterUsername(String username) {
        inputUsername.sendKeys(username);
    }

    public void enterPassword(String password) {
        inputPassword.sendKeys(password);
    }

    public void clickOnLogin() {
        loginButton.click();
    }
    public void setClickPIM(){
        clickPIM.click();
    }
    public void setClickAdd(){
        clickAdd.click();
    }

    public void enterName(String name) {
        inputFirstName.sendKeys(name);
    }
    public void enterMiddleName(String middleName){
        inputMiddleName.sendKeys(middleName);
    }
    public void enterLastname(String lastName){
        inputLastName.sendKeys(lastName);
    }
    public void setClickSave(){
        clickSave.click();
    }
    public String getUserNAme(){
        return userName.getText();
    }


    public void doAddEmployee(String username, String password, String name) {
        enterUsername(username);
        enterPassword(password);
//        enterName(name);
        clickOnLogin();
        setClickPIM();
        setClickAdd();

    }

}
