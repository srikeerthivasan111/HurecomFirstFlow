package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import utility.Baseclass;

public class Hooksjava extends Baseclass {

//	  @Before
//	 public void before() {
//		 browserlauncher();
//		 time();
//		 maximize();
//		 
//
//	}
	
	 
	@After
	public void after(Scenario scenario) throws InterruptedException {

		boolean failed = scenario.isFailed();

		TakesScreenshot tk = (TakesScreenshot) driver;
		byte[] screenshotAs = tk.getScreenshotAs(OutputType.BYTES);
		System.out.println("driver is complete");
		Thread.sleep(1000);
		scenario.attach(screenshotAs, "image/png", +System.currentTimeMillis() + " login details");
		
	 
	}
	
	
	
	

}
