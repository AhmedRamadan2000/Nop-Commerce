package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Main;
import pages.P02_LoginPage;

import java.util.concurrent.TimeUnit;

import static testcases.TC01_Registration.EMAIL;
import static testcases.TC01_Registration.PASSWORD;

public class TC05_ChangeCurrency extends TestBase {
    @Test(enabled = true)
    public void ChangeCurrency() {
        new Main(driver).clickLoginlink();
        new P02_LoginPage(driver).addUserEmail(EMAIL).addUserPassword(PASSWORD).clickLoginButton();
        new Main(driver).selectCurrency();
        Assert.assertEquals("€1032.00", new Main(driver).theCurrencyThatAppear());
    }
}