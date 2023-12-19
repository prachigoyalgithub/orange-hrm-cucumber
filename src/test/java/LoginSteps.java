import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class LoginSteps {
    @Given("Enter username")
    public void enterUsername() {

    }

    @And("Enter password")
    public void enterPassword() {
    }

    @When("Click on Login Button")
    public void clickOnLoginButton() {
    }

    @Then("Verify {string} Message")
    public void verifyMessage(String Message) {
    }

    @Given("Login To The application")
    public void loginToTheApplication() {
    }

    @Then("Verify Logo is Displayed")
    public void verifyLogoIsDisplayed() {
    }

    @When("Click on User Profile logo")
    public void clickOnUserProfileLogo() {
    }

    @And("Mouse hover on {string} and click")
    public void mouseHoverOnAndClick(String click) {
    }

    @Then("Verify the text {string} is displayed")
    public void verifyTheTextIsDisplayed(String displayed) {
    }


    @Given("Enter username <username>")
    public void enterUsernameUsername() {
    }

    @And("Enter password <password>")
    public void enterPasswordPassword() {
    }

    @Then("Verify Error message <errorMessage>")
    public void verifyErrorMessageErrorMessage() {
    }


    @Given("Enter invalid username <username>")
    public void enterInvalidUsernameUsername() {
    }

    @And("Enter invalid password <password>")
    public void enterInvalidPasswordPassword() {
    }


    @Given("Enter  username{int} <username>")
    public void enterUsernameUsername(int username) {
    }

    @And("Enter  password{int} <password>")
    public void enterPasswordPassword(int password) {
    }

    @Then("Verify Error message{int} <errorMessage>")
    public void verifyErrorMessageErrorMessage(int message) {
    }
}
