package components;

import interfaces.FinalPaymentPage;
import interfaces.SummaryPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FinalPaymentPageImpl implements FinalPaymentPage {
   private WebDriver driver;
    private By confirmButton = new By.ByClassName("button btn btn-default button-medium");

    public FinalPaymentPageImpl(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public SummaryPage confirmOrder(WebDriver driver) {
        driver.findElement(confirmButton).click();
        return new SummaryPageImpl(driver);
    }
}
