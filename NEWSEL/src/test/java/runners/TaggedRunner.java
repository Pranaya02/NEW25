package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
		features = "src\\test\\resources\\taggedfeature\\",
		   glue = {"StepDef"} ,
		monochrome = true ,
	//	tags= "@SmokeTest"
	//	tags = "@RegressionTest",
	//	tags = "@SmokeTest" and "@RegressionTest",
	//	tags = "@SmokeTest" or "@RegressionTest"
	//	tags = "@SmokeTest" and not "@RegressionTest"
	//	tags = "@PhaseTwo and @SmokeTest",
		tags = "@PhaseTwo"
)
public class TaggedRunner extends AbstractTestNGCucumberTests {
	 
	  
}



