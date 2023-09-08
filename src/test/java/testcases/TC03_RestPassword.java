package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Main;
import pages.P03_RestPasswordPage;
import static testcases.TC01_Registration.*;

public class TC03_RestPassword extends TestBase {
    @Test(enabled = true)
    public void ResetPasswordSuccessfully() throws InterruptedException {
        new Main(driver).clickLoginlink();
        new P03_RestPasswordPage(driver).clickOnForgetPassword().addRecoverEmailField(EMAIL)
                .clickRecoverButton();
      Assert.assertEquals("Email with instructions has been sent to you.", new P03_RestPasswordPage(driver).checkConfirmationMessage());
    }
}