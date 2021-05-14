package com.sparta.eng82.components.pages;

import com.sparta.eng82.components.pages.ShippingPageImpl;
import com.sparta.eng82.interfaces.pages.AddressPage;
import com.sparta.eng82.interfaces.pages.ShippingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddressPageImpl implements AddressPage {

    private final WebDriver driver;
    private final By processAddress = new By.ByName("processAddress");

    public AddressPageImpl(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public ShippingPage proceedToShippingPage() {
        driver.findElement(processAddress).click();
        return new ShippingPageImpl(driver);
    }
}
