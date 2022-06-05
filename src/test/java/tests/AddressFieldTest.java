package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddressFieldPage;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class AddressFieldTest extends BaseTest {

    @Test
    public void validFields() {
        loginPage.open();
        loginPage.login("setminsk@gmail.com","100200300");
        accountPage.slideToAddressPage();
        addressFieldPage.validfields();
        assertEquals(addressFieldPage.title(),"Адреса - http://prestashop.qatestlab.com.ua/");
    }

    @Test
    public void firstNameIsInvalid() {
        loginPage.open();
        loginPage.login("setminsk@gmail.com","100200300");
        accountPage.slideToAddressPage();
        addressFieldPage.inValidName();
        assertEquals(addressFieldPage.getErrorFirstName(),"firstname is invalid.");
    }
    @Test
    public void lastNameIsRequired() {
        loginPage.open();
        loginPage.login("setminsk@gmail.com","100200300");
        accountPage.slideToAddressPage();
        addressFieldPage.inValidLastName();
        assertEquals(addressFieldPage.getErrorLastName(),"lastname is required.");
    }
    @Test
    public void lastNameIsInvalid() {
        loginPage.open();
        loginPage.login("setminsk@gmail.com","100200300");
        accountPage.slideToAddressPage();
        addressFieldPage.LastNameIs1234();
        assertEquals(addressFieldPage.getError3(),"lastname is invalid.");

    }

}


