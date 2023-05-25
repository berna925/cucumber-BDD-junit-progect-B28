package com.berna.step_definitions;

import com.berna.pages.SelasColumnsPage;
import com.berna.utilities.BrowserUtils;
import com.berna.utilities.ConfigurationReader;
import com.berna.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SelsColumn_StepDefinition {

    SelasColumnsPage selasColumnsPage = new SelasColumnsPage();
    @Given("the user is logged in as a POS user or sales manager")
    public void the_user_is_logged_in_as_a_pos_user_or_sales_manager() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }



    @When("the user navigates to the Sales page")
    public void navigateToSalesPage() {





    }
    @Then("the Sales page displays {int} columns for quotations")
    public void the_sales_page_displays_columns_for_quotations(Integer int1) {
        List<WebElement> columns = selasColumnsPage.columns;
        int actualColumns = columns.size();
        int expectedColumns = 6;
        Assert.assertEquals(actualColumns, expectedColumns);
    }



    }

