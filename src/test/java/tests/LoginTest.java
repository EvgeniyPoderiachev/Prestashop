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
    public void invalidEmailPassword() {
        loginPage.open();
        loginPage.login("vfgdsfhgfd@gmail.com","hgghk");
        assertEquals(loginPage.title(),"Аутентификация - http://prestashop.qatestlab.com.ua/");
    }
    @Test
    public void cleanFields() {
        loginPage.open();
        loginPage.login("","");
        assertEquals(loginPage.getError1(),"An email address required.");

    }
    @Test
    public void cleanPassword() {
        loginPage.open();
        loginPage.login("setminsk@gmail.com","");
        assertEquals(loginPage.getError2(),"Password is required.");

    }

    @Test
    public void wrongPassword() {
        loginPage.open();
        loginPage.login("setminsk@gmail.com","55555");
        assertEquals(loginPage.getError3(), "Authentication failed.");
    }

    @Test
    public void wrongEmail() {
        loginPage.open();
        loginPage.login("setdssdf@gmail.com","55555");
        assertEquals(loginPage.getError3(), "Authentication failed.");
    }

}
