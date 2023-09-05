package testcases;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import pages.*;

public class TC12_CheckoutOrder2 extends TestBase {
    @Test(enabled = true)
    public void CheckOutOrder() throws InterruptedException {
        new P01_RegisterPage(driver).confirmationMessage();
        new P02_LoginPage(driver).addUserEmail("");
        new P11_AddProductsToComparelist(driver).AddProduct2ToList();
        new P10_AddProductsToWishlist(driver).NavigateToWishList();
        // payment

        new TC09_AddProductsToShoppingCart().AddProductsToShoppingCart();
new P12_CheckoutOrder2(driver).ClickOnTermsAndCondition().ClickOnCheckOutButton();
    }
}