package components;

import interfaces.SummaryPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SummaryImpl implements SummaryPage {
    private WebDriver driver;
    private By processSignin = new By.ByLinkText("Proceed to checkout");

    public SummaryImpl(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public SignInPage proceedToCheckout(){
        driver.findElement(processSignin).click();
        return new SignInPageImpl(driver);
    }

}
