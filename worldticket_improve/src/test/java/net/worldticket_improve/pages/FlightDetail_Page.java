package net.worldticket_improve.pages;



import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.worldticket_improve.method.Method;

public class FlightDetail_Page extends PageObject {

	private Method method = new Method();

	public String departureFlightNo;
	public String returnFlightNo;
	public String departure_departureTime;
	public String departure_arrivalTime;
	public String return_departureTime;
	public String return_arrivalTime;

	public boolean no_Display_btnPrevious() {
		// boolean isDisplay =
		// isElementVisible(By.xpath("//button[text()='Previous']"));
		boolean isDisplay = isElementVisible(By.id("//button[text()='Previous']"));

		if (!isDisplay) {

			return true;

		} else {

			return false;
		}
	}

	// Departure table
	public String depart_Date() {
		WebElementFacade element = find(By.xpath(
				".//*[@id='container']/div/div[1]/table/tbody/tr[1]/td/table/tbody/tr/td[2]/div/table/tbody/tr/td/div"));
		return element.getText();

	}

	public String depart_FlightNo() {
		WebElementFacade element = find(By.xpath(
				".//*[@id='container']/div/div[1]/table/tbody/tr[2]/td/div/div/div/div/div/table/tbody/tr[2]/td[2]/div"));
		departureFlightNo = element.getText();
		return element.getText();
	}

	public String depart_AirportFrom() {
		WebElementFacade element = find(By.xpath(".//*[@id='container']/div/div[1]/div/div/div[2]/span[3]"));
		return element.getText();
	}

	public String depart_AirportTo() {
		WebElementFacade element = find(By.xpath(".//*[@id='container']/div/div[1]/div/div/div[4]/span[3]"));
		return element.getText();
	}

	public String depart_departureTime() {
		WebElementFacade element = find(By.xpath(
				".//*[@id='container']/div/div[1]/table/tbody/tr[2]/td/div/div/div/div/div/table/tbody/tr[2]/td[3]/div"));
		return element.getText();
	}

	public String depart_ArrivalTime() {
		WebElementFacade element = find(By.xpath(
				".//*[@id='container']/div/div[1]/table/tbody/tr[2]/td/div/div/div/div/div/table/tbody/tr[2]/td[4]/div"));
		return element.getText();
	}

	// Return table

	public String return_Date() {
		WebElementFacade element = find(By.xpath(
				".//*[@id='container']/div/div[2]/table/tbody/tr[1]/td/table/tbody/tr/td[2]/div/table/tbody/tr/td/div"));
		return element.getText();

	}

	public String return_FlightNo() {
		WebElementFacade element = find(By.xpath(
				".//*[@id='container']/div/div[2]/table/tbody/tr[2]/td/div/div/div/div/div/table/tbody/tr[2]/td[2]/div"));
		returnFlightNo = element.getText();
		return element.getText();

	}

	public String return_AirportFromText() {
		WebElementFacade element = find(By.xpath(".//*[@id='container']/div/div[2]/div/div/div[2]/span[3]"));
		return element.getText();
	}

	public String return_AirportToText() {
		WebElementFacade element = find(By.xpath(".//*[@id='container']/div/div[2]/div/div/div[4]/span[3]"));
		return element.getText();
	}

	public String return_DepartureTime() {
		WebElementFacade element = find(By.xpath(
				".//*[@id='container']/div/div[2]/table/tbody/tr[2]/td/div/div/div/div/div/table/tbody/tr[2]/td[3]/div"));
		return element.getText();
	}

	public String return_ArrivalTime() {
		WebElementFacade element = find(By.xpath(
				".//*[@id='container']/div/div[2]/table/tbody/tr[2]/td/div/div/div/div/div/table/tbody/tr[2]/td[4]/div"));
		return element.getText();
	}

	// Departure Selection

	public String getDeparture_Date() {
		WebElementFacade element = find(
				By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[2]/div/div[2]"));
		return element.getText();
	}

	public String getDeparture_AirportFrom() {
		WebElementFacade element = find(By.xpath(
				".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[2]/div/div[3]/div[1]/div[1]/span[3]"));
		return element.getText();
	}

	public String getDeparture_AirportTo() {
		WebElementFacade compareAirportTo = find(By.xpath(
				".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[2]/div/div[3]/div[1]/div[3]/span[3]"));
		return compareAirportTo.getText();
	}

	public String getDeparture_DepartureTime() {
		WebElementFacade element = find(By.xpath(
				".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[2]/div/div[3]/div[2]/div/span[1]"));
		departure_departureTime = element.getText();
		return element.getText();
	}

	public String getDeparture_ArrivalTime() {
		WebElementFacade element = find(By.xpath(
				".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[2]/div/div[3]/div[2]/div/span[3]"));
		departure_arrivalTime = element.getText();
		return element.getText();
	}

	public String getDeparture_FlightNo() {
		WebElementFacade element = find(
				By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[2]/div/div[3]/div[3]/div[2]"));
		return element.getText();
	}

	// Return Selection
	public String getReturn_Date() {
		WebElementFacade element = find(
				By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[3]/div/div[2]"));
		return element.getText();
	}

	public String getReturn_AirportFrom() {
		WebElementFacade element = find(By.xpath(
				".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[3]/div/div[3]/div[1]/div[1]/span[3]"));
		return element.getText();
	}

	public String getReturn_AirportTo() {
		WebElementFacade element = find(By.xpath(
				".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[3]/div/div[3]/div[1]/div[3]/span[3]"));
		return element.getText();
	}

	public String getReturn_DepartureTime() {
		WebElementFacade element = find(By.xpath(
				".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[3]/div/div[3]/div[2]/div/span[1]"));
		return_departureTime = element.getText();
		return element.getText();
	}

	public String getReturn_ArrivalTime() {
		WebElementFacade element = find(By.xpath(
				".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[3]/div/div[3]/div[2]/div/span[3]"));
		return_arrivalTime = element.getText();
		return element.getText();
	}

	public String getReturn_FlightNo() {
		WebElementFacade element = find(
				By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[3]/div/div[3]/div[3]/div[2]"));
		return element.getText();

	}

	
	public void selectDeparture() {

		method.jsClick((find(By.xpath(".//*[@id='container']/div/div[1]/table/tbody/tr[2]/td/div/div/div/div/div/table/tbody/tr[2]/td[1]/div/input"))),super.getDriver());

	}

	public void selectReturn() {

		method.jsClick((find(By.xpath(
				".//*[@id='container']/div/div[2]/table/tbody/tr[2]/td/div/div/div/div/div/table/tbody/tr[2]/td[1]/div/input"))),super.getDriver());

	}

	public void clickNextbtn() {
		WebElementFacade element = find(By.xpath(".//button[text()='Next']"));
		element.click();

	}

}
