package StepDef;

import static org.testng.AssertJUnit.assertTrue;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;

import dev.failsafe.internal.util.Assert;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class LoginStepdef {
	WebDriver driver;
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts ().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://the-internet.herokuapp.com/login");
	    
	}

	@When("User enters login Credential")
	public void user_enters_login_credential() {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("tomsmith");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.className("fa fa-2x fa-sign-in")).click();
	}
	
	
	
	@When("User enters {string} and {string}")
	public void user_enters_and(String strUser, String strPwd) {
		driver.findElement(By.cssSelector("#username")).sendKeys(strUser);
		driver.findElement(By.id("password")).sendKeys(strPwd);
	     driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();
	}
	
	@When ("User enters login credentials")
	public void user_enters_login_credentials(DataTable dataTable) {
	List<Map<String , String>> users = dataTable.asMaps();
//	user1 - uname, pwd
//	user2  -  uname, pwd
	String strUser = users.get(0).get("username");
	String strPwd = users.get(0).get("password");
	driver.findElement(By.cssSelector("#username")).sendKeys(strUser);
	driver.findElement(By.id("password")).sendKeys(strPwd);
	driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();
	}

	@Then("Should display Home Page")
	public void should_display_home_page() {
	boolean isValidUser = driver.findElement(By.cssSelector("div.flash.success")).isDisplayed();
    AssertJUnit.assertTrue(isValidUser);
	}


}
