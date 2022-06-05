package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage extends BasePage {

    public static final By USER_EMAIL_INPUT = By.id("email_create");
    public static final By SUBMIT_BUTTON = By.id("SubmitCreate");
    public static final By REG_ERROR1 = By.xpath("//li[text()='Invalid email address.']");
    //public static final By REG_POSITIVE1 = By.xpath("//*[@class='page-subheading']");


    public RegistrationPage(WebDriver driver) {
        super(driver);
    }
    public void open() {
        driver.get(baseUrl);
    }

    public void regCleanField (String email) {
        driver.findElement(SUBMIT_BUTTON).click();
    }
    public void correctEmail (String email) {
        driver.findElement(USER_EMAIL_INPUT).sendKeys("seew@gmail.com");
        driver.findElement(SUBMIT_BUTTON).click();
    }

    public String getError1() { return driver.findElement(REG_ERROR1).getText(); }
    //public String getPositive() { return driver.findElement(REG_POSITIVE1).getText(); }


}
