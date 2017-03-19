package net.worldticket.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Passenger extends AbstractPage {
	
	private WebDriverWait wait = new WebDriverWait(this.driver, 15);


	
	public String title;
	public String firstname;
	public String lastname;

	public Passenger(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public Passenger selectTitle(String value) {
		Select select = new Select(
				driver.findElement(By.xpath(".//*[@class='passenger_item passenger_item_select']/div/select")));
		select.selectByValue(value);

		return PageFactory.initElements(driver, Passenger.class);
	}

	public Passenger setFirstName(String value) {
		WebElement element = driver.findElement(By.xpath(".//div[@class='single_passenger_item']/div[2]/div/input"));
		element.sendKeys(value);

		return PageFactory.initElements(driver, Passenger.class);
	}

	public Passenger setLastName(String value) {
		WebElement element = driver.findElement(By.xpath(".//div[@class='single_passenger_item']/div[3]/div/input"));
		element.sendKeys(value);

		return PageFactory.initElements(driver, Passenger.class);
	}

	// depart
	public String depart_getTitle() {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[@class='your_choice_item']/div/div[3]/div[4]/div[3]/span[1]")));
		title = element.getText();
		return element.getText();
	}

	public String depart_getFirstName() {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[@class='your_choice_item']/div/div[3]/div[4]/div[3]/span[3]")));
		firstname = element.getText();
		return element.getText();
		
	}

	public String depart_getLastName() {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[@class='your_choice_item']/div/div[3]/div[4]/div[3]/span[5]")));
		lastname = element.getText();
		return element.getText();
		
	}

	// return

	public String return_getTitle() {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[@class='your_choice_item is_to_item']/div/div[3]/div[4]/div[3]/span[1]")));

		return element.getText();
	
	}

	public String return_getFirstName() {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[@class='your_choice_item is_to_item']/div/div[3]/div[4]/div[3]/span[3]")));

		return element.getText();
		
	}

	public String return_getLastName() {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[@class='your_choice_item is_to_item']/div/div[3]/div[4]/div[3]/span[5]")));

		return element.getText();
	
	}
	
	public SeatsPage clickNextbtn(){
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(".//button[text()='Next']")));
		element.click();
		return PageFactory.initElements(driver, SeatsPage.class);
	}
	

}
