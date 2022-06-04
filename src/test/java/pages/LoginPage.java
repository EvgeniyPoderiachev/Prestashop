package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {


    public static final By USER_EMAIL_INPUT = By.id("email");
    public static final By USER_PASSWORD_INPUT = By.id("passwd");
    public static final By SIGN_IN_BUTTON = By.id("SubmitLogin");


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

}