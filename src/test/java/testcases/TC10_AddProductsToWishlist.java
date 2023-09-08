package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Main;
import pages.P02_LoginPage;
import pages.P09_AddProductsToShoppingCart;
import pages.P10_AddProductsToWishlist;

import java.util.concurrent.TimeUnit;

import static testcases.TC01_Registration.*;
import static testcases.TC01_Registration.PASSWORD;

public class TC10_AddProductsToWishlist extends TestBase {
    @Test(enabled = true)
    public void AddProductsToWishlist() {
        new Main(driver).clickLoginlink();
        new P02_LoginPage(driver).addUserEmail(EMAIL).addUserPassword(PASSWORD).clickLoginButton();

        //ToDo: Add product 1
        new P10_AddProductsToWishlist(driver).SelectCategory().AddProduct1ToWishList().CloseTheBar();

        //ToDo: Add product 2
        new P10_AddProductsToWishlist(driver).AddProduct2ToWishList().ClickOnTheBar();

        //ToDo: Assert product are added to wish list table
        Assert.assertTrue( new P10_AddProductsToWishlist(driver).Product1AddedToList());
        Assert.assertTrue( new P10_AddProductsToWishlist(driver).Product2AddedToList());
    }
}