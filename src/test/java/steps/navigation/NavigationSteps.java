package steps.navigation;

import io.cucumber.java.en.When;
import pages.flightstatus.AcceptCookiesPage;
import pages.flightstatus.FlightStatusPage;

public class NavigationSteps {

    FlightStatusPage flightStatusPage;
    AcceptCookiesPage acceptCookiesPage;

    @When("User navigates to flight status page")
    public void userNavigatesToFlightStatusPage() {
        flightStatusPage.open();
        //acceptCookiesPage.waitAcceptCookiesBtnToBeDisplayed();
        //acceptCookiesPage.clickOnAcceptCookiesBtn();
        //acceptCookiesPage.waitAcceptCookiesBtnToNotBeDisplayed();
    }
}
