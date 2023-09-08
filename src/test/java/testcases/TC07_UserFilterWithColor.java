package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Main;
import pages.P02_LoginPage;
import pages.P06_SelectRandomCategory;
import pages.P07_UserFilterWithColor;

import static testcases.TC01_Registration.EMAIL;
import static testcases.TC01_Registration.PASSWORD;

public class TC07_UserFilterWithColor extends TestBase {

    @Test(enabled = true)
    public void UserCanFilterProductWithColor() {
        new Main(driver).clickLoginlink();
        new P02_LoginPage(driver).addUserEmail(EMAIL).addUserPassword(PASSWORD).clickLoginButton();
        new P06_SelectRandomCategory(driver).hoverOnCategory(driver).selectedCategory();
        new P07_UserFilterWithColor(driver).selectColor();
        Assert.assertTrue( new P07_UserFilterWithColor(driver).VerifyProductThatAppear());
    }
}