package hadle_webElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RadioButton {
    //var region

    WebDriver driver;

    @FindBy(xpath = "//div[@class='px-10 pt-20 pb-5']//label")
    List<WebElement> listRadioButton;

    public RadioButton(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    // methods region

    // in case you cant have inner text go with attribute
//    public void selectGender(String gender){
//        for(WebElement element : listRadioButton){
//            if(element.getAttribute("value").equals(gender)){
//                element.click();
//                break;
//            }
//        }
//    }
    public void selectGender(String gender){
        for(WebElement element : listRadioButton){
            if(element.getText().equals(gender)){
                element.click();
                break;
            }
        }
    }
}
