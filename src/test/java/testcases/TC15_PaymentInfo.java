package testcases;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P15_PaymentInfoPage;

public class TC15_PaymentInfo extends TestBase{

    public static Faker faker = new Faker();
    public static String CardNumber = "4263982640269299";
    public static String HolderName = faker.name().fullName();
    public static String Code = "500";

    @Test(enabled = true)
    public void ConfirmPaymentInfo() {
        new TC14_ShippingMethod().ConfirmShipping();
        //ToDo: Add Credit Card method is selected
        new P15_PaymentInfoPage(driver).SelectCreditCard();
        Assert.assertTrue( new P15_PaymentInfoPage(driver).CreditCardMethodIsSelected());
        new P15_PaymentInfoPage(driver).ContinuePaymentMethod().CardHolderName(HolderName).CardNumber(CardNumber)
                .SelectExpiryDate().CardCode(Code).ContinuePaymentInfo();
    }
}