package testcases;

import org.testng.annotations.Test;
import pages.Main;
import pages.P01_RegisterPage;
import pages.P02_LoginPage;
import static testcases.TC01_Registration.*;
public class TC02_LoginPage extends TestBase {

    @Test(enabled = true)
    public void user_login_successfully() throws InterruptedException {

        EMAIL = faker.internet().emailAddress();
        new Main(driver).clickRegisterlink();
        new P01_RegisterPage(driver).selectGender().addFirst_name(FName).addLast_name(LastName).selectDay()
                .selectMonth().selectYear().addEmail(EMAIL).addCompany_name(companyName).addPassword(PASSWORD)
                .addConfirm_password(PASSWORD).clickRegister_button();
        Thread.sleep(3000);
        new Main(driver).clickLoginlink();
        new P02_LoginPage(driver).addUserEmail(EMAIL).addUserPassword(PASSWORD).clickLoginButton();
    }
}