package gov.uspto.opsg.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SimpleFormPage extends Base{
	
	
	public SimpleFormPage() {
       PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user-message")
	public WebElement messageField;
	
	@FindBy(css="#get-input >button")
	public WebElement showMessageButton;
	
	@FindBy(id="display")
	public WebElement messagedisplayed;
	
	@FindBy(id="sum1")
	public WebElement valueA;
	
	@FindBy(id="sum2")
	public WebElement valueB;
	
	
	@FindBy(xpath="//*[@id=\'gettotal\']/button")
	public WebElement getTotalButton;
	
	@FindBy(id="displayvalue")
	public WebElement displayedTotal;
	

	
	}



























