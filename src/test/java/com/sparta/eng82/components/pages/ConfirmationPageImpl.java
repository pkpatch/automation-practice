package com.sparta.eng82.components.pages;

import com.sparta.eng82.interfaces.pages.ConfirmationPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmationPageImpl implements ConfirmationPage {
    private final By classChequeIndent = new By.ByClassName("cheque-indent");
    private final By strongTag = new By.ByTagName("strong");
    WebDriver driver;


    public ConfirmationPageImpl(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public boolean checkOrderStatus() {
        return driver.findElement(classChequeIndent).findElement(strongTag).getText().equals("Your order on My Store is complete.");
    }
}
