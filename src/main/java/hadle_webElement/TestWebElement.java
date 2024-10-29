package hadle_webElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestWebElement {
    WebDriver driver;
    @BeforeMethod
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
         //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
        //https://www.lambdatest.com/selenium-playground/select-dropdown-demo
        //https://www.lambdatest.com/selenium-playground/radiobutton-demo
        //https://www.lambdatest.com/selenium-playground/drag-drop-range-sliders-demo
        //https://demoqa.com/date-picker
        driver.get("https://demoqa.com/date-picker");
        driver.manage().window().maximize();
//        Thread.sleep(2000);
//        driver.findElement(By.name("username")).sendKeys("Admin");
//        driver.findElement(By.name("password")).sendKeys("admin123");
//        driver.findElement(By.tagName("button")).click();

    }

//    @Test
//    public void testSelect(){
//        HandleSelectWithSelect handleWebElement = new HandleSelectWithSelect(driver);
//        handleWebElement.selectDay("Tuesday");
//    }

//    @Test
//    public void testSelectWithOutSelectTag() throws InterruptedException {
//        HandleSelectWithOutSelect handleSelectWithOutSelect = new HandleSelectWithOutSelect(driver);
//        handleSelectWithOutSelect.selectFromMenu("Change Password");
//
//
//    }


//     @Test
//     public void testRadioButton(){
//        RadioButton radioButton = new RadioButton(driver);
//       radioButton.selectGender("Male");
//     }

//    @Test
//    public void testSlider(){
//        Slider slider = new Slider(driver);
//        slider.setSlider(90);
//    }
    @Test
    public void testDatePicker(){
        DatePicker datePicker = new DatePicker(driver);
        datePicker.setDate("26","August 2026");
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
