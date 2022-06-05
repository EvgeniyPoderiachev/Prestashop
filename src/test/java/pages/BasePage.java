package pages;

import org.openqa.selenium.WebDriver;

public class BasePage {

    WebDriver driver;
    String baseUrl = "http://prestashop.qatestlab.com.ua/en/authentication?back=my-account";

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
}
