package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P10_AddProductsToWishlist {
    WebDriver driver;

    public P10_AddProductsToWishlist(WebDriver driver) {
        this.driver = driver;
    }

    //define locators
    private final By GiftCategory = By.xpath("//body/div[6]/div[2]/ul[1]/li[5]/a[1]");

    private final By WishlistButton1 = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[3]");
    private final By WishlistButton2 = By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/button[3]");
//    private final By ConfirmationMessage = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    private final By Product1InWishList = By.xpath("//a[contains(text(),'Fahrenheit 451 by Ray Bradbury')]");
    private final By Product2InWishList = By.xpath("//a[contains(text(),'First Prize Pies')]");
    private final By WishListPage = By.xpath("//a[contains(text(),'wishlist')]");

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

//    public P10_AddProductsToWishlist ConfirmationMessageAppears() {
//        driver.findElement(this.ConfirmationMessage).isDisplayed();
//        return this;
//    }

    public P10_AddProductsToWishlist NavigateToWishList() {
        driver.findElement(this.WishListPage).click();
        return this;
    }

    public boolean confirmationProduct1InWishList() {
        return driver.findElement(this.Product1InWishList).getText().equals("Flower Girl Bracelet");
    }

    public boolean confirmationProduct2InWishList() {
        return driver.findElement(this.Product2InWishList).getText().equals("Vintage Style Engagement Ring");
    }
}