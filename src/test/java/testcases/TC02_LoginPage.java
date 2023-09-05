package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Main;
import pages.P01_RegisterPage;
import pages.P02_LoginPage;

import static testcases.TC01_Registration.*;

public class TC02_LoginPage extends TestBase {

    // TODO: check login functionality with valid email and valid password
    @Test(priority = 1,enabled = true,description = "Check Login with Valid Email and Password")
    public void user_login_successfully() throws InterruptedException {
        new Main(driver).clickLoginlink();
        new P02_LoginPage(driver).addUserEmail(EMAIL).addUserPassword(PASSWORD).clickLoginButton();
        Assert.assertTrue(new P02_LoginPage(driver).LogoutButton());
    }
    @Test(priority = 2,enabled = true)
    public void loginWithInvalidEmailandValidPassword_N() throws InterruptedException {

        new Main(driver).clickLoginlink();
        EMAIL="test@yahoo.com";
        new P02_LoginPage(driver).addUserEmail(EMAIL).addUserPassword(PASSWORD).clickLoginButton();
//        Assert.assertTrue(new P02_LoginPage(driver).LogoutButton());
    }
    @Test(priority = 3,enabled = true)
    public void loginWithValidEmailandInvalidPassword_N() throws InterruptedException {

        new Main(driver).clickLoginlink();
        PASSWORD="msdalmdsla";
        new P02_LoginPage(driver).addUserEmail(EMAIL).addUserPassword(PASSWORD).clickLoginButton();
//        Assert.assertTrue(new P02_LoginPage(driver).LogoutButton());
    }
    @Test(priority = 4,enabled = true)
    public void loginWithInvalidEmailandInvalidPassword_N() throws InterruptedException {
        new Main(driver).clickLoginlink();
        EMAIL="test@yahoo.com";
        PASSWORD="asdlkansdln";
        new P02_LoginPage(driver).addUserEmail(EMAIL).addUserPassword(PASSWORD).clickLoginButton();
//        Assert.assertTrue(new P02_LoginPage(driver).LogoutButton());
    }
}