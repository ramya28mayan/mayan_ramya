Feature: Executing democyclos site

  Scenario Outline: Navigating to the profile page
    Given Launch the land URL
    And Provided the correct "<username>" and "<password>"
    Then Validating the profile page
    And check more outcomes

    Examples: 
      | username       | password   |
      | ironmancaptain | Bright@123 |