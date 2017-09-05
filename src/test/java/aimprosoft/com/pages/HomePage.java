package aimprosoft.com.pages;

import aimprosoft.com.LOCATORS;
import com.sun.mail.imap.IMAPStore;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import javax.mail.*;
import javax.mail.search.AndTerm;
import javax.mail.search.FlagTerm;
import javax.mail.search.SearchTerm;
import java.io.File;
import java.io.FilenameFilter;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Folder;
import javax.mail.MessagingException;

@DefaultUrl("https://www.aimprosoft.com/")

public class HomePage extends net.serenitybdd.core.pages.PageObject {

    private static Logger logger = org.slf4j.LoggerFactory.getLogger(HomePage.class);

    String globalpass; //password using "get mail.ru" method
    String pass;       //password using program method

    public boolean homePageIsOpened() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.AIMPROSOFT_LOGO)));
        return $(LOCATORS.AIMPROSOFT_LOGO).isPresent();
    }

    public void clickOnLeftButton() {
        $(LOCATORS.LEFT_BUTTON).click();
    }

    public boolean fullSizeSiteModeIsDisplayed() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.AIMPROSOFT_LOGO_ON_THE_FULL_SIZE_SITE_MODE)));
        return $(LOCATORS.AIMPROSOFT_LOGO_ON_THE_FULL_SIZE_SITE_MODE).isPresent();
    }

    public void clickOnDownButton() {
        $(LOCATORS.DOWN_BUTTON).click();
        checkCurrentCoordinates();
    }

    public int titleCoordinates() {
        return $(LOCATORS.WE_ARE_REALLY_GOOD_AT_TITLE).getCoordinates().inViewPort().getY();
    }

    public boolean checkCurrentCoordinates()  {
        for (int i = 0; i < 100; i++) {
            if ($(LOCATORS.WE_ARE_REALLY_GOOD_AT_TITLE).getCoordinates().inViewPort().getY()==155) {
                return true;
            }
        }
       return false;
    }

    public void clickOnRequestAFreeQuoteLink() {
        $(LOCATORS.REQUEST_A_FREE_QUOTE_LINK).click();
    }

    public boolean currentURLEqualsToExpected() {
        return getDriver().getCurrentUrl().equals("https://www.aimprosoft.com/contact-us/");
    }
}
