package com.cydeo.step_definitions;

import com.cydeo.pages.dashBoardPage;
import com.cydeo.pages.logInPage;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.propertiesReader;
import com.cydeo.utilities.verify;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class logout_steps {

    @Given("User should be on dashboard page as login")
    public void user_should_be_on_dashboard_page_as_login() {
        logInPage logInPage = new logInPage();
        logInPage.LogInByDefaultData();
    }

    dashBoardPage dashBoardPage = new dashBoardPage();
    @When("User click username button")
    public void user_click_username_button() {
        dashBoardPage.avatarDiv.click();
    }

    @When("User click logout button")
    public void user_click_logout_button() {
        dashBoardPage.logOutBtn.click();
    }

    @Then("user should be login page")
    public void user_should_be_login_page() {

        String actualResult = Driver.getDrv().getTitle();
        verify.VerifyTitleForLogINPage(Driver.getDrv(),actualResult);
    }

    @When("User click step back button")
    public void user_click_step_back_button() {
        Driver.getDrv().navigate().back();
    }

    @Then("User should not be able to return dashboard page")
    public void user_should_not_be_able_to_return_dashboard_page() {
        String actualResult = Driver.getDrv().getTitle();
        verify.VerifyTitleForLogINPage(Driver.getDrv(),actualResult);
    }

}