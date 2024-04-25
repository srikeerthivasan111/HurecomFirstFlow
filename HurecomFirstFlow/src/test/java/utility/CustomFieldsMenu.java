package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomFieldsMenu extends Baseclass {

	public CustomFieldsMenu() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//p-button[@class='p-element']")
	public WebElement CreateCustomFieldsBt;

	@FindBy(xpath = "//div[@class='p-checkbox-box']")
	public WebElement DisplayCheckBox;

	@FindBy(xpath = "(//div[@class='p-checkbox-box'])[2]")
	public WebElement MandatoryCheckBox;

	@FindBy(xpath = "(//div[@class='p-checkbox-box'])[3]")
	public WebElement LinkToJobOpeningsCheckBox;

	@FindBy(xpath = " //div[@aria-label='dropdown trigger']")
	public WebElement SectionDropDownBt;

	@FindBy(xpath = "//input[@formcontrolname='displayName']")
	public WebElement DisplayName;

	@FindBy(xpath = "(//div[@aria-label='dropdown trigger'])[2]")
	public WebElement FieldTypeDropdownbt;

	@FindBy(xpath = "//li[@role='option']")
	public WebElement CanidatePersonalOptions;

	@FindBy(xpath = "(//li[@role='option'])[2]")
	public WebElement Candidate_PrefessionalOption;

	@FindBy(xpath = "(//li[@role='option'])[3]")
	public WebElement ApplicationDetailsOption;

	@FindBy(xpath = "(//li[@role='option'])[1]")
	public WebElement CheckBoxFieldsType;

	@FindBy(xpath = "(//li[@role='option'])[2]")
	public WebElement DateFieldtype;

	@FindBy(xpath = "(//li[@role='option'])[3]")
	public WebElement NumberFieldType;

	@FindBy(xpath = "(//li[@role='option'])[4]")
	public WebElement TextFieldType;

	@FindBy(xpath = "(//li[@role='option'])[5]")
	public WebElement DropDownFieldType;

	@FindBy(xpath = "(//div[@aria-label='dropdown trigger'])[3]")
	public WebElement DropDownTypeBt;

	@FindBy(xpath = "//li[@role='option'];")
	public WebElement DropDownFieldTypeBt;

	@FindBy(xpath = "(//a[@role='presentation'])[3]")
	public WebElement CustomfieldsPageMenuBt;

	@FindBy(xpath = "//span[normalize-space()='Save']")
	public WebElement save_BT;

	@FindBy(xpath = "//div[text()='Custom Field saved successfully.']")
	public WebElement Custom_Field_Creating_SuccessMSG;

	@FindBy(xpath = "//timesicon[contains(@class,'p-element p-icon-wrapper')]")
	public WebElement Exit_BT;

	@FindBy(xpath = "(//p-button[@class='p-element'])[2]")
	public WebElement Delete_BT_Of_Popup;

	@FindBy(xpath = "//div[text()='Custom Field deleted successfully.']")
	public WebElement Delete_popup_message;

	@FindBy(xpath = "(//a[@role='presentation'])[4]")
	public WebElement DropDown_Menu_Bt;

	@FindBy(xpath = "//p-button[@label='Add New']")
	public WebElement DropDown_AddNew_Bt;

	@FindBy(xpath = "//input[@formcontrolname='dropdownType']")
	public WebElement DropDown_Type_Name;

	@FindBy(xpath = "//p-button[@ng-reflect-label='Save']//button[@type='button']")
	public WebElement Dropdown_Save_BT;

	@FindBy(xpath = "//div[text()='Dropdown Type saved successfully.']")
	public WebElement Drodown_save_Success_message;

	@FindBy(xpath = "//tbody/tr[1]/td[3]/span[1]/i[1]")
	public WebElement Edit_Bt_DropDown;

	@FindBy(xpath = "//tbody/tr[1]/td[1]/span[1]/i[1]")
	public WebElement DropDown_values_AeroBT;

	@FindBy(xpath = "(//p-button[@label='Add New'])[2]")
	public WebElement DropDwonvalues_AddNewBT;

	@FindBy(xpath = "//input[@formcontrolname='displayValue']")
	public WebElement dropdownvalues_Display;

	@FindBy(xpath = "(//p-button[@class='p-element'])[3]")
	public WebElement Drpodown_values_saveBT;

	@FindBy(xpath = "//div[text()='Dropdown Value saved successfully.']")
	public WebElement Dropdown_values_Created_success_message;

	@FindBy(xpath = "//div[text()='Dropdown Type deleted successfully.']")
	public WebElement Dropdown_values_delete_success_message;

	@FindBy(xpath = "//td[@class='table-data']//i[@class='pi pi-trash ml-3 trash']")
	public WebElement Dropdown_values_deleteBt;

	@FindBy(xpath = "//p-button[@class='p-element ml-2']//button[@type='button']")
	public WebElement Dropdown_values_Delete_YesBt;

	@FindBy(xpath = "//tbody/tr[1]/td[3]/span[1]/i[2]")
	public WebElement DropDwon_Types_DeleteBT;

	@FindBy(xpath = "//p-button[@label='Yes']//button[@type='button']")
	public WebElement DropDwon_Types_DeleteYesBT;

	@FindBy(xpath = "//div[text()='Dropdown Type deleted successfully.']")
	public WebElement Drpodown_types_delete_message;

	@FindBy(xpath = "//div[text()='Dropdown Type already exists.']")
	public WebElement Dropdown_Already_Exit_Message;

	@FindBy(xpath = "//i[@class='p-element pi pi-chevron-right']")
	public WebElement Dropdown_Aero_BT;

	@FindBy(xpath = "(//p-button[@label='Add New'])[2]")
	public WebElement AddNew_ValuesBT;

	@FindBy(xpath = "//input[@formcontrolname='displayValue']")
	public WebElement AddNewValues_Display;

	@FindBy(xpath = "(//p-button[@class='p-element'])[3]")
	public WebElement DropdownValues_SaveBT;
	
	
	 
	
	
	

	public WebElement getDropdownValues_SaveBT() {
		return DropdownValues_SaveBT;
	}

	public WebElement getAddNewValues_Display() {
		return AddNewValues_Display;
	}

	public WebElement getAddNew_ValuesBT() {
		return AddNew_ValuesBT;
	}

	public WebElement getDropdown_Already_Exit_Message() {
		return Dropdown_Already_Exit_Message;
	}

	public WebElement getDropdown_Aero_BT() {
		return Dropdown_Aero_BT;
	}

	public WebElement getDelete_popup_message() {
		return Delete_popup_message;
	}

	public WebElement getDelete_BT_Of_Popup() {
		return Delete_BT_Of_Popup;
	}

	public WebElement getExit_BT() {
		return Exit_BT;
	}

	public WebElement getSave_BT() {
		return save_BT;
	}

	public WebElement getCustom_Field_Creating_SuccessMSG() {
		return Custom_Field_Creating_SuccessMSG;
	}

	public WebElement getCustomfieldsPageMenuBt() {
		return CustomfieldsPageMenuBt;
	}

	public WebElement getDropDown_Menu_Bt() {
		return DropDown_Menu_Bt;
	}

	public WebElement getDropDown_AddNew_Bt() {
		return DropDown_AddNew_Bt;
	}

	public WebElement getDropDown_Type_Name() {
		return DropDown_Type_Name;
	}

	public WebElement getDropdown_Save_BT() {
		return Dropdown_Save_BT;
	}

	public WebElement getDrodown_save_Success_message() {
		return Drodown_save_Success_message;
	}

	public WebElement getEdit_Bt_DropDown() {
		return Edit_Bt_DropDown;
	}

	public WebElement getDropDown_values_AeroBT() {
		return DropDown_values_AeroBT;
	}

	public WebElement getDropDwonvalues_AddNewBT() {
		return DropDwonvalues_AddNewBT;
	}

	public WebElement getDropdownvalues_Display() {
		return dropdownvalues_Display;
	}

	public WebElement getDrpodown_values_saveBT() {
		return Drpodown_values_saveBT;
	}

	public WebElement getDropdown_values_Created_success_message() {
		return Dropdown_values_Created_success_message;
	}

	public WebElement getDropdown_values_delete_success_message() {
		return Dropdown_values_delete_success_message;
	}

	public WebElement getDropdown_values_deleteBt() {
		return Dropdown_values_deleteBt;
	}

	public WebElement getDropdown_values_Delete_YesBt() {
		return Dropdown_values_Delete_YesBt;
	}

	public WebElement getDropDwon_Types_DeleteBT() {
		return DropDwon_Types_DeleteBT;
	}

	public WebElement getDropDwon_Types_DeleteYesBT() {
		return DropDwon_Types_DeleteYesBT;
	}

	public WebElement getDrpodown_types_delete_message() {
		return Drpodown_types_delete_message;
	}

	public WebElement getDropDownTypeBt() {
		return DropDownTypeBt;
	}

	public WebElement getDropDownFieldTypeBt() {
		return DropDownFieldTypeBt;
	}

	public WebElement getFieldTypeDropdownbt() {
		return FieldTypeDropdownbt;
	}

	public WebElement getCanidatePersonalOptions() {
		return CanidatePersonalOptions;
	}

	public WebElement getCandidate_PrefessionalOption() {
		return Candidate_PrefessionalOption;
	}

	public WebElement getApplicationDetailsOption() {
		return ApplicationDetailsOption;
	}

	public WebElement getCheckBoxFieldsType() {
		return CheckBoxFieldsType;
	}

	public WebElement getDateFieldtype() {
		return DateFieldtype;
	}

	public WebElement getNumberFieldType() {
		return NumberFieldType;
	}

	public WebElement getTextFieldType() {
		return TextFieldType;
	}

	public WebElement getDropDownFieldType() {
		return DropDownFieldType;
	}

	public WebElement getCreateCustomFieldsBt() {
		return CreateCustomFieldsBt;
	}

	public WebElement getDisplayCheckBox() {
		return DisplayCheckBox;
	}

	public WebElement getMandatoryCheckBox() {
		return MandatoryCheckBox;
	}

	public WebElement getLinkToJobOpeningsCheckBox() {
		return LinkToJobOpeningsCheckBox;
	}

	public WebElement getSectionDropDownBt() {
		return SectionDropDownBt;
	}

	public WebElement getDisplayName() {
		return DisplayName;
	}

}
