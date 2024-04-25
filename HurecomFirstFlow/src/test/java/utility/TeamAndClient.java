package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TeamAndClient extends Baseclass {

	public TeamAndClient() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//li[@ptooltip='Teams']")
	public WebElement Teams_Menu_BT;

	@FindBy(xpath = "//a[@role='presentation']")
	public WebElement Users_Menu;

	@FindBy(xpath = "(//a[@role='presentation'])[2]")
	public WebElement Teams_Menu_Bar;

	@FindBy(xpath = "//p-button[@label='Create User']")
	public WebElement Create_UserBt;

	@FindBy(xpath = " //input[@formcontrolname='name']")
	public WebElement User_name;

	@FindBy(xpath = " //input[@formcontrolname='mobileNumber']")
	public WebElement User_MobileNuber;

	@FindBy(xpath = " //input[@formcontrolname='email']")
	public WebElement User_Email;

	@FindBy(xpath = " //input[@formcontrolname='userName']")
	public WebElement User_UserName;

	@FindBy(xpath = " //input[@type='password']")
	public WebElement User_Password;

	@FindBy(xpath = "//div[@aria-label='dropdown trigger']")
	public WebElement Role_Dropdown_Bt;

	@FindBy(xpath = "(//div[@aria-label='dropdown trigger'])[2]")
	public WebElement Organization_Dropdown_Bt;

	@FindBy(xpath = "(//div[@aria-label='dropdown trigger'])[3]")
	public WebElement Organization_Locaiton_dropdown_Bt;

	@FindBy(xpath = "(//div[@aria-label='dropdown trigger'])[4]")
	public WebElement Status_Dropdown_Bt;

	@FindBy(xpath = "//li[@role='option']")
	public WebElement Admin_option;

	@FindBy(xpath = "(//li[@role='option'])[2]")
	public WebElement Manager_Option;

	@FindBy(xpath = "(//li[@role='option'])[3]")
	public WebElement Lead_Option;

	@FindBy(xpath = "(//li[@role='option'])[4]")
	public WebElement Associate_Option;

	@FindBy(xpath = "(//li[@role='option'])[5]")
	public WebElement QualityAnalyst_Option;

	@FindBy(xpath = "//p-button[@ng-reflect-label='Create']//button")
	public WebElement Create_Bt;

	@FindBy(xpath = "//p-button[@label='Reset']")
	public WebElement Reset_Bt;

	@FindBy(xpath = "//p-button[@ng-reflect-label='Update']//button")
	public WebElement Update_Bt;

	@FindBy(xpath = "//p-button[@ng-reflect-label='Update']//button")
	public WebElement Create_Team_Bt;

	@FindBy(xpath = "//input[@formcontrolname='code']")
	public WebElement Team_Code;

	@FindBy(xpath = "//input[@formcontrolname='name']")
	public WebElement Team_name;

	@FindBy(xpath = "(//div[@class='p-dropdown-trigger'])[2]")
	public WebElement Create_Team_Status;

	@FindBy(xpath = " //p-button[@label='Create']")
	public WebElement CreateBt_CreatingTeam;

	@FindBy(xpath = " //p-button[@label='Reset']")
	public WebElement ResetBt_ResetTeams;

	@FindBy(xpath = "//button[@class='ng-tns-c6-18 p-dialog-header-icon p-dialog-header-maximize p-link ng-star-inserted']")
	public WebElement Exit_Bt_Creating_Teams;

	@FindBy(xpath = "//p-button[@label='Add Members']")
	public WebElement Add_MembersBt;

	@FindBy(xpath = "//div[@class='p-multiselect-trigger']")
	public WebElement Add_Members_Organization_dropdownBt;

	@FindBy(xpath = "(//div[@class='p-multiselect-trigger'])[2]")
	public WebElement Add_Members_OrganizationLocation_dropdownBt;

	@FindBy(xpath = "//p-button[@label='Ok']")
	public WebElement Popup_Ok_Bt;

	@FindBy(xpath = "//div[@class='message']")
	public WebElement Popup_Text_messages;
	
	

	public WebElement getPopup_Ok_Bt() {
		return Popup_Ok_Bt;
	}

	public WebElement getPopup_Text_messages() {
		return Popup_Text_messages;
	}

	public WebElement getTeams_Menu_BT() {
		return Teams_Menu_BT;
	}

	public WebElement getUsers_Menu() {
		return Users_Menu;
	}

	public WebElement getTeams_Menu_Bar() {
		return Teams_Menu_Bar;
	}

	public WebElement getCreate_UserBt() {
		return Create_UserBt;
	}

	public WebElement getUser_name() {
		return User_name;
	}

	public WebElement getUser_MobileNuber() {
		return User_MobileNuber;
	}

	public WebElement getUser_Email() {
		return User_Email;
	}

	public WebElement getUser_UserName() {
		return User_UserName;
	}

	public WebElement getUser_Password() {
		return User_Password;
	}

	public WebElement getRole_Dropdown_Bt() {
		return Role_Dropdown_Bt;
	}

	public WebElement getOrganization_Dropdown_Bt() {
		return Organization_Dropdown_Bt;
	}

	public WebElement getOrganization_Locaiton_dropdown_Bt() {
		return Organization_Locaiton_dropdown_Bt;
	}

	public WebElement getStatus_Dropdown_Bt() {
		return Status_Dropdown_Bt;
	}

	public WebElement getAdmin_option() {
		return Admin_option;
	}

	public WebElement getManager_Option() {
		return Manager_Option;
	}

	public WebElement getLead_Option() {
		return Lead_Option;
	}

	public WebElement getAssociate_Option() {
		return Associate_Option;
	}

	public WebElement getQualityAnalyst_Option() {
		return QualityAnalyst_Option;
	}

	public WebElement getCreate_Bt() {
		return Create_Bt;
	}

	public WebElement getReset_Bt() {
		return Reset_Bt;
	}

	public WebElement getUpdate_Bt() {
		return Update_Bt;
	}

	public WebElement getCreate_Team_Bt() {
		return Create_Team_Bt;
	}

	public WebElement getTeam_Code() {
		return Team_Code;
	}

	public WebElement getTeam_name() {
		return Team_name;
	}

	public WebElement getCreate_Team_Status() {
		return Create_Team_Status;
	}

	public WebElement getCreateBt_CreatingTeam() {
		return CreateBt_CreatingTeam;
	}

	public WebElement getResetBt_ResetTeams() {
		return ResetBt_ResetTeams;
	}

	public WebElement getExit_Bt_Creating_Teams() {
		return Exit_Bt_Creating_Teams;
	}

	public WebElement getAdd_MembersBt() {
		return Add_MembersBt;
	}

	public WebElement getAdd_Members_Organization_dropdownBt() {
		return Add_Members_Organization_dropdownBt;
	}

	public WebElement getAdd_Members_OrganizationLocation_dropdownBt() {
		return Add_Members_OrganizationLocation_dropdownBt;
	}

}
