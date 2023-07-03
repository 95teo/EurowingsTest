package pages.flightstatus;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DefaultUrl("https://www.eurowings.com/en/information/at-the-airport/flight-status.html")
public class FlightStatusPage extends PageObject {

    @FindBy(className = "o-compact-search__cta-button-floating-label")
    List<WebElementFacade> routeOptions;

    @FindBy(css = "form[class='o-search-flight-status__flight-search__form'] button[type=submit]")
    WebElementFacade showFlightStatus;

    @FindBy(css = "input[aria-label='Departure airport'][id*='gid']")
    WebElementFacade departureAirportInput;

    @FindBy(css = "input[aria-label='Destination airport'][id*='gid']")
    WebElementFacade destinationAirportInput;

    public void clickOnDepartureAirport() {
        routeOptions.get(0).click();
    }

    public void clickOnDestinationAirport() {
        routeOptions.get(1).click();
    }

    public void clickOnShowFlightStatusButton() {
        showFlightStatus.click();
    }

    public void enterDepartureAirport(String departureAirport) {
        departureAirportInput.sendKeys(departureAirport);
        departureAirportInput.sendKeys(Keys.ENTER);
    }

    public void enterDestinationAirport(String destinationAirport) {
        destinationAirportInput.sendKeys(destinationAirport);
        destinationAirportInput.sendKeys(Keys.ENTER);
    }
}
