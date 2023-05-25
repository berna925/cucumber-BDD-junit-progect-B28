package com.berna.step_definitions;

import com.berna.pages.US97Page;
import com.berna.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US97_RepairOrder_StepDefinition {

US97Page repairOrders = new US97Page();// Create object from US97Page


    @Given("users already logged in page")
    public void users_already_logged_in_page() {
        repairOrderPage.login("posmanager11@info.com", "posmanager");


    }

    @When("user should see repaires module")
    public void user_should_see_repaires_module() {
        String expectedTitle ="Odoo";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);





    }

    @When("user click the Repairs module")
    public void user_click_the_repairs_module() {
        repairOrderPage.Repairs.click();

    }

    @And("users should verify {int} column orders")
    public void usersShouldVerifyColumnOrders(int elements) {
        Assert.assertTrue(repairOrderPage.columns.size()==elements);


    }


    @Then("user should verify login as POS manager")
    public void user_should_verify_login_as_pos_manager() {
//repairOrderPage.posManager.isDisplayed();
        Assert.assertTrue(repairOrderPage.posManager.isDisplayed());


    }

}

