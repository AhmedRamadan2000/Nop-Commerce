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
    public void ConfirmOrder() {
        //ToDo: login with valid user
        new Main(driver).clickLoginlink();
        new P02_LoginPage(driver).addUserEmail(EMAIL).addUserPassword(PASSWORD).clickLoginButton();

        //ToDo: Add Product to cart
        new P09_AddProductsToShoppingCart(driver).SelectCategory().AddProduct1ToShoppingCart().ClickOnTheBar();

        //ToDo: Assert the product is added
        Assert.assertTrue(new P09_AddProductsToShoppingCart(driver).Product1AddedToCart());

        //ToDo: checkout the order
        new P12_CheckoutOrder2(driver).ClickOnTermsAndCondition().ClickOnCheckOutButton();

        //Payment
        //ToDo: assert the user is in the billing address page
        String pageTitle = driver.getTitle();
        Assert.assertTrue(pageTitle.contains("Checkout"));

        //ToDo: Add billing address data
        new P13_BillingAddressPage(driver).SelectCountry().AddCity(City).AddAddress(Address).AddPostalCode().AddPhoneNum(PhoneNumber).ClickOnContinueBilling();

        //ToDo: Add shipping method
//        Assert.assertTrue(new P14_ShippingMethodPage(driver).ShippingMethodselected());
        new P14_ShippingMethodPage(driver).SelectShippingMethod();

        //ToDo: Add Credit Card as a payment method
        new P15_PaymentInfoPage(driver).SelectCreditCard();

        //ToDo: Assert the Credit Card payment method is selected
        Assert.assertTrue(new P15_PaymentInfoPage(driver).CreditCardMethodIsSelected());
        new P15_PaymentInfoPage(driver).ContinuePaymentMethod().CardHolderName(HolderName).CardNumber(CardNumber).SelectExpiryDate().CardCode(Code).ContinuePaymentInfo();

        //ToDo: Assert the confirm button is appear
        Assert.assertTrue(new P16_ConfirmOrderPage(driver).ConfirmOrderButtonIsAppear());
        new P16_ConfirmOrderPage(driver).ConfirmOrder();

        //ToDo: Assert the confirm message is appear
        Assert.assertTrue(new P16_ConfirmOrderPage(driver).ConfirmSuccessMessageAppear());

        ////ToDo: Continue shopping
        new P16_ConfirmOrderPage(driver).ContinueShopping();
    }
}