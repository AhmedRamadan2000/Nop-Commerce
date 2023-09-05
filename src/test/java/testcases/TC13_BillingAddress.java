package testcases;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import pages.P13_BillingAddressPage;

public class TC13_BillingAddress extends TestBase {

    public static Faker faker = new Faker();
    //    public static String cardnum = faker.finance().creditCard();

//    public static String City = faker.country().capital();

    public static String City = faker.address().city();

    public static String PhoneNumber = faker.phoneNumber().cellPhone();

    public static String Address = faker.address().streetAddress();

    @Test(enabled = true)
    public void ConfirmBilling() throws InterruptedException {
        new TC12_CheckoutOrder2().CheckOutOrder();
        new P13_BillingAddressPage(driver).SelectCountry().AddCity(City).AddAddress(Address).AddPostalCode()
                .AddPhoneNum(PhoneNumber).ClickOnContinueBilling();
    }
}