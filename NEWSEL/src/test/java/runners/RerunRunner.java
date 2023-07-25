package runners;


	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(
			features = "@target/reports/failedScenarios.txt"
	    ,   glue = {"StepDef"} ,
			monochrome = true 
)
public class RerunRunner extends AbstractTestNGCucumberTests {
	 
	  
}


