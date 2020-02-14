package pages;

import base.TestBase;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class ResultUnderSixteen extends TestBase {

    public ResultUnderSixteen(){
        PageFactory.initElements(driver, this);
    }
    public void ValidateResult()
    {
        Assert.assertEquals(driver.getTitle(),"Because you're under 16 you get help paying NHS costs");
    }
}
