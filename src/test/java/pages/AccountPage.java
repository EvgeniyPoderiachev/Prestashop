package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage extends BasePage {

    public static final By ADD_ADDRESS = By.xpath("//span[text()='Add my first address']");

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public void slideToAddressPage() {
        driver.findElement(ADD_ADDRESS).click();
    }

}
