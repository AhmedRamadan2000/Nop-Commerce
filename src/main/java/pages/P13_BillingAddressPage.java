package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utility.Utilities;

public class P13_BillingAddressPage {
    WebDriver driver;
    Select select;

    public P13_BillingAddressPage(WebDriver driver) {
        this.driver = driver;
    }

    //define locators
    private final By CountryDropDownLIst = By.xpath("//select[@id='BillingNewAddress_CountryId']");

    private final By City = By.xpath("//input[@id='BillingNewAddress_City']");

    private final By Address = By.xpath("//input[@id='BillingNewAddress_Address1']");

    private final By PostalCode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");

    private final By PhoneNumber = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");

    private final By ContinueBilling = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]");

    public P13_BillingAddressPage SelectCountry() {
        select = new Select(driver.findElement(this.CountryDropDownLIst));
        select.selectByIndex(Utilities.generateRandomNumber(1, 120));
        return this;
    }

    public P13_BillingAddressPage AddCity(String City) {
        driver.findElement(this.City).sendKeys(City);
        return this;
    }

    public P13_BillingAddressPage AddAddress(String Address) {
        driver.findElement(this.Address).sendKeys(Address);
        return this;
    }

    public P13_BillingAddressPage AddPostalCode() {
        driver.findElement(this.PostalCode).sendKeys("12345");
        return this;
    }

    public P13_BillingAddressPage AddPhoneNum(String PhoneNumber) {
        driver.findElement(this.PhoneNumber).sendKeys(PhoneNumber);
        return this;
    }

    public P13_BillingAddressPage ClickOnContinueBilling() {
        driver.findElement(this.ContinueBilling).click();
        return this;
    }
}
