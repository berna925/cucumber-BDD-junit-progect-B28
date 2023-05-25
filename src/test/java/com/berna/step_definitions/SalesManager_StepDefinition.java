package com.berna.step_definitions;

import com.berna.pages.SalesManagerPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class SalesManager_StepDefinition{

    SalesManagerPage salesManagerPage = new SalesManagerPage();



    @Given("user logged as a sales manager")
    public void user_logged_as_a_sales_manager() {



    }

    @Then("user access the {int} module of the page with the {string}")
    public void user_access_the_module_of_the_page_with_the(int expectedModuleNumber, String expectedProfileName) {
        int actualModuleNumber = SalesManagerPage.modules.size();
        Assert.assertTrue(expectedProfileName.equals(salesManagerPage.profileName.getText()));
        Assert.assertEquals(expectedModuleNumber,actualModuleNumber);

    }

}
