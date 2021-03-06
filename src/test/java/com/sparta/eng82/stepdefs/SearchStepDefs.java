package com.sparta.eng82.stepdefs;

import com.sparta.eng82.components.pages.HomePageImpl;
import com.sparta.eng82.interfaces.pages.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchStepDefs {

    private WebDriver driver;

    private HomePage homePage;

    @Given("I am on any page on the website")
    public void iAmOnAnyPageOnTheWebsite() {
        driver = new ChromeDriver();
        homePage = new HomePageImpl(driver);
    }

    @When("I enter {string} into the search")
    public void iEnterIntoTheSearch(String arg0) {
        homePage.typeInSearchBar(arg0);
    }


    @Then("I see the relevant search results for {string}")
    public void iSeeTheRelevantSearchResultsFor(String arg0) {
        Assertions.assertEquals("http://automationpractice.com/index.php?controller=search&orderby=position&orderway=desc&search_query="+ arg0 +"&submit_search=", driver.getCurrentUrl());
    }
}
