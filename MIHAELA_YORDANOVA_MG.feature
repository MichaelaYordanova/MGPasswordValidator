Feature: MoneyGaming Registration

  As a new user,
  I want to register with a secure password,
  So that I can create an account successfully.

  Scenario: Successful registration with a valid password
    Given I am on the registration page
    When I enter a valid password "Testpass@123"
    And I submit the registration form
    Then I should see a confirmation message

  Scenario: Password too short
    Given I am on the registration page
    When I enter a password "A@1" that is less than 6 characters
    And I submit the registration form
    Then I should see an error message "Password must be at least 6 characters long"

  Scenario: Password missing a number
    Given I am on the registration page
    When I enter a password "Testpass@!" without a number
    And I submit the registration form
    Then I should see an error message "Password must contain at least one number"

  Scenario: Password missing a special character
    Given I am on the registration page
    When I enter a password "Testpass123" without a special character
    And I submit the registration form
    Then I should see an error message "Password must contain at least one special character"

  Scenario: Password missing both a number and a special character
    Given I am on the registration page
    When I enter a password "Testpass" without a number and special character
    And I submit the registration form
    Then I should see an error message "Password must contain at least one number and one special character"
