package steps.flightstatus.actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.flightstatus.FlightStatusPage;

public class FlightStatusActions {

    FlightStatusPage flightStatusPage;

    @Given("user enters a valid flight route from {string} to {string} for date {string}")
    public void userEntersFlightRouteAndDate(String departureAirport, String destinationAirport, String date) {
        flightStatusPage.clickOnDestinationAirport();
        flightStatusPage.enterDepartureAirport(departureAirport);
        flightStatusPage.clickOnDepartureAirport();
        flightStatusPage.enterDestinationAirport(destinationAirport);
    }

    @When("the user clicks on ‘Show flight status’ button")
    public void theUserClicksOnShowFlightStatusButton() {
        flightStatusPage.clickOnShowFlightStatusButton();
    }
}
