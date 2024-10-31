package solution.orange;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Employer {
    WebDriver driver;
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

    public Employer(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void setClickAdd(){
        clickAdd.click();
    }
    public void enterName(String name) {
        inputFirstName.sendKeys(name);
    }

    public void enterMiddleName(String middleName) {
        inputMiddleName.sendKeys(middleName);
    }

    public void enterLastname(String lastName) {
        inputLastName.sendKeys(lastName);
    }

    public void setClickSave() {
        clickSave.click();
    }

}
