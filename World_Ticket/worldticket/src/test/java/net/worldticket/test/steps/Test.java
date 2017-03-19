package net.worldticket.test.steps;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.worldticket.test.pages.*;


public class Test {
	
	

	public static void main(String[] args) throws ParseException {
		/*LandingPage LandingPage;
		
		WebDriver driver = new ChromeDriver();
		LandingPage = new LandingPage(driver);
		LandingPage.naviateToWorldTicketWebApp();
		LandingPage.changeLanguage("English");
		LandingPage.clickAirportFrom();
		LandingPage.selectCountry_AirportFrom("Germany");
		LandingPage.selectAirport("BRE");
		LandingPage.selectCountry_AirportTo("Spain");
		LandingPage.selectAirport("PMI");
		LandingPage.noSelectLeftCalendar();
		LandingPage.noEnableRightCalendar();*/
		
		
		/*
		String text = "06.04.17 - 10.04.17";
		String dayFrom = text.substring(0, 2);
		System.out.println(dayFrom);
		String dayTo = text.substring(11,13);
		System.out.println(dayTo);
		
		//month
		String monthFrom = text.substring(3, 5);
		System.out.println(monthFrom);
		String monthTo = text.substring(14,16);
		System.out.println(monthTo);
		
		//year
		String yearFrom = text.substring(6, 8);
		System.out.println(yearFrom);
		String yearhTo = text.substring(17,19);
		
		System.out.println(yearhTo);
		
		
		
		int year = 17;
		int month = 03;
		int day = 18;
		
		String dateString = String.format("%d-%d-%d", year, month, day);
		Date date = new SimpleDateFormat("yy-M-d").parse(dateString);

		// Then get the day of week from the Date based on specific locale.
		String dayOfWeek = new SimpleDateFormat("E", Locale.ENGLISH).format(date);
		dayOfWeek = dayOfWeek.substring(0, 2) + ".";
		System.out.println(dayOfWeek); 
		*/
		
		String text1 = "20,00";
		String text2 = "20,00";
		text1 = text1.replaceAll(",",".");
		text2 = text2.replaceAll(",",".");
		
		float f_departure_price = Float.parseFloat(text1);
		float f_return_price = Float.parseFloat(text2);
		
		float sum = f_departure_price + f_return_price;
		
		String total = Float.toString(sum);
		
		total = total.replaceAll("[.]",",");
		
		System.out.println(total);
		
		
	}
	
	

}
