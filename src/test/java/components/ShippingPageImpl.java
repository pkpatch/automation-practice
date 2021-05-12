package components;

import interfaces.FinalPaymentPage;
import interfaces.ShippingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShippingPageImpl implements ShippingPage {
   private WebDriver driver;
    private By checkbox = new By.ByName("cgv");
    private By proceed = new By.ByName("processCarrier");

    public ShippingPageImpl(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void agreeToTermsOfService() {
        driver.findElement(checkbox).click();
    }

    @Override
    public FinalPaymentPage proceedToCheckout(WebDriver driver) {
        driver.findElement(proceed).click();
        return new FinalPaymentPageImpl(driver);
    }
}
