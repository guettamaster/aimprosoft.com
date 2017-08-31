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

    public void openHomePage() {
        homePage.open();
    }

    public void homePageIsOpened() {
        Assert.assertTrue("False", homePage.homePageIsOpened());
    }
}