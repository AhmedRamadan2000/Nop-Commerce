package testcases;

import org.testng.annotations.Test;
import pages.Main;
import pages.P01_RegisterPage;
import pages.P02_LoginPage;
import pages.P10_AddProductsToWishlist;

import static testcases.TC01_Registration.*;
import static testcases.TC01_Registration.PASSWORD;

public class TC10_AddProductsToWishlist extends TestBase {
    @Test(enabled = true)
    public void AddProductsToWishlist() {
        EMAIL = faker.internet().emailAddress();
        new Main(driver).clickRegisterlink();
        new P01_RegisterPage(driver).selectGender().addFirst_name(FName).addLast_name(LastName).selectDay()
                .selectMonth().selectYear().addEmail(EMAIL).addCompany_name(companyName).addPassword(PASSWORD)
                .addConfirm_password(PASSWORD).clickRegister_button();
        new Main(driver).clickLoginlink();
        new P02_LoginPage(driver).addUserEmail(EMAIL).addUserPassword(PASSWORD).clickLoginButton();
        new P10_AddProductsToWishlist(driver).SelectCategory().AddProduct1ToList().ConfirmationMessageAppears().AddProduct2ToList().ConfirmationMessageAppears();
    }
}