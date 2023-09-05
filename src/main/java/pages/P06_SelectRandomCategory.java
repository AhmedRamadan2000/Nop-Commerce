package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class P06_SelectRandomCategory {
    WebDriver driver;
    Actions actions;

    public P06_SelectRandomCategory(WebDriver driver) {
        this.driver = driver;
    }

    //define locators
    private final By hoverCategory = By.xpath("//body/div[6]/div[2]/ul[1]/li[3]/a[1]");
    private final By selectedCategory = By.xpath("//body/div[6]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]");
    private final By categoryTitle = By.xpath("//h1[contains(text(),'Shoes')]");

    public P06_SelectRandomCategory hoverOnCategory(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
        actions.moveToElement(driver.findElement(this.hoverCategory)).build().perform();
        return this;
    }

    public P06_SelectRandomCategory selectedCategory() {
        driver.findElement(this.selectedCategory).click();
        return this;
    }

    public boolean  CheckCategoryTitle(){
        return  driver.findElement(this.categoryTitle).getText().equals("Shoes");
    }
}