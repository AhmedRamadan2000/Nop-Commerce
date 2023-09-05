//package pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.Select;
//import utility.Utilities;
//
//public class P12_CheckoutOrder {
//    WebDriver driver;
//
//    Select select;
//
//    public P12_CheckoutOrder(WebDriver driver) {
//        this.driver = driver;
//    }
//
//    //define locators
//    private final By GiftCategory = By.xpath("//body/div[6]/div[2]/ul[1]/li[6]/a[1]");
//
//    private final By Product1 = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/button[1]");
//
//    private final By Product2 = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/button[1]");
//
//    private final By ConfirmationMessage = By.xpath("//a[contains(text(),'shopping cart')]");
//
//    private final By TermsAndConditionsCheckBox = By.xpath("//input[@id='termsofservice']");
//    private final By CheckOutButton = By.xpath("//button[@id='checkout']");
//
//    private final By CountryDropDownLIst = By.xpath("//select[@id='BillingNewAddress_CountryId']");
//
//    private final By City = By.xpath("//input[@id='BillingNewAddress_City']");
//
//    private final By Address = By.xpath("//input[@id='BillingNewAddress_Address1']");
//
//    private final By PostalCode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
//
//    private final By PhoneNumber = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
//
//    private final By ContinueBilling = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]");
//
//    private final By ContinueShipping = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]");
//
//    private final By ContinuePaymentMethod = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]");
//
//    private final By ContinuePaymentInfo = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]");
//
//    private final By ConfirmOrder = By.xpath("//button[contains(text(),'Confirm')]");
//
//    private final By SuccessfulMessage = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
//
//    private final By ContinueShoppingButton = By.xpath("//button[contains(text(),'Continue')]");
//
//    public By ContinueShoppingButton() {
//        return By.xpath("//button[contains(text(),'Continue')]");
//    }
//
//
//
//    public P12_CheckoutOrder SelectCategory() {
//
//        driver.findElement(this.GiftCategory).click();
//        return this;
//    }
//
//    public P12_CheckoutOrder AddProduct1ToShoppingCart() {
//        driver.findElement(this.Product1).click();
//        return this;
//    }
//
//    public P12_CheckoutOrder AddProduct2ToShoppingCart() {
//        driver.findElement(this.Product2).click();
//        return this;
//    }
//
//    public P12_CheckoutOrder ConfirmationMessageAppears() {
//        driver.findElement(this.ConfirmationMessage).click();
//        return this;
//    }
//
//    public P12_CheckoutOrder ClickOnTermsAndCondition() {
//        driver.findElement(this.TermsAndConditionsCheckBox).click();
//        return this;
//    }
//
//    public P12_CheckoutOrder ClickOnCheckOotButton() {
//        driver.findElement(this.CheckOutButton).click();
//        return this;
//    }
//
//    public P12_CheckoutOrder SelectCountry() {
//        select = new Select(driver.findElement(this.CountryDropDownLIst));
//        select.selectByIndex(Utilities.generateRandomNumber(1, 120));
//        return this;
//    }
//
//    public P12_CheckoutOrder AddCity(String City) {
//        driver.findElement(this.City).sendKeys(City);
//        return this;
//    }
//
//    public P12_CheckoutOrder AddAddress(String Address) {
//        driver.findElement(this.Address).sendKeys(Address);
//        return this;
//    }
//
//    public P12_CheckoutOrder AddPostalCode() {
//        driver.findElement(this.PostalCode).sendKeys("12345");
//        return this;
//    }
//
//    public P12_CheckoutOrder AddPhoneNum(String PhoneNumber) {
//        driver.findElement(this.PhoneNumber).sendKeys(PhoneNumber);
//        return this;
//    }
//
//    public P12_CheckoutOrder ClickOnContinueBilling() {
//        driver.findElement(this.ContinueBilling).click();
//        return this;
//    }
//
//    public P12_CheckoutOrder SelectShippingMethod() {
//        driver.findElement(this.ContinueShipping).click();
//        return this;
//    }
//
//    public P12_CheckoutOrder SelectPaymentMethod() {
//        driver.findElement(this.ContinuePaymentMethod).click();
//        return this;
//    }
//
//    public P12_CheckoutOrder SelectPaymentInfo() {
//        driver.findElement(this.ContinuePaymentInfo).click();
//        return this;
//    }
//
//    public P12_CheckoutOrder ConfirmOrder() {
//        driver.findElement(this.ConfirmOrder).click();
//        return this;
//    }
//
//    public P12_CheckoutOrder SuccessMessage() {
//
//        driver.findElement(this.SuccessfulMessage).isDisplayed();
//        return this;
//    }
//
//    public P12_CheckoutOrder ContinueShopping() {
//
//        driver.findElement(this.ContinueShoppingButton).click();
//        return this;
//    }
//}