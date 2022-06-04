package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class LoginTest extends BaseTest {

    @Test
    public void validEmailPassword() {
        loginPage.open();
        loginPage.login("setminsk@gmail.com","100200300");
        assertEquals(loginPage.title(),"Мой аккаунт - http://prestashop.qatestlab.com.ua/");

    }

    @Test
    public void unvalidEmailPassword() {
        loginPage.open();
        loginPage.login("vfgdsfhgfd@gmail.com","hgghk");
        assertEquals(loginPage.title(),"Аутентификация - http://prestashop.qatestlab.com.ua/");
    }

}
