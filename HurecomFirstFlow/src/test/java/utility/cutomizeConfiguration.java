package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cutomizeConfiguration extends Baseclass {

	public cutomizeConfiguration() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@routerlinkactive='menu-active'])[5]")
	public WebElement CustomizeConfigurationMenuBt;

	@FindBy(xpath = "//tbody/tr[1]/td[1]/span[1]/i[1]")
	public WebElement NotProcessedAeroBt;

	@FindBy(xpath = "//p-button[@label='Add New']")
	public WebElement AddNewBtForStatus;

	@FindBy(xpath = "//input[@formcontrolname='statusName']")
	public WebElement AddNewStatusNameTextBox;

	@FindBy(xpath = "//div[@class='p-checkbox-box']")
	public WebElement CheckBoxShowinCandidatePoolpage;

	@FindBy(xpath = "(//div[@class='p-checkbox-box'])[2]")
	public WebElement CheckboxSendMail;

	@FindBy(xpath = "//p-checkbox[@inputid='sendWhatsapp']//div[@class='p-checkbox-box']")
	public WebElement CheckBoxSendWhatsApp;

	@FindBy(xpath = "(//p-button[@class='p-element'])[2]")
	public WebElement SaveBtForAddNewStatus;

	@FindBy(xpath = "//div[@aria-label='dropdown trigger']")
	public WebElement MailTemplateDropdwonBt;

	@FindBy(xpath = "(//div[@aria-label='dropdown trigger'])[2]")
	public WebElement WhatsTemplateDropDown;

	@FindBy(xpath = "(//li[@role='option'])[5]")
	public WebElement MailTemplateOptions;

	@FindBy(xpath = "(//li[@role='option'])[2]")
	public WebElement WhatsAppTemplateOptions;

	@FindBy(xpath = "(//a[@role='presentation'])[2]")
	public WebElement FieldsMenubt;

	@FindBy(xpath = "(//a[@role='presentation'])[3]")
	public WebElement CustomFieldsMenuBt;

	@FindBy(xpath = "(//a[@role='presentation'])[4]")
	public WebElement DropDownMenuBt;

	@FindBy(xpath = "(//a[@role='presentation'])[5]")
	public WebElement ReportsMenuBt;

	@FindBy(xpath = "//tbody/tr[5]/td[5]/span[2]/i[1]")
	public WebElement CustomizeDeleteBt;

	@FindBy(xpath = "//p-button[@label='Yes']")
	public WebElement DeleteYesBtCustomize;

	@FindBy(xpath = "//tbody/tr[3]/td[5]/span[2]/i[1]")
	public WebElement EditBtForCustomizeStatus;

	@FindBy(xpath = "//button[@class='p-ripple p-element p-button-secondary p-button p-component']")
	public WebElement CancelBtForPopupinDelete;

	@FindBy(xpath = "(//button[@type='button'])[2]")
	public WebElement ExitButton;

	@FindBy(xpath = "//button[contains(@class,'ng-tns-c6-42 p-dialog-header-icon')]")
	public WebElement EmailTemplateExitBt;

	@FindBy(xpath = " //button[contains(@class,'ng-tns-c6-6 p-dialog-header-icon p-dialog-header-maximize')]")
	public WebElement whatsAppTempalteExitBT;

	@FindBy(xpath = "//div[@class='p-dialog-header-icons ng-tns-c6-31']")
	public WebElement updateStatusExitButton;

	public WebElement getUpdateStatusExitButton() {
		return updateStatusExitButton;
	}

	public WebElement getEmailTemplateExitBt() {
		return EmailTemplateExitBt;
	}

	public WebElement getWhatsAppTempalteExitBT() {
		return whatsAppTempalteExitBT;
	}

	public WebElement getExitButton() {
		return ExitButton;
	}

	public WebElement getMailTemplateDropdwonBt() {
		return MailTemplateDropdwonBt;
	}

	public WebElement getFieldsMenubt() {
		return FieldsMenubt;
	}

	public WebElement getCustomFieldsMenuBt() {
		return CustomFieldsMenuBt;
	}

	public WebElement getDropDownMenuBt() {
		return DropDownMenuBt;
	}

	public WebElement getReportsMenuBt() {
		return ReportsMenuBt;
	}

	public WebElement getCustomizeDeleteBt() {
		return CustomizeDeleteBt;
	}

	public WebElement getDeleteYesBtCustomize() {
		return DeleteYesBtCustomize;
	}

	public WebElement getEditBtForCustomizeStatus() {
		return EditBtForCustomizeStatus;
	}

	public WebElement getCancelBtForPopupinDelete() {
		return CancelBtForPopupinDelete;
	}

	public WebElement getWhatsTemplateDropDown() {
		return WhatsTemplateDropDown;
	}

	public WebElement getMailTemplateOptions() {
		return MailTemplateOptions;
	}

	public WebElement getWhatsAppTemplateOptions() {
		return WhatsAppTemplateOptions;
	}

	public WebElement getCustomizeConfigurationMenuBt() {
		return CustomizeConfigurationMenuBt;
	}

	public WebElement getNotProcessedAeroBt() {
		return NotProcessedAeroBt;
	}

	public WebElement getAddNewBtForStatus() {
		return AddNewBtForStatus;
	}

	public WebElement getAddNewStatusNameTextBox() {
		return AddNewStatusNameTextBox;
	}

	public WebElement getCheckBoxShowinCandidatePoolpage() {
		return CheckBoxShowinCandidatePoolpage;
	}

	public WebElement getCheckboxSendMail() {
		return CheckboxSendMail;
	}

	public WebElement getCheckBoxSendWhatsApp() {
		return CheckBoxSendWhatsApp;
	}

	public WebElement getSaveBtForAddNewStatus() {
		return SaveBtForAddNewStatus;
	}

}
