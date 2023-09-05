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

//    private final By Gift2 = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/button[1]");

    private final By ConfirmationMessage = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    private final By Product1InTable = By.xpath("//tbody/tr[1]/td[3]/a[1]");

//    private final By Product2InTable = By.cssSelector("div.master-wrapper-page:nth-child(7) div.master-wrapper-content div.master-column-wrapper div.center-1 div.page.shopping-cart-page div.page-body div.order-summary-content div.table-wrapper:nth-child(1) table.cart tbody:nth-child(3) tr:nth-child(2) td.product > a.product-name");

    public P09_AddProductsToShoppingCart SelectCategory() {

        driver.findElement(this.GiftCategory).click();
        return this;
    }

    public P09_AddProductsToShoppingCart AddCard1ToShoppingCart() {
        driver.findElement(this.Gift1).click();
        return this;
    }

//    public P09_AddProductsToShoppingCart AddCard2ToShoppingCart() throws InterruptedException {
//        driver.findElement(this.Gift2).click();
//        return this;
//    }

    public P09_AddProductsToShoppingCart ConfirmationMessageAppear() {
        driver.findElement(this.ConfirmationMessage).click();
        return this;
    }

    public boolean  Product1AddedToCart(){
        return  driver.findElement(this.Product1InTable).getText().equals("Flower Girl Bracelet");
    }

//    public boolean  Product2AddedToCart(){
//        return  driver.findElement(this.Product2InTable).getText().equals("Vintage Style Engagement Ring");
//    }
}