package testcases;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P13_BillingAddressPage;

public class TC13_BillingAddress extends TestBase {

    public static Faker faker = new Faker();

    public static String City = faker.address().city();

    public static String PhoneNumber = faker.phoneNumber().cellPhone();

    public static String Address = faker.address().streetAddress();

    @Test(enabled = true)
    public void ConfirmBilling() {
        //ToDo: checkout the order
        new TC12_CheckoutOrder2().CheckOutOrder();
        //ToDo: Add billing address data
        String pageTitle = driver.getTitle();
        Assert.assertTrue(pageTitle.contains("Checkout"));
        new P13_BillingAddressPage(driver).SelectCountry().AddCity(City).AddAddress(Address).AddPostalCode()
                .AddPhoneNum(PhoneNumber).ClickOnContinueBilling();
    }
}