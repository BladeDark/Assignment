package net.worldticket.test.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeatsPage extends Passenger {

	private WebDriverWait wait = new WebDriverWait(this.driver, 15);
	
	public String departSeatNo;
	public String returnSeatNo;

	public SeatsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public SeatsPage selectDepartureSeat() {
		List<WebElement> departureSeat;

		departureSeat = driver.findElements(
				By.xpath(".//*[contains(@id,'fromSEAT')][contains(@class,'AISLE_SEAT Y AVAILABLE')]/a"));

		departureSeat.get(0).click();
		departSeatNo = departureSeat.get(0).getAttribute("class");

		return PageFactory.initElements(driver, SeatsPage.class);
	}

	public SeatsPage selectReturnSeat() {
		List<WebElement> returnSeat;

		returnSeat = driver.findElements(
				By.xpath(".//*[contains(@id,'toSEAT')][contains(@class,'AISLE_SEAT Y AVAILABLE')]/a"));
		
		 wait.until(ExpectedConditions.visibilityOfAllElements(returnSeat));
		 
		 this.jsClick(returnSeat.get(0));
		 
		//returnSeat.get(0).click();
		returnSeatNo = returnSeat.get(0).getAttribute("class");

		return PageFactory.initElements(driver, SeatsPage.class);
	}

	public String Departure_CheckSelectedSeat() {

		WebElement departureSeat;

		departureSeat = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(".//*[contains(@id,'fromSEAT')][contains(@class,'SELECTED')]/a")));
				
				
			

		return departureSeat.getAttribute("class");
	}

	public String Return_CheckSelectedSeat() {

		WebElement returnSeat;

		returnSeat = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(".//*[contains(@id,'toSEAT')][contains(@class,'SELECTED')]/a")));
				
			

		return returnSeat.getAttribute("class");
	}

	public String table_Departure_Seat() {
		WebElement seat;

		seat = driver.findElement(By.xpath(".//*[@id='main_flights_wrapper']/div[3]/div[1]/table/tbody/tr/td[2]"));

		return seat.getText();

	}

	public String MySelection_departure_Seat() {
		WebElement seat;

		seat = driver.findElement(
				By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[3]/div/div[3]/div[4]/div[4]"));

		return seat.getText();

	}

	public String table_Return_Seat() {
		WebElement seat;

		
		
		seat = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(".//*[@id='main_flights_wrapper']/div[3]/div[2]/table/tbody/tr/td[2]")));

		return seat.getText();

	}
	
	public String MySelection_return_Seat(){
		WebElement seat;

		
		
		seat = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[4]/div/div[3]/div[4]/div[4]")));
		
		return seat.getText();
		
	}
	
	public SummaryPage clickNextButton(){
		WebElement btnNext;
		btnNext = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(".//button[text()='Next']")));
		
		btnNext.click();
		
		return PageFactory.initElements(driver, SummaryPage.class);
	}

}
