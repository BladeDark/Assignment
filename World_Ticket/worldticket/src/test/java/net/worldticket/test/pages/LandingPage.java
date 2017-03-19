package net.worldticket.test.pages;

import java.text.ParseException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage extends AbstractPage {

	private WebDriverWait wait = new WebDriverWait(driver, 15);
	public String airportFromName;
	public String airportToName;
	public String dateFrom; //06
	public String dateTo; //10
	
	//use in method
	public String monthFrom;
	public String monthTo ;
	public String yearFrom ;
	public String yearTo ;
	
	//
	
	
	
	public String dayOfweekTo; //Ex.Thursday Friday
	public String dayOfweekFrom; //Ex.Thursday Friday

	public LandingPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public String getlblBookingText() {

		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(".//*[@class='site-nav site-nav--desk js-site-nav']/ul/li[1]/a/span")));
		return element.getText();

	}

	public String getlblPlanning() {

		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(".//*[@class='site-nav site-nav--desk js-site-nav']/ul/li[2]/a/span")));
		return element.getText();
	}

	public String getlblFlying() {

		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(".//*[@class='site-nav site-nav--desk js-site-nav']/ul/li[3]/a/span")));
		return element.getText();
	}

	public String getlblTravelGuide() {

		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(".//*[@class='site-nav site-nav--desk js-site-nav']/ul/li[4]/a/span")));
		return element.getText();
	}

	public String getlblLanguage() {

		WebElement element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='ddList-js-language__list']/a/label")));
		return element.getText();
		// return lblLanguage.getText();
	}

	public LandingPage changeLanguage(String language) {

		WebElement expandLangugage = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='ddList-js-language__list']/a")));
		expandLangugage.click();
		WebElement clicklanguage;

		if (language.equals("English")) {
			clicklanguage = wait.until(
					ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='language-sw']/ul/li[2]/a/label")));
			clicklanguage.click();
		}
		return PageFactory.initElements(driver, LandingPage.class);
	}

	public LandingPage clickAirportFrom() {
		WebElement element = driver.findElement(By.id("airportFromId"));
		element.click();
		return PageFactory.initElements(driver, LandingPage.class);
	}

	public LandingPage clickAirportTo() {
		WebElement element = driver.findElement(By.id("airportToId"));
		element.click();
		return PageFactory.initElements(driver, LandingPage.class);
	}

	public LandingPage selectAirport(String airport) {
		WebElement selectAirport;
		if (airport.equals("BRE")) {
			selectAirport = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[text()='Bremen (BRE)']")));
			selectAirport.click();
		} else if (airport.equals("PMI")) {
			selectAirport = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[text()='Palma de Mallorca (PMI)']")));
			selectAirport.click();
		}

		return PageFactory.initElements(driver, LandingPage.class);
	}

	public LandingPage selectCountry_AirportFrom(String country) {
		WebElement selectCountry;
		if (country.equals("Germany")) {
			selectCountry = wait.until(ExpectedConditions.elementToBeClickable(
					By.xpath(".//div[@class='layout layout_item countries']/div[1]//*[text()='Germany']")));
			selectCountry.click();
		} else if (country.equals("Spain")) {

			selectCountry = wait.until(ExpectedConditions.elementToBeClickable(
					By.xpath(".//div[@class='layout layout_item countries']/div[1]//*[text()='Spain']")));
			selectCountry.click();
		}

		return PageFactory.initElements(driver, LandingPage.class);
	}

	public LandingPage selectCountry_AirportTo(String country) {
		WebElement selectCountry;
		if (country.equals("Germany")) {
			selectCountry = wait.until(ExpectedConditions.elementToBeClickable(
					By.xpath(".//div[@class='layout layout_item countries']/div[2]//*[text()='Germany']")));
			selectCountry.click();
		} else if (country.equals("Spain")) {

			selectCountry = wait.until(ExpectedConditions.elementToBeClickable(
					By.xpath(".//div[@class='layout layout_item countries']/div[2]//*[text()='Spain']")));
			selectCountry.click();
		}

		return PageFactory.initElements(driver, LandingPage.class);
	}

	public String getTextAirportFrom() {
		WebElement element = driver.findElement(By.id("airportFromId"));

		return element.getAttribute("value");
	}

	public String getTextAirportTo() {
		WebElement element = driver.findElement(By.id("airportToId"));

		return element.getAttribute("value");
	}
	
	public String getTextDate() {
		WebElement element = driver.findElement(By.id("dateFromToId"));

		return element.getAttribute("value");
	}

	public boolean noSelectLeftCalendar() {

		Boolean leftBoardActiveDisplay = wait.until(ExpectedConditions.invisibilityOfElementLocated(
				By.xpath(".//*[@class='datepicker_container_border']//*[contains(@class,'active')]")));

		if (leftBoardActiveDisplay) {

			return true;

		} else {

			return false;
		}
	}

	public boolean noEnableRightCalendar() {

		int count;

		count = driver
				.findElements(
						By.xpath(".//*[@class='datepicker_container']/div/div/div/div[2]/div//*[@disabled='']/div"))
				.size();
		if (count == 42) {
			return true;
		} else {
			return false;
		}
	}
	
	public FlightDetailPage clickBookseatsButton(){
		WebElement element = driver.findElement(By.xpath(".//button[text()='Book seats']"));
		element.click();
		return PageFactory.initElements(driver, FlightDetailPage.class);
	}
	
	
	
	public LandingPage selectDateFrom(String value){
		List<WebElement> element;
		element = driver.findElements(By.xpath(".//*[@class='datepicker_container_border']/div/div/div/div[2]/div/div[*]/div[not(@disabled)]/*[text()='" + value +"']")); 
				
		element.get(0).click();			
		return PageFactory.initElements(driver, LandingPage.class);
	}
	
	public LandingPage selectDateTo(String value){
		
		List<WebElement> element;
		element = driver.findElements(By.xpath(".//*[@class='datepicker_container']/div/div/div/div[2]/div/div[*]/div[not(@disabled)]/*[text()='" + value +"']")); 
				
		
		
		try {
			element.get(0).click();	
	       
	    } catch (Exception e) {
	    	this.changeMonthRightBorder();
	    	element = null;
	    	element = driver.findElements(By.xpath(".//*[@class='datepicker_container']/div/div/div/div[2]/div/div[*]/div[not(@disabled)]/*[text()='" + value +"']")); 
	       this.changeMonthRightBorder();
	       element.get(0).click();	
	    }
		
		
		
		return PageFactory.initElements(driver, LandingPage.class);
	}
	
	
	public LandingPage changeMonthRightBorder(){
		WebElement expand = driver.findElement(By.xpath(".//div[@class='layout_item date_to']//span[@class='Select-arrow-zone']")); 
		expand.click();
		
		WebElement month = wait.until(
		ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@class='Select-menu-outer']/div/div[2]")));
		
		month.click();
				
		return PageFactory.initElements(driver, LandingPage.class);
	}
	
	public LandingPage getSelectedInformation() throws NumberFormatException, ParseException{
		//getdate
		dateFrom = this.getTextDate().substring(0, 2);
		dateTo = this.getTextDate().substring(11,13);
		monthFrom = this.getTextDate().substring(3, 5);
		monthTo = this.getTextDate().substring(14, 16);
		yearFrom = this.getTextDate().substring(6,8);
		yearTo = this.getTextDate().substring(17,19);
		
		//getAirport
		airportFromName = this.subStringAirport(this.getTextAirportFrom());
		airportToName = this.subStringAirport(this.getTextAirportTo());
		
		
		//getDayOfWeek
		dayOfweekFrom = this.getDayOfWeek(Integer.parseInt(yearFrom), Integer.parseInt(monthFrom), Integer.parseInt(dateFrom));
		dayOfweekTo = this.getDayOfWeek(Integer.parseInt(yearTo), Integer.parseInt(monthTo), Integer.parseInt(dateTo));
		
		
		
		
		
		return PageFactory.initElements(driver, LandingPage.class);
	}
	
	
	

}
