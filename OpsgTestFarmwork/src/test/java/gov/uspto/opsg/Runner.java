package gov.uspto.opsg;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features",
		plugin= {"pretty","html:/target/cucumber","json:/target/json/result.json"},
		tags= {"@SC1"}
		
		
		
		)


public class Runner {

}
