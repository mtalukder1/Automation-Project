package gov.uspto.opsg.stepDefination;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import gov.uspto.opsg.pageObject.RadioButtonDemoPage;


public class RadioButtonDemoStepDef {
	
	RadioButtonDemoPage radioButtonDemoPage=new RadioButtonDemoPage();
		@Then("^User click on the radio button Demo link$")
		public void user_click_on_the_radio_button_Demo_link() throws Throwable {
			radioButtonDemoPage.RadioButtonDemolink.click();
			
		}

		@Then("^User ckick on male radio button$")
		public void user_ckick_on_male_radio_button() throws Throwable {
			radioButtonDemoPage.maleRadioButton.click();
		}
		
		@Then("^user click on Get checked value button$")
		public void user_click_on_Get_checked_value_button() throws Throwable {
			radioButtonDemoPage.GetCheckedValueButto.click();	
		}
		@Then("^validate checked value$")
		public void validate_checked_value() throws Throwable {
			String actuatResult="Radio button 'Male' is checked";
			String expectedResult=radioButtonDemoPage.RadioButtonMaleisChecked.getText();
			Assert.assertEquals(expectedResult, actuatResult);	
			
		}
		
		@Then("^User ckick on Female radio button$")
		public void user_ckick_on_Female_radio_button() throws Throwable {
			radioButtonDemoPage.FemaleRadioButton.click();	
		}
		@Then("^User click on Fget checked value button$")
		public void user_click_on_Fget_checked_value_button() throws Throwable {
			radioButtonDemoPage.GetCheckedValueButto.click();
		}
		@Then("^validate Female radio button checked value$")
		public void validate_Female_radio_button_checked_value() throws Throwable {
			String actualValue="Radio button 'Female' is checked";
			String ExpectedValue=radioButtonDemoPage.RadioButtonFemaleIsChecked.getText();
			Assert.assertEquals(ExpectedValue, actualValue);
		}
		
			@Then("^User should validate Group Radio Buttons Demo text$")
			public void user_should_validate_Group_Radio_Buttons_Demo_text() throws Throwable {
				String actualValue="Group Radio Buttons Demo";
				String ExpectedValue=radioButtonDemoPage.GroupRadioButtonsDemo.getText();
				Assert.assertEquals(ExpectedValue, actualValue);
			}

			@Then("^user click on Mail radio button$")
			public void user_click_on_Mail_radio_button() throws Throwable {
				radioButtonDemoPage.MailRadioButton.click();

			}

			@Then("^user click on age radio button$")
			public void user_click_on_age_radio_button() throws Throwable {
				radioButtonDemoPage.AgeGroupRadioButton.click();
			}

			@Then("^user click on get values button$")
			public void user_click_on_get_values_button() throws Throwable {
				radioButtonDemoPage.GetvalueButton.click();
			}

			@Then("^user validate the result$")
			public void user_validate_the_result() throws Throwable {
			String ExpectedValue= radioButtonDemoPage.MaleAgeGroup.getText();
			System.out.println(ExpectedValue);
			
			
			
			}
}








