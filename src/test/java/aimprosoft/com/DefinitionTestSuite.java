package aimprosoft.com;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features= {"src/test/resources/HomePage.feature",
                            "src/test/resources/NavigationMenuPage.feature"
})
public class DefinitionTestSuite {}
