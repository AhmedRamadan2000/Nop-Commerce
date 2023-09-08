package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class P09_AddProductsToShoppingCart {
    WebDriver driver;

    Actions actions;

    public P09_AddProductsToShoppingCart(WebDriver driver) {
        this.driver = driver;
    }

    //define locators
    private final By jewelryCategory = By.xpath("//body/div[6]/div[2]/ul[1]/li[6]/a[1]");

    private final By product1 = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/button[1]");

    private final By product2 = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/button[1]");

    private final By CloseNotificationMessage = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");

    private final By Product1InTable = By.xpath("//tbody/tr[1]/td[3]/a[1]");

    private final By Product2InTable = By.xpath("//tbody/tr[2]/td[3]/a[1]");

    private final By ClickOnShoppingCartBar = By.xpath("//a[contains(text(),'shopping cart')]");

    private final By ShoppingCartButton = By.xpath("//span[contains(text(),'Shopping cart')]");

    private final By CartButton = By.xpath("//button[contains(text(),'Go to cart')]");

    public P09_AddProductsToShoppingCart SelectCategory() {

        driver.findElement(this.jewelryCategory).click();
        return this;
    }

    public P09_AddProductsToShoppingCart AddProduct1ToShoppingCart() {
        driver.findElement(this.product1).click();
        return this;
    }

    public P09_AddProductsToShoppingCart AddProduct2ToShoppingCart() {
        driver.findElement(this.product2).click();
        return this;
    }

    public P09_AddProductsToShoppingCart CloseTheBar() {
        driver.findElement(this.CloseNotificationMessage).click();
        return this;
    }

    public P09_AddProductsToShoppingCart ClickOnTheBar() {
        driver.findElement(this.ClickOnShoppingCartBar).click();
        return this;
    }

    public P09_AddProductsToShoppingCart hoverOnTheShoppingCart(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
        actions.moveToElement(driver.findElement(this.ShoppingCartButton)).build().perform();
        return this;
    }
        public P09_AddProductsToShoppingCart ClickOnTheShoppingCart() {
        driver.findElement(this.CartButton).click();
        return this;
    }

    public boolean Product1AddedToCart() {
        return driver.findElement(this.Product1InTable).getText().equals("Flower Girl Bracelet");
    }

    public boolean Product2AddedToCart() {
        return driver.findElement(this.Product2InTable).getText().equals("Vintage Style Engagement Ring");
    }
}