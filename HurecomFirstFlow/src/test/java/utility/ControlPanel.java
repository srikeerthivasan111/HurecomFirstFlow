package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ControlPanel extends Baseclass {

	public ControlPanel() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//i[@class='pi pi-angle-down']")
	public WebElement MyAccountDropDownBtn;

	@FindBy(xpath = "//li[@routerlink='/admin-panel/organizations']")
	public WebElement ContropaneOptins;

	@FindBy(xpath = "//p-button[@label='Create Organization']")
	public WebElement CreateorganizationBt;

	@FindBy(xpath = "//input[@type='text']")
	public WebElement OrganizationName;

	@FindBy(xpath = "//div[@aria-label='dropdown trigger']")
	public WebElement OrganizationDropDownbutton;

	@FindBy(xpath = "//li[@role='option']")
	public WebElement OraganicationActiveStatus;

	@FindBy(xpath = "(//li[@role='option'])[2]")
	public WebElement OrganizationInActivesattus;

	@FindBy(xpath = "//p-button[@label='Reset']")
	public WebElement CreateOrganizationResetBt;

	@FindBy(xpath = "//p-button[@label='Create']")
	public WebElement CreateorganizationCreateBt;

	@FindBy(xpath = "//div[@class='message']")
	public WebElement SuccessMessageForCreateOrganization;

	@FindBy(xpath = "(//button[@class='p-ripple p-element p-button p-component'])[3]")
	public WebElement SuccessOkBt;

	@FindBy(xpath = "//p-button[@class='p-element']")
	public WebElement CreateOrganizationLocationBt;

	@FindBy(xpath = "(//div[@aria-label='dropdown trigger'])[3]")
	public WebElement CountryDropDownBt;

	@FindBy(xpath = "//li[@role='option']")
	public WebElement indianameDropdwonbt;

	@FindBy(xpath = "(//div[@aria-label='dropdown trigger'])[4]")
	public WebElement StateDropdwonBt;

	@FindBy(xpath = "//li[@aria-label='Tamil Nadu']")
	public WebElement TamilnaduStatus;

	@FindBy(xpath = "(//div[@aria-label='dropdown trigger'])[5]")
	public WebElement cityDropdownBt;

	@FindBy(xpath = "//li[@role='option']")
	public WebElement ChennaiStatus;

	@FindBy(xpath = "//input[@formcontrolname='branch']")
	public WebElement OrganizationBranchName;

	@FindBy(xpath = "(//div[@aria-label='dropdown trigger'])[6]")
	public WebElement StatusDropDownBt;

	@FindBy(xpath = "//li[@role='option']")
	public WebElement ActiveStatusBt;

	@FindBy(xpath = "//p-button[@label='Create']")
	public WebElement OrganizationLocationCreateBt;

	@FindBy(xpath = "//p-button[@label='Ok']")
	public WebElement OrganizationLocationSuccessOkBt;

	@FindBy(xpath = "//div[@class='message']")
	public WebElement OrganizationLocationSuccessMessage;

	@FindBy(xpath = "//i[@routerlink='/admin-panel/organizations']")
	public WebElement UpdateOrganizationBackBT;

	@FindBy(xpath = "//tbody/tr[1]/td[3]/span[1]/i[1]")
	public WebElement OrganizationUpdateBt;

	@FindBy(xpath = "//i[@class='pi pi-pencil']")
	public WebElement OrganizationLocationUpdateBt;

	@FindBy(xpath = "//input[@formcontrolname='branch']")
	public WebElement UpdateOrganizationLocationBranchName;

	@FindBy(xpath = " //div[@class='button-wrapper']//span[@class='p-button-label ng-star-inserted'][normalize-space()='Update']")
	public WebElement UpdatebtForUpdateOrganizationLocation;

	@FindBy(xpath = "//p-button[@label='Ok']")
	public WebElement UpdateOrganizationLocationSuccessOkBt;

	@FindBy(xpath = "//div[@class='message']")
	public WebElement UpdateOrganizationLocationSuccessMessage;

	public WebElement getUpdateOrganizationLocationSuccessOkBt() {
		return UpdateOrganizationLocationSuccessOkBt;
	}

	public WebElement getUpdateOrganizationLocationSuccessMessage() {
		return UpdateOrganizationLocationSuccessMessage;
	}

	public WebElement getUpdateOrganizationBackBT() {
		return UpdateOrganizationBackBT;
	}

	public WebElement getOrganizationUpdateBt() {
		return OrganizationUpdateBt;
	}

	public WebElement getOrganizationLocationUpdateBt() {
		return OrganizationLocationUpdateBt;
	}

	public WebElement getUpdateOrganizationLocationBranchName() {
		return UpdateOrganizationLocationBranchName;
	}

	public WebElement getUpdatebtForUpdateOrganizationLocation() {
		return UpdatebtForUpdateOrganizationLocation;
	}

	public WebElement getOrganizationLocationCreateBt() {
		return OrganizationLocationCreateBt;
	}

	public WebElement getOrganizationLocationSuccessOkBt() {
		return OrganizationLocationSuccessOkBt;
	}

	public WebElement getOrganizationLocationSuccessMessage() {
		return OrganizationLocationSuccessMessage;
	}

	public WebElement getCreateOrganizationLocationBt() {
		return CreateOrganizationLocationBt;
	}

	public WebElement getCountryDropDownBt() {
		return CountryDropDownBt;
	}

	public WebElement getIndianameDropdwonbt() {
		return indianameDropdwonbt;
	}

	public WebElement getStateDropdwonBt() {
		return StateDropdwonBt;
	}

	public WebElement getTamilnaduStatus() {
		return TamilnaduStatus;
	}

	public WebElement getCityDropdownBt() {
		return cityDropdownBt;
	}

	public WebElement getChennaiStatus() {
		return ChennaiStatus;
	}

	public WebElement getOrganizationBranchName() {
		return OrganizationBranchName;
	}

	public WebElement getStatusDropDownBt() {
		return StatusDropDownBt;
	}

	public WebElement getActiveStatusBt() {
		return ActiveStatusBt;
	}

	public WebElement getMyAccountDropDownBtn() {
		return MyAccountDropDownBtn;
	}

	public WebElement getContropaneOptins() {
		return ContropaneOptins;
	}

	public WebElement getCreateorganizationBt() {
		return CreateorganizationBt;
	}

	public WebElement getOrganizationName() {
		return OrganizationName;
	}

	public WebElement getOrganizationDropDownbutton() {
		return OrganizationDropDownbutton;
	}

	public WebElement getOraganicationActiveStatus() {
		return OraganicationActiveStatus;
	}

	public WebElement getOrganizationInActivesattus() {
		return OrganizationInActivesattus;
	}

	public WebElement getCreateOrganizationResetBt() {
		return CreateOrganizationResetBt;
	}

	public WebElement getCreateorganizationCreateBt() {
		return CreateorganizationCreateBt;
	}

	public WebElement getSuccessMessageForCreateOrganization() {
		return SuccessMessageForCreateOrganization;
	}

	public WebElement getSuccessOkBt() {
		return SuccessOkBt;
	}

}
