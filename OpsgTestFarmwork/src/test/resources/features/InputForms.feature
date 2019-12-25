Feature: As usre I should be able to verify Input Froms funcanality 


Scenario: Verify single input field
Given User navigate to Selenium Easy home page
When User click on the Input Form link
Then User click on the Simple From Demo
Then User type message on the message field
And click on show message button
Then User should be able to verify message is bing displayed



Scenario: Two Input Fields
Given User navigate to Selenium Easy home page
When User click on the Input Form link
Then User click on the Simple From Demo
When User Enter number a and b in to the Enter a field
Then User click on get total button
And User should verify that total number is bing displayed

