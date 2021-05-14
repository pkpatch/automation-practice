package com.sparta.eng82.components.pages;

import com.sparta.eng82.interfaces.pages.BestSellersPage;
import org.openqa.selenium.WebDriver;

public class BestSellersPageImpl implements BestSellersPage {
    private final WebDriver driver;

    public BestSellersPageImpl(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public String getUrl() {
        return driver.getCurrentUrl();
    }
}
