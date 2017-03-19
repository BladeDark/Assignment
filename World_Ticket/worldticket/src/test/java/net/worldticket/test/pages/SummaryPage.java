package net.worldticket.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SummaryPage extends AbstractPage {
	
	private WebDriverWait wait = new WebDriverWait(driver, 15);

	public SummaryPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Departure
	public String departure_Date(){
		WebElement element;
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='main_flights_wrapper']/div[3]/div[1]/div/div[1]")));
		return element.getText();
	}
	
	public String departure_AirportFrom(){
		WebElement element;
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='main_flights_wrapper']/div[3]/div[1]/div/div[2]/span[1]/div[2]/span[3]")));
		return element.getText();
	}
	
	public String departure_AirportTo(){
		WebElement element;
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='main_flights_wrapper']/div[3]/div[1]/div/div[2]/span[1]/div[4]/span[3]")));
		return element.getText();
	}
	
	public String departure_FlightNo(){
		WebElement element;
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='main_flights_wrapper']/div[3]/div[1]/div/div[2]/span[2]")));
		return element.getText();
	}
	
	public String departure_Title(){
		WebElement element;
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='main_flights_wrapper']/div[3]/div[1]/div/div[5]/div[1]/span/span[1]")));
		return element.getText();
	}
	
	public String departure_FirstName(){
		WebElement element;
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='main_flights_wrapper']/div[3]/div[1]/div/div[5]/div[1]/span/span[3]")));
		return element.getText();
	}
	
	public String departure_LastName(){
		WebElement element;
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='main_flights_wrapper']/div[3]/div[1]/div/div[5]/div[1]/span/span[5]")));
		return element.getText();
	}
	
	public String departure_SeatNo(){
		WebElement element;
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='main_flights_wrapper']/div[3]/div[1]/div/div[5]/div[3]/span[3]")));
		return element.getText();
	}
	public String departure_price(){
		WebElement element;
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='main_flights_wrapper']/div[3]/div[1]/div/div[5]/div[4]/span[1]")));
		return element.getText();
	}
	
	

	
	
	//Return
	public String return_Date(){
		WebElement element;
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='main_flights_wrapper']/div[3]/div[2]/div/div[1]")));
		return element.getText();
	}
	
	public String return_AirportFrom(){
		WebElement element;
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='main_flights_wrapper']/div[3]/div[2]/div/div[2]/span[1]/div[2]/span[3]")));
		return element.getText();
	}
	
	public String return_AirportTo(){
		WebElement element;
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='main_flights_wrapper']/div[3]/div[2]/div/div[2]/span[1]/div[4]/span[3]")));
		return element.getText();
	}
	
	public String return_FlightNo(){
		WebElement element;
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='main_flights_wrapper']/div[3]/div[2]/div/div[2]/span[2]")));
		return element.getText();
	}
	
	public String return_Title(){
		WebElement element;
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='main_flights_wrapper']/div[3]/div[2]/div/div[5]/div[1]/span/span[1]")));
		return element.getText();
	}
	
	public String return_FirstName(){
		WebElement element;
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='main_flights_wrapper']/div[3]/div[2]/div/div[5]/div[1]/span/span[3]")));
		return element.getText();
	}
	
	public String return_LastName(){
		WebElement element;
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='main_flights_wrapper']/div[3]/div[2]/div/div[5]/div[1]/span/span[5]")));
		return element.getText();
	}
	
	public String return_SeatNo(){
		WebElement element;
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='main_flights_wrapper']/div[3]/div[2]/div/div[5]/div[3]/span[3]")));
		return element.getText();
	}
	public String return_price(){
		WebElement element;
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='main_flights_wrapper']/div[3]/div[2]/div/div[5]/div[4]/span[1]")));
		return element.getText();
	}
	
	
	//Departure Selection
	
	public String selection_departure_Date(){
		WebElement element;
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[3]/div/div[2]")));
		return element.getText();
	}
	
	public String selection_departure_AirportFrom(){
		WebElement element;
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[3]/div/div[3]/div[1]/div[1]/span[3]")));
		return element.getText();
	}
	
	public String selection_departure_AirportTo(){
		WebElement element;
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[3]/div/div[3]/div[1]/div[3]/span[3]")));
		return element.getText();
	}
	
	public String selection_departure_DepartureTime(){
		WebElement element;
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[3]/div/div[3]/div[2]/div/span[1]")));
		return element.getText();
	}
	
	public String selection_departure_ArrivalTime(){
		WebElement element;
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[3]/div/div[3]/div[2]/div/span[3]")));
		return element.getText();
	}
	
	public String selection_departure_FlightNo(){
		WebElement element;
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[3]/div/div[3]/div[3]/div[2]")));
		return element.getText();
	}
	
	public String selection_departure_Title(){
		WebElement element;
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[3]/div/div[3]/div[4]/div[3]/span[1]")));
		return element.getText();
	}
	
	public String selection_departure_FirstName(){
		WebElement element;
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[3]/div/div[3]/div[4]/div[3]/span[3]")));
		return element.getText();
	}
	
	public String selection_departure_LastName(){
		WebElement element;
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[3]/div/div[3]/div[4]/div[3]/span[5]")));
		return element.getText();
	}
	
	public String selection_departure_SeatNo(){
		WebElement element;
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[3]/div/div[3]/div[4]/div[4]")));
		return element.getText();
	}
	
	
	
	//My selection return
	
	public String selection_return_Date(){
		WebElement element;
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[4]/div/div[2]")));
		return element.getText();
	}
	
	public String selection_return_AirportFrom(){
		WebElement element;
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[4]/div/div[3]/div[1]/div[1]/span[3]")));
		return element.getText();
	}
	
	public String selection_return_AirportTo(){
		WebElement element;
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[4]/div/div[3]/div[1]/div[3]/span[3]")));
		return element.getText();
	}
	
	public String selection_return_DepartureTime(){
		WebElement element;
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[4]/div/div[3]/div[2]/div/span[1]")));
		return element.getText();
	}
	
	public String selection_return_ArrivalTime(){
		WebElement element;
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[4]/div/div[3]/div[2]/div/span[3]")));
		return element.getText();
	}
	
	public String selection_return_FlightNo(){
		WebElement element;
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[4]/div/div[3]/div[3]/div[2]")));
		return element.getText();
	}
	
	public String selection_return_Title(){
		WebElement element;
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[4]/div/div[3]/div[4]/div[3]/span[1]")));
		return element.getText();
	}
	
	public String selection_return_FirstName(){
		WebElement element;
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[4]/div/div[3]/div[4]/div[3]/span[3]")));
		return element.getText();
	}
	
	public String selection_return_LastName(){
		WebElement element;
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[4]/div/div[3]/div[4]/div[3]/span[5]")));
		return element.getText();
	}
	
	public String selection_return_SeatNo(){
		WebElement element;
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[4]/div/div[3]/div[4]/div[4]")));
		return element.getText();
	}
	
	
	//Price
	public String totalPrice(){
		WebElement element;
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='main_flights_wrapper']/div[3]/div[3]/div[2]/div[2]/span[1]")));
		return element.getText();
	}
	
	public String total_Per_Person(){
		WebElement element;
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[5]/div[2]/div[2]")));
		return element.getText();
	}
	
	public String total_Fee(){
		WebElement element;
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[5]/div[3]/div[2]")));
		return element.getText();
	}
	
	
	//Method
	public String cal_departurePrice_And_ReturnPrice(){
		String departure_price = this.departure_price();
		String return_price = this.return_price();
		
		
		departure_price = departure_price.replaceAll(",",".");
		return_price = return_price.replaceAll(",",".");
		
		float summation = Float.parseFloat(departure_price) + Float.parseFloat(return_price)  ;
		String total = Float.toString(summation);
		total = total.replaceAll("[.]",",");	
		return total;
		
	}

}
