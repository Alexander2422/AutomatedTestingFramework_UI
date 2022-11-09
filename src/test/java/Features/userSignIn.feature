Feature: Feature to test register functionality


  Scenario: Register a new user with valid information
    Given I set homepage link
    When I click on Register
    When I set "valid" FirstName,"valid" LastName, "valid" Address, "valid" City, "valid" State, "valid" ZipCode, "valid" Phone, "valid" Ssn , "valid" Username, "valid" Password, "valid" ConfirmationPassword
    When I click on Register user
    Then I see Welcome FirstName,LastName















