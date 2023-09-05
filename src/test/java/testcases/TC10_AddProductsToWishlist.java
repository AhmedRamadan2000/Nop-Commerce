package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Main;
import pages.P02_LoginPage;
import pages.P10_AddProductsToWishlist;

import java.util.concurrent.TimeUnit;

import static testcases.TC01_Registration.*;
import static testcases.TC01_Registration.PASSWORD;

public class TC10_AddProductsToWishlist extends TestBase {
    @Test(enabled = true)
    public void AddProductsToWishlist() {
        new Main(driver).clickLoginlink();
        new P02_LoginPage(driver).addUserEmail(EMAIL).addUserPassword(PASSWORD).clickLoginButton();
        //Add product 1
        new P10_AddProductsToWishlist(driver).SelectCategory().AddProduct1ToList();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Add product 2
      new P10_AddProductsToWishlist(driver).AddProduct2ToList().NavigateToWishList();
        Assert.assertTrue( new P10_AddProductsToWishlist(driver).confirmationProduct1InWishList());
        Assert.assertTrue( new P10_AddProductsToWishlist(driver).confirmationProduct2InWishList());
    }
}