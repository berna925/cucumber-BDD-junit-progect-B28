package com.berna.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RepairOrderCheckboxPage extends BasePage{

   @FindBy(xpath = "//a[@data-menu-xmlid='mrp_repair.menu_repair_order']")
 public WebElement repairsButton;
    @FindBy(xpath = "//li[.='Repair Orders']")
  public WebElement header;

    @FindBy(xpath = "(//input[@type='checkbox'])[3]")
   public WebElement checkBox;
    @FindBy(xpath = "//span[.='POSManager13']")
    public WebElement posManager;

}
