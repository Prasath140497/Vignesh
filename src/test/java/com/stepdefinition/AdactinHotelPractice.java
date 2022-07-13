package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
public class AdactinHotelPractice {
	WebDriver driver;

	@Given("User Should on the Adactin Hotel Login page")
	public void method01() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();

	}
	@When("User Should Login {string} and {string}")
	public void method02 (String username, String password) {
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys(username);
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys(password);
	}

	@Then("User Should Click login")
	public void method03() {
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
	}
	@Then("User Should Search {string},{string},{string},{string},{string},{string},{string}and{string}")
	public void method04 (String Location, String Hotels, String RoomType, String  NumberofRooms, String CheckInDate, String CheckOutDate, String AdultsPerRoom, String ChildrenPerRoom) {
		WebElement location = driver.findElement(By.id("location"));
		location.sendKeys(Location);
		WebElement hotels = driver.findElement(By.id("hotels"));
		hotels.sendKeys(Hotels);
		WebElement roomType = driver.findElement(By.id("room_type"));
		roomType.sendKeys(RoomType);
		WebElement numberOfRooms = driver.findElement(By.id("room_nos"));
		numberOfRooms.sendKeys(NumberofRooms);
		WebElement checkInDate = driver.findElement(By.id("datepick_in"));
		checkInDate.sendKeys(CheckInDate);
		WebElement checkOutDate = driver.findElement(By.id("datepick_out"));
		checkOutDate.sendKeys(CheckOutDate);
		WebElement adultsPerRoom = driver.findElement(By.id("adult_room"));
		adultsPerRoom.sendKeys(AdultsPerRoom);
		WebElement childrenPerRoom = driver.findElement(By.id("adult_room"));
		childrenPerRoom.sendKeys(ChildrenPerRoom);		
	}
	@Then("User Should Click Search Button")
	public void method05() {
		WebElement submit = driver.findElement(By.id("Submit"));
		submit.click();
		driver.quit();
	}

}

