package com.sparta.eng82.components.pages;

import com.sparta.eng82.interfaces.pages.ContactUsPage;
import org.openqa.selenium.WebDriver;

public class ContactUsPageImpl implements ContactUsPage {
    private final WebDriver driver;

    public ContactUsPageImpl(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public String getUrl() {
        return driver.getCurrentUrl();
    }
}
