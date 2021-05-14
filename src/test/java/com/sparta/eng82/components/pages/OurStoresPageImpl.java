package com.sparta.eng82.components.pages;

import com.sparta.eng82.interfaces.pages.OurStoresPage;
import org.openqa.selenium.WebDriver;

public class OurStoresPageImpl implements OurStoresPage {
    private final WebDriver driver;

    public OurStoresPageImpl(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public String getUrl() {
        return driver.getCurrentUrl();
    }
}
