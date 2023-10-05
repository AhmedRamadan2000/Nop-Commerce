package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Main;
import pages.P02_LoginPage;
import utility.Utilities;

import static testcases.TC01_Registration.EMAIL;
import static testcases.TC01_Registration.PASSWORD;

public class TC02_LoginPage extends TestBase {

    @Test(enabled = true)
    public void user_login_successfully() throws InterruptedException {
        new Main(driver).clickLoginlink();
        new P02_LoginPage(driver).addUserEmail(EMAIL).addUserPassword(PASSWORD).clickLoginButton();
        //ToDo: Take a screenshot
        Utilities.Capturescreenshots(driver, "LoginSuccessfully");

        Assert.assertTrue(new P02_LoginPage(driver).LogoutButton());
    }

    @Test(enabled = true)
    public void loginWithInvalidEmailandValidPassword_N() throws InterruptedException {
        new Main(driver).clickLoginlink();
        EMAIL = "test@yahoo.com";
        new P02_LoginPage(driver).addUserEmail(EMAIL).addUserPassword(PASSWORD).clickLoginButton();
        //ToDo: Take a screenshot
        Utilities.Capturescreenshots(driver, "loginWithInvalidEmailAndValidPassword");
        Assert.assertTrue(new P02_LoginPage(driver).ValidationMessage());
    }

    @Test(enabled = true)
    public void loginWithValidEmailandInvalidPassword_N() throws InterruptedException {

        new Main(driver).clickLoginlink();
        PASSWORD = "msdalmdsla";
        new P02_LoginPage(driver).addUserEmail(EMAIL).addUserPassword(PASSWORD).clickLoginButton();
        //ToDo: Take a screenshot
        Utilities.Capturescreenshots(driver, "loginWithValidEmailAndInvalidPassword");
        Assert.assertTrue(new P02_LoginPage(driver).ValidationMessage());
    }

    @Test(enabled = true)
    public void loginWithInvalidEmailandInvalidPassword_N() throws InterruptedException {
        new Main(driver).clickLoginlink();
        EMAIL = "test@yahoo.com";
        PASSWORD = "asdlkansdln";
        new P02_LoginPage(driver).addUserEmail(EMAIL).addUserPassword(PASSWORD).clickLoginButton();
        //ToDo: Take a screenshot
        Utilities.Capturescreenshots(driver, "loginWithInvalidEmailAndInvalidPassword");
        Assert.assertTrue(new P02_LoginPage(driver).ValidationMessage());
    }
}