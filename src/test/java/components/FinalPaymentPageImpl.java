package components;

import interfaces.ConfirmationPage;
import interfaces.FinalPaymentPage;
import interfaces.SummaryPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FinalPaymentPageImpl implements FinalPaymentPage {
    private final WebDriver driver;
    private final By confirmButton = new By.ByClassName("button btn btn-default button-medium");

    public FinalPaymentPageImpl(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public ConfirmationPage confirmOrder() {
        driver.findElement(confirmButton).click();
        return new ConfirmationPageImpl(driver);
    }
}
