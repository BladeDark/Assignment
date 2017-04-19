package net.worldticket_improve.pages;


import java.text.ParseException;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import java.util.List;
import net.worldticket_improve.method.*;


@DefaultUrl("https://ecom-gmi.worldticket.net/?___store=german&___from_store=default#/?_k=u0c3uk")
public class Landing_Page extends PageObject {
	
	private Method method = new Method();
	
	
	public String airportFromName;
	public String airportToName;
	public String dateFrom; //06
	public String dateTo; //10
	
	//use in method
	public String monthFrom;
	public String monthTo ;
	public String yearFrom ;
	public String yearTo ;
	
	
	public String dayOfweekTo; //Ex.Thursday Friday
	public String dayOfweekFrom; //Ex.Thursday Friday
	

	public void navigateToLandingPage() {
		this.open();

	}

	public String getlblBookingText() {

		WebElementFacade element = find(By.xpath(".//*[@class='site-nav site-nav--desk js-site-nav']/ul/li[1]/a/span"));
		return element.getText();
	}

	public String getlblPlanning() {

		WebElementFacade element = find(By.xpath(".//*[@class='site-nav site-nav--desk js-site-nav']/ul/li[2]/a/span"));

		return element.getText();

	}

	public String getlblFlying() {

		WebElementFacade element = find(By.xpath(".//*[@class='site-nav site-nav--desk js-site-nav']/ul/li[3]/a/span"));

		return element.getText();
	}

	public String getlblTravelGuide() {

		WebElementFacade element = find(By.xpath(".//*[@class='site-nav site-nav--desk js-site-nav']/ul/li[4]/a/span"));

		return element.getText();
	}

	public String getlblLanguage() {

		WebElementFacade element = find(By.xpath(".//*[@id='ddList-js-language__list']/a/label"));

		return element.getText();
		// return lblLanguage.getText();
	}

	public void changeLanguage(String language) {

		WebElementFacade expandLangugage = find(By.xpath(".//*[@id='ddList-js-language__list']/a"));
		expandLangugage.click();
		WebElementFacade clicklanguage;

		if (language.equals("English")) {
			clicklanguage = find(By.xpath(".//*[@id='language-sw']/ul/li[2]/a/label"));
			clicklanguage.waitUntilClickable().click();
		}

	}

	public void clickAirportFrom() {
		WebElementFacade element = find(By.id("airportFromId"));
		element.click();

	}

	public void clickAirportTo() {
		WebElementFacade element = find(By.id("airportToId"));
		element.click();
	}

	public void selectAirport(String airport) {
		WebElementFacade selectAirport;
		if (airport.equals("BRE")) {
			selectAirport = find(By.xpath(".//*[text()='Bremen (BRE)']"));
			selectAirport.waitUntilVisible().click();
		} else if (airport.equals("PMI")) {
			selectAirport = find(By.xpath(".//*[text()='Palma de Mallorca (PMI)']"));
			selectAirport.waitUntilVisible().click();
		}

	}

	public void selectCountry_AirportFrom(String country) {
		WebElementFacade selectCountry;
		if (country.equals("Germany")) {
			selectCountry = find(By.xpath(".//div[@class='layout layout_item countries']/div[1]//*[text()='Germany']"));
			selectCountry.waitUntilClickable().click();

		} else if (country.equals("Spain")) {

			selectCountry = find(By.xpath(".//div[@class='layout layout_item countries']/div[1]//*[text()='Spain']"));
			selectCountry.waitUntilClickable().click();

		}
	}

	public void selectCountry_AirportTo(String country) {
		WebElementFacade selectCountry;
		if (country.equals("Germany")) {
			selectCountry = find(By.xpath(".//div[@class='layout layout_item countries']/div[2]//*[text()='Germany']"));
			selectCountry.waitUntilClickable().click();
		} else if (country.equals("Spain")) {
			selectCountry = find(By.xpath(".//div[@class='layout layout_item countries']/div[2]//*[text()='Spain']"));
			selectCountry.waitUntilClickable().click();
		}
	}

	public String getTextAirportFrom() {
		WebElementFacade element = find(By.id("airportFromId"));

		return element.getAttribute("value");
	}

	public String getTextAirportTo() {
		WebElementFacade element = find(By.id("airportToId"));

		return element.getAttribute("value");
	}

	public String getTextDate() {
		WebElementFacade element = find(By.id("dateFromToId"));

		//return element.getAttribute("value");
		
		return element.getValue();

	}

	public boolean noSelectLeftCalendar() {

		Boolean leftBoardActiveDisplay = isElementVisible(
				By.xpath(".//*[@class='datepicker_container_border']//*[contains(@class,'active')]"));

		if (!leftBoardActiveDisplay) {

			return true;

		} else {

			return false;
		}
	}

	public boolean noEnableRightCalendar() {

		List<WebElementFacade> disableElement = findAll(
				".//*[@class='datepicker_container']/div/div/div/div[2]/div//*[@disabled='']/div");
		int count = disableElement.size();

		if (count == 42) {
			return true;
		} else {
			return false;
		}
	}

	public void clickBookseatsButton() {

		WebElementFacade element = find(By.xpath(".//button[text()='Book seats']"));
		element.click();

	}

	public void selectDateFrom(String value) {
		
		List<WebElementFacade> element = findAll(By.xpath(".//*[@class='datepicker_container_border']/div/div/div/div[2]/div/div[*]/div[not(@disabled)]/*[text()='"+ value + "']"));
		element.get(0).click();

	}

	public void selectDateTo(String value) {
		List<WebElementFacade> element = findAll(By
				.xpath(".//*[@class='datepicker_container']/div/div/div/div[2]/div/div[*]/div[not(@disabled)]/*[text()='"
						+ value + "']"));

		try {
			element.get(0).click();

		} catch (Exception e) {
			this.changeMonthRightBorder();
			element = null;
			element = find(By
					.xpath(".//*[@class='datepicker_container']/div/div/div/div[2]/div/div[*]/div[not(@disabled)]/*[text()='"
							+ value + "']"));
			element.get(0).click();
		}

	}

	public void changeMonthRightBorder() {
		WebElementFacade expand  = find(By.xpath(".//div[@class='layout_item date_to']//span[@class='Select-arrow-zone']"));
		expand.click();
		
		WebElementFacade month = find(By.xpath(".//div[@class='Select-menu-outer']/div/div[2]"));
		
		month.click();

	}
	
	public void getSelectedInformation() throws NumberFormatException, ParseException{
		//getdate
		dateFrom = this.getTextDate().substring(0, 2);
		dateTo = this.getTextDate().substring(11,13);
		monthFrom = this.getTextDate().substring(3, 5);
		monthTo = this.getTextDate().substring(14, 16);
		yearFrom = this.getTextDate().substring(6,8);
		yearTo = this.getTextDate().substring(17,19);
		
		//getAirport
		airportFromName = method.subStringAirport(this.getTextAirportFrom());
		airportToName = method.subStringAirport(this.getTextAirportTo());
		
		
		//getDayOfWeek
		dayOfweekFrom = method.getDayOfWeek(Integer.parseInt(yearFrom), Integer.parseInt(monthFrom), Integer.parseInt(dateFrom));
		dayOfweekTo = method.getDayOfWeek(Integer.parseInt(yearTo), Integer.parseInt(monthTo), Integer.parseInt(dateTo));
		
		
		
		

	}
	
	
	

	

}
