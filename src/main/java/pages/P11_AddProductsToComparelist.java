package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P11_AddProductsToComparelist {
    WebDriver driver;

    public P11_AddProductsToComparelist(WebDriver driver) {
        this.driver = driver;
    }

    //define locators
    private final By GiftCategory = By.xpath("//body/div[6]/div[2]/ul[1]/li[6]/a[1]");

    private final By Product1 = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/button[2]");

    private final By Product2 = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/button[2]");
    private final By ConfirmationMessage = By.xpath("//a[contains(text(),'product comparison')]");

    private final By Product1InTable = By.xpath("//a[contains(text(),'Flower Girl Bracelet')]");

    private final By Product2InTable = By.xpath("//a[contains(text(),'Vintage Style Engagement Ring')]");


    public P11_AddProductsToComparelist SelectCategory() {
        driver.findElement(this.GiftCategory).click();
        return this;
    }

    public P11_AddProductsToComparelist AddProduct1ToList() {
        driver.findElement(this.Product1).click();
        return this;
    }

    public P11_AddProductsToComparelist AddProduct2ToList() {
        driver.findElement(this.Product2).click();
        return this;
    }

    public P11_AddProductsToComparelist ConfirmationMessageAppears() {
        driver.findElement(this.ConfirmationMessage).click();
        return this;
    }

//    public P11_AddProductsToComparelist Product1AddedToLIst() {
//        driver.findElement(this.Product1InTable).isDisplayed();
//        return this;
//    }
    public boolean Product1AddedToLIst(){
        return  driver.findElement(this.Product1InTable).getText().equals("Flower Girl Bracelet");
    }

    public boolean Product2AddedToLIst(){
        return  driver.findElement(this.Product2InTable).getText().equals("Vintage Style Engagement Ring");
    }

//    public P11_AddProductsToComparelist Product2AddedToLIst() {
//        driver.findElement(this.Product2InTable).click();
//        return this;
//    }
}