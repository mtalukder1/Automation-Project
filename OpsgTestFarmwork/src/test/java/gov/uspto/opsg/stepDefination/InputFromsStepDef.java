package gov.uspto.opsg.stepDefination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gov.uspto.opsg.pageObject.Base;
import gov.uspto.opsg.pageObject.HomePage;
import gov.uspto.opsg.pageObject.SimpleFormPage;

public class InputFromsStepDef extends Base{
	
	
	@Before
	public void openBrowser() {
     Base.inilitizeBrowser();
	}
	
	@After
	public void tearDown() {
	
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		driver.close();
	}
	
	HomePage homePage;
	
	SimpleFormPage simpleFormPage;
	
	@Given("^User navigate to Selenium Easy home page$")
	public void user_navigate_to_Selenium_Easy_home_page() throws Throwable {
		
		
 String URL=prop.getProperty("AppURL");
 
		driver.get(URL);
	}

	@When("^User click on the Input Form link$")
	public void user_click_on_the_Input_Form_link() throws Throwable {
		homePage =new HomePage();
		homePage.InputFormsLink.click();	
	}

	@Then("^User click on the Simple From Demo$")
	public void user_click_on_the_Simple_From_Demo() throws Throwable {
		homePage.SimpletFormDemo.click();
	}

	@Then("^User type message on the message field$")
	public void user_type_message_on_the_message_field() throws Throwable {
		
		simpleFormPage =new SimpleFormPage();
		simpleFormPage.messageField.sendKeys("How are you ?");
	}

	@And("^click on show message button$")
	public void click_on_show_message_button() throws Throwable {
		simpleFormPage.showMessageButton.click();
	}

	@Then("^User should be able to verify message is bing displayed$")
	public void user_should_be_able_to_verify_message_is_bing_displayed() throws Throwable {
		simpleFormPage.messagedisplayed.getText();
		
      String expectedResult=simpleFormPage.messagedisplayed.getText();
      System.out.println("Expected Result is : "+expectedResult);
      String actualResult="How are you ?";
      System.out.println("Extual Result is : "+actualResult);
      Assert.assertEquals(expectedResult, actualResult); 
	}
	
	@When("^User Enter number a and b in to the Enter a field$")
	public void user_Enter_number_a_and_b_in_to_the_Enter_a_field() throws Throwable {
		simpleFormPage =new SimpleFormPage();
		simpleFormPage.valueA.sendKeys("8");
		simpleFormPage.valueB.sendKeys("7");
	}
	
	@Then("^User click on get total button$")
	public void user_click_on_get_total_button() throws Throwable {
		simpleFormPage.getTotalButton.click();
	}

	@And("^User should verify that total number is bing displayed$")
	public void user_verify_that_total_number_is_bing_displayeds() throws Throwable {
		
	      String expectedResult=simpleFormPage.displayedTotal.getText();
	      System.out.println("Expected Result is : "+expectedResult);
	      String actualResult="15";
	      System.out.println("Extual Result is : "+actualResult);
	      Assert.assertEquals(expectedResult, actualResult);
	     
	}

}
