package testcases;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import pages.P15_PaymentInfoPage;

public class TC15_PaymentInfo extends TestBase{

    public static Faker faker = new Faker();
    public static String CardNumber = faker.finance().creditCard();
    public static String HolderName = faker.name().fullName();
    public static String Code = faker.code().asin();


    @Test(enabled = true)
    public void ConfirmPaymentInfo() throws InterruptedException {
        new TC14_ShippingMethod().ConfirmShipping();
        new P15_PaymentInfoPage(driver).SelectCreditCard().ContinuePaymentMethod().CardHolderName(HolderName).CardNumber(CardNumber)
                .SelectExpirationDate().CardCode(Code).ContinuePaymentInfo();
    }
}