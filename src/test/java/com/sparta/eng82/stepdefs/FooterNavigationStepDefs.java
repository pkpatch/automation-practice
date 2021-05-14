package com.sparta.eng82.stepdefs;

import com.sparta.eng82.stepdefs.utility.WebDriverManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class FooterNavigationStepDefs {

    @When("I click on {string} in the footer")
    public void iClickOnInTheFooter(String arg0) {
        String test = WebDriverManager.driver.findElement(By.id("footer")).findElement(By.className("category_footer toggle-footer")).getText();
        System.out.println(test);
    }

    @Then("I will go to the {string} page")
    public void iWillGoToThePage(String arg0) {
        System.out.println(arg0);
    }

}
