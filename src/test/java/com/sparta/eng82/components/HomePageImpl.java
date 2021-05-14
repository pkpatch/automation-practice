package com.sparta.eng82.components;

import com.sparta.eng82.interfaces.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageImpl implements HomePage {

    private final WebDriver driver;

    private final By addToCart = new By.ByCssSelector("a[data-id-product=\"1\"]");
    private final By checkout = new By.ByCssSelector("a[title=\"Proceed to checkout\"");

    public HomePageImpl(WebDriver driver) {
        this.driver = driver;
        driver.get("http://automationpractice.com/index.php");
    }

    @Override
    public HomePage addItemToCart() {
        driver.findElement(addToCart).click();
        return this;
    }

    @Override
    public SummaryPageImpl goToCheckout() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(checkout));
        driver.findElement(checkout).click();
        return new SummaryPageImpl(driver);

    }
}
