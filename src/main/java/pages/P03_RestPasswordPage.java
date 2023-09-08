package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P03_RestPasswordPage {
    WebDriver driver;

    public P03_RestPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    //define locators
    private final By ForgetPassword = By.xpath("(//span)[@class=\"forgot-password\"]");
    private final By RecoverEmailField = By.id("Email");
    private final By RecoverButton = By.xpath("//button[contains(text(),'Recover')]");
    private final By ConfirmationMessage = By.xpath("//p[contains(text(),'Email with instructions has been sent to you.')]");

    public P03_RestPasswordPage clickOnForgetPassword() {
        driver.findElement(this.ForgetPassword).click();
        return this;
    }

    public P03_RestPasswordPage addRecoverEmailField(String email) {

        driver.findElement(this.RecoverEmailField).sendKeys(email);
        return this;
    }

    public P03_RestPasswordPage clickRecoverButton() {
        driver.findElement(this.RecoverButton).click();
        return this;
    }

    public String checkConfirmationMessage() {
        return driver.findElement(this.ConfirmationMessage).getText();
    }
}