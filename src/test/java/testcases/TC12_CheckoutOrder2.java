package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Main;
import pages.P02_LoginPage;
import pages.P09_AddProductsToShoppingCart;
import pages.P12_CheckoutOrder2;

import static testcases.TC01_Registration.EMAIL;
import static testcases.TC01_Registration.PASSWORD;

public class TC12_CheckoutOrder2 extends TestBase {
    @Test(enabled = true)
    public void CheckOutOrder() {

        //ToDo: Login to site
        new Main(driver).clickLoginlink();
        new P02_LoginPage(driver).addUserEmail(EMAIL).addUserPassword(PASSWORD).clickLoginButton();

        //ToDo: Add product to shopping cart
        new P09_AddProductsToShoppingCart(driver).SelectCategory().AddProduct1ToShoppingCart().ClickOnTheBar();
        Assert.assertTrue(new P09_AddProductsToShoppingCart(driver).Product1AddedToCart());

        //ToDo: checkout the order
        new P12_CheckoutOrder2(driver).ClickOnTermsAndCondition().ClickOnCheckOutButton();
    }
}