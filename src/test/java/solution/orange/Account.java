package solution.orange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Account {
    WebDriver driver;
    @FindBy (xpath = "//ul[@class='oxd-main-menu']//a//span")
    List<WebElement> listMenu;


    //
    public Account(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    // methods region
    public void clickOnMenu(String menuOption) throws InterruptedException {
        Thread.sleep(2000);
        for(WebElement element : listMenu){
            if(element.getText().equals(menuOption)){
                element.click();
                break;
            }
        }
    }
}
