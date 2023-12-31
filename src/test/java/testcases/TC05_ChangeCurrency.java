package testcases;

import org.testng.annotations.Test;
import pages.Main;
import pages.P02_LoginPage;

import static testcases.TC01_Registration.EMAIL;
import static testcases.TC01_Registration.PASSWORD;

public class TC05_ChangeCurrency extends TestBase {
    @Test(enabled = true)
    public void ChangeCurrency() {
        new Main(driver).clickLoginlink();
        new P02_LoginPage(driver).addUserEmail(EMAIL).addUserPassword(PASSWORD).clickLoginButton();
        new Main(driver).selectCurrency();
    }
}