package testcases;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Main;
import pages.P01_RegisterPage;
import utility.Utilities;

public class TC01_Registration extends TestBase {
    public static Faker faker = new Faker();

    public static String EMAIL = faker.internet().emailAddress();
    public static String FName = faker.name().firstName();
    public static String LastName = faker.name().lastName();
    public static String companyName = faker.company().name();

    public static String PASSWORD = "ahmed123";

    @Test(enabled = true)
    public void RegisterNewUserWithValidData_P() {

        new Main(driver).clickRegisterlink();

        new P01_RegisterPage(driver).selectGender().addFirst_name(FName).addLast_name(LastName).selectDay()
                .selectMonth().selectYear().addEmail(EMAIL).addCompany_name(companyName).addPassword(PASSWORD)
                .addConfirm_password(PASSWORD).clickRegister_button();

        //ToDo: Take a screenshot
        Utilities.Capturescreenshots(driver, "RegisterWithNewUser");

        //ToDo: Assert the user register successfully
        Assert.assertTrue(new P01_RegisterPage(driver).confirmationMessage());
    }

    @Test(enabled = true)
    public void RegisterNewUserWithInvalidData_N() {
        //ToDo: Register with new user
        new Main(driver).clickRegisterlink();
        EMAIL = "admin1@admin.com";
        new P01_RegisterPage(driver).selectGender().addFirst_name(FName).addLast_name(LastName).selectDay()
                .selectMonth().selectYear().addEmail(EMAIL).addCompany_name(companyName).addPassword(PASSWORD)
                .addConfirm_password(PASSWORD).clickRegister_button();

        //ToDo: Register again with the same email
        new Main(driver).clickRegisterlink();
        new P01_RegisterPage(driver).selectGender().addFirst_name(FName).addLast_name(LastName).selectDay()
                .selectMonth().selectYear().addEmail(EMAIL).addCompany_name(companyName).addPassword(PASSWORD)
                .addConfirm_password(PASSWORD).clickRegister_button();

        //ToDo: Take a screenshot
        Utilities.Capturescreenshots(driver, "RegisterWithInvalidData");

        //ToDo: Assert the validation message appears
        Assert.assertTrue(new P01_RegisterPage(driver).ValidationMessage());
    }
}