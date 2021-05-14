package com.sparta.eng82.components.pages;

import com.sparta.eng82.interfaces.pages.SitemapPage;
import org.openqa.selenium.WebDriver;

public class SitemapPageImpl implements SitemapPage {
    private final WebDriver driver;

    public SitemapPageImpl(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public String getUrl() {
        return driver.getCurrentUrl();
    }
}
