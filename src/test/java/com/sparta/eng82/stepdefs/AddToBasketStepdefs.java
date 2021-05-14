package com.sparta.eng82.stepdefs;

import com.sparta.eng82.components.HomePageImpl;
import com.sparta.eng82.interfaces.HomePage;
import com.sparta.eng82.interfaces.SignInPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToBasketStepdefs {

    private WebDriver driver;
    private HomePage homePage;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
    }

    @Given("I am on the home page")
    public void iAmOnTheHomePage() {
        driver = new ChromeDriver();
        homePage = new HomePageImpl(driver);
    }

    @When("I add an item to the basket")
    public void iAddAnItemToTheBasket() {
        homePage.addItemToCart();
    }

    @Then("I see an item in my basket")
    public void iSeeAnItemInMyBasket() {
        Assertions.assertTrue(((HomePageImpl) homePage).addToBasketStatus());
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
