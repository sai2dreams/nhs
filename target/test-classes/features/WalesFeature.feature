Feature: As a person from Wales
  I need to know what help I can get with my NHS costs
  So that I can get the treatment I need

  Background:
    Given the user is on landing page

  @wip
  Scenario Outline: Age under 16 Wales test
    When the user is from Wales
    And the user is less than 17 years of age "<day>" "<month>" "<year>"
    Then the user should get free NHS help

    Examples:
      | day |month|year|
      |01  | 01  | 2019|
      #|01  | 01  | 2004|
