Feature: Feature to functionality of webApp


  Scenario: Testing click on button and alert appears in 5 seconds
    Given I set homepage link for demoQA
    When I click on Alerts, Frame & Windows to make alerts visible
    When I click on Alerts
    When I click on button that will give an alert in five seconds
    Then I check if alert appeared in 6 seconds
    Then I check if displayed text is "This alert appeared after 5 seconds" correct
    When I close the alert by clicking ok

  @Tests
  Scenario: Testing click on button and prompt box appears, write text in it
    Given I set homepage link for demoQA
    When I click on Alerts, Frame & Windows to make alerts visible
    When I click on Alerts
    When I click on prompt box button
    When I write the "Welcome" in the prompt and click "yes" in the box
    Then I check if the text was written

  Scenario: Testing opening a new window tab
    Given I set homepage link for demoQA
    When I click on Alerts, Frame & Windows to make alerts visible
    When I click on Browser Windows
    When I press on New Tab
    When I switch to the new window
    When I read the heading of the page
    Then I check the written text
