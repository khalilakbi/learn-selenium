package hadle_webElement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Slider {
    WebDriver driver;

    @FindBy(xpath = "//input[@value = '5']")
    WebElement inputSlider;

    @FindBy (id = "range")
    WebElement currentValue;


    public Slider(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    // methods region

    public void setSlider(int givenValue){
        while (!(Integer.parseInt(currentValue.getText()) == givenValue)){
           inputSlider.sendKeys(Keys.ARROW_RIGHT);
        }
    }
}
