package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class WhereYouLivePage extends TestBase {
    @FindBy(how= How.ID,using="label-wales")
    public WebElement Wales;

    @FindBy(how= How.ID,using="next-button")
    public WebElement Next;

    public WhereYouLivePage(){
        PageFactory.initElements(driver, this);
    }

    public void SelectWales() {
        Wales.click();
    }

    public void Submit(){
        Next.submit();
    }
}
