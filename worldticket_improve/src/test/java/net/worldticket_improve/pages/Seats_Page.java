package net.worldticket_improve.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindAll;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.worldticket_improve.method.Method;

public class Seats_Page extends PageObject{
	
	private Method method = new Method();
	
	public String departSeatNo;
	public String returnSeatNo;

	public void selectDepartureSeat() {
		List<WebElementFacade> departureSeat = findAll(
				By.xpath(".//*[contains(@id,'fromSEAT')][contains(@class,'AISLE_SEAT Y AVAILABLE')]/a"));

		departureSeat.get(0).click();
		departSeatNo = departureSeat.get(0).getAttribute("class");

		
	}

	public void selectReturnSeat() {
		List<WebElementFacade> returnSeat =findAll(By.xpath(".//*[contains(@id,'toSEAT')][contains(@class,'AISLE_SEAT Y AVAILABLE')]/a"));

		method.jsClick(returnSeat.get(0), super.getDriver());
		returnSeatNo = returnSeat.get(0).getAttribute("class");

	
	}

	public String Departure_CheckSelectedSeat() {

		WebElementFacade departureSeat;

		departureSeat = find(By.xpath(".//*[contains(@id,'fromSEAT')][contains(@class,'SELECTED')]/a"));
				
		return departureSeat.getAttribute("class");
	}

	public String Return_CheckSelectedSeat() {

		WebElementFacade returnSeat;

		returnSeat = find(By.xpath(".//*[contains(@id,'toSEAT')][contains(@class,'SELECTED')]/a"));
				
			

		return returnSeat.getAttribute("class");
	}

	public String table_Departure_Seat() {
		WebElementFacade seat;

		seat = find(By.xpath(".//*[@id='main_flights_wrapper']/div[3]/div[1]/table/tbody/tr/td[2]"));

		return seat.getText();

	}

	public String MySelection_departure_Seat() {
		WebElementFacade seat;

		seat = find(
				By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[3]/div/div[3]/div[4]/div[4]"));

		return seat.getText();

	}

	public String table_Return_Seat() {
		WebElementFacade seat;

		seat = find(By.xpath(".//*[@id='main_flights_wrapper']/div[3]/div[2]/table/tbody/tr/td[2]"));

		return seat.getText();

	}
	
	public String MySelection_return_Seat(){
		WebElementFacade seat;

		seat = find(By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[4]/div/div[3]/div[4]/div[4]"));
		
		return seat.getText();
		
	}
	
	public void clickNextButton(){
		WebElementFacade btnNext;
		btnNext = find(By.xpath(".//button[text()='Next']"));
		
		btnNext.click();
		
		
	}

}
