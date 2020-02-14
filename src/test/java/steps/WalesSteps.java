package steps;

import base.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.BeforeClass;
import pages.DateOfBirthPage;
import pages.LandingPage;
import pages.ResultUnderSixteen;
import pages.WhereYouLivePage;

public class WalesSteps extends TestBase {
    LandingPage landingPage = new LandingPage();
    WhereYouLivePage whereYouLivePage = new WhereYouLivePage();
    DateOfBirthPage dateOfBirthPage = new DateOfBirthPage();
    ResultUnderSixteen resultUnderSixteen = new ResultUnderSixteen();

    @Given("the user is on landing page")

    @BeforeClass
    public void setUp() throws InterruptedException {
        initialization();

    }
    public void the_user_is_on_landing_page() {
        whereYouLivePage.SelectWales();
        whereYouLivePage.Submit();

    }

    @When("the user is from Wales")
    public void the_user_is_from_Wales() {
        landingPage.getLandingPage();
        landingPage.Start();
    }

    @When("the user is less than {int} years of age {string} {string} {string}")
    public void the_user_is_less_than_years_of_age(Integer int1, String day, String month, String year) {
        dateOfBirthPage.EnterDatOfBirth(day,month,year);
        dateOfBirthPage.Submit();
    }

    @Then("the user should get free NHS help")
    public void the_user_should_get_free_NHS_help() {
        resultUnderSixteen.ValidateResult();

    }
}
