package com.berna.step_definitions;

import com.berna.pages.BasePage;
import com.berna.pages.RepairOrderCheckboxPage;
import com.berna.utilities.ConfigurationReader;
import com.berna.utilities.Driver;
import com.sun.source.tree.AssertTree;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Collections;

public class RepairOrderCheckbox_stepDefinition{

    RepairOrderCheckboxPage  repairOrderCheckboxPage = new RepairOrderCheckboxPage();
    @When("User is logged in page")
    public void user_is_logged_in_page() {


    }

    @Then("user click on repair button")
    public void user_click_on_repair_button() {
        repairOrderCheckboxPage.repairsButton.click();


    }
    @Then("user should  click on the top ckeckbox")
    public void user_should_click_on_the_top_ckeckbox() {
        repairOrderCheckboxPage.checkBox.click();

    }
    @Then("user should select all the repair orders by clicking the top check box")
    public void user_should_select_all_the_repair_orders_by_clicking_the_top_check_box() {
        Assert.assertTrue(repairOrderCheckboxPage.posManager.isDisplayed());

    }

}
