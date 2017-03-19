Feature: Verify menu
  As a user
  After I select select valid information
  The data must show as selected information


	

Scenario: Verify default language
	Given I am on world ticket website
	Given I check default language is Germany 
	Then I check Booking menu is "Buchen" 
	Then I check Planing menu is "Planen" 
	Then I check Flying menu is "Fliegen" 
	Then I check Travel guide menu is "Reiseführer" 
	
Scenario: Change English language
	When I change language to "English"
	Then I check Booking menu is "Booking" 
	Then I check Planing menu is "Planning" 
	Then I check Flying menu is "Flying" 
	Then I check Travel guide menu is "Travel guide" 
	
	And I Close Browser