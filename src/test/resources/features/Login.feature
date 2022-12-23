Feature: login

Scenario: User should be able to login with valid credentials
			Given User is in login page
			When User enters "test@email.com" and "abcabc"
			Then User should be able to login
	

Scenario: Successful logout  
			Given User logs out from the application
			Then User should not be able to visit practice page
 