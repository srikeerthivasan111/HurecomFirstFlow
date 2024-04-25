package runnerHurecom;

import io.cucumber.testng.AbstractTestNGCucumberTests; 
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;



@CucumberOptions(features={"C:\\Hurecom\\HurecomFirstFlow\\src\\test\\resources\\features"},
                 dryRun =true,
                 glue= {"steps","hooks"},
                 snippets = SnippetType.CAMELCASE, 
                 monochrome = true, 
                 plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                		    "pretty","html:target/Hurecom-reports.html"},
                 tags="@Teams"  
                 
                 
                  )


public class RunnerClass extends AbstractTestNGCucumberTests {
	
	

}
