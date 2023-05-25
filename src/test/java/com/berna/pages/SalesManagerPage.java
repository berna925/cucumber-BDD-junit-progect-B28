package com.berna.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SalesManagerPage extends BasePage{

    @FindBy(xpath = "//span[.='SalesManager11']")
    public WebElement profileName;


    @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder']/li/a/span")
    public static List<WebElement> modules;
}
