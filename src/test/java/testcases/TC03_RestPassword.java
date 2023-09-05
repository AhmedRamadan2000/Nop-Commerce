package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Main;
import pages.P01_RegisterPage;
import pages.P03_RestPasswordPage;

import java.util.concurrent.TimeUnit;

import static testcases.TC01_Registration.*;

public class TC03_RestPassword extends TestBase {
    @Test(enabled = true)
    public void ResetPasswordSuccessfully() throws InterruptedException {

        new Main(driver).clickLoginlink();
        new P03_RestPasswordPage(driver).clickOnForgetPassword().addRecoverEmailField(EMAIL)
                .clickRecoverButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertFalse(new P03_RestPasswordPage(driver).checkConfirmationMessage());
    }
}