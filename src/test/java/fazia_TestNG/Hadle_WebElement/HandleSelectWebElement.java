package fazia_TestNG.Hadle_WebElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HandleSelectWebElement {
    // Var
    WebDriver driver;
    @FindBy(id="select-demo")
    WebElement selectDropdown;



    public HandleSelectWebElement(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void selectDay(String day){
        Select select = new Select(selectDropdown);
        select.selectByVisibleText(day);
    }
}
