package com.sparta.eng82.components.pages;

import com.sparta.eng82.interfaces.pages.FinalPaymentPage;
import com.sparta.eng82.interfaces.pages.PaymentPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPageImpl implements PaymentPage {

    private final By bankWireBox = new By.ByClassName("bankwire");
    WebDriver driver;


    public PaymentPageImpl(WebDriver driver) {
        this.driver = driver;
    }


    @Override
    public FinalPaymentPage payByBankWire() {
        driver.findElement(bankWireBox).click();
        return new FinalPaymentPageImpl(driver);
    }
}
