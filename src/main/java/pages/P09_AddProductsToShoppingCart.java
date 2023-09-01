package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P09_AddProductsToShoppingCart {
    WebDriver driver;

    public P09_AddProductsToShoppingCart(WebDriver driver) {
        this.driver = driver;
    }

    //define locators
    private final By GiftCategory = By.xpath("//body/div[6]/div[2]/ul[1]/li[6]/a[1]");

    private final By Gift1 = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/button[1]");

    private final By Gift2 = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/button[1]");

    private final By ConfirmationMessage = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");

    public P09_AddProductsToShoppingCart SelectCategory() {

        driver.findElement(this.GiftCategory).click();
        return this;
    }

    public P09_AddProductsToShoppingCart AddCard1ToShoppingCart() {
        driver.findElement(this.Gift1).click();
        return this;
    }

    public P09_AddProductsToShoppingCart AddCard2ToShoppingCart() {
        driver.findElement(this.Gift2).click();
        return this;
    }

    public P09_AddProductsToShoppingCart ConfirmationMessageAppears() {
        driver.findElement(this.ConfirmationMessage).isDisplayed();
        return this;
    }
}