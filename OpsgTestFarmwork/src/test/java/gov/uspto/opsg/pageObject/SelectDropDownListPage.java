package gov.uspto.opsg.pageObject;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;

public class SelectDropDownListPage extends Base {
	public SelectDropDownListPage() {
		PageFactory.initElements(driver, this);	
		
	}
	
	@FindBy(linkText="Select Dropdown List")	
	public WebElement SelectDropDownList ;
	
	@FindBy(xpath="//*[@id=\'easycont\']/div/div[2]/div[1]/div[1]")
	public WebElement SelectListDemo ;
	
	@FindBy(xpath="//*[@id=\'select-demo\']")
	public WebElement PleaseSelectIcon;	
}