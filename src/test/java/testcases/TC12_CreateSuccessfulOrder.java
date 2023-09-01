package testcases;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import pages.Main;
import pages.P01_RegisterPage;
import pages.P02_LoginPage;
import pages.P12_CreateSuccessfulOrder;

import static testcases.TC01_Registration.*;
import static testcases.TC01_Registration.PASSWORD;

public class TC12_CreateSuccessfulOrder extends TestBase {
    public static Faker faker = new Faker();
//    public static String City = faker.country().capital();

    public static String City = faker.address().city();

    public static String cardnum = faker.finance().creditCard();
    public static String cardnum = faker.finance().
    public static String PhoneNumber = faker.phoneNumber().cellPhone();

    public static String Address = faker.address().streetAddress();

    @Test(enabled = true)
    public void ConfirmOrder() {
        EMAIL = faker.internet().emailAddress();
        new Main(driver).clickRegisterlink();
        new P01_RegisterPage(driver).selectGender().addFirst_name(FName).addLast_name(LastName).selectDay()
                .selectMonth().selectYear().addEmail(EMAIL).addCompany_name(companyName).addPassword(PASSWORD)
                .addConfirm_password(PASSWORD).clickRegister_button();

        new Main(driver).clickLoginlink();

        new P02_LoginPage(driver).addUserEmail(EMAIL).addUserPassword(PASSWORD).clickLoginButton();
        new P12_CreateSuccessfulOrder(driver).SelectCategory().AddProduct1ToShoppingCart().AddProduct2ToShoppingCart()
                .ConfirmationMessageAppears().ClickOnTermsAndCondition()
                .ClickOnCheckOotButton().SelectCountry().AddCity(City).AddAddress(Address).AddPostalCode().AddPhoneNum(PhoneNumber)
                .ClickOnContinueBilling().SelectShippingMethod().SelectPaymentMethod().SelectPaymentInfo().ConfirmOrder()
                .SuccessMessage().ContinueShopping();
    }
}