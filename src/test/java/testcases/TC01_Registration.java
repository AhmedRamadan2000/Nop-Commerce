package testcases;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Main;
import pages.P01_RegisterPage;

public class TC01_Registration extends TestBase {
    public static Faker faker = new Faker();

    public static String EMAIL = faker.internet().emailAddress();
    public static String FName = faker.name().firstName();
    public static String LastName = faker.name().lastName();
    public static String companyName = faker.company().name();

    public static String PASSWORD = "ahmed123";

    @Test(enabled = true)
    public void RegisterNewUserWithValidData_P() {

        new  Main(driver).clickRegisterlink();

        new P01_RegisterPage(driver).selectGender().addFirst_name(FName).addLast_name(LastName).selectDay()
                .selectMonth().selectYear().addEmail(EMAIL).addCompany_name(companyName).addPassword(PASSWORD)
                .addConfirm_password(PASSWORD).clickRegister_button();
        //Assert result
        Assert.assertTrue( new P01_RegisterPage(driver).confirmationMessage());
        new Main(driver).clickLoginlink();
//        SoftAssert softAssert= new SoftAssert();
//        softAssert.assertTrue(new P01_RegisterPage(driver).confirmationMessage());

    }

//    @Test(enabled = true)
//    public void RegisterNewUserWithInvalidData_N() {
//
//        new  Main(driver).clickRegisterlink();
//FName= "dsvsdvsd";
//        new P01_RegisterPage(driver).selectGender().addFirst_name(FName).addLast_name(LastName).selectDay()
//                .selectMonth().selectYear().addEmail(EMAIL).addCompany_name(companyName).addPassword(PASSWORD)
//                .addConfirm_password(PASSWORD).clickRegister_button();
//        new Main(driver).clickLoginlink();
//        //Assert result
//        Assert.assertFalse( new P01_RegisterPage(driver).confirmationMessage());
//    }
}