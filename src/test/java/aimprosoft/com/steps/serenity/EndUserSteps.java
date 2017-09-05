package aimprosoft.com.steps.serenity;

import aimprosoft.com.pages.HomePage;
import aimprosoft.com.pages.NavigationMenuPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class EndUserSteps extends ScenarioSteps {

    HomePage homePage;
    NavigationMenuPage navigationMenuPage;

//======================================================HomePage================================================

    @Step
    public void openHomePage() {
        homePage.open();
    }

    @Step
    public void homePageIsOpened() {
        Assert.assertTrue("False", homePage.homePageIsOpened());
    }

    @Step
    public void clickOnLeftButton() {
        homePage.clickOnLeftButton();
    }

    @Step
    public void fullSizeSiteModeIsDisplayed() {
        Assert.assertTrue("False", homePage.fullSizeSiteModeIsDisplayed());
    }

    @Step
    public void clickOnTheTitle(String arg0) {
        navigationMenuPage.clickOnTheTitle(arg0);
    }

    @Step
    public void subcategoryIsDisplayed(String arg0) {
        Assert.assertTrue("False", navigationMenuPage.subcategoryIsDisplayed(arg0));
    }

    @Step
    public void titleIsDisplayed(String arg0) {
        Assert.assertTrue("False", navigationMenuPage.titleIsDisplayed(arg0));
    }

    @Step
    public void breadcrumbIsDisplayed(String arg0) {
        Assert.assertTrue("False", navigationMenuPage.breadcrumbIsDisplayed(arg0));
    }

    @Step
    public void tabIsDisplayed(String arg0) {
        Assert.assertTrue("False", navigationMenuPage.tabIsDisplayed(arg0));
    }

    @Step
    public void clickOnDownButton() {
        homePage.clickOnDownButton();
    }

    @Step
    public void weAreReallyGoodAtBlockIsDisplayed(int a) {
        Assert.assertEquals(a, homePage.titleCoordinates());
    }

    @Step
    public void clickOnRequestAFreeQuoteLink() {
        homePage.clickOnRequestAFreeQuoteLink();
    }

    @Step
    public void theUrlForContactsPageIsPresent() {
        Assert.assertTrue("False", homePage.currentURLEqualsToExpected());
    }
}