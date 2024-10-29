package hadle_webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HandleSelectWithOutSelect {
    WebDriver driver;

    @FindBy(xpath = "//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
    WebElement dropDown;

    @FindBy(xpath = "//ul[@class='oxd-dropdown-menu']//a")
    List<WebElement> listMenu;


    public HandleSelectWithOutSelect(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    // select from dropdown without select tag
    // click on the dropdown
    //list of all option

    public void selectFromMenu(String option) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")));
        dropDown.click();
        Thread.sleep(1000);
        for(WebElement element : listMenu){
            if(element.getText().equals(option)){
               element.click();
               break;
            }
        }
    }


}
