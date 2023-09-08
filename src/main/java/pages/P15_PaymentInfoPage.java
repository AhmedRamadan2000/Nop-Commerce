package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utility.Utilities;

public class P15_PaymentInfoPage {
    WebDriver driver;
    Select select;

    public P15_PaymentInfoPage(WebDriver driver) {
        this.driver = driver;
    }

    //define locators
    private final By CreditCard = By.cssSelector("#paymentmethod_1");
    private final By ContinuePaymentMethod = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]");
    private final By ContinuePaymentInfo = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]");

    private final By CardHolderName = By.xpath("//input[@id='CardholderName']");

    private final By CardNumber = By.xpath("//input[@id='CardNumber']");

    private final By ExpirationDate = By.name("ExpireYear");

    private final By CardCode = By.xpath("//input[@id='CardCode']");

    public P15_PaymentInfoPage SelectCreditCard() {
        driver.findElement(this.CreditCard).click();
        return this;
    }

    public P15_PaymentInfoPage ContinuePaymentMethod() {
        driver.findElement(this.ContinuePaymentMethod).click();
        return this;
    }

    public P15_PaymentInfoPage CardHolderName(String CardHolderName) {
        driver.findElement(this.CardHolderName).sendKeys(CardHolderName);
        return this;
    }

    public P15_PaymentInfoPage CardNumber(String CardNumber) {
        driver.findElement(this.CardNumber).sendKeys(CardNumber);
        return this;
    }

    public P15_PaymentInfoPage ContinuePaymentInfo() {
        driver.findElement(this.ContinuePaymentInfo).click();
        return this;
    }

    public P15_PaymentInfoPage SelectExpiryDate() {
        select = new Select(driver.findElement(this.ExpirationDate));
        select.selectByIndex(Utilities.generateRandomNumber(2024, 2030));
        return this;
    }

    public P15_PaymentInfoPage CardCode(String CardCode) {
        driver.findElement(this.CardCode).sendKeys(CardCode);
        return this;
    }

    public boolean CreditCardMethodIsSelected() {
        return driver.findElement(this.CreditCard).isSelected();
    }
}