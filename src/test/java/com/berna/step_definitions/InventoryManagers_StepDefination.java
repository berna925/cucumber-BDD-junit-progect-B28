package com.berna.step_definitions;

import com.berna.pages.InventoryManagerPage;
import com.berna.utilities.ConfigurationReader;
import com.berna.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class InventoryManagers_StepDefination {

    InventoryManagerPage inventoryManagersPage = new InventoryManagerPage();

    @Given("an inventory manager is logged into the system")
    public void an_inventory_manager_is_logged_into_the_system() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @When("the manager navigates to the modules page")
    public void the_manager_navigates_to_the_modules_page() {


    }


    @When("the manager click on the inventory modules")
    public void theManagerClickOnTheInventoryModules() {
    }


    @Then("the manager should see {int} modules displayed")
    public void the_manager_should_see_modules_displayed(Integer int1) {
        List<WebElement> modules = inventoryManagersPage.modules;
        int actualColumns = modules.size();
        int expectedColumns = 16;
        Assert.assertEquals(actualColumns, expectedColumns);


    }

    @Then("the manager should have access to all {int} modules")
    public void the_manager_should_have_access_to_all_modules(Integer int1) {

    }
}