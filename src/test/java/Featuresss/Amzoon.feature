Feature: Amazon search functionality with lg4j

  Scenario: To navigate to page and then get the title
    Given the user navigates to the amazon url
    Then types tv in the search bar
    Then selects the high to low sort
    And selects the four star review
    And prints the name
    Then exits the driver