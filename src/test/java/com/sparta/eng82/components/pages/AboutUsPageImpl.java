package com.sparta.eng82.components.pages;

import com.sparta.eng82.interfaces.pages.AboutUsPage;
import org.openqa.selenium.WebDriver;

public class AboutUsPageImpl implements AboutUsPage {
    private final WebDriver driver;

    public AboutUsPageImpl(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public String getUrl() {
        return driver.getCurrentUrl();
    }
}
