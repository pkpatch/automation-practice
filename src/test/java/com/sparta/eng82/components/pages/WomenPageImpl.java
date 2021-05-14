package com.sparta.eng82.components.pages;

import com.sparta.eng82.interfaces.pages.WomenPage;
import org.openqa.selenium.WebDriver;

public class WomenPageImpl implements WomenPage {

    private final WebDriver driver;

    public WomenPageImpl(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public String getUrl() {
        return driver.getCurrentUrl();
    }
}
