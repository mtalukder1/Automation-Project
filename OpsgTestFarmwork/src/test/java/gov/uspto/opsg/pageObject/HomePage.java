package gov.uspto.opsg.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Base{
	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
@FindBy(linkText="Input Forms")
public WebElement InputFormsLink;

@FindBy(linkText="Simple Form Demo")
public WebElement SimpletFormDemo;

@FindBy(linkText="Date pickers")
public WebElement datePickerLink;

@FindBy(linkText="Table")
public WebElement tooLink;

@FindBy(linkText="Demo Home")
public WebElement demoHomeLink;

@FindBy(linkText="Progress Bar")
public WebElement progressBarLink;

//@FindBy(linkText="Input Forms")
//public WebElement lerts & ModalsLink;

}














