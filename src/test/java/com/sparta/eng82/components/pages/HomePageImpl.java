package com.sparta.eng82.components.pages;

import com.sparta.eng82.components.FooterPageFactory;
import com.sparta.eng82.interfaces.Page;
import com.sparta.eng82.interfaces.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageImpl implements HomePage {

    private final WebDriver driver;

    private final By addToCart = new By.ByCssSelector("a[data-id-product=\"1\"]");
    private final By checkout = new By.ByCssSelector("a[title=\"Proceed to checkout\"");
    private final By searchBar = new By.ById("search_query_top");

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
        wait(10);
        driver.findElement(checkout).click();
        return new SummaryPageImpl(driver);
    }

    public boolean addToBasketStatus() {
        wait(10);
        String message = driver.findElement(By.tagName("h2")).getText();
        return message.equals("Product successfully added to your shopping cart");
    }

    private void wait(int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(checkout));
    }

    public void typeInSearchBar(String searchTerm) {
        driver.findElement(searchBar).sendKeys(searchTerm, Keys.ENTER);
    }

    public <T extends Page> T clickFooterElement(String anchorContent) {
        driver.findElement(By.id("footer")).findElement(By.linkText(anchorContent)).click();
        return new FooterPageFactory(driver).getPage(anchorContent);
    }
}
