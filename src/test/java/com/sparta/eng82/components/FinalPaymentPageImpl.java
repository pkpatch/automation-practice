package com.sparta.eng82.components;

import com.sparta.eng82.interfaces.ConfirmationPage;
import com.sparta.eng82.interfaces.FinalPaymentPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FinalPaymentPageImpl implements FinalPaymentPage {
    private final WebDriver driver;

    private final By cartNavigation = new By.ById("cart_navigation");
    private final By confirmButton = new By.ByTagName("button");

    public FinalPaymentPageImpl(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public ConfirmationPage confirmOrder() {
        driver.findElement(cartNavigation).findElement(confirmButton).click();
        return new ConfirmationPageImpl(driver);
    }
}
