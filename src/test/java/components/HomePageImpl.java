package components;

import interfaces.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HomePageImpl implements HomePage {

    private final WebDriver driver;

    private final By addToCart = new By.ByCssSelector("a[data-id-product=\"1\"]");
    private final By checkout = new By.ByCssSelector("a[title=\"Proceed to checkout\"");

    public HomePageImpl(WebDriver driver) {
        this.driver = driver;
        driver.get("http://automationpractice.com/index.php");
    }

    @Override
    public void addItemToCart() {
        driver.findElement(addToCart).click();
    }

    @Override
    public SummaryPageImpl goToCheckout() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(checkout));
        driver.findElement(checkout).click();
        return new SummaryPageImpl(driver);

    }
}
