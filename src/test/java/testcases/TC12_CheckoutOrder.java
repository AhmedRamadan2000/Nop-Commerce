//package testcases;
//
//import com.github.javafaker.Faker;
//import org.testng.annotations.Test;
//import pages.Main;
//import pages.P02_LoginPage;
//import pages.P12_CheckoutOrder;
//
//import static testcases.TC01_Registration.*;
//import static testcases.TC01_Registration.PASSWORD;
//
//public class TC12_CheckoutOrder extends TestBase {
//    public static Faker faker = new Faker();
////    public static String City = faker.country().capital();
//
//    public static String City = faker.address().city();
//
//    public static String cardnum = faker.finance().creditCard();
////    public static String cardnum = faker.finance().
//    public static String PhoneNumber = faker.phoneNumber().cellPhone();
//
//    public static String Address = faker.address().streetAddress();
//
//    @Test(enabled = true)
//    public void ConfirmOrder() {
//        new Main(driver).clickLoginlink();
//
//        new P02_LoginPage(driver).addUserEmail(EMAIL).addUserPassword(PASSWORD).clickLoginButton();
//        new P12_CheckoutOrder(driver).SelectCategory().AddProduct1ToShoppingCart().AddProduct2ToShoppingCart()
//                .ConfirmationMessageAppears().ClickOnTermsAndCondition()
//                .ClickOnCheckOotButton().SelectCountry().AddCity(City).AddAddress(Address).AddPostalCode().AddPhoneNum(PhoneNumber)
//                .ClickOnContinueBilling().SelectShippingMethod().SelectPaymentMethod().SelectPaymentInfo().ConfirmOrder()
//                .SuccessMessage().ContinueShopping();
//    }
//}