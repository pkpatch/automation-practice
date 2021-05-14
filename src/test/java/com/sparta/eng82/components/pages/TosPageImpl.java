package com.sparta.eng82.components.pages;

import com.sparta.eng82.interfaces.pages.TosPage;
import org.openqa.selenium.WebDriver;

public class TosPageImpl implements TosPage {
    private final WebDriver driver;

    public TosPageImpl(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public String getUrl() {
        return driver.getCurrentUrl();
    }
}
