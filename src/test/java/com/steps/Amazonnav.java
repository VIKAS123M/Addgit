package com.steps;


import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Amazonnav {

	WebDriver driver = new ChromeDriver();
	Logger log = Logger.getLogger(Amazonnav.class);
	
	@Given("the user navigates to the amazon url")
	public void homepage() {
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		log.info("Navigated to the url"+driver.getCurrentUrl());
	}
	@Then("types tv in the search bar")
	public void searchbar() {
		WebElement ele;
		ele = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		ele.click();
		ele.sendKeys("tv");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		log.info("The term tv is typed into the search bar and clicked on the search button");
	}
	@SuppressWarnings("deprecation")
	@Then("selects the high to low sort")
	public void sorting() {
		WebElement ele;
		ele = driver.findElement(By.xpath("//span[@id='a-autoid-0-announce']"));
		ele.click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='a-popover a-dropdown a-dropdown-common a-declarative']/div/div/ul/li[3]")).click();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		log.info("The high to low sort has been selected");
	}
	@And("selects the four star review")
	public void review() {
		WebElement ele;
		ele = driver.findElement(By.xpath("//div[@id='reviewsRefinements']/ul/li[1]"));
		ele.click();
		log.fatal("The customer review is not been selected");
	}
	@And("prints the name")
	public void printing() {
		WebElement ele;
		ele = driver.findElement(By.xpath("//div[@cel_widget_id='MAIN-SEARCH_RESULTS-2']/div/div/div/div[2]/div/div/div/h2/a/span"));
		System.out.println(ele.getText());
		log.info("The first search result name is printed on the console");
	}
	@Then("exits the driver")
	public void ending() {
		driver.quit();
		log.info("The driver is closed");
	}
}
