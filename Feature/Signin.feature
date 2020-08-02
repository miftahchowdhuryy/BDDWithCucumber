@Log
Feature: Amazon Login feature test
Scenario: User be able to signin with valid credentials
	Given Go to home page
	When Enter Username
	And Enter password
	And Click on Submit button
	Then login should be successful