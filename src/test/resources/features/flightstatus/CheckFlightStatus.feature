Feature: Check flight status

  Background: User is on flight status page
    When User navigates to flight status page
    Then Flight status page is loaded

  Scenario Outline: Verify flight status for route <departureAirport> - <destinationAirport> for <date>
    Given user enters a valid flight route from <departureAirport> to <destinationAirport> for date <date>
    When the user clicks on ‘Show flight status’ button
    #Then a list with the flights status for the given flight route and date should be displayed

    Examples:
      | departureAirport | destinationAirport | date    |
      | "CGN"            | "BER"              | "today" |