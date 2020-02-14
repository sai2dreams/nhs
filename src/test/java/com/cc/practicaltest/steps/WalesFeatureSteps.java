package com.cc.practicaltest.steps;



import com.cc.practicaltest.Pages.DateOfBirthPage;
import com.cc.practicaltest.Pages.LandingPage;
import com.cc.practicaltest.Pages.ResultUnderSixteen;
import com.cc.practicaltest.Pages.WhereYouLivePage;
import com.cc.practicaltest.base.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.BeforeClass;

public class WalesFeatureSteps extends TestBase {
  LandingPage landingPage = new LandingPage();
  WhereYouLivePage whereYouLivePage = new WhereYouLivePage();
  DateOfBirthPage dateOfBirthPage = new DateOfBirthPage();
  ResultUnderSixteen resultUnderSixteen = new ResultUnderSixteen();

    @BeforeClass
    public void setUp() throws InterruptedException {
      initialization();

    }

    @Given("the user is on landing page")
    public void the_user_is_on_landing_page() {
      landingPage.getLandingPage();
      landingPage.Start();

    }

    @When("the user is from Wales")
    public void the_user_is_from_Wales() {
      whereYouLivePage.SelectWales();
      whereYouLivePage.Submit();


    }

    @Given("the user is less than {int} years of age {string} {string} {string}")
    public void the_user_is_less_than_years_of_age(Integer int1, String day, String month, String year) {
      dateOfBirthPage.EnterDatOfBirth(day,month,year);
      dateOfBirthPage.Submit();
    }

    @Then("the user should get free NHS help")
    public void the_user_should_get_free_NHS_help() {
     resultUnderSixteen.ValidateResult();


    }

}
