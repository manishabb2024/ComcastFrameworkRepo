package com.client.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrgPageOR {
	WebDriver driver=null;
	public OrgPageOR(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(linkText = "Organizations")
	public WebElement org;
	
	
	@FindBy(xpath="//img[@alt='Create Organization...']")
	public WebElement add;
	
	@FindBy(name="accountname")
	public WebElement accfield;
	
	@FindBy(xpath="//input[@value='  Save  ' and @type='button']")
	public WebElement savebtn;
}
