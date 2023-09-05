package testcases;

import org.testng.annotations.Test;
import pages.P14_ShippingMethodPage;

public class TC14_ShippingMethod extends TestBase {

    @Test(enabled = true)
    public void ConfirmShipping() throws InterruptedException {
        new TC13_BillingAddress().ConfirmBilling();
        new P14_ShippingMethodPage(driver).SelectShippingMethod();
    }
}