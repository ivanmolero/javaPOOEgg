Feature: search star wars characters on wikipedia
  Scenario Outline: review star wars characters on swapi.dev
    Given retrive data from swapi <idCharacter>
    When get the name of the character
    And search for him on wikipedia web page
    Then the character name is equals to name from swapi
    Examples:
      | idCharacter |
      | "1"         |
      | "2"         |
      | "3"         |
      | "4"         |
      | "5"         |
