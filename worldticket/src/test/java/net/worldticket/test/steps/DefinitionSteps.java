package net.worldticket.test.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.worldticket.test.pages.*;

public class DefinitionSteps {

	private static WebDriver driver = new ChromeDriver();
	private static WebDriverWait wait = new WebDriverWait(driver, 5);
	
	private static LandingPage LandingPage;
	private static FlightDetailPage FlightDetailPage;
	private static Passenger Passenger;
	private static SeatsPage SeatsPage;
	private static SummaryPage SummaryPage;

	@Then("^I Close Browser$")
	public void i_Close_Browser() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
		driver.close();
		
		
		
	}

	@Given("^I am on world ticket website$")
	public void i_am_on_world_ticket_website() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try {
			LandingPage = new LandingPage(driver);
			LandingPage.naviateToWorldTicketWebApp();
		} catch (Exception e) {
			driver = new ChromeDriver();
			wait = new WebDriverWait(driver, 10);
			LandingPage = new LandingPage(driver);
			LandingPage.naviateToWorldTicketWebApp();

		}

	}

	/*
	 * @After public void AfterScenario() { driver.quit(); }
	 */

	@Given("^I check default language is Germany$")
	public void i_check_default_language_is_Germany() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(LandingPage.getlblLanguage().contains("Deutsch"));

	}

	@When("^I change language to \"([^\"]*)\"$")
	public void i_change_language_to(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		if (arg1.equals("English")) {
			LandingPage.changeLanguage("English");
		}

	}

	@Then("^I check Booking menu is \"([^\"]*)\"$")
	public void i_check_Booking_menu_is(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		if (arg1.equals("Buchen")) {
			Assert.assertTrue(LandingPage.getlblBookingText().contains("Buchen"));
		} else if (arg1.equals("Booking")) {
			Assert.assertTrue(LandingPage.getlblBookingText().contains("Booking"));
		}

	}

	@Then("^I check Planing menu is \"([^\"]*)\"$")
	public void i_check_Planing_menu_is(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		if (arg1.equals("Planen")) {
			Assert.assertTrue(LandingPage.getlblPlanning().contains("Planen"));
		} else if (arg1.equals("Planning")) {
			Assert.assertTrue(LandingPage.getlblPlanning().contains("Planning"));
		}
	}

	@Then("^I check Flying menu is \"([^\"]*)\"$")
	public void i_check_Flying_menu_is(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		if (arg1.equals("Fliegen")) {
			Assert.assertTrue(LandingPage.getlblFlying().contains("Fliegen"));
		} else if (arg1.equals("Flying")) {
			Assert.assertTrue(LandingPage.getlblFlying().contains("Flying"));
		}
	}

	@Then("^I check Travel guide menu is \"([^\"]*)\"$")
	public void i_check_Travel_guide_menu_is(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		if (arg1.equals("Reiseführer")) {
			Assert.assertTrue(LandingPage.getlblTravelGuide().contains("Reiseführer"));
		} else if (arg1.equals("Travel guide")) {
			Assert.assertTrue(LandingPage.getlblTravelGuide().contains("Travel guide"));
		}
	}

	@When("^I click airport \"([^\"]*)\" field$")
	public void i_click_airport_field(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		if (arg1.equals("From")) {
			LandingPage.clickAirportFrom();
		} else if (arg1.equals("To")) {
			LandingPage.clickAirportTo();
		}
	}

	@And("^I select \"([^\"]*)\" country on Airport From$")
	public void i_select_country_airport_from(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		if (arg1.equals("Germany")) {
			LandingPage.selectCountry_AirportFrom("Germany");
		} else if (arg1.equals("Spain")) {
			LandingPage.selectCountry_AirportFrom("Spain");
		}
	}

	@And("^I select \"([^\"]*)\" country on Airport To$")
	public void i_select_country_airport_to(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		if (arg1.equals("Germany")) {
			LandingPage.selectCountry_AirportTo("Germany");
		} else if (arg1.equals("Spain")) {
			LandingPage.selectCountry_AirportTo("Spain");
		}
	}

	@And("^I select \"([^\"]*)\" airport$")
	public void i_select_airport_airport_from(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		if (arg1.equals("BRE")) {
			LandingPage.selectAirport("BRE");
		} else if (arg1.equals("PMI")) {
			LandingPage.selectAirport("PMI");
		}
	}

	@Then("^I check \"([^\"]*)\" was applied in Airport From$")
	public void i_check_was_applied_in_Airport_From(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		if (arg1.equals("BRE")) {
			Assert.assertTrue(LandingPage.getTextAirportFrom().contains("Bremen (BRE)"));

		}
	}

	@Then("^I check \"([^\"]*)\" was applied in Airport To$")
	public void i_check_was_applied_in_Airport_To(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		if (arg1.equals("PMI")) {
			Assert.assertTrue(LandingPage.getTextAirportTo().contains("Palma de Mallorca (PMI)"));

		}
	}

	@When("^I check if not select item in left calendar$")
	public void i_check_if_not_select_item_in_left_calendar() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(LandingPage.noSelectLeftCalendar());

	}

	@Then("^All item in right calendar must be inactive$")
	public void all_item_in_right_calendar_must_be_inactive() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(LandingPage.noEnableRightCalendar());

	}

	@Then("^I click the button must not redirect browser$")
	public void i_click_the_button_must_not_redirect_browser() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		LandingPage.clickBookseatsButton();
		Assert.assertTrue(
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[text()='Previous']"))));
	}

	@When("^I select date \"([^\"]*)\" in Date From$")
	public void i_select_date_in_Date_From(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		LandingPage.selectDateFrom(arg1);
	}

	@When("^I select date \"([^\"]*)\" in Date To$")
	public void i_select_date_in_Date_To(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		LandingPage.selectDateTo(arg1);

	}

	@When("^I click book seats button$")
	public void i_click_book_seats_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		LandingPage.getSelectedInformation();
		FlightDetailPage = LandingPage.clickBookseatsButton();
	}

	@Then("^I check information on Flight Details Page$")
	public void i_check_information_on_Flight_Details_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(FlightDetailPage.depart_Date().contains(LandingPage.dayOfweekFrom + " " + LandingPage.dateFrom
				+ " " + LandingPage.convertMonth(LandingPage.monthFrom)));
		Assert.assertTrue(FlightDetailPage.depart_FlightNo().contains("ST4570"));
		Assert.assertTrue(FlightDetailPage.depart_AirportFrom().contains(LandingPage.airportFromName));
		Assert.assertTrue(FlightDetailPage.depart_AirportTo().contains(LandingPage.airportToName));

		Assert.assertTrue(FlightDetailPage.return_Date().contains(LandingPage.dayOfweekTo + " " + LandingPage.dateTo
				+ " " + LandingPage.convertMonth(LandingPage.monthTo)));
		Assert.assertTrue(FlightDetailPage.return_FlightNo().contains("ST4571"));

	}

	@Then("^I select \"([^\"]*)\"$")
	public void i_select_Departure(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		if (arg1.equals("Departure")) {
			FlightDetailPage.selectDeparture();
		} else if (arg1.equals("Return")) {
			FlightDetailPage.selectReturn();
		}

	}

	@Then("^I check information in \"([^\"]*)\"$")
	public void i_check_information_in_depart(String arg1) throws Throwable {

		if (arg1.equals("Departure")) {
			Assert.assertTrue(FlightDetailPage.getDeparture_Date().contains(LandingPage.dateFrom + "." + LandingPage.monthFrom + "." + LandingPage.yearFrom));
			Assert.assertTrue(FlightDetailPage.getDeparture_AirportFrom().contains(FlightDetailPage.depart_AirportFrom()));
			Assert.assertTrue(FlightDetailPage.getDeparture_AirportTo().contains(FlightDetailPage.depart_AirportTo()));
			Assert.assertTrue(FlightDetailPage.getDeparture_DepartureTime().contains(FlightDetailPage.depart_departureTime()));
			Assert.assertTrue(FlightDetailPage.getDeparture_ArrivalTime().contains(FlightDetailPage.depart_ArrivalTime()));
			Assert.assertTrue(FlightDetailPage.getDeparture_FlightNo().contains(FlightDetailPage.depart_FlightNo()));

		} else if (arg1.equals("Return")) {
			Assert.assertTrue(FlightDetailPage.getReturn_Date().contains(LandingPage.dateTo + "." + LandingPage.monthTo + "." + LandingPage.yearTo));
			Assert.assertTrue(FlightDetailPage.getReturn_AirportFrom().contains(FlightDetailPage.return_AirportFromText()));
			Assert.assertTrue(FlightDetailPage.getReturn_AirportTo().contains(FlightDetailPage.return_AirportToText()));
			Assert.assertTrue(FlightDetailPage.getReturn_DepartureTime().contains(FlightDetailPage.return_DepartureTime()));
			Assert.assertTrue(FlightDetailPage.getReturn_ArrivalTime().contains(FlightDetailPage.return_ArrivalTime()));
			Assert.assertTrue(FlightDetailPage.getReturn_FlightNo().contains(FlightDetailPage.return_FlightNo()));
		}

	}

	@When("^I click next button on Flight Details Page$")
	public void i_click_next_button_on_Flight_Details_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Passenger = FlightDetailPage.clickNextbtn();
	}

	@When("^I select \"([^\"]*)\" in Title$")
	public void i_select_in_Title(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Passenger.selectTitle(arg1);
		Assert.assertTrue(Passenger.depart_getTitle().contains(arg1));
		Assert.assertTrue(Passenger.return_getTitle().contains(arg1));
	}

	@And("^I input \"([^\"]*)\" in First Name$")
	public void i_input_in_First_Name(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Passenger.setFirstName(arg1);
		Assert.assertTrue(Passenger.depart_getFirstName().contains(arg1));
		Assert.assertTrue(Passenger.return_getFirstName().contains(arg1));
	}

	@And("^I input \"([^\"]*)\" in Last Name$")
	public void i_input_in_Last_Name(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Passenger.setLastName(arg1);
		Assert.assertTrue(Passenger.depart_getLastName().contains(arg1));
		Assert.assertTrue(Passenger.return_getLastName().contains(arg1));
	}

	@Then("^I click next button on Passenger Page$")
	public void i_click_next_button_on_Passenger_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		SeatsPage = Passenger.clickNextbtn();
	}

	@When("^I select any AISLE SEAT available in departure$")
	public void i_select_any_AISLE_SEAT_avaialbe_in_departure() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		SeatsPage.selectDepartureSeat();
		Assert.assertTrue(SeatsPage.Departure_CheckSelectedSeat().contains(SeatsPage.departSeatNo));
	}

	@When("^I select any AISLE SEAT available in return$")
	public void i_select_any_AISLE_SEAT_avaialbe_in_return() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		SeatsPage.selectReturnSeat();
		Assert.assertTrue(SeatsPage.Return_CheckSelectedSeat().contains(SeatsPage.returnSeatNo));
	}

	@Then("^I check seat display as selected$")
	public void i_check_seat_display_as_selected() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(SeatsPage.table_Departure_Seat().contains(SeatsPage.departSeatNo));
		Assert.assertTrue(SeatsPage.MySelection_departure_Seat().contains(SeatsPage.departSeatNo));

		Assert.assertTrue(SeatsPage.table_Return_Seat().contains(SeatsPage.returnSeatNo));
		Assert.assertTrue(SeatsPage.MySelection_return_Seat().contains(SeatsPage.returnSeatNo));
	}

	@Then("^I click next button on Seats Page$")
	public void i_click_next_button_on_Seats_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		SummaryPage = SeatsPage.clickNextButton();
	}

	@Then("^I check summary information must show as selected$")
	public void i_check_summary_information_must_show_as_selected() throws Throwable {
		//departure table
		Assert.assertTrue(SummaryPage.departure_Date().contains(LandingPage.dateFrom + "." + LandingPage.monthFrom + "." + LandingPage.yearFrom));
		Assert.assertTrue(SummaryPage.departure_AirportFrom().contains(LandingPage.airportFromName));
		Assert.assertTrue(SummaryPage.departure_AirportTo().contains(LandingPage.airportToName));
		Assert.assertTrue(SummaryPage.departure_FlightNo().contains(FlightDetailPage.departureFlightNo));
		Assert.assertTrue(SummaryPage.departure_Title().contains(Passenger.title));
		Assert.assertTrue(SummaryPage.departure_FirstName().contains(Passenger.firstname));
		Assert.assertTrue(SummaryPage.departure_LastName().contains(Passenger.lastname));
		Assert.assertTrue(SummaryPage.departure_SeatNo().contains(SeatsPage.departSeatNo));
		
		//return table
		Assert.assertTrue(SummaryPage.return_Date().contains(LandingPage.dateTo + "." + LandingPage.monthTo + "." + LandingPage.yearTo));
		Assert.assertTrue(SummaryPage.return_AirportFrom().contains(LandingPage.airportToName));
		Assert.assertTrue(SummaryPage.return_AirportTo().contains(LandingPage.airportFromName));
		Assert.assertTrue(SummaryPage.return_FlightNo().contains(FlightDetailPage.returnFlightNo));
		Assert.assertTrue(SummaryPage.return_Title().contains(Passenger.title));
		Assert.assertTrue(SummaryPage.return_FirstName().contains(Passenger.firstname));
		Assert.assertTrue(SummaryPage.return_LastName().contains(Passenger.lastname));
		Assert.assertTrue(SummaryPage.return_SeatNo().contains(SeatsPage.returnSeatNo));
		
		//My selection departure
		Assert.assertTrue(SummaryPage.selection_departure_Date().contains(LandingPage.dateFrom + "." + LandingPage.monthFrom + "." + LandingPage.yearFrom));
		Assert.assertTrue(SummaryPage.selection_departure_AirportFrom().contains(LandingPage.airportFromName));
		Assert.assertTrue(SummaryPage.selection_departure_AirportTo().contains(LandingPage.airportToName));
		Assert.assertTrue(SummaryPage.selection_departure_DepartureTime().contains(FlightDetailPage.departure_departureTime));
		Assert.assertTrue(SummaryPage.selection_departure_ArrivalTime().contains(FlightDetailPage.departure_arrivalTime));
		Assert.assertTrue(SummaryPage.selection_departure_FlightNo().contains(FlightDetailPage.departureFlightNo));
		Assert.assertTrue(SummaryPage.selection_departure_Title().contains(Passenger.title));
		Assert.assertTrue(SummaryPage.selection_departure_FirstName().contains(Passenger.firstname));
		Assert.assertTrue(SummaryPage.selection_departure_LastName().contains(Passenger.lastname));
		Assert.assertTrue(SummaryPage.selection_departure_SeatNo().contains(SeatsPage.departSeatNo));
		
		//My selection return
		Assert.assertTrue(SummaryPage.selection_return_Date().contains(LandingPage.dateTo + "." + LandingPage.monthTo + "." + LandingPage.yearTo));
		Assert.assertTrue(SummaryPage.selection_return_AirportFrom().contains(LandingPage.airportToName));
		Assert.assertTrue(SummaryPage.selection_return_AirportTo().contains(LandingPage.airportFromName));
		Assert.assertTrue(SummaryPage.selection_return_DepartureTime().contains(FlightDetailPage.return_departureTime));
		Assert.assertTrue(SummaryPage.selection_return_ArrivalTime().contains(FlightDetailPage.return_arrivalTime));
		Assert.assertTrue(SummaryPage.selection_return_FlightNo().contains(FlightDetailPage.returnFlightNo));
		Assert.assertTrue(SummaryPage.selection_return_Title().contains(Passenger.title));
		Assert.assertTrue(SummaryPage.selection_return_FirstName().contains(Passenger.firstname));
		Assert.assertTrue(SummaryPage.selection_return_LastName().contains(Passenger.lastname));
		Assert.assertTrue(SummaryPage.selection_return_SeatNo().contains(SeatsPage.returnSeatNo));
		
		//Price
		Assert.assertTrue(SummaryPage.totalPrice().contains(SummaryPage.cal_departurePrice_And_ReturnPrice()));
		Assert.assertTrue(SummaryPage.total_Per_Person().contains(SummaryPage.cal_departurePrice_And_ReturnPrice()));
		Assert.assertTrue(SummaryPage.total_Fee().contains(SummaryPage.cal_departurePrice_And_ReturnPrice()));
		
		
		
	}
}
