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
    public void AddProductsToComparelist(){
        new Main(driver).clickLoginlink();
        new P02_LoginPage(driver).addUserEmail(EMAIL).addUserPassword(PASSWORD).clickLoginButton();
        new P11_AddProductsToComparelist(driver).SelectCategory().AddProduct1ToList().AddProduct2ToList()
                .ConfirmationMessageAppears();
        Assert.assertTrue( new P11_AddProductsToComparelist(driver).Product1AddedToLIst());
        Assert.assertTrue( new P11_AddProductsToComparelist(driver).Product2AddedToLIst());
    }
}