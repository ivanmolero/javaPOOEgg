Feature: test api connection and wikipedia search
  Scenario: review edit random movie from swapi and wikipedia
    Given a random data movie from swapi
    When get the name of the movie
    And search for the movie in wikipedia page
    And click en edit link
    Then the edit movie page is displayed correctly

  Scenario: review history random movie from swapi and wikipedia
    Given a random data movie from swapi
    When get the name of the movie
    And search for the movie in wikipedia page
    And click en history link
    Then the history movie page is displayed correctly

  Scenario Outline:
    Given a data character from swapi with value <idCharacter>
    When get the name of the character
    And search for the character in wikipedia page
    Then the character page is displayed correctly
    Examples:
      | idCharacter |
      | 1 |
      | 2 |
      | 3 |
      | 4 |
      | 5 |

