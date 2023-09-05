package testcases;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import static testcases.TC01_Registration.EMAIL;
import static testcases.TC01_Registration.PASSWORD;

public class TC16_ConfirmOrder extends TestBase {
    public static Faker faker = new Faker();
    public static String City = faker.address().city();
    public static String PhoneNumber = faker.phoneNumber().cellPhone();
    public static String Address = faker.address().streetAddress();
    public static String CardNumber = faker.finance().creditCard();
    public static String HolderName = faker.name().fullName();
    public static String Code = faker.code().asin();


    @Test(enabled = true)
    public void ConfirmOrder() throws InterruptedException {
        new Main(driver).clickLoginlink();
        new P02_LoginPage(driver).addUserEmail(EMAIL).addUserPassword(PASSWORD).clickLoginButton();
        //Add Product to cart
        new P09_AddProductsToShoppingCart(driver).SelectCategory().AddCard1ToShoppingCart().ConfirmationMessageAppear();
        new P12_CheckoutOrder2(driver).ClickOnTermsAndCondition().ClickOnCheckOutButton();
        //Payment
        new P13_BillingAddressPage(driver).SelectCountry().AddCity(City).AddAddress(Address).AddPostalCode().AddPhoneNum(PhoneNumber).ClickOnContinueBilling();
        new P14_ShippingMethodPage(driver).SelectShippingMethod();
        new P15_PaymentInfoPage(driver).SelectCreditCard().ContinuePaymentMethod().CardHolderName(HolderName).CardNumber(CardNumber).SelectExpirationDate().CardCode(Code).ContinuePaymentInfo();
        Assert.assertTrue(new P16_ConfirmOrderPage(driver).ConfirmSuccessMessageAppear());
        //Continue shopping
        new P16_ConfirmOrderPage(driver).ContinueShopping();
    }
}