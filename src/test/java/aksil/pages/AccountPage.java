package aksil.pages;

import aksil.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends Base {

    @FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
    WebElement dropDownMenu;
   // By dashboard = By.xpath("//h6[text() = 'Dashboard']");
    //
    public AccountPage() {
        PageFactory.initElements(driver, this);
    }
    public void clickOnDropdown() {
        dropDownMenu.click();
    }

}
