package com.sparta.eng82.components;

import com.sparta.eng82.interfaces.FinalPaymentPage;
import com.sparta.eng82.interfaces.PaymentPage;
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
