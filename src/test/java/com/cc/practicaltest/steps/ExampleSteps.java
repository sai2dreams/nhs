package com.cc.practicaltest.steps;

import com.cc.practicaltest.Pages.LandingPage;
import com.cc.practicaltest.Pages.googlePage;
import com.cc.practicaltest.base.TestBase;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class ExampleSteps extends TestBase {
    LandingPage loginPage ;

    @Before
    public void setUp() throws InterruptedException {
        initialization();
        loginPage = new LandingPage();
    }

    @Given("^I am on the Google search page$")
    public void visitHomepage(){
        loginPage.getLandingPage();
    }

    @When("^I search for \"(.*)\"$")
    public void searchFor(String query) {


    }

    @Then("^the page title should start with \"(.*)\"$")
    public void checkTitle(String titleStartsWith) {

    }

    @After
    public void closeBrowser() {

    }
}
