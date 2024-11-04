package aksil.system;

import aksil.base.Base;
import aksil.pages.EmployeePage;
import aksil.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestSearchEmployee extends Base {

    @Test
    public void validSearchEmployee() throws InterruptedException {
        HomePage homePage = new HomePage();
        EmployeePage employeePage = new EmployeePage();
        employeePage.enterUsername("Admin");
        homePage.enterPassword("admin123");
        homePage.clickOnLogin();

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='PIM']")));
        employeePage.setClickPIM();

        WebDriverWait wait1 = new WebDriverWait(driver, 30);             //label[text()='Employee Name']
        wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[text()='Employee Name']")));
        Thread.sleep(3000);
        homePage.enterEmployeeName();

//        WebDriverWait wait2 = new WebDriverWait(driver, 30);
//        wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type='submit']")));
//        homePage.clickSearchButton();
    }
}
