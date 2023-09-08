package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Main;
import pages.P02_LoginPage;
import pages.P09_AddProductsToShoppingCart;

import static testcases.TC01_Registration.EMAIL;
import static testcases.TC01_Registration.PASSWORD;

public class TC09_AddProductsToShoppingCart extends TestBase {

    @Test
    public void AddProductsToShoppingCart() {
        //ToDo: login
        new Main(driver).clickLoginlink();
        new P02_LoginPage(driver).addUserEmail(EMAIL).addUserPassword(PASSWORD).clickLoginButton();
        //ToDo: Add product cart
        new P09_AddProductsToShoppingCart(driver).SelectCategory().AddProduct1ToShoppingCart().ClickOnTheBar();
//                .AddProduct2ToShoppingCart().CloseTheBar().hoverOnTheShoppingCart(driver).ClickOnTheShoppingCart();
//        WebDriverWait wait = new WebDriverWait(driver, 5);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Shopping cart')]")));
//        new P09_AddProductsToShoppingCart(driver).AddProduct2ToShoppingCart().CloseTheBar().ClickOnTheShoppingCart();
        //ToDo: Assert the product is added
        Assert.assertTrue( new P09_AddProductsToShoppingCart(driver).Product1AddedToCart());
//        Assert.assertTrue( new P09_AddProductsToShoppingCart(driver).Product2AddedToCart());
    }
}