package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Main;
import pages.P02_LoginPage;
import pages.P06_SelectRandomCategory;
import static testcases.TC01_Registration.*;

public class TC06_SelectRandomCategory extends TestBase {

    @Test(enabled = true)
    public void SelectRandomCategory() {
        new Main(driver).clickLoginlink();
        new P02_LoginPage(driver).addUserEmail(EMAIL).addUserPassword(PASSWORD).clickLoginButton();
        new P06_SelectRandomCategory(driver).hoverOnCategory(driver).selectedCategory();
        Assert.assertTrue(new P06_SelectRandomCategory(driver).CheckCategoryTitle());
    }
}