package hadle_webElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HandleSelectWithSelect {
    // var
    WebDriver driver;

    @FindBy(id = "select-demo")
    WebElement selectDropDown;


    public HandleSelectWithSelect(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void selectDay(String day){
        Select select = new Select(selectDropDown);
        select.selectByVisibleText(day);
    }
}
