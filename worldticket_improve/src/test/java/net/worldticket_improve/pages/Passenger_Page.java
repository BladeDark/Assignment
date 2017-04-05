package net.worldticket_improve.pages;


import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Passenger_Page extends PageObject {
	
	
	public String title;
	public String firstname;
	public String lastname;

	

	public void selectTitle(String value) {
		WebElementFacade element = find(By.xpath(".//*[@class='passenger_item passenger_item_select']/div/select"));
		element.selectByValue(value);

	}

	public void setFirstName(String value) {
		WebElementFacade element = find(By.xpath(".//div[@class='single_passenger_item']/div[2]/div/input"));
		element.sendKeys(value);

		
	}

	public void setLastName(String value) {
		WebElementFacade element = find(By.xpath(".//div[@class='single_passenger_item']/div[3]/div/input"));
		element.sendKeys(value);


	}

	// depart
	public String depart_getTitle() {
		WebElementFacade element = find(By.xpath("//div[@class='your_choice_item']/div/div[3]/div[4]/div[3]/span[1]"));
		title = element.getText();
		return element.getText();
	}

	public String depart_getFirstName() {
		WebElementFacade element = find(By.xpath("//div[@class='your_choice_item']/div/div[3]/div[4]/div[3]/span[3]"));
		firstname = element.getText();
		return element.getText();
		
	}

	public String depart_getLastName() {
		WebElementFacade element = find(By.xpath("//div[@class='your_choice_item']/div/div[3]/div[4]/div[3]/span[5]"));
		lastname = element.getText();
		return element.getText();
		
	}

	// return

	public String return_getTitle() {
		WebElementFacade element = find(By.xpath("//div[@class='your_choice_item is_to_item']/div/div[3]/div[4]/div[3]/span[1]"));

		return element.getText();
	
	}

	public String return_getFirstName() {
		WebElementFacade element = find(By.xpath("//div[@class='your_choice_item is_to_item']/div/div[3]/div[4]/div[3]/span[3]"));

		return element.getText();
		
	}

	public String return_getLastName() {
		WebElementFacade element = find(By.xpath("//div[@class='your_choice_item is_to_item']/div/div[3]/div[4]/div[3]/span[5]"));

		return element.getText();
	
	}
	
	public void clickNextbtn(){
		WebElementFacade element = find(By.xpath(".//button[text()='Next']"));
		element.click();
		
	}

}
