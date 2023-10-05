package testcases;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utility.Utilities;

import static testcases.TC01_Registration.EMAIL;
import static testcases.TC01_Registration.PASSWORD;

public class TC16_ConfirmOrder extends TestBase {
    public static Faker faker = new Faker();
    public static String City = faker.address().city();
    public static String PhoneNumber = faker.phoneNumber().cellPhone();
    public static String Address = faker.address().streetAddress();
    public static String CardNum = "4263982640269299";
    public static String HolderName = faker.name().fullName();
    public static String Code = "500";

    @Test(enabled = true)
    public void ConfirmOrder() throws InterruptedException {

        //ToDo: login with valid user
        new Main(driver).clickLoginlink();
        new P02_LoginPage(driver).addUserEmail(EMAIL).addUserPassword(PASSWORD).clickLoginButton();

        //ToDo: Take a screenshot
        Utilities.Capturescreenshots(driver, "Login successfully");

        //ToDo: Add Product to cart
        new P09_AddProductsToShoppingCart(driver).SelectCategory().AddProduct1ToShoppingCart().ClickOnTheBar();

        //ToDo: Take a screenshot
        Utilities.Capturescreenshots(driver, "AddProductsToShoppingCart");

        //ToDo: Assert the product is added
        Assert.assertTrue(new P09_AddProductsToShoppingCart(driver).Product1AddedToCart());

        //ToDo: checkout the order
        new P12_CheckoutOrder2(driver).ClickOnTermsAndCondition().ClickOnCheckOutButton();

        //ToDo: Take a screenshot
        Utilities.Capturescreenshots(driver, "CheckOutPage");

        //Payment
        //ToDo: assert the user is in the billing address page
        String pageTitle = driver.getTitle();
        Assert.assertTrue(pageTitle.contains("Checkout"));

        //ToDo: Add billing address data
        new P13_BillingAddressPage(driver).SelectCountry().AddCity(City).AddAddress(Address).AddPostalCode().AddPhoneNum(PhoneNumber).ClickOnContinueBilling();

        //ToDo: Take a screenshot
        Utilities.Capturescreenshots(driver, "BillingPage");

        //ToDo: Add shipping method
        new P14_ShippingMethodPage(driver).SelectShippingMethod();

        //ToDo: Take a screenshot
        Utilities.Capturescreenshots(driver, "ShippingPage");

        //ToDo: Select Credit Card as a payment method
        new P15_PaymentInfoPage(driver).SelectCreditCard();

        //ToDo: Assert the Credit Card payment method is selected
        Assert.assertTrue(new P15_PaymentInfoPage(driver).CreditCardMethodIsSelected());

        //ToDo: Take a screenshot
        Utilities.Capturescreenshots(driver, "PaymentPage");

        //ToDo: Add Credit card data
        new P15_PaymentInfoPage(driver).ContinuePaymentMethod().CardHolderName(HolderName).CardNumber(CardNum).SelectExpiryDate().CardCode(Code).ContinuePaymentInfo();

        //ToDo: Take a screenshot
        Utilities.Capturescreenshots(driver, "PaymentData");

        //ToDo: Assert the confirm button is appear
        Assert.assertTrue(new P16_ConfirmOrderPage(driver).ConfirmOrderButtonIsAppear());

        //ToDo: Confirm the order
        new P16_ConfirmOrderPage(driver).ConfirmOrder();

        //ToDo: Take a screenshot
        Utilities.Capturescreenshots(driver, "ConfirmOrder");

        //ToDo: Assert the confirmation message is appear
        Assert.assertTrue(new P16_ConfirmOrderPage(driver).ConfirmSuccessMessageAppear());

        //ToDo: Continue shopping
        new P16_ConfirmOrderPage(driver).ContinueShopping();
    }
}