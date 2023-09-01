package testcases;

import org.testng.annotations.Test;
import pages.Main;
import pages.P01_RegisterPage;
import pages.P03_RestPasswordPage;

import static testcases.TC01_Registration.*;

public class TC03_RestPassword extends TestBase {
    @Test(enabled = true)
    public void ResetPasswordSuccessfully() {
//        EMAIL = faker.internet().emailAddress();
//        new Main(driver).clickRegisterlink();
//        new P01_RegisterPage(driver).selectGender().addFirst_name(FName).addLast_name(LastName).selectDay()
//                .selectMonth().selectYear().addEmail(EMAIL).addCompany_name(companyName).addPassword(PASSWORD)
//                .addConfirm_password(PASSWORD).clickRegister_button();
        new Main(driver).clickLoginlink();
        new P03_RestPasswordPage(driver).clickOnForgetPassword().addRecoverEmailField(EMAIL)
                .clickRecoverButton().checkConfirmationMessage();
    }
}