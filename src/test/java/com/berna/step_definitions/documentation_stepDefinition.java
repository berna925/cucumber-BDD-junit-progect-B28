package com.berna.step_definitions;

import com.berna.pages.DocumentationPage;
import com.berna.utilities.BrowserUtils;
import com.berna.utilities.ConfigurationReader;
import com.berna.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class documentation_stepDefinition{


    DocumentationPage documentationPage = new DocumentationPage();// create object from LoginPage


    @Given("user is logged in")
    public void userIsLoggedIn() {

    }

    @When("user clicks {string} button")
    public void userClicksButton(String string) {
        WebElement element = Driver.getDriver().findElement(By.partialLinkText(string));
        element.click();
    }

    @When("the user clicks on the {string}")
    public void theUserClicksOnThe(String username) {

    }

    @When("user clicks {string} option")
    public void user_clicks_option(String documentation) {
        //  documentationPage.documentation.click();
        String mainHandle = Driver.getDriver().getWindowHandle();
        BrowserUtils.sleep(2);
        documentationPage.ClickMenu(documentation);

        BrowserUtils.sleep(1);

        Set<String> windows = Driver.getDriver().getWindowHandles();

        for (String window : windows) {
            Driver.getDriver().switchTo().window(window);
        }

    }

    @Then("user sees  {string} in the url")
    public void user_sees_in_the_url(String string) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(string));
    }


    @Then("user sees {string} message is displayed")
    public void user_sees_message_is_displayed(String string) {
        Assert.assertTrue(documentationPage.OdooDocumentation.isDisplayed());
        Assert.assertEquals(documentationPage.OdooDocumentation.getText(), string);

    }


    @And("there are {int} main documents topics are listed")
    public void thereAreMainDocumentsTopicsAreListed(int int1) {
        Assert.assertTrue(documentationPage.headers.size() == int1);

    }


}




