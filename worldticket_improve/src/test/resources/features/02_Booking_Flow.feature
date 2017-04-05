Feature: Booking flow information must show correctly as selected 
	As a user
  After I select select valid information
  The data must show as selected information

Scenario: Select BRE in airport From 
	Given I am on world ticket website 
	When I change language to "English" 
	Then I check Booking menu is "Booking" 
	When I click airport "From" field 
	And I select "Germany" country on Airport From 
	And I select "BRE" airport 
	Then I check "BRE" was applied in Airport From 
	
Scenario: Select PMI in airport To 
	And I select "Spain" country on Airport To 
	And I select "PMI" airport 
	Then I check "PMI" was applied in Airport To 
	
Scenario: Right calendar must be disable if left caldendar has no selected 
	When I check if not select item in left calendar 
	Then All item in right calendar must be inactive 
	
Scenario: If left caldendar has no select when click button must not redirect 
	When I check if not select item in left calendar 
	Then I click the button must not redirect browser 
	
Scenario: Select valid date and check information on flight details page 
	When I select date "6" in Date From 
	And I select date "10" in Date To 
	And I click book seats button 
	Then I check information on Flight Details Page 
	
Scenario: Departure and Return information must show correctly as selected 
	And I select "Departure" 
	And I select "Return" 
	Then I check information in "Departure" 
	Then I check information in "Return" 
	When I click next button on Flight Details Page 
	
Scenario: I fill personal information, it must show name as I filled in the box 
	When I select "Mr." in Title 
	And I input "Steve" in First Name 
	And I input "Jobs" in Last Name 
	Then I click next button on Passenger Page 
	
Scenario: Seat information must show the same as I selected 
	When I select any AISLE SEAT available in departure 
	And I select any AISLE SEAT available in return 
	Then I check seat display as selected 
	And I click next button on Seats Page 
	
Scenario: Summary Page must show information same as selected in each pages 
	Then I check summary information must show as selected 
	
	
  