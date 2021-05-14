package com.sparta.eng82.components.pages;

import com.sparta.eng82.interfaces.pages.PaymentPage;
import com.sparta.eng82.interfaces.pages.ShippingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShippingPageImpl implements ShippingPage {
    private final WebDriver driver;
    private final By checkbox = new By.ByName("cgv");
    private final By proceed = new By.ByName("processCarrier");

    public ShippingPageImpl(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public ShippingPage agreeToTermsOfService() {
        driver.findElement(checkbox).click();
        return this;
    }

    @Override
    public PaymentPage proceedToPaymentPage() {
        driver.findElement(proceed).click();
        return new PaymentPageImpl(driver);
    }
}
