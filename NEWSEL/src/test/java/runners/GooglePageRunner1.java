package runners;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src\\test\\resources\\features\\"
    ,   glue = {"StepDef"} ,
		monochrome = true ,
		dryRun = false,
		plugin = {"pretty" , 
				"usage:target/reports/usageReport"  
				,"html:target/reports/HtmlReport.html"
				,"json:target/reports/JsonReport.json"
				,"testng:target/reports/TESTNGReport.xml",
		       "rerun:target/reports/failedScenarios.txt",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		}
		)



public class GooglePageRunner1 extends AbstractTestNGCucumberTests {
 
  
}
