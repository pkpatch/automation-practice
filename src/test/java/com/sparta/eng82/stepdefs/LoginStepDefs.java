package com.sparta.eng82.stepdefs;

import com.sparta.eng82.components.pages.HomePageImpl;
import com.sparta.eng82.stepdefs.utility.Pages;
import com.sparta.eng82.stepdefs.utility.WebDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefs {

    @Before
    public void setup() {
        WebDriverManager.setUp();
    }

    @Given("I am on the checkout sign in page")
    public void iAmOnTheCheckoutSignInPage() {
        WebDriverManager.driver = new ChromeDriver();
        Pages.signInPage = new HomePageImpl(WebDriverManager.driver).addItemToCart().goToCheckout().proceedToSignIn();
    }

    @When("I enter my credentials")
    public void iEnterMyCredentials() {
        Pages.signInPage.enterEmail();
        Pages.signInPage.enterPassword();
    }

    @Then("I proceed with the checkout")
    public void iProceedWithTheCheckout() {
        Pages.signInPage.clickSignIn();
    }

    @After
    public void tearDown() {

        WebDriverManager.tearDown();

    }


}
