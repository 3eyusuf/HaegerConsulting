Feature: Home Page Testing

  Background:
    Given The user is on Home Page
    Then  verify that the Haeger-Consulting Logo Displayed is


  @wip
  Scenario Outline:  All Navigation Elements Testing
    And   the user should be able to  click "<NavigationElement>"
    Then  verify that the "<Title>"

    Examples: NavigationElement and Tittle
      | NavigationElement | Title              |
      | Aktuell           | Aktuell            |
      | Services          | Services           |
      | Team              | Unser Team         |
      | Kultur            | Unternehmenskultur |
      | Projekte          | Projekte           |
      | Jobs              | Jobs               |
      | Kontakt           | Kontakt            |