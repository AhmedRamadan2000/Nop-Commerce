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

    private final By Product = By.xpath("//a[contains(text(),'adidas Consortium Campus 80s Running Shoes')]");

    public P07_UserFilterWithColor selectColor() {
        driver.findElement(this.colorRed).click();
        return this;
    }

    public boolean  VerifyProductThatAppear(){
        return  driver.findElement(this.Product).getText().equals("adidas Consortium Campus 80s Running Shoes");
    }
}