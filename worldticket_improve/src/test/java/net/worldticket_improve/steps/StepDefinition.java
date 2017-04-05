package net.worldticket_improve.steps;

import net.thucydides.core.annotations.Steps;
import net.worldticket_improve.method.Method;
import net.worldticket_improve.pages.*;

import org.junit.Assert;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	// Own method
	private Method method = new Method();

	// Page Object
	private static Landing_Page Landing_Page;
	private static FlightDetail_Page FlightDetail_Page;
	private static Passenger_Page Passenger_Page;
	private static Seats_Page Seats_Page;
	private static Summary_Page Summary_Page;

	// ---------- Landing Page----------
	@Given("I am on world ticket website")
	public void givenTheUserIsOnTheWikionaryHomePage() {
		Landing_Page.navigateToLandingPage();
	}

	@Given("^I check default language is Germany$")
	public void i_check_default_language_is_Germany() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(Landing_Page.getlblLanguage().contains("Deutsch"));

	}

	@When("^I change language to \"([^\"]*)\"$")
	public void i_change_language_to(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		if (arg1.equals("English")) {
			Landing_Page.changeLanguage("English");
		}

	}

	@Then("^I check Booking menu is \"([^\"]*)\"$")
	public void i_check_Booking_menu_is(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(Landing_Page.getlblBookingText().contains(arg1));
	}

	@Then("^I check Planing menu is \"([^\"]*)\"$")
	public void i_check_Planing_menu_is(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(Landing_Page.getlblPlanning().contains(arg1));

	}

	@Then("^I check Flying menu is \"([^\"]*)\"$")
	public void i_check_Flying_menu_is(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		Assert.assertTrue(Landing_Page.getlblFlying().contains(arg1));

	}

	@Then("^I check Travel guide menu is \"([^\"]*)\"$")
	public void i_check_Travel_guide_menu_is(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(Landing_Page.getlblTravelGuide().contains(arg1));

	}

	@When("^I click airport \"([^\"]*)\" field$")
	public void i_click_airport_field(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		if (arg1.equals("From")) {
			Landing_Page.clickAirportFrom();
		} else if (arg1.equals("To")) {
			Landing_Page.clickAirportTo();
		}
	}

	@And("^I select \"([^\"]*)\" country on Airport From$")
	public void i_select_country_airport_from(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		Landing_Page.selectCountry_AirportFrom(arg1);

	}

	@And("^I select \"([^\"]*)\" country on Airport To$")
	public void i_select_country_airport_to(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		Landing_Page.selectCountry_AirportTo(arg1);

	}

	@And("^I select \"([^\"]*)\" airport$")
	public void i_select_airport_airport_from(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		Landing_Page.selectAirport(arg1);

	}

	@Then("^I check \"([^\"]*)\" was applied in Airport From$")
	public void i_check_was_applied_in_Airport_From(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		if (arg1.equals("BRE")) {
			Assert.assertTrue(Landing_Page.getTextAirportFrom().contains("Bremen (BRE)"));

		}
	}

	@Then("^I check \"([^\"]*)\" was applied in Airport To$")
	public void i_check_was_applied_in_Airport_To(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		if (arg1.equals("PMI")) {
			Assert.assertTrue(Landing_Page.getTextAirportTo().contains("Palma de Mallorca (PMI)"));

		}
	}

	@When("^I check if not select item in left calendar$")
	public void i_check_if_not_select_item_in_left_calendar() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(Landing_Page.noSelectLeftCalendar());

	}

	@Then("^All item in right calendar must be inactive$")
	public void all_item_in_right_calendar_must_be_inactive() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(Landing_Page.noEnableRightCalendar());

	}

	@Then("^I click the button must not redirect browser$")
	public void i_click_the_button_must_not_redirect_browser() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Landing_Page.clickBookseatsButton();
		Assert.assertTrue(FlightDetail_Page.no_Display_btnPrevious());
	}

	@When("^I select date \"([^\"]*)\" in Date From$")
	public void i_select_date_in_Date_From(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Landing_Page.selectDateFrom(arg1);
	}

	@When("^I select date \"([^\"]*)\" in Date To$")
	public void i_select_date_in_Date_To(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Landing_Page.selectDateTo(arg1);
	}

	@When("^I click book seats button$")
	public void i_click_book_seats_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
		Landing_Page.getSelectedInformation();
		Landing_Page.clickBookseatsButton();
		
		
	
	}

	// ---------- Flight Detail Page----------

	@Then("^I check information on Flight Details Page$")
	public void i_check_information_on_Flight_Details_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		
		
		Assert.assertTrue(FlightDetail_Page.depart_Date().contains(Landing_Page.dayOfweekFrom + " "
				+ Landing_Page.dateFrom + " " + method.convertMonth(Landing_Page.monthFrom)));
		Assert.assertTrue(FlightDetail_Page.depart_FlightNo().contains("ST4570"));
		Assert.assertTrue(FlightDetail_Page.depart_AirportFrom().contains(Landing_Page.airportFromName));
		Assert.assertTrue(FlightDetail_Page.depart_AirportTo().contains(Landing_Page.airportToName));

		Assert.assertTrue(FlightDetail_Page.return_Date().contains(Landing_Page.dayOfweekTo + " " + Landing_Page.dateTo
				+ " " + method.convertMonth(Landing_Page.monthTo)));
		Assert.assertTrue(FlightDetail_Page.return_FlightNo().contains("ST4571"));
		
		

	}

	@Then("^I select \"([^\"]*)\"$")
	public void i_select_Departure(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		
		if (arg1.equals("Departure")) {
			FlightDetail_Page.selectDeparture();
		} else if (arg1.equals("Return")) {
			FlightDetail_Page.selectReturn();
		}
		
		

	}

	@Then("^I check information in \"([^\"]*)\"$")
	public void i_check_information_in_depart(String arg1) throws Throwable {
		
		
		
		if (arg1.equals("Departure")) {
			Assert.assertTrue(FlightDetail_Page.getDeparture_Date()
					.contains(Landing_Page.dateFrom + "." + Landing_Page.monthFrom + "." + Landing_Page.yearFrom));
			Assert.assertTrue(
					FlightDetail_Page.getDeparture_AirportFrom().contains(FlightDetail_Page.depart_AirportFrom()));
			Assert.assertTrue(
					FlightDetail_Page.getDeparture_AirportTo().contains(FlightDetail_Page.depart_AirportTo()));
			Assert.assertTrue(
					FlightDetail_Page.getDeparture_DepartureTime().contains(FlightDetail_Page.depart_departureTime()));
			Assert.assertTrue(
					FlightDetail_Page.getDeparture_ArrivalTime().contains(FlightDetail_Page.depart_ArrivalTime()));
			Assert.assertTrue(FlightDetail_Page.getDeparture_FlightNo().contains(FlightDetail_Page.depart_FlightNo()));

		} else if (arg1.equals("Return")) {
			Assert.assertTrue(FlightDetail_Page.getReturn_Date()
					.contains(Landing_Page.dateTo + "." + Landing_Page.monthTo + "." + Landing_Page.yearTo));
			Assert.assertTrue(
					FlightDetail_Page.getReturn_AirportFrom().contains(FlightDetail_Page.return_AirportFromText()));
			Assert.assertTrue(
					FlightDetail_Page.getReturn_AirportTo().contains(FlightDetail_Page.return_AirportToText()));
			Assert.assertTrue(
					FlightDetail_Page.getReturn_DepartureTime().contains(FlightDetail_Page.return_DepartureTime()));
			Assert.assertTrue(
					FlightDetail_Page.getReturn_ArrivalTime().contains(FlightDetail_Page.return_ArrivalTime()));
			Assert.assertTrue(FlightDetail_Page.getReturn_FlightNo().contains(FlightDetail_Page.return_FlightNo()));
		}

	}

	@When("^I click next button on Flight Details Page$")
	public void i_click_next_button_on_Flight_Details_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		FlightDetail_Page.clickNextbtn();
	}

	// ---------- Passenger Page----------
	@When("^I select \"([^\"]*)\" in Title$")
	public void i_select_in_Title(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Passenger_Page.selectTitle(arg1);
		Assert.assertTrue(Passenger_Page.depart_getTitle().contains(arg1));
		Assert.assertTrue(Passenger_Page.return_getTitle().contains(arg1));
	}

	@And("^I input \"([^\"]*)\" in First Name$")
	public void i_input_in_First_Name(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Passenger_Page.setFirstName(arg1);
		Assert.assertTrue(Passenger_Page.depart_getFirstName().contains(arg1));
		Assert.assertTrue(Passenger_Page.return_getFirstName().contains(arg1));
	}

	@And("^I input \"([^\"]*)\" in Last Name$")
	public void i_input_in_Last_Name(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Passenger_Page.setLastName(arg1);
		Assert.assertTrue(Passenger_Page.depart_getLastName().contains(arg1));
		Assert.assertTrue(Passenger_Page.return_getLastName().contains(arg1));
	}

	@Then("^I click next button on Passenger Page$")
	public void i_click_next_button_on_Passenger_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Passenger_Page.clickNextbtn();
	}

	// ---------- Seats Page----------

	@When("^I select any AISLE SEAT available in departure$")
	public void i_select_any_AISLE_SEAT_avaialbe_in_departure() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Seats_Page.selectDepartureSeat();
		Assert.assertTrue(Seats_Page.Departure_CheckSelectedSeat().contains(Seats_Page.departSeatNo));
	}

	@When("^I select any AISLE SEAT available in return$")
	public void i_select_any_AISLE_SEAT_avaialbe_in_return() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Seats_Page.selectReturnSeat();
		Assert.assertTrue(Seats_Page.Return_CheckSelectedSeat().contains(Seats_Page.returnSeatNo));
	}

	@Then("^I check seat display as selected$")
	public void i_check_seat_display_as_selected() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(Seats_Page.table_Departure_Seat().contains(Seats_Page.departSeatNo));
		Assert.assertTrue(Seats_Page.MySelection_departure_Seat().contains(Seats_Page.departSeatNo));

		Assert.assertTrue(Seats_Page.table_Return_Seat().contains(Seats_Page.returnSeatNo));
		Assert.assertTrue(Seats_Page.MySelection_return_Seat().contains(Seats_Page.returnSeatNo));
	}

	@Then("^I click next button on Seats Page$")
	public void i_click_next_button_on_Seats_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Seats_Page.clickNextButton();
	}

	// ---------- Summary Page----------
	@Then("^I check summary information must show as selected$")
	public void i_check_summary_information_must_show_as_selected() throws Throwable {
		// departure table
		Assert.assertTrue(Summary_Page.departure_Date()
				.contains(Landing_Page.dateFrom + "." + Landing_Page.monthFrom + "." + Landing_Page.yearFrom));
		Assert.assertTrue(Summary_Page.departure_AirportFrom().contains(Landing_Page.airportFromName));
		Assert.assertTrue(Summary_Page.departure_AirportTo().contains(Landing_Page.airportToName));
		Assert.assertTrue(Summary_Page.departure_FlightNo().contains(FlightDetail_Page.departureFlightNo));
		Assert.assertTrue(Summary_Page.departure_Title().contains(Passenger_Page.title));
		Assert.assertTrue(Summary_Page.departure_FirstName().contains(Passenger_Page.firstname));
		Assert.assertTrue(Summary_Page.departure_LastName().contains(Passenger_Page.lastname));
		Assert.assertTrue(Summary_Page.departure_SeatNo().contains(Seats_Page.departSeatNo));

		// return table
		Assert.assertTrue(Summary_Page.return_Date()
				.contains(Landing_Page.dateTo + "." + Landing_Page.monthTo + "." + Landing_Page.yearTo));
		Assert.assertTrue(Summary_Page.return_AirportFrom().contains(Landing_Page.airportToName));
		Assert.assertTrue(Summary_Page.return_AirportTo().contains(Landing_Page.airportFromName));
		Assert.assertTrue(Summary_Page.return_FlightNo().contains(FlightDetail_Page.returnFlightNo));
		Assert.assertTrue(Summary_Page.return_Title().contains(Passenger_Page.title));
		Assert.assertTrue(Summary_Page.return_FirstName().contains(Passenger_Page.firstname));
		Assert.assertTrue(Summary_Page.return_LastName().contains(Passenger_Page.lastname));
		Assert.assertTrue(Summary_Page.return_SeatNo().contains(Seats_Page.returnSeatNo));

		// My selection departure
		Assert.assertTrue(Summary_Page.selection_departure_Date()
				.contains(Landing_Page.dateFrom + "." + Landing_Page.monthFrom + "." + Landing_Page.yearFrom));
		Assert.assertTrue(Summary_Page.selection_departure_AirportFrom().contains(Landing_Page.airportFromName));
		Assert.assertTrue(Summary_Page.selection_departure_AirportTo().contains(Landing_Page.airportToName));
		Assert.assertTrue(
				Summary_Page.selection_departure_DepartureTime().contains(FlightDetail_Page.departure_departureTime));
		Assert.assertTrue(
				Summary_Page.selection_departure_ArrivalTime().contains(FlightDetail_Page.departure_arrivalTime));
		Assert.assertTrue(Summary_Page.selection_departure_FlightNo().contains(FlightDetail_Page.departureFlightNo));
		Assert.assertTrue(Summary_Page.selection_departure_Title().contains(Passenger_Page.title));
		Assert.assertTrue(Summary_Page.selection_departure_FirstName().contains(Passenger_Page.firstname));
		Assert.assertTrue(Summary_Page.selection_departure_LastName().contains(Passenger_Page.lastname));
		Assert.assertTrue(Summary_Page.selection_departure_SeatNo().contains(Seats_Page.departSeatNo));

		// My selection return
		Assert.assertTrue(Summary_Page.selection_return_Date()
				.contains(Landing_Page.dateTo + "." + Landing_Page.monthTo + "." + Landing_Page.yearTo));
		Assert.assertTrue(Summary_Page.selection_return_AirportFrom().contains(Landing_Page.airportToName));
		Assert.assertTrue(Summary_Page.selection_return_AirportTo().contains(Landing_Page.airportFromName));
		Assert.assertTrue(
				Summary_Page.selection_return_DepartureTime().contains(FlightDetail_Page.return_departureTime));
		Assert.assertTrue(Summary_Page.selection_return_ArrivalTime().contains(FlightDetail_Page.return_arrivalTime));
		Assert.assertTrue(Summary_Page.selection_return_FlightNo().contains(FlightDetail_Page.returnFlightNo));
		Assert.assertTrue(Summary_Page.selection_return_Title().contains(Passenger_Page.title));
		Assert.assertTrue(Summary_Page.selection_return_FirstName().contains(Passenger_Page.firstname));
		Assert.assertTrue(Summary_Page.selection_return_LastName().contains(Passenger_Page.lastname));
		Assert.assertTrue(Summary_Page.selection_return_SeatNo().contains(Seats_Page.returnSeatNo));

		// Price
		Assert.assertTrue(Summary_Page.totalPrice().contains(Summary_Page.cal_departurePrice_And_ReturnPrice()));
		Assert.assertTrue(Summary_Page.total_Per_Person().contains(Summary_Page.cal_departurePrice_And_ReturnPrice()));
		Assert.assertTrue(Summary_Page.total_Fee().contains(Summary_Page.cal_departurePrice_And_ReturnPrice()));

	}
}
