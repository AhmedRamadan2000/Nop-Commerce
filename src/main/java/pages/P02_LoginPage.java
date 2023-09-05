package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P02_LoginPage {

    //define driver
    WebDriver driver;

    public P02_LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //define locators
    private final By Email = By.id("Email");
    private final By Password = By.id("Password");
    private final By LoginButton = By.xpath("//button[contains(text(),'Log in')]");
//    private final By continue_button = By.xpath("//a[contains(text(),'Continue')]");

    private final By LogoutButton = By.xpath("//a[contains(text(),'Log out')]");

    public P02_LoginPage addUserEmail(String email) {
        driver.findElement(this.Email).sendKeys(email);
        return this;
    }

    public P02_LoginPage addUserPassword(String password) {
        driver.findElement(this.Password).sendKeys(password);
        return this;
    }

    public P02_LoginPage clickLoginButton() {
        driver.findElement(this.LoginButton).click();
        return this;
    }

    public boolean LogoutButton() {
        return driver.findElement(this.LogoutButton).getText().equals("Log out");
    }
}