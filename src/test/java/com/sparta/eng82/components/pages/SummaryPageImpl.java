package com.sparta.eng82.components.pages;

import com.sparta.eng82.interfaces.pages.SignInPage;
import com.sparta.eng82.interfaces.pages.SummaryPage;
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
