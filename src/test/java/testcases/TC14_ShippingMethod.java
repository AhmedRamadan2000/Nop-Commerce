package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P14_ShippingMethodPage;

public class TC14_ShippingMethod extends TestBase {

    @Test(enabled = true)
    public void ConfirmShipping() {
        new TC13_BillingAddress().ConfirmBilling();

        //ToDo: Add shipping method
        Assert.assertTrue(new P14_ShippingMethodPage(driver).ShippingMethodselected());
        new P14_ShippingMethodPage(driver).SelectShippingMethod();
    }
}