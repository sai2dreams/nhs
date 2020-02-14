package pages;

import base.TestBase;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends TestBase {

    @FindBy(how= How.ID,using="next-button")
    public WebElement startButton;


    public LandingPage(){
        PageFactory.initElements(driver, this);
    }


    public void getLandingPage()
    {
        driver.get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
        Assert.assertEquals(driver.getTitle(),"Check what help you could get to pay for NHS costs");
    }

    public void Start()
    {
        startButton.submit();

    }
}
