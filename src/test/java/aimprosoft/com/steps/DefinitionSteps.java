package aimprosoft.com.steps;

import aimprosoft.com.steps.serenity.EndUserSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUserSteps;

//======================================================HomePage========================================================

    @Given("^open home page$")
    public void openHomePage() throws Throwable {
        endUserSteps.openHomePage();
    }

    @Then("^home page is opened$")
    public void homePageIsOpened() throws Throwable {
        endUserSteps.homePageIsOpened();
    }

    @When("^click on left button$")
    public void clickOnLeftButton() throws Throwable {
        endUserSteps.clickOnLeftButton();
    }

    @Then("^full size site mode is displayed$")
    public void fullSizeSiteModeIsDisplayed() throws Throwable {
        endUserSteps.fullSizeSiteModeIsDisplayed();
    }

    @When("^click on the \"([^\"]*)\" title$")
    public void clickOnTheTitle(String arg0) throws Throwable {
        endUserSteps.clickOnTheTitle(arg0);
    }

    @Then("^\"([^\"]*)\" subcategory is displayed$")
    public void subcategoryIsDisplayed(String arg0) throws Throwable {
        endUserSteps.subcategoryIsDisplayed(arg0);
    }
}
