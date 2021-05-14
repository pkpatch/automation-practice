package com.sparta.eng82.components;

import com.sparta.eng82.interfaces.SignInPage;
import com.sparta.eng82.interfaces.SummaryPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SummaryPageImpl implements SummaryPage {
    private final WebDriver driver;
    private final By processSignin = new By.ByLinkText("Proceed to checkout");

    public SummaryPageImpl(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public SignInPage proceedToSignIn() {
        driver.findElement(processSignin).click();
        return new SignInPageImpl(driver);
    }

}
