package components;

import interfaces.HomePage;
import interfaces.SummaryPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class HomePageImpl implements HomePage {

    private WebDriver driver;

    private By addToCart = new By.ByCssSelector("a[data-id-product=\"1\"]");
    private By checkout = new By.ByCssSelector("a[title=\"Proceed to checkout\"");

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
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(checkout).click();
        return new SummaryPageImpl(driver);

    }
}
