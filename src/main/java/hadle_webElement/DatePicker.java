package hadle_webElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DatePicker {
    // var region

    WebDriver driver;
    @FindBy(id = "datePickerMonthYearInput")
    WebElement inputDate;

    @FindBy(xpath = "//button[@aria-label= 'Next Month']")
    WebElement nextButton;

    @FindBy(xpath = "//div[@class='react-datepicker__current-month react-datepicker__current-month--hasYearDropdown react-datepicker__current-month--hasMonthDropdown']")
    WebElement currentMonthYear;

    @FindBy (xpath = "//div[@class='react-datepicker__month']//div//div")
    List<WebElement> listDay;

    public DatePicker(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // methods


    public void setDate(String day,String givenMothYear) {
        inputDate.click();
        while (!givenMothYear.equals(currentMonthYear.getText())) {
            nextButton.click();
        }
        for(WebElement element : listDay){
            if(element.getText().equals(day)){
                element.click();
                break;
            }
        }
    }
}
