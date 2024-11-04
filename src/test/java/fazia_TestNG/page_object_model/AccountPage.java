package fazia_TestNG.page_object_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage {
    // var region

    WebDriver driver;

    By dashboard = By.xpath("//h6[text() = 'Dashboard']");



    //
    public AccountPage(WebDriver driver) {
        this.driver = driver;
    }

    // methods region
    public String getTitle(){

        return driver.getTitle();
    }
}

