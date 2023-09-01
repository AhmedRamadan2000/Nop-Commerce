package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P10_AddProductsToWishlist {
    WebDriver driver;

    public P10_AddProductsToWishlist(WebDriver driver) {
        this.driver = driver;
    }

    //define locators
    private final By GiftCategory = By.xpath("//body/div[6]/div[2]/ul[1]/li[6]/a[1]");

    private final By WishlistButton1 = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/button[3]");

    private final By WishlistButton2 = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/button[3]");

    private final By ConfirmationMessage = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");


    public P10_AddProductsToWishlist SelectCategory() {
        driver.findElement(this.GiftCategory).click();
        return this;
    }

    public P10_AddProductsToWishlist AddProduct1ToList() {
        driver.findElement(this.WishlistButton1).click();
        return this;
    }

    public P10_AddProductsToWishlist AddProduct2ToList() {
        driver.findElement(this.WishlistButton2).click();
        return this;
    }

    public P10_AddProductsToWishlist ConfirmationMessageAppears() {
        driver.findElement(this.ConfirmationMessage).isDisplayed();
        return this;
    }
}