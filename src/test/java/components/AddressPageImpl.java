package components;

import interfaces.AddressPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddressPageImpl implements AddressPage {

    private WebDriver driver;
    private By processAddress = new By.ByLinkText("processAddress");

    public AddressPageImpl(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void proceedToCheckout() {
        driver.findElement(processAddress).click();
        return new ShippingPageImpl(driver);
    }
}
