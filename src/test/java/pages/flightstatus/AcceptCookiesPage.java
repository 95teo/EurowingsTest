package pages.flightstatus;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class AcceptCookiesPage extends PageObject {

    @FindBy(className = "cookie-consent--cta-save")
    WebElementFacade acceptCookiesBtn;

    public void waitAcceptCookiesBtnToBeDisplayed() {
        acceptCookiesBtn.waitUntilVisible();
    }

    public void waitAcceptCookiesBtnToNotBeDisplayed() {
        acceptCookiesBtn.waitUntilNotVisible();
    }

    public void clickOnAcceptCookiesBtn() {
        acceptCookiesBtn.click();
    }
}
