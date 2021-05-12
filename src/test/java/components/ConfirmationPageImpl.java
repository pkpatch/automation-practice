package components;

import interfaces.ConfirmationPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmationPageImpl implements ConfirmationPage {
    WebDriver driver;
    private final By confirmationStatus = new By.ByLinkText("dark");


    public ConfirmationPageImpl(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void checkOrderStatus() {
        driver.findElement(confirmationStatus).getText().equals("Your order on My Store is complete.");
    }
}
