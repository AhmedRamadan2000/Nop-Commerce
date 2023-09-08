package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P12_CheckoutOrder2 {
    WebDriver driver;

    public P12_CheckoutOrder2(WebDriver driver) {
        this.driver = driver;
    }

    //define locators
    private final By TermsAndConditionsCheckBox = By.xpath("//input[@id='termsofservice']");
    private final By CheckOutButton = By.xpath("//button[@id='checkout']");

    public P12_CheckoutOrder2 ClickOnTermsAndCondition() {
        driver.findElement(this.TermsAndConditionsCheckBox).click();
        return this;
    }

    public P12_CheckoutOrder2 ClickOnCheckOutButton() {
        driver.findElement(this.CheckOutButton).click();
        return this;
    }
}