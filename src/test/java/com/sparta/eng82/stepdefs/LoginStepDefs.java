package com.sparta.eng82.stepdefs;

import com.sparta.eng82.components.HomePageImpl;
import com.sparta.eng82.interfaces.SignInPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefs {

    private WebDriver driver;

    private SignInPage signInPage;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
    }

    @Given("I am on the checkout sign in page")
    public void iAmOnTheCheckoutSignInPage() {
        driver = new ChromeDriver();
        signInPage = new HomePageImpl(driver).addItemToCart().goToCheckout().proceedToSignIn();
    }

    @When("I enter my credentials")
    public void iEnterMyCredentials() {
        signInPage.enterEmail();
        signInPage.enterPassword();
    }

    @Then("I proceed with the checkout")
    public void iProceedWithTheCheckout() {
        signInPage.clickSignIn();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
