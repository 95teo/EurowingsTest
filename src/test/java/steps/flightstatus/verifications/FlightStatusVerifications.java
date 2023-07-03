package steps.flightstatus.verifications;

import io.cucumber.java.en.Then;
import pages.flightstatus.FlightStatusPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static utils.Constants.FLIGHT_STATUS_PAGE_TITLE;

public class FlightStatusVerifications {

    FlightStatusPage flightStatusPage;

    @Then("Flight status page is loaded")
    public void flightStatusPageIsLoaded() {
        assertThat(flightStatusPage.getTitle(), is(FLIGHT_STATUS_PAGE_TITLE));
    }
}
