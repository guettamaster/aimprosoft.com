package aimprosoft.com.steps.serenity;

import aimprosoft.com.pages.HomePage;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

import java.net.URISyntaxException;
import java.text.ParseException;

public class EndUserSteps extends ScenarioSteps {

    HomePage homePage;

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
}