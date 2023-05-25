package com.berna.pages;

import com.berna.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class InventoryManagerPage extends BasePage{

    @FindBy(xpath = "//div[@class='o_notification_manager']")
    public WebElement InputModules;

    public List<WebElement> modules = Driver.getDriver().findElements(By.xpath("//div[@class='o_content']"));

}
