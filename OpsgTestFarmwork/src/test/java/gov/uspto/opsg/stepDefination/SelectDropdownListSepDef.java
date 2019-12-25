package gov.uspto.opsg.stepDefination;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import cucumber.api.java.en.Then;
import gov.uspto.opsg.pageObject.Base;
import gov.uspto.opsg.pageObject.SelectDropDownListPage;

public class SelectDropdownListSepDef extends Base {

	SelectDropDownListPage selectDropdownListPage = new SelectDropDownListPage();
	
	@Then("^User click on select dropdown list$")
	public void user_click_on_select_dropdown_list() throws Throwable {
		selectDropdownListPage.SelectDropDownList.click();
	}

	@Then("^User validate the select demo list page$")
	public void user_validate_the_select_demo_list_page() throws Throwable {	
    String actuatResult="Select List Demo";
    String expectedResult= selectDropdownListPage.SelectListDemo.getText();
    Assert.assertEquals(actuatResult, expectedResult);	
	}
	
	@Then("^should able to click on dropdown Icon$")
	public void should_able_to_click_on_dropdown_Icon() throws Throwable {
		selectDropdownListPage.PleaseSelectIcon.click();
	}

	@Then("^should able to select Monday$")
	public void should_able_to_select_Monday() throws Throwable {
		
//		@FindBy(id="//*[@id=\"select-demo\"]")
//		public WebElement vn;
	}
//
//	@Then("^User should able to validate the selected day$")
//	public void user_should_able_to_validate_the_selected_day() throws Throwable {
//
//	}
		
}
   