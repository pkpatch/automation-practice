package components;

import interfaces.PaymentPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPageImpl implements PaymentPage {

    WebDriver driver;
    private By bankWireBox = new By.ByName("bankwire");


    public PaymentPageImpl(WebDriver driver) {
        this.driver = driver;
    }


    @Override
    public FinalPaymentPage payByBankWire() {
        driver.findElement(bankWireBox).click();
        return new FinalPaymentPageImpl(driver);
    }
}
