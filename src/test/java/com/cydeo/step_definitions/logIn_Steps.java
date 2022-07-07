package com.cydeo.step_definitions;

import com.cydeo.pages.forgetPass_Page;
import com.cydeo.pages.logInPage;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.propertiesReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class logIn_Steps {
    @Given("Navigate to login page")
    public void navigate_to_login_page() {
        Driver.getDrv().get(propertiesReader.getProperty("url"));
    }

    logInPage logInPage = new logInPage();
    @When("Enter {string} into username input")
    public void enter_into_username_input(String string) {
        logInPage.userNameInput.sendKeys(string);
    }
    @When("Enter {string} into password input")
    public void enter_into_password_input(String string) {
        logInPage.passWordInput.sendKeys(string);

    }
    @When("Click on the login button on the login page")
    public void click_on_the_login_button_on_the_login_page() {
        logInPage.LoginBtn.click();

    }
    @Then("Can navigate to homepage")
    public void can_navigate_to_homepage() {
        Assert.assertEquals("Dashboard - Symund - QA", propertiesReader.getProperty("dashboardPageTitle"));
    }

    @When("Enter {string} as a invalid username data")
    public void enter_as_a_invalid_username_data(String string) {
        logInPage.userNameInput.sendKeys(string);

    }
    @When("Enter {string} as a invalid password data")
    public void enter_as_a_invalid_password_data(String string) {
        logInPage.passWordInput.sendKeys(string);

    }

    @Then("Verify to see this message {string}")
    public void verifyToSeeThisMessage(String string) {
        boolean r = logInPage.AlertForInvalidData.isDisplayed();
        Assert.assertTrue(r);
    }


    @When("Enter valid password  data and left blank username input")
    public void enter_valid_password_data_and_left_blank_username_input() {
        logInPage.passWordInput.sendKeys(propertiesReader.getProperty("defaultPassWord"));


    }


    @Then("verify to password input has required attribute")
    public void verify_to_password_input_has_required_attribute() {
        boolean r = logInPage.passWordInput.getAttribute("required").equals("true");
        Assert.assertTrue(r);
    }

    @Given("Click {string} icon in the password input")
    public void clickIconInThePasswordInput(String arg0) {
        logInPage.EyeIcon.click();
    }



    @Then("Verify to can see password")
    public void verify_to_can_see_password() {
        boolean r =logInPage.passWordInput.getAttribute("type").equals("text");
        Assert.assertTrue(r);
    }

    @Given("Click on the Forget password button")
    public void click_on_the_forget_password_button() {
        logInPage.ForgetPassBtn.click();
    }
    forgetPass_Page forgetPass_page = new forgetPass_Page();
    @Then("verify to see reset password button")
    public void verify_to_see_reset_password_button() {
        boolean r =forgetPass_page.resetPassBtn.isDisplayed();
        Assert.assertTrue(r);

    }

        boolean r1 = false;

    @When("Verify to see {string} in the username input")
    public void verify_to_see_in_the_username_input(String string) {
        r1 = logInPage.userNameInput.getAttribute("placeholder").equals(string);

    }
    @Then("Verify to see {string} in the password input")
    public void verify_to_see_in_the_password_input(String string) {
        boolean r2 = logInPage.passWordInput.getAttribute("placeholder").equals(string);
        boolean r3 = r1 && r2;
        Assert.assertTrue(r3);
    }



}
