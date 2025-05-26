#language: en

Feature: Cumulative record covid
  As a COVID Tracking Project button user,
  I want COVID-19 data from 56 U.S. states and territories to be managed
  To ensure the figures provide the most complete possible picture of COVID-19 testing activities in the U.S.
  and the effects of the outbreak on affected individuals and communities.

  Scenario Outline: Cumulative record daily totals covid

    Given that the user needs to obtain the accumulated daily results on COVID
    When the user consumes the API that allows obtaining the accumulated daily results on COVID
    Then the service returns the required status code
      | statusCode   |
      | <statusCode> |
    And the user obtains the accumulated daily results on COVID returned by the consumed API

    Examples:

      | statusCode |
      | 200        |