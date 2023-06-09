package com.berna.pages;

import com.berna.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SelasColumnsPage extends BasePage{

    @FindBy(xpath = "//a[@data-menu='445']")
    public WebElement salesTab;


    @FindBy (xpath = "//th[.='Salesperson']")
    public WebElement SalesPerson;


    @FindBy (xpath = "//span[@class='oe_topbar_name']")
    public WebElement ManagerInfo;


    public List<WebElement> columns = Driver.getDriver().findElements(By.xpath("//th[@class='o_column_sortable']"));


}


