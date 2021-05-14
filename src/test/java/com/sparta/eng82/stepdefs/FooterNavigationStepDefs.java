package com.sparta.eng82.stepdefs;

import com.sparta.eng82.components.pages.HomePageImpl;
import com.sparta.eng82.stepdefs.utility.Pages;
import com.sparta.eng82.stepdefs.utility.WebDriverManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FooterNavigationStepDefs {

    @When("I click on {string} in the footer")
    public void iClickOnInTheFooter(String arg0) {
        Pages.tempPage = new HomePageImpl(WebDriverManager.driver).clickFooterElement(arg0);
    }

    @Then("I will go to the {string} page")
    public void iWillGoToThePage(String arg0) {
        System.out.println(arg0);
    }

}
