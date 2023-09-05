package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class P14_ShippingMethodPage {
    WebDriver driver;
    Select select;

    public P14_ShippingMethodPage(WebDriver driver) {
        this.driver = driver;
    }

    //define locators
    private final By ContinueShipping = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]");

    public P14_ShippingMethodPage SelectShippingMethod() {
        driver.findElement(this.ContinueShipping).click();
        return this;
    }
}