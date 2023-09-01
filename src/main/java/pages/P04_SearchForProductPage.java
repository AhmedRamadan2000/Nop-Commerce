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

    private final By SearchResult = By.xpath("//body/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/h2[1]/a[1]");

    public P04_SearchForProductPage AddTextInTheSearchField(String product) {

        driver.findElement(this.SearchField).sendKeys(product);
        return this;
    }

    public P04_SearchForProductPage ClickOnSearchButton() {

        driver.findElement(this.SearchButton).click();
        return this;
    }

    public P04_SearchForProductPage SearchResultDisplay() {

        driver.findElement(this.SearchResult).isDisplayed();
        return this;
    }
}