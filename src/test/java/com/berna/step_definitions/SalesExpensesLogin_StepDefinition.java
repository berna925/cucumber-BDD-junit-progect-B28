package com.berna.step_definitions;

import com.berna.pages.BasePage;
import com.berna.pages.SalesExpensesLoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SalesExpensesLogin_StepDefinition extends BasePage{

    SalesExpensesLoginPage salesExpensesLoginPage = new SalesExpensesLoginPage();

    @When("Users login with their {string} and {string}")
    public void users_login_with_their_and(String username, String password) {



    }
    @Then("Users see the correct {string}")
    public void users_see_the_correct(String accountHolderName) {
     //   Assert.assertTrue(accountHolderName,salesExpensesLoginPage.accountHolderName.getText());

    }
}
