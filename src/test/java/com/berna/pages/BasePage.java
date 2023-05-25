package com.berna.pages;

import com.berna.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {


    public BasePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id="login")
    public WebElement email;



    @FindBy(id="password")
    public WebElement password;

    @FindBy(xpath = "//button[.=\"Log in\"]")
    public WebElement btn_logIn;













}



