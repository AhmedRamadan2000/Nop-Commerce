package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P07_UserFilterWithColor {

    WebDriver driver;

    public P07_UserFilterWithColor(WebDriver driver) {
        this.driver = driver;
    }

    // define locators
    private final By colorRed = By.xpath("//input[@id='attribute-option-15']");

    private final By Product = By.cssSelector("div.master-wrapper-page:nth-child(7) div.master-wrapper-content div.master-column-wrapper div.center-2 div.page.category-page div.page-body div.products-container div.products-wrapper div.product-grid div.item-grid div.item-box div.product-item div.details h2.product-title > a:nth-child(1)");

    public P07_UserFilterWithColor selectColor() {
        driver.findElement(this.colorRed).click();
        return this;
    }

    public P07_UserFilterWithColor ProductAppear() {
        driver.findElement(this.Product).isDisplayed();
        return this;
    }
}