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

public class NavigationMenu extends net.serenitybdd.core.pages.PageObject {

    public void clickOnTheTitle(String arg0) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.CATEGORY_TITLE_NAME_ON_THE_NAVIGATION_MENU.replace("$1", arg0))));
        $(LOCATORS.CATEGORY_TITLE_NAME_ON_THE_NAVIGATION_MENU.replace("$1", arg0)).click();
    }

    public boolean subcategoryIsDisplayed(String arg0) {
        withTimeoutOf(16, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.SUBCATEGORY_TITLE_NAME_ON_THE_NAVIGATION_MENU.replace("$1", arg0))));
        return $(LOCATORS.SUBCATEGORY_TITLE_NAME_ON_THE_NAVIGATION_MENU.replace("$1", arg0)).isPresent();
    }

    public boolean titleIsDisplayed(String arg0) {
        withTimeoutOf(16, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.SECTION_TILTE_ON_THE_BACKGROUND_IMAGE.replace("$1", arg0))));
        return $(LOCATORS.SECTION_TILTE_ON_THE_BACKGROUND_IMAGE.replace("$1", arg0)).isPresent();
    }

    public boolean breadcrumbIsDisplayed(String arg0) {
        withTimeoutOf(16, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.CATEGORY_BREADCRUMB.replace("$1", arg0))));
        return $(LOCATORS.CATEGORY_BREADCRUMB.replace("$1", arg0)).isPresent();
    }

    public boolean tabIsDisplayed(String arg0) {
        withTimeoutOf(16, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.TECHNOLOGIES_TAB.replace("$1", arg0))));
        return $(LOCATORS.TECHNOLOGIES_TAB.replace("$1", arg0)).isPresent();
    }
}
