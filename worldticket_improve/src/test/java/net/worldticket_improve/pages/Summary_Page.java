package net.worldticket_improve.pages;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Summary_Page extends PageObject{
	
	//Departure
		public String departure_Date(){
			WebElementFacade element;
			element = find(By.xpath(".//*[@id='main_flights_wrapper']/div[3]/div[1]/div/div[1]"));
			return element.getText();
		}
		
		public String departure_AirportFrom(){
			WebElementFacade element;
			element = find(By.xpath(".//*[@id='main_flights_wrapper']/div[3]/div[1]/div/div[2]/span[1]/div[2]/span[3]"));
			return element.getText();
		}
		
		public String departure_AirportTo(){
			WebElementFacade element;
			element = find(By.xpath(".//*[@id='main_flights_wrapper']/div[3]/div[1]/div/div[2]/span[1]/div[4]/span[3]"));
			return element.getText();
		}
		
		public String departure_FlightNo(){
			WebElementFacade element;
			element = find(By.xpath(".//*[@id='main_flights_wrapper']/div[3]/div[1]/div/div[2]/span[2]"));
			return element.getText();
		}
		
		public String departure_Title(){
			WebElementFacade element;
			element = find(By.xpath(".//*[@id='main_flights_wrapper']/div[3]/div[1]/div/div[5]/div[1]/span/span[1]"));
			return element.getText();
		}
		
		public String departure_FirstName(){
			WebElementFacade element;
			element = find(By.xpath(".//*[@id='main_flights_wrapper']/div[3]/div[1]/div/div[5]/div[1]/span/span[3]"));
			return element.getText();
		}
		
		public String departure_LastName(){
			WebElementFacade element;
			element = find(By.xpath(".//*[@id='main_flights_wrapper']/div[3]/div[1]/div/div[5]/div[1]/span/span[5]"));
			return element.getText();
		}
		
		public String departure_SeatNo(){
			WebElementFacade element;
			element = find(By.xpath(".//*[@id='main_flights_wrapper']/div[3]/div[1]/div/div[5]/div[3]/span[3]"));
			return element.getText();
		}
		public String departure_price(){
			WebElementFacade element;
			element = find(By.xpath(".//*[@id='main_flights_wrapper']/div[3]/div[1]/div/div[5]/div[4]/span[1]"));
			return element.getText();
		}
		
		

		
		
		//Return
		public String return_Date(){
			WebElementFacade element;
			element = find(By.xpath(".//*[@id='main_flights_wrapper']/div[3]/div[2]/div/div[1]"));
			return element.getText();
		}
		
		public String return_AirportFrom(){
			WebElementFacade element;
			element = find(By.xpath(".//*[@id='main_flights_wrapper']/div[3]/div[2]/div/div[2]/span[1]/div[2]/span[3]"));
			return element.getText();
		}
		
		public String return_AirportTo(){
			WebElementFacade element;
			element = find(By.xpath(".//*[@id='main_flights_wrapper']/div[3]/div[2]/div/div[2]/span[1]/div[4]/span[3]"));
			return element.getText();
		}
		
		public String return_FlightNo(){
			WebElementFacade element;
			element = find(By.xpath(".//*[@id='main_flights_wrapper']/div[3]/div[2]/div/div[2]/span[2]"));
			return element.getText();
		}
		
		public String return_Title(){
			WebElementFacade element;
			element = find(By.xpath(".//*[@id='main_flights_wrapper']/div[3]/div[2]/div/div[5]/div[1]/span/span[1]"));
			return element.getText();
		}
		
		public String return_FirstName(){
			WebElementFacade element;
			element = find(By.xpath(".//*[@id='main_flights_wrapper']/div[3]/div[2]/div/div[5]/div[1]/span/span[3]"));
			return element.getText();
		}
		
		public String return_LastName(){
			WebElementFacade element;
			element = find(By.xpath(".//*[@id='main_flights_wrapper']/div[3]/div[2]/div/div[5]/div[1]/span/span[5]"));
			return element.getText();
		}
		
		public String return_SeatNo(){
			WebElementFacade element;
			element = find(By.xpath(".//*[@id='main_flights_wrapper']/div[3]/div[2]/div/div[5]/div[3]/span[3]"));
			return element.getText();
		}
		public String return_price(){
			WebElementFacade element;
			element = find(By.xpath(".//*[@id='main_flights_wrapper']/div[3]/div[2]/div/div[5]/div[4]/span[1]"));
			return element.getText();
		}
		
		
		//Departure Selection
		
		public String selection_departure_Date(){
			WebElementFacade element;
			element = find(By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[3]/div/div[2]"));
			return element.getText();
		}
		
		public String selection_departure_AirportFrom(){
			WebElementFacade element;
			element = find(By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[3]/div/div[3]/div[1]/div[1]/span[3]"));
			return element.getText();
		}
		
		public String selection_departure_AirportTo(){
			WebElementFacade element;
			element = find(By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[3]/div/div[3]/div[1]/div[3]/span[3]"));
			return element.getText();
		}
		
		public String selection_departure_DepartureTime(){
			WebElementFacade element;
			element = find(By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[3]/div/div[3]/div[2]/div/span[1]"));
			return element.getText();
		}
		
		public String selection_departure_ArrivalTime(){
			WebElementFacade element;
			element = find(By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[3]/div/div[3]/div[2]/div/span[3]"));
			return element.getText();
		}
		
		public String selection_departure_FlightNo(){
			WebElementFacade element;
			element = find(By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[3]/div/div[3]/div[3]/div[2]"));
			return element.getText();
		}
		
		public String selection_departure_Title(){
			WebElementFacade element;
			element = find(By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[3]/div/div[3]/div[4]/div[3]/span[1]"));
			return element.getText();
		}
		
		public String selection_departure_FirstName(){
			WebElementFacade element;
			element = find(By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[3]/div/div[3]/div[4]/div[3]/span[3]"));
			return element.getText();
		}
		
		public String selection_departure_LastName(){
			WebElementFacade element;
			element = find(By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[3]/div/div[3]/div[4]/div[3]/span[5]"));
			return element.getText();
		}
		
		public String selection_departure_SeatNo(){
			WebElementFacade element;
			element = find(By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[3]/div/div[3]/div[4]/div[4]"));
			return element.getText();
		}
		
		
		
		//My selection return
		
		public String selection_return_Date(){
			WebElementFacade element;
			element = find(By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[4]/div/div[2]"));
			return element.getText();
		}
		
		public String selection_return_AirportFrom(){
			WebElementFacade element;
			element = find(By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[4]/div/div[3]/div[1]/div[1]/span[3]"));
			return element.getText();
		}
		
		public String selection_return_AirportTo(){
			WebElementFacade element;
			element = find(By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[4]/div/div[3]/div[1]/div[3]/span[3]"));
			return element.getText();
		}
		
		public String selection_return_DepartureTime(){
			WebElementFacade element;
			element = find(By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[4]/div/div[3]/div[2]/div/span[1]"));
			return element.getText();
		}
		
		public String selection_return_ArrivalTime(){
			WebElementFacade element;
			element = find(By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[4]/div/div[3]/div[2]/div/span[3]"));
			return element.getText();
		}
		
		public String selection_return_FlightNo(){
			WebElementFacade element;
			element = find(By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[4]/div/div[3]/div[3]/div[2]"));
			return element.getText();
		}
		
		public String selection_return_Title(){
			WebElementFacade element;
			element = find(By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[4]/div/div[3]/div[4]/div[3]/span[1]"));
			return element.getText();
		}
		
		public String selection_return_FirstName(){
			WebElementFacade element;
			element = find(By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[4]/div/div[3]/div[4]/div[3]/span[3]"));
			return element.getText();
		}
		
		public String selection_return_LastName(){
			WebElementFacade element;
			element = find(By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[4]/div/div[3]/div[4]/div[3]/span[5]"));
			return element.getText();
		}
		
		public String selection_return_SeatNo(){
			WebElementFacade element;
			element = find(By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[4]/div/div[3]/div[4]/div[4]"));
			return element.getText();
		}
		
		
		//Price
		public String totalPrice(){
			WebElementFacade element;
			element = find(By.xpath(".//*[@id='main_flights_wrapper']/div[3]/div[3]/div[2]/div[2]/span[1]"));
			return element.getText();
		}
		
		public String total_Per_Person(){
			WebElementFacade element;
			element = find(By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[5]/div[2]/div[2]"));
			return element.getText();
		}
		
		public String total_Fee(){
			WebElementFacade element;
			element = find(By.xpath(".//*[@id='main_flights_wrapper']/div[2]/div/ul/li/div/div/div[5]/div[3]/div[2]"));
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
