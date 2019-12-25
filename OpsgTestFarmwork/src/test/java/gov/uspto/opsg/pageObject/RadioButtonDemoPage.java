package gov.uspto.opsg.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonDemoPage extends Base {
	public RadioButtonDemoPage() {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//*[@id=\'navbar-brand-centered\']/ul[1]/li[1]/ul/li[3]/a")	
	public WebElement RadioButtonDemolink ;
	
	@FindBy(xpath="//*[@id=\'easycont\']/div/div[2]/div[1]/div[2]/label[1]/input")	
	public WebElement maleRadioButton ;
	
	@FindBy(id="buttoncheck")
	public WebElement GetCheckedValueButto;
	
	@FindBy(xpath="//*[@id=\'easycont\']/div/div[2]/div[1]/div[2]/p[3]")
	public WebElement RadioButtonMaleisChecked;
	
	@FindBy(xpath="//*[@id=\'easycont\']/div/div[2]/div[1]/div[2]/label[2]/input")	
	public WebElement FemaleRadioButton;
	
	@FindBy(xpath="//*[@id=\'easycont\']/div/div[2]/div[1]/div[2]/p[3]")
	public WebElement RadioButtonFemaleIsChecked;
	
	@FindBy(xpath="//*[@id=\'easycont\']/div/div[2]/div[2]/div[1]")
	public WebElement GroupRadioButtonsDemo;
	
	@FindBy(xpath="//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[1]/input")
	public WebElement MailRadioButton;
	
	@FindBy(xpath="//*[@id=\'easycont\']/div/div[2]/div[2]/div[2]/div[2]/label[1]/input")
	public WebElement AgeGroupRadioButton;
	
	@FindBy(xpath="//*[@id='easycont']/div/div[2]/div[2]/div[2]/button")
	public WebElement GetvalueButton;
	
	
	@FindBy(xpath="//p[contains(text(),'Sex : Male')]")
	public WebElement MaleAgeGroup;
	
		
}




















