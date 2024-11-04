package aksil.system;

import aksil.base.Base;
import aksil.pages.EmployeePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAddEmployee extends Base {
        String RequiredMSG;
    @Test(priority = 0)
    public void addEmployee() throws InterruptedException {
        //__________________________________________________
        WebDriverWait wait0 = new WebDriverWait(driver, 30);
        wait0.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type='submit']")));
        EmployeePage employerPage = new EmployeePage();
        employerPage.enterUsername("Admin");
        employerPage.enterPassword("admin123");
        employerPage.clickOnLogin();
        String lastName = "test";
        String firstName = "peter";
        String employeeName = firstName + " " + lastName;

        // wait
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='PIM']")));
        employerPage.setClickPIM();


        WebDriverWait wait1 = new WebDriverWait(driver, 30);
        wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")));
        employerPage.setClickAdd();

        // enter first name
        WebDriverWait wait2 = new WebDriverWait(driver, 30);
        wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='firstName']")));
        employerPage.enterName(firstName);

        employerPage.enterMiddleName(lastName);
        // enter last name
        WebDriverWait wait10 = new WebDriverWait(driver, 30);
        wait10.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='lastName']")));
        employerPage.enterLastname("LastNameTest");

        employerPage.setClickSave();


        Assert.assertEquals(employeeName, "peter test");


    }

    @Test
    public void addEmployeeWithoutFirstName() {

        // String firstName = "peter";
        WebDriverWait wait0 = new WebDriverWait(driver, 30);
        wait0.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type='submit']")));
        String lastName = "test";
        EmployeePage employerPage = new EmployeePage();
        employerPage.enterUsername("Admin");
        employerPage.enterPassword("admin123");
        employerPage.clickOnLogin();

        // wait
        WebDriverWait wait1 = new WebDriverWait(driver, 30);
        wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='PIM']")));
        employerPage.setClickPIM();


        WebDriverWait wait2 = new WebDriverWait(driver, 30);
        wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")));
        employerPage.setClickAdd();

        WebDriverWait wait3 = new WebDriverWait(driver, 30);
        wait3.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='firstName']")));
        //employerPage.enterName(firstName);
        employerPage.enterMiddleName(lastName);
        employerPage.enterLastname("LastNameTest");

        employerPage.setClickSave();
        //span[text()='Required']
        WebDriverWait wait4 = new WebDriverWait(driver, 30);
        wait4.until(ExpectedConditions.presenceOfElementLocated(By.xpath(" //span[text()='Required']")));
        Assert.assertTrue(employerPage.isRequiredMSG());


    }

}

