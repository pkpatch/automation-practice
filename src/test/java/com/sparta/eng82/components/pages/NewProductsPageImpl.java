package com.sparta.eng82.components.pages;

import com.sparta.eng82.interfaces.pages.NewProductsPage;
import org.openqa.selenium.WebDriver;

public class NewProductsPageImpl implements NewProductsPage {
    private final WebDriver driver;

    public NewProductsPageImpl(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public String getUrl() {
        return driver.getCurrentUrl();
    }
}
