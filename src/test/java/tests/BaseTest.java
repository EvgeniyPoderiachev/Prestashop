package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.AccountPage;
import pages.AddressFieldPage;
import pages.LoginPage;
import pages.RegistrationPage;

import java.time.Duration;
@Log4j2
public class BaseTest {


    WebDriver driver;
    LoginPage loginPage;
    AccountPage accountPage;
    AddressFieldPage addressFieldPage;
    RegistrationPage registrationPage;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(false);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        loginPage = new LoginPage(driver);
        accountPage = new AccountPage(driver);
        addressFieldPage = new AddressFieldPage(driver);
        registrationPage = new RegistrationPage(driver);

        log.error("error");
        log.info("info");
        log.debug("debug");

    }

    @AfterMethod(alwaysRun = true)
    public void close() {
        if (driver != null) {
            driver.quit();
        }
    }
}
