
Feature: Home Page Testing

  Background:
    Given The user is on Home Page
    Then  verify that the Url "https://haeger-consulting.de/"



  @wip
  Scenario Outline:  All Menu Parts Test
    And   the user should be able to  click "<Parts>"
    Then  verify that the "<Title>"

    Examples:
      | Parts    | Title              |
      | Aktuell  | Aktuell            |
      | Services | Services           |
      | Team     | Unser Team         |
      | Kultur   | Unternehmenskultur |
      | Projekte | Projekte           |
      | Jobs     | Jobs               |
      | Kontakt  | Kontakt            |