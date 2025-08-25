Feature: Search for a train using RedBus

  @Smoke
  Scenario Outline: Enter the Source and destination ,date to find train
    Given launch the browser with redbus
    Then enter the "<source>" and "<destination>" and "<date>"
    Then click on search

    Examples:
      | source    | destination | date         |
      | Bangalore | Mumbai      | 25 July,2025 |
