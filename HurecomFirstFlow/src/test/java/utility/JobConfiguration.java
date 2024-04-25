package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobConfiguration extends Baseclass {

	public JobConfiguration() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//input[@type='text'])[3]")
	public WebElement Client_Name;

	@FindBy(xpath = "(//div[@aria-label='dropdown trigger'])[2]")
	public WebElement Client_Status_DropdownBt;

	@FindBy(xpath = "//li[@role='option']")
	public WebElement Active_Status_Create_Client;

	@FindBy(xpath = "(//li[@role='option'])[2]")
	public WebElement InActive_CreateCliet_Status;

	@FindBy(xpath = "//p-button[@label='Create']")
	public WebElement CreateBt_CreateClient;

	@FindBy(xpath = "(//p-button[@label='Reset'])[2]")
	public WebElement ResetBt_CreateClient;

	@FindBy(xpath = "//div[text()='Client created successfully.']")
	public WebElement CreateClient_Success_Message;

	@FindBy(xpath = "//p-button[@label='Create Location']")
	public WebElement ClientLocation_bt;

	@FindBy(xpath = "(//div[@class='p-dropdown-trigger'])[4]")
	public WebElement Client_Location_Country_Dropdown_bt;

	@FindBy(xpath = "//li[@role='option']")
	public WebElement India_Option;

	@FindBy(xpath = "(//div[@class='p-dropdown-trigger'])[5]")
	public WebElement Cient_Location_State_Dropdown_BT;

	@FindBy(xpath = "(//li[@role='option'])[27]")
	public WebElement Tamilnadu_Option;

	@FindBy(xpath = "(//div[@class='p-dropdown-trigger'])[6]")
	public WebElement Client_Location_City_DropdownBt;

	@FindBy(xpath = "(//li[@role='option'])[1]")
	public WebElement Chennai_location_option;

	@FindBy(xpath = "//input[@formcontrolname='branch']")
	public WebElement Client_Location_BranchName;

	@FindBy(xpath = "(//div[@class='p-dropdown-trigger'])[7]")
	public WebElement Cient_Location_Dropdown_Bt;

	@FindBy(xpath = "//li[@role='option']")
	public WebElement Client_location_Active_Option;

	@FindBy(xpath = "(//li[@role='option'])[2]")
	public WebElement Client_location_InActive_Option;

	@FindBy(xpath = " //p-button[@label='Create']")
	public WebElement CientLocation_Create_Bt;

	@FindBy(xpath = "//p-button[@label='Reset']")
	public WebElement CientLocation_Reset_Bt;

	@FindBy(xpath = "(//a[@role='tab'])[2]")
	public WebElement Client_spoc_MenuBt;
	@FindBy(xpath = " //p-button[@label='Create SPOC']")
	public WebElement Create_SpocBT;

	@FindBy(xpath = "(//input[@formcontrolname='name'])[2]")
	public WebElement Client_Spoc_Name;
	
	
	@FindBy(xpath = "//input[@formcontrolname='email']")
	public WebElement Client_Spoc_email;
	
	@FindBy(xpath = "//input[@formcontrolname='mobileNumber']")
	public WebElement Client_Spoc_MobileNumber;
	
	@FindBy(xpath = "(//div[@aria-label='dropdown trigger'])[4]")
	public WebElement Client_Spoc_Status_dropdown_bt;
	
	@FindBy(xpath = "//li[@role='option']")
	public WebElement Client_Spoc_Status_Active_Options;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
