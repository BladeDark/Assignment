package net.worldticket.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightDetailPage extends AbstractPage {

	private WebDriverWait wait = new WebDriverWait(driver, 15);
	private Actions action = new Actions(driver);
	public String departureFlightNo;
	public String returnFlightNo;
	public String departure_departureTime;
	public String departure_arrivalTime;
	public String return_departureTime;
	public String return_arrivalTime;

	public FlightDetailPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// Departure table
	public String depart_Date() {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				".//*[@id='container']/div/div[1]/table/tbody/tr[1]/td/table/tbody/tr/td[2]/div/table/tbody/tr/td/div")));
		return element.getText();

	}

	public String depart_FlightNo() {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				".//*[@id='container']/div/div[1]/table/tbody/tr[2]/td/div/div/div/div/div/table/tbody/tr[2]/td[2]/div")));
		departureFlightNo = element.getText();
		return element.getText();
	}

	public String depart_AirportFrom() {
		WebElement element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='container']/div/div[1]/div/div/div[2]/span[3]")));
		return element.getText();
	}

	public String depart_AirportTo() {
		WebElement element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='container']/div/div[1]/div/div/div[4]/span[3]")));
		return element.getText();
	}

	public String depart_departureTime() {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				".//*[@id='container']/div/div[1]/table/tbody/tr[2]/td/div/div/div/div/div/table/tbody/tr[2]/td[3]/div")));
		return element.getText();
	}

	public String depart_ArrivalTime() {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				".//*[@id='container']/div/div[1]/table/tbody/tr[2]/td/div/div/div/div/div/table/tbody/tr[2]/td[4]/div")));
		return element.getText();
	}

	// Return table

	public String return_Date() {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				".//*[@id='container']/div/div[2]/table/tbody/tr[1]/td/table/tbody/tr/td[2]/div/table/tbody/tr/td/div")));
		return element.getText();

	}

	public String return_FlightNo() {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				".//*[@id='container']/div/div[2]/table/tbody/tr[2]/td/div/div/div/div/div/table/tbody/tr[2]/td[2]/div")));
		returnFlightNo = element.getText();
		return element.getText();

	}

	public String return_AirportFromText() {
		WebElement element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='container']/div/div[2]/div/div/div[2]/span[3]")));
		return element.getText();
	}

	public String return_AirportToText() {
		WebElement element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='container']/div/div[2]/div/div/div[4]/span[3]")));
		return element.getText();
	}

	public String return_DepartureTime() {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				".//*[@id='container']/div/div[2]/table/tbody/tr[2]/td/div/div/div/div/div/table/tbody/tr[2]/td[3]/div")));
		return element.getText();
	}

	public String return_ArrivalTime() {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				".//*[@id='container']/div/div[2]/table/tbody/tr[2]/td/div/div/div/div/div/table/tbody/tr[2]/td[4]/div")));
		return element.getText();
	}

	// Departure Selection

	public String getDeparture_Date() {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[2]/div/div[2]")));
		return element.getText();
	}

	public String getDeparture_AirportFrom() {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[2]/div/div[3]/div[1]/div[1]/span[3]")));
		return element.getText();
	}

	public String getDeparture_AirportTo() {
		WebElement compareAirportTo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[2]/div/div[3]/div[1]/div[3]/span[3]")));
		return compareAirportTo.getText();
	}

	public String getDeparture_DepartureTime() {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[2]/div/div[3]/div[2]/div/span[1]")));
		departure_departureTime = element.getText();
		return element.getText();
	}

	public String getDeparture_ArrivalTime() {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[2]/div/div[3]/div[2]/div/span[3]")));
		departure_arrivalTime = element.getText();
		return element.getText();
	}

	public String getDeparture_FlightNo() {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[2]/div/div[3]/div[3]/div[2]")));
		return element.getText();
	}

	// Return Selection
	public String getReturn_Date() {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[3]/div/div[2]")));
		return element.getText();
	}

	public String getReturn_AirportFrom() {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[3]/div/div[3]/div[1]/div[1]/span[3]")));
		return element.getText();
	}

	public String getReturn_AirportTo() {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[3]/div/div[3]/div[1]/div[3]/span[3]")));
		return element.getText();
	}

	public String getReturn_DepartureTime() {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[3]/div/div[3]/div[2]/div/span[1]")));
		return_departureTime = element.getText();
		return element.getText();
	}

	public String getReturn_ArrivalTime() {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[3]/div/div[3]/div[2]/div/span[3]")));
		return_arrivalTime = element.getText();
		return element.getText();
	}

	public String getReturn_FlightNo() {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[3]/div/div[3]/div[3]/div[2]")));
		return element.getText();

	}

	//

	public FlightDetailPage selectDeparture() {
		
		this.jsClick((driver.findElement(By.xpath(
				".//*[@id='container']/div/div[1]/table/tbody/tr[2]/td/div/div/div/div/div/table/tbody/tr[2]/td[1]/div/input"))));
		
		return PageFactory.initElements(driver, FlightDetailPage.class);

	}

	public FlightDetailPage selectReturn() {

		this.jsClick((driver.findElement(By.xpath(
				".//*[@id='container']/div/div[2]/table/tbody/tr[2]/td/div/div/div/div/div/table/tbody/tr[2]/td[1]/div/input"))));
		
		return PageFactory.initElements(driver, FlightDetailPage.class);
	}
	
	
	public Passenger clickNextbtn(){
		WebElement btnNext = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(".//button[text()='Next']")));
		btnNext.click();
		return PageFactory.initElements(driver, Passenger.class);
	}
}
