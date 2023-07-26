package StepDef;

import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class TaskMgmtStepdef {
	@BeforeAll
	public void setup() {
		System.out.println("Before all the scenarios");
	}
	@Before
	public void eachScenario() {
		System.out.println("Before each scenarios");
	}
	@BeforeStep
	public void eachStep() {
		System.out.println("Before each step");
	}
	
	
	@AfterAll
	public void teardown() {
		System.out.println("After all the scenarios");
	}
	
	@Given("User is logged in")
	public void user_is_logged_in() {
	    System.out.println("User is logged in");
	}
	
	@When("User create a task")
	public void user_create_a_task() {
	    System.out.println("User updated a task");
	}
	
	@When("User update a task")
	public void user_update_a_task() {
	    System.out.println("User updated a task");
	}
	@When("User delete a task")
	public void user_delete_a_task() {
		 System.out.println("User deleted a task");
	    
	}
	@When("User create a Deal")
	public void user_create_a_Deal() {
	    System.out.println("User created a Deal");
	}
	
	@When("User update a Deal")
	public void user_update_a_Deal() {
	    System.out.println("User updated a Deal");
	}
	@When("User delete a Deal")
	public void user_delete_a_Deal() {
		 System.out.println("User deleted a Deal");
	
}
	
	@When("User create a Contact")
	public void user_create_a_Contact() {
	    System.out.println("User created a Contact");
	}
	
	@When("User update a Contact")
	public void user_update_a_Contact() {
	    System.out.println("User updated a Contact");
	}
	@When("User delete a Contact")
	public void user_delete_a_Contact() {
		 System.out.println("User deleted a Contact");

}
}
