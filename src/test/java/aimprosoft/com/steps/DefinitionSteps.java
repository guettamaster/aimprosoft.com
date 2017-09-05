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

    @Then("^\"([^\"]*)\" title is displayed$")
    public void titleIsDisplayed(String arg0) throws Throwable {
        endUserSteps.titleIsDisplayed(arg0);
    }

    @Then("^\"([^\"]*)\" breadcrumb is displayed$")
    public void breadcrumbIsDisplayed(String arg0) throws Throwable {
        endUserSteps.breadcrumbIsDisplayed(arg0);
    }

    @Then("^\"([^\"]*)\" tab is displayed$")
    public void tabIsDisplayed(String arg0) throws Throwable {
        endUserSteps.tabIsDisplayed(arg0);
    }

    @When("^click on down button$")
    public void clickOnDownButton() throws Throwable {
        endUserSteps.clickOnDownButton();
    }

    @Then("^We are really good at block is has coordinates \"([^\"]*)\"$")
    public void weAreReallyGoodAtBlockIsHasCoordinates(int a) throws Throwable {
        endUserSteps.weAreReallyGoodAtBlockIsDisplayed(a);
    }

    @When("^click on Request a free quote link$")
    public void clickOnRequestAFreeQuoteLink() throws Throwable {
        endUserSteps.clickOnRequestAFreeQuoteLink();
    }
}
