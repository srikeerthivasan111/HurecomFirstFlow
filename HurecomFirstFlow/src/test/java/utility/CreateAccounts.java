package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccounts extends Baseclass {
	
 


	public CreateAccounts(){
		
		PageFactory.initElements(driver , this); 
	}
	
	
	
	@FindBy(xpath="//a[@routerlink='/create-account']")
	public WebElement createacbutton;
		
	@FindBy(xpath=" //input[@type='text']")
	public WebElement name ;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	public WebElement email;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	public WebElement  mobilenumber;
	
	@FindBy(xpath="(//input[@type='text'])[4]")
	public WebElement companyname;
	
	
	@FindBy(xpath=" //p-dropdown[@placeholder='Select Country']//div[@aria-label='dropdown trigger']")
	public WebElement  countrydrop;
	
	@FindBy(xpath="//li[@aria-label='India']")
	public WebElement countryname;
	
	@FindBy(xpath="//p-dropdown[@placeholder='Select State']//div[@aria-label='dropdown trigger']")
	public WebElement statedrop;
	
	
	@FindBy(xpath="//li[@aria-label='Tamil Nadu']")
	public WebElement statename;
	
 	
	@FindBy(xpath="(//div[@role='button'])[3]")
	public WebElement citydrop;
	
	@FindBy(xpath="//li[@aria-label='Chennai']")
	public WebElement cityname;
	
	@FindBy(xpath="//input[@formcontrolname='branch']")
	public WebElement  branchname;
	
	@FindBy(xpath="//input[@formcontrolname='userName']")
	public WebElement username;
	
 	@FindBy(xpath="//input[@type='password']")
	public WebElement  password;
	
	@FindBy(xpath="//span[@class='p-button-label ng-star-inserted']")
	public WebElement createacbtsubmit;
   	 
	@FindBy(xpath="//button[@type='button']")
	public WebElement successokbt;
	
	 
	 
	
	

	public WebElement getCreateacbutton() {
		return createacbutton;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getMobilenumber() {
		return mobilenumber;
	}

	public WebElement getCompanyname() {
		return companyname;
	}

	public WebElement getCountrydrop() {
		return countrydrop;
	}

	public WebElement getCountryname() {
		return countryname;
	}

	public WebElement getStatedrop() {
		return statedrop;
	}

	public WebElement getStatename() {
		return statename;
	}

	public WebElement getCitydrop() {
		return citydrop;
	}

	public WebElement getCityname() {
		return cityname;
	}

	public WebElement getBranchname() {
		return branchname;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getCreateacbtsubmit() {
		return createacbtsubmit;
	}

	public WebElement getSuccessokbt() {
		return successokbt;
	}
 
	
	
	
	 
	
	
}
