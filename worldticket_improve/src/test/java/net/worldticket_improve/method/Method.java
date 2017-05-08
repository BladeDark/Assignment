package net.worldticket_improve.method;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Method  {
	
	public String getDayOfWeek(int year, int month, int day) throws ParseException {

		String dateString = String.format("%d-%d-%d", year, month, day);
		Date date = new SimpleDateFormat("yy-M-d").parse(dateString);
		String dayOfWeek = new SimpleDateFormat("E", Locale.ENGLISH).format(date);
		dayOfWeek = dayOfWeek.substring(0, 2) + ".";
		return dayOfWeek;
	}

	public String convertMonth(String month) {

		if (month.equals("01")) {
			month = "Jan";
		} else if (month.equals("02")) {
			month = "Feb";
		} else if (month.equals("03")) {
			month = "Mar";
		} else if (month.equals("04")) {
			month = "Apr";
		} else if (month.equals("05")) {
			month = "May";
		} else if (month.equals("06")) {
			month = "Jun";
		} else if (month.equals("07")) {
			month = "Jul";
		} else if (month.equals("08")) {
			month = "Aug";
		} else if (month.equals("09")) {
			month = "Sep";
		} else if (month.equals("10")) {
			month = "Oct";
		} else if (month.equals("11")) {
			month = "Nov";
		} else if (month.equals("12")) {
			month = "Dec";
		}
		return month;

	}

	public String subStringAirport(String airport) {
		airport = airport.substring(airport.indexOf("(") + 1);
		airport = airport.substring(0, 3);

		return airport;
	}

	
	//click hidden element
	public void jsClick(WebElementFacade element,WebDriver driver) {
		  ((JavascriptExecutor) driver).executeScript("return arguments[0].click();", element);
		}
	
	public void maximizeBrowser(WebDriver driver){
		driver.manage().window().maximize();
	}

}
