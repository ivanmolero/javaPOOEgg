Feature: search star wars characters on wikipedia
  Scenario Outline: review star wars characters on swapi.dev
    Given retrive data from swapi <idCharacter>
    When get the name of the character
    And search for the value on wikipedia web page
    Then the character name is equals to name from swapi
    Examples:
      | idCharacter |
      | "1"         |
      | "2"         |
      | "3"         |
      | "4"         |
      | "5"         |

  Scenario: review movie data and edit in wikipedia
    Given a request for random movie from swapi
    When get the name of the movie
    And search for the value on wikipedia web page in english
    And click on edit link
    Then the edit movie page is displayed correctly

  Scenario: review movie history in wikipedia
    Given a request for random movie from swapi
    When get the name of the movie
    And search for the value on wikipedia web page in english
    And click on history link
    Then the history movie page is displayed correctly

