package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationSteps {

    @Given("I am on the registration page")
    public void i_am_on_the_registration_page() {
        System.out.println("Navigating to the registration page...");
        // Code to navigate to the registration page in your web app
    }

    @When("I enter a valid password {string}")
    public void i_enter_a_valid_password(String password) {
        System.out.println("Entering password: " + password);
        // Code to input the password field in the UI
    }

    @When("I submit the registration form")
    public void i_submit_the_registration_form() {
        System.out.println("Submitting registration form...");
        // Code to click the submit button
    }

    @Then("I should see a confirmation message")
    public void i_should_see_a_confirmation_message() {
        System.out.println("Verifying confirmation message...");
        // Code to verify the confirmation message appears
    }

    @When("I enter a password {string} that is less than {int} characters")
    public void i_enter_a_password_that_is_less_than_characters(String password, Integer length) {
        System.out.println("Entering short password: " + password);
        // Code to input the invalid password
    }

    @When("I enter a password {string} without a number")
    public void i_enter_a_password_without_a_number(String password) {
        System.out.println("Entering password without a number: " + password);
        // Code to input the invalid password
    }

    @When("I enter a password {string} without a special character")
    public void i_enter_a_password_without_a_special_character(String password) {
        System.out.println("Entering password without a special character: " + password);
        // Code to input the invalid password
    }

    @When("I enter a password {string} without a number and special character")
    public void i_enter_a_password_without_a_number_and_special_character(String password) {
        System.out.println("Entering password without number and special character: " + password);
        // Code to input the invalid password
    }

    @Then("I should see an error message {string}")
    public void i_should_see_an_error_message(String errorMessage) {
        System.out.println("Checking for error message: " + errorMessage);
        // Code to verify the error message
    }
}
