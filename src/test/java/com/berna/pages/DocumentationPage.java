package com.berna.pages;

import com.berna.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DocumentationPage extends BasePage{

    @FindBy(xpath = "//span[.='POSManager11']")
    public WebElement Username;

    @FindBy(xpath = "//a[@data-menu='documentation']")
    public WebElement documentation;

    @FindBy(xpath ="//h1[.='Odoo Documentation']")
             public WebElement OdooDocumentation;

    @FindBy(tagName = "h1")
    public WebElement message;


    @FindBy(tagName = "h2")
    public List<WebElement> headers;





    public void ClickMenu(String linkText){
        WebElement element = Driver.getDriver().findElement(By.partialLinkText(linkText));
        element.click();
    }
}


