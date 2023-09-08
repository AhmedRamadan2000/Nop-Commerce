package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P10_AddProductsToWishlist {
    WebDriver driver;

    public P10_AddProductsToWishlist(WebDriver driver) {
        this.driver = driver;
    }

    //define locators
    private final By jewelryCategory = By.xpath("//body/div[6]/div[2]/ul[1]/li[6]/a[1]");

    private final By product1 = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/button[3]");

    private final By product2 = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/button[3]");

    private final By CloseNotificationMessage = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");

    private final By Product1InTable = By.xpath("//a[contains(text(),'Flower Girl Bracelet')]");

    private final By Product2InTable = By.xpath("//tbody/tr[2]/td[4]/a[1]");

    private final By ClickOnWishListBar = By.xpath("//a[contains(text(),'wishlist')]");

    public P10_AddProductsToWishlist SelectCategory() {
        driver.findElement(this.jewelryCategory).click();
        return this;
    }

    public P10_AddProductsToWishlist AddProduct1ToWishList() {
        driver.findElement(this.product1).click();
        return this;
    }

    public P10_AddProductsToWishlist AddProduct2ToWishList() {
        driver.findElement(this.product2).click();
        return this;
    }

    public P10_AddProductsToWishlist CloseTheBar() {
        driver.findElement(this.CloseNotificationMessage).click();
        return this;
    }

    public P10_AddProductsToWishlist ClickOnTheBar() {
        driver.findElement(this.ClickOnWishListBar).click();
        return this;
    }

    public boolean Product1AddedToList() {
        return driver.findElement(this.Product1InTable).getText().equals("Flower Girl Bracelet");
    }

    public boolean Product2AddedToList() {
        return driver.findElement(this.Product2InTable).getText().equals("Vintage Style Engagement Ring");
    }
}