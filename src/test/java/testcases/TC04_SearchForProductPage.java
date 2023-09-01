package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Main;
import pages.P02_LoginPage;
import pages.P04_SearchForProductPage;

import static testcases.TC01_Registration.EMAIL;
import static testcases.TC01_Registration.PASSWORD;

public class TC04_SearchForProductPage extends TestBase {

    String product = "Apple MacBook Pro 13-inch";

    @Test(enabled = true)
    public void SearchForProduct() {
        new Main(driver).clickLoginlink();
        new P02_LoginPage(driver).addUserEmail(EMAIL).addUserPassword(PASSWORD).clickLoginButton();
        new P04_SearchForProductPage(driver).AddTextInTheSearchField(product).ClickOnSearchButton().SearchResultDisplay();
    }
}