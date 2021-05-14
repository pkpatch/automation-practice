package com.sparta.eng82.components;

import com.sparta.eng82.interfaces.Page;
import org.openqa.selenium.WebDriver;

import java.lang.reflect.InvocationTargetException;

public class FooterPageFactory {

    private WebDriver driver;

    public FooterPageFactory(WebDriver driver) {
        this.driver = driver;
    }

    public <T extends Page> T getPage(String anchorContent) {
        FooterPage page = null;
        for (FooterPage footerPage : FooterPage.values()) {
            if (footerPage.getLinkText().equals(anchorContent)) {
                page = footerPage;
            }
        }

        T returnPage = null;
        try {
            returnPage = (T) page.getPageClass().getDeclaredConstructor(WebDriver.class).newInstance(driver);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return returnPage;
    }
}
