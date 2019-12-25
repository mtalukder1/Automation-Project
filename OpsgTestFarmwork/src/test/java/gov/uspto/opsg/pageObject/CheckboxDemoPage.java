package gov.uspto.opsg.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckboxDemoPage extends Base {
	
	public CheckboxDemoPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(linkText="Checkbox Demo")
	public WebElement checkboxDemoLink;
	
	@FindBy(id="isAgeSelected")
	public WebElement SingleCheckBox;
	
	@FindBy(id="txtAge")
	public WebElement successMessage;
	
	
	@FindBy(id="check1")
	public WebElement checkAllButton;
	
	@FindBy(id="check1")
	public WebElement UncheckAllButton;
	
	@FindBy(xpath="//*[@id=\'easycont\']/div/div[2]/div[2]/div[2]/div[1]/label/input")
	public WebElement option1;
	@FindBy(xpath="//*[@id=\'easycont\']/div/div[2]/div[2]/div[2]/div[2]/label/input")
	public WebElement option2;
	@FindBy(xpath="//*[@id=\'easycont\']/div/div[2]/div[2]/div[2]/div[3]/label/input")
	public WebElement option3;
	@FindBy(xpath="//*[@id=\'easycont\']/div/div[2]/div[2]/div[2]/div[4]/label/input")
	public WebElement option4;
	
	
	
	
	
}
