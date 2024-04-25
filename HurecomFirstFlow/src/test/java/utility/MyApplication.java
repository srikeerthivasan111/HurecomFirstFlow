package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyApplication extends Baseclass {

	public MyApplication() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@routerlinkactive='menu-active'])[3]")
	public WebElement myapplicationbt;
	
	 
	@FindBy(xpath = "//span[normalize-space()='Update Status']")
	public WebElement  updatestatusbt;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
