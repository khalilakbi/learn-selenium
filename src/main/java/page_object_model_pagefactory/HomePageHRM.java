package page_object_model_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageHRM {
    // var

    WebDriver driver;
    // web element
    @FindBy(name = "username")
    WebElement inputUsername;
    @FindBy(name = "password")
    WebElement inputPassword;
    @FindBy(xpath = "//button")
    WebElement loginButton;

    // constructor
    public HomePageHRM(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String username) {

        inputUsername.sendKeys(username);
    }

    public void enterPassword(String password) {

        inputPassword.sendKeys(password);
    }

    public void clickOnLogin() {

        loginButton.click();
    }
    public void doLogin(String username,String password){
        enterUsername(username);
        enterPassword(password);
        clickOnLogin();
    }



}
