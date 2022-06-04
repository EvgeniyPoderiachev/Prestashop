package tests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class AddressFieldTest extends BaseTest {

    @Test
    public void validEmailPassword() {
        loginPage.open();
        loginPage.login("setminsk@gmail.com","100200300");
        accountPage.slideToAddressPage();
        addressFieldPage.fields();

    }
}
