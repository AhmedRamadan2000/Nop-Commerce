package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Main;
import pages.P02_LoginPage;
import pages.P11_AddProductsToComparelist;

import static testcases.TC01_Registration.EMAIL;
import static testcases.TC01_Registration.PASSWORD;

public class TC11_AddProductsToComparelist extends TestBase {
    @Test(enabled = true)
    public void AddProductsToCompareList(){
        //ToDO: Login with valid User
        new Main(driver).clickLoginlink();
        new P02_LoginPage(driver).addUserEmail(EMAIL).addUserPassword(PASSWORD).clickLoginButton();
        //ToDo: Add product 1
        new P11_AddProductsToComparelist(driver).SelectCategory().AddProduct1ToCompareList().CloseTheBar();

        //ToDo: Add product 2
        new P11_AddProductsToComparelist(driver).AddProduct2ToCompareList().ClickOnBar();

        //ToDo: Assert products are added to Comparison table
        Assert.assertTrue( new P11_AddProductsToComparelist(driver).Product1AddedToCompareList());
        Assert.assertTrue( new P11_AddProductsToComparelist(driver).Product2AddedToCompareList());
    }

}