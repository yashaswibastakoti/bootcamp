Feature: Sending message in Slack

  Scenario: Search for Slack and send a message
    Given I am logged in to Slack
    When I send a message "Hello" to "Harsh Trivedi"
    Then The message should be sent successfully
