package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {


    public static final By USER_EMAIL_INPUT = By.id("email");
    public static final By USER_PASSWORD_INPUT = By.id("passwd");
    public static final By SIGN_IN_BUTTON = By.id("SubmitLogin");
    public static final By REG_ERROR1 = By.xpath("//li[text()='An email address required.']");
    public static final By REG_ERROR2 = By.xpath("//li[text()='Password is required.']");
    public static final By REG_ERROR3 = By.xpath("//li[text()='Authentication failed.']");



    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(baseUrl);
    }

    public void login(String email, String password) {
        driver.findElement(USER_EMAIL_INPUT).sendKeys(email);
        driver.findElement(USER_PASSWORD_INPUT).sendKeys(password);
        driver.findElement(SIGN_IN_BUTTON).click();
    }

    public String title() {return driver.getTitle();}
    public String getError1() { return driver.findElement(REG_ERROR1).getText(); }
    public String getError2() { return driver.findElement(REG_ERROR2).getText(); }
    public String getError3() { return driver.findElement(REG_ERROR3).getText(); }



}