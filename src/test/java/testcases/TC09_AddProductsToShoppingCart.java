package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Main;
import pages.P02_LoginPage;
import pages.P09_AddProductsToShoppingCart;
import static testcases.TC01_Registration.*;

public class TC09_AddProductsToShoppingCart extends TestBase {

    @Test
    public void AddProductsToShoppingCart() throws InterruptedException {
        new Main(driver).clickLoginlink();
        new P02_LoginPage(driver).addUserEmail(EMAIL).addUserPassword(PASSWORD).clickLoginButton();
        new P09_AddProductsToShoppingCart(driver).SelectCategory().AddCard1ToShoppingCart().ConfirmationMessageAppear();

        Assert.assertTrue( new P09_AddProductsToShoppingCart(driver).Product1AddedToCart());
    }
}