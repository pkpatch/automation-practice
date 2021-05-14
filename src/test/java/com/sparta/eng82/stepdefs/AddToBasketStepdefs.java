package com.sparta.eng82.stepdefs;

import com.sparta.eng82.components.pages.HomePageImpl;
import com.sparta.eng82.stepdefs.utility.Pages;
import com.sparta.eng82.stepdefs.utility.WebDriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToBasketStepdefs {

    @Given("I am on the home page")
    public void iAmOnTheHomePage() {
        WebDriverManager.driver = new ChromeDriver();
        Pages.homePage = new HomePageImpl(WebDriverManager.driver);
    }

    @When("I add an item to the basket")
    public void iAddAnItemToTheBasket() {
        Pages.homePage.addItemToCart();
    }

    @Then("I see an item in my basket")
    public void iSeeAnItemInMyBasket() {
        Assertions.assertTrue(((HomePageImpl) Pages.homePage).addToBasketStatus());
    }
}
