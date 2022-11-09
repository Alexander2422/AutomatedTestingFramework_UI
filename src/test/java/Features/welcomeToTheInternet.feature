Feature: Feature to learn all of Selenium's functionalities


  Scenario: Testing drop-down box
    Given I set homepage link for welcomeToTheInternet
    When I click on Dropdown Button
    When I select DropDown option
    Then I check to see if option is selected

  Scenario: Testing drag and drop functionality
    Given I set homepage link for welcomeToTheInternet
    When I click on Drag and Drop Button
    When I move Box B over box A
    Then I check to see if box B is in place of box A


