package tests;

import org.testng.annotations.Test;
import pages.RegistrationPage;

import static org.testng.AssertJUnit.assertEquals;

public class RegistrationTest extends BaseTest {

    @Test
    public void cleanField() {
        registrationPage.open();
        registrationPage.regCleanField("");
        assertEquals(registrationPage.getError1(),"Invalid email address.");
    }

}
