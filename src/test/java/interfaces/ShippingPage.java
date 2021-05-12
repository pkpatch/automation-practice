package interfaces;

import org.openqa.selenium.WebDriver;

public interface ShippingPage {

    void agreeToTermsOfService();
    void proceedToCheckout(WebDriver driver);
}
