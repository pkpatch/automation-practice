package components;

import interfaces.AddressPage;
import interfaces.ShippingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddressPageImpl implements AddressPage {

    private final WebDriver driver;
    private final By processAddress = new By.ByName("processAddress");

    public AddressPageImpl(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public ShippingPage proceedToCheckout() {
        driver.findElement(processAddress).click();
        return new ShippingPageImpl(driver);
    }
}
