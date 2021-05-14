package com.sparta.eng82.stepdefs;

import com.sparta.eng82.interfaces.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class HappyPathStepDefs {
    private WebDriver driver;
    private HomePage homePage;
    private AddressPage addressPage;
    private ConfirmationPage confirmationPage;
    private FinalPaymentPage finalPaymentPage;
    private PaymentPage paymentPage;
    private ShippingPage shippingPage;
    private SignInPage signInPage;
    private SummaryPage summaryPage;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
    }


    @Given("I am on the home page")
    public void iAmOnTheHomePage() {
    }

    @When("I click on the add to cart button")
    public void iClickOnTheAddToCartButton() {
    }

    @And("I click on the view cart")
    public void iClickOnTheViewCart() {
    }

    @Then("The cart page opens and I see the product")
    public void theCartPageOpensAndISeeTheProduct() {
    }

    @Given("I am on the cart page")
    public void iAmOnTheCartPage() {
    }

    @When("I click the Proceed to checkout button")
    public void iClickTheProceedToCheckoutButton() {
    }

    @Then("I go to the authentication page")
    public void iGoToTheAuthenticationPage() {
    }

    @Given("I am on the authentication page")
    public void iAmOnTheAuthenticationPage() {
    }

    @When("I enter my username")
    public void iEnterMyUsername() {
    }

    @And("I enter my password")
    public void iEnterMyPassword() {
    }

    @And("I click the sign in button")
    public void iClickTheSignInButton() {
    }

    @Then("I continue to the addresses page")
    public void iContinueToTheAddressesPage() {
    }

    @Given("I am on the address page")
    public void iAmOnTheAddressPage() {
    }

    @And("I have an address saved")
    public void iHaveAnAddressSaved() {
    }

    @When("I click proceed to checkout button")
    public void iClickProceedToCheckoutButton() {
    }

    @Then("I continue to the shipping page")
    public void iContinueToTheShippingPage() {
    }

    @Given("I am on the shipping page")
    public void iAmOnTheShippingPage() {
    }

    @When("I tick the terms of service box")
    public void iTickTheTermsOfServiceBox() {
    }

    @And("I click on the proceed to checkout button")
    public void iClickOnTheProceedToCheckoutButton() {
    }

    @Then("I proceed to the payment page")
    public void iProceedToThePaymentPage() {
    }

    @Given("I am on the payment page")
    public void iAmOnThePaymentPage() {
    }

    @When("I click pay by bank wire")
    public void iClickPayByBankWire() {
    }

    @Then("I go to the final payment page")
    public void iGoToTheFinalPaymentPage() {
    }

    @Given("I am on the final payment page")
    public void iAmOnTheFinalPaymentPage() {
    }

    @When("I click I confirm my order")
    public void iClickIConfirmMyOrder() {
    }

    @Then("I am taken to the confirmation page")
    public void iAmTakenToTheConfirmationPage() {
    }

    @Given("I am on the order confirmation page")
    public void iAmOnTheOrderConfirmationPage() {
    }

    @When("My order was successful")
    public void myOrderWasSuccessful() {
    }

    @Then("I should see written confirmation")
    public void iShouldSeeWrittenConfirmation() {
    }

    @After
    public void teardown(){
        driver.quit();
    }
}
