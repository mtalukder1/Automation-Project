package gov.uspto.opsg.stepDefination;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import gov.uspto.opsg.pageObject.CheckboxDemoPage;

public class CheckboxDemoStepDef {
  CheckboxDemoPage checkboxDemoPage=new CheckboxDemoPage();
	
	@Then("^User click on the Chickbox Demo$")
	public void user_click_on_the_Chickbox_Demo() throws Throwable {
		checkboxDemoPage.checkboxDemoLink.click();
	 
	}

	@Then("^Click on this check box$")
	public void click_on_this_check_box() throws Throwable {
	
		checkboxDemoPage.SingleCheckBox.click();
	}

	@Then("^user verify the Check box is checked message$")
	public void user_verify_the_Check_box_is_checked_message() throws Throwable {
		
		String actualResult="Success - Check box is checked";
		String expextedResult=checkboxDemoPage.successMessage.getText();
		Assert.assertEquals(expextedResult, actualResult);
	}
	
	@Then("^click on check All button$")
	public void click_on_check_All_button() throws Throwable {
		
		checkboxDemoPage.checkAllButton.click();
		boolean actualResult1=true;
		boolean expectedResult1= checkboxDemoPage.option1.isSelected();
		Assert.assertEquals(expectedResult1, actualResult1);
	
		//checkboxDemoPage.checkAllButton.click();
		boolean actualResult2=true;
		boolean expectedResult2= checkboxDemoPage.option2.isSelected();
		Assert.assertEquals(expectedResult2, actualResult2);
		
		boolean actualResult3=true;
		boolean expectedResult3= checkboxDemoPage.option3.isSelected();
		Assert.assertEquals(expectedResult3, actualResult3);
		
		
		boolean actualResult4=true;
		boolean expectedResult4= checkboxDemoPage.option4.isSelected();
		Assert.assertEquals(expectedResult4, actualResult4);

	}

	@Then("^validate uncheck All button$")
	public void validate_uncheck_All_button() throws Throwable {
		checkboxDemoPage.UncheckAllButton.click(); 
		
		boolean actualResult1=false;
		boolean expectedResult1= checkboxDemoPage.option1.isSelected();
		Assert.assertEquals(expectedResult1, actualResult1);
		
		boolean actualResult2=false;
		boolean expectedResult2= checkboxDemoPage.option2.isSelected();
		Assert.assertEquals(expectedResult2, actualResult2);
		
		boolean actualResult3=false;
		boolean expectedResult3= checkboxDemoPage.option3.isSelected();
		Assert.assertEquals(expectedResult3, actualResult3);
		
		boolean actualResult4=false;
		boolean expectedResult4= checkboxDemoPage.option4.isSelected();
		Assert.assertEquals(expectedResult4, actualResult4);
		

	}
	
	
	
	
		
}
