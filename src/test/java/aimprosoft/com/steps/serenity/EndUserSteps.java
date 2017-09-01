package aimprosoft.com.steps.serenity;

import aimprosoft.com.pages.HomePage;
import aimprosoft.com.pages.NavigationMenu;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.net.URISyntaxException;
import java.text.ParseException;

public class EndUserSteps extends ScenarioSteps {

    HomePage homePage;
    NavigationMenu navigationMenu;

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
        navigationMenu.clickOnTheTitle(arg0);
    }

    @Step
    public void subcategoryIsDisplayed(String arg0) {
        Assert.assertTrue("False", navigationMenu.subcategoryIsDisplayed(arg0));
    }

    @Step
    public void titleIsDisplayed(String arg0) {
        Assert.assertTrue("False", navigationMenu.titleIsDisplayed(arg0));
    }

    @Step
    public void breadcrumbIsDisplayed(String arg0) {
        Assert.assertTrue("False", navigationMenu.breadcrumbIsDisplayed(arg0));
    }

    @Step
    public void tabIsDisplayed(String arg0) {
        Assert.assertTrue("False", navigationMenu.tabIsDisplayed(arg0));
    }
}