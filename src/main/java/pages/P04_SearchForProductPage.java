package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P04_SearchForProductPage {
    WebDriver driver;

    public P04_SearchForProductPage(WebDriver driver) {
        this.driver = driver;
    }

    //define locators
    private final By SearchField = By.xpath("//input[@id='small-searchterms']");

    private final By SearchButton = By.xpath("//button[contains(text(),'Search')]");

    private final By SearchResult = By.xpath("//a[contains(text(),'Apple MacBook Pro 13-inch')]");

    public P04_SearchForProductPage AddTextInTheSearchField(String product) {

        driver.findElement(this.SearchField).sendKeys(product);
        return this;
    }

    public P04_SearchForProductPage ClickOnSearchButton() {

        driver.findElement(this.SearchButton).click();
        return this;
    }

    public boolean SearchResult(){
        return  driver.findElement(this.SearchResult).isDisplayed();
    }
}