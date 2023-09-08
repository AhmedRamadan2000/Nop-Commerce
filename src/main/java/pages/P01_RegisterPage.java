package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utility.Utilities;

public class P01_RegisterPage {

    //define driver
    WebDriver driver;
    Select select;

    public P01_RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    // define locators
    private final By Gender = By.xpath("//span[@class=\"male\"]");
    private final By First_name = By.id("FirstName");
    private final By Last_name = By.id("LastName");
    private final By Day = By.xpath("//select[@name='DateOfBirthDay']");
    private final By Month = By.xpath("//select[@name='DateOfBirthMonth']");
    private final By Year = By.xpath("//select[@name='DateOfBirthYear']");
    private final By Email = By.id("Email");
    private final By Company_name = By.id("Company");
    private final By Password = By.id("Password");
    private final By Confirm_password = By.id("ConfirmPassword");
    private final By register_button = By.xpath("//button[@name='register-button']");
    private final By ConfirmRegistration = By.xpath("//div[@class=\"result\"]");
    private final By ValidationMessage = By.xpath("//li[contains(text(),'The specified email already exists')]");

    public P01_RegisterPage selectGender() {
        driver.findElement(this.Gender).click();
        return this;
    }

    public P01_RegisterPage addFirst_name(String Firstname) {
        driver.findElement(this.First_name).sendKeys(Firstname);
        return this;
    }

    public P01_RegisterPage addLast_name(String LastName) {
        driver.findElement(this.Last_name).sendKeys(LastName);
        return this;
    }

    public P01_RegisterPage selectDay() {
        select = new Select(driver.findElement(this.Day));
        select.selectByIndex(Utilities.generateRandomNumber(1, 30));
        return this;
    }

    public P01_RegisterPage selectMonth() {
        select = new Select(driver.findElement(this.Month));
        select.selectByIndex(Utilities.generateRandomNumber(1, 12));
        return this;
    }

    public P01_RegisterPage selectYear() {
        select = new Select(driver.findElement(this.Year));
        select.selectByIndex(Utilities.generateRandomNumber(1, 15));
        return this;
    }

    public P01_RegisterPage addEmail(String email) {
        driver.findElement(this.Email).sendKeys(email);
        return this;
    }

    public P01_RegisterPage addCompany_name(String CompanyName) {
        driver.findElement(this.Company_name).sendKeys(CompanyName);
        return this;
    }

    public P01_RegisterPage addPassword(String password) {
        driver.findElement(this.Password).sendKeys(password);
        return this;
    }

    public P01_RegisterPage addConfirm_password(String password) {
        driver.findElement(this.Confirm_password).sendKeys(password);
        return this;
    }

    public P01_RegisterPage clickRegister_button() {
        driver.findElement(this.register_button).click();
        return this;
    }

    public boolean confirmationMessage() {
        return driver.findElement(this.ConfirmRegistration).getText().equals("Your registration completed");
    }

    public boolean ValidationMessage() {
        return driver.findElement(this.ValidationMessage).getText().equals("The specified email already exists");
    }
}