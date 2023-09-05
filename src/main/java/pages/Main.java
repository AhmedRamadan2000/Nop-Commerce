package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {

    WebDriver driver;
    Select select;

    public Main (WebDriver driver) {
        this.driver = driver;
    }

    //define locators
//    private final By loginlink = By.xpath("//a[contains(text(),'Log in')]");

    private final By loginlink = By.linkText("Log in");

    private final By Registerlink = By.xpath("//a[@class='ico-register']");

    private final By ChangeCurrency = By.xpath("//select[@id='customerCurrency']");

    public Main clickLoginlink() {
        driver.findElement(this.loginlink).click();
        return this;
    }

    public Main clickRegisterlink() {
        driver.findElement(this.Registerlink).click();
        return this;
    }

    public Main selectCurrency() {
        select = new Select(driver.findElement(this.ChangeCurrency));
        select.selectByIndex(1);
        return this;
    }
}