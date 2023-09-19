package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P16_ConfirmOrderPage {
    WebDriver driver;

    public P16_ConfirmOrderPage(WebDriver driver) {
        this.driver = driver;
    }

    //define locators
    private final By ConfirmOrderButton = By.xpath("//button[contains(text(),'Confirm')]");

    private final By SuccessfulMessage = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");

    private final By ContinueShoppingButton = By.xpath("//button[contains(text(),'Continue')]");

    private final By AssertOnMessage = By.xpath("//div[contains(text(),'Gift wrapping: No')]");

    public P16_ConfirmOrderPage ConfirmOrder() {
        driver.findElement(this.ConfirmOrderButton).click();
        return this;
    }

    public boolean ConfirmSuccessMessageAppear() {
        return driver.findElement(this.SuccessfulMessage).getText().equals("Your order has been successfully processed!");
    }

    public P16_ConfirmOrderPage ContinueShopping() {

        driver.findElement(this.ContinueShoppingButton).click();
        return this;
    }

    public boolean ConfirmOrderButtonIsAppear() {
        return driver.findElement(this.ConfirmOrderButton).isEnabled();
    }
}