package com.sparta.eng82.components.pages;

import com.sparta.eng82.interfaces.pages.SpecialsPage;
import org.openqa.selenium.WebDriver;

public class SpecialsPageImpl implements SpecialsPage {
    private final WebDriver driver;

    public SpecialsPageImpl(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public String getUrl() {
        return driver.getCurrentUrl();
    }
}
