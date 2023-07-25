package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;

import com.aventstack.extentreports.gherkin.model.Scenario;
import com.mongodb.MapReduceCommand.OutputType;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import io.cucumber.java.Scenario;

public class GoogleStepdef {
	WebDriver driver;
	
	@Given("User launch google page")
	public void user_launch_google_page() {
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	    
	}
	@When("User search Java tutorial")
	public void user_search_java_tutorial() {
		
		WebElement schBox = driver.findElement(By.name("q"));
		schBox.sendKeys("Java Tutorial");
		schBox.submit();
	    
	}
	@Then("Should display Java result page")
	public void should_display_java_result_page() {
		AssertJUnit.assertEquals(driver.getTitle() , "Java Tutorial - Google Search");
	   
	}
	
	@When ("User search Selenium Tutorial")
	public void user_search_selenium_tutorial () {
	WebElement schBox = driver.findElement (By.name ("q")) ;
	schBox. sendKeys ("Selenium Tutorial");
	schBox.submit ();
	}
	  @Then("Should display Selenium result page")
	public void should_display_selenium_result_page() {
	Assert.assertEquals(driver.getTitle(), "Selenium Tutorial - Google Search");
	  }
	  
	  //@After
//	  public void attachScreenshot(Scenario scenario) {
//		  
//		  if(scenario.isFailed()) {
//		  TakesScreenshot screen = (TakesScreenshot)driver;
//		  byte[] imgByte = screen.getscreenshots(OutputType.BYTES);
//		 scenario.attach(imgByte,"image/png","ImageOne");
//       }
	  }

