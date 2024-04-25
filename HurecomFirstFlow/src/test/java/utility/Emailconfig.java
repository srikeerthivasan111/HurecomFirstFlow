package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Emailconfig extends Baseclass {

	public WebElement getDashboard() {
		return dashboard;
	}

	public Emailconfig() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@type='text']")
	public WebElement smtphost;

	@FindBy(xpath = "//input[@formcontrolname='port']")
	public WebElement smtpport;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	public WebElement smtpemail;

	@FindBy(xpath = "//input[@type='password']")
	public WebElement emailpass;

	@FindBy(xpath = "//checkicon[@class='p-element p-icon-wrapper ng-star-inserted']")
	public WebElement checkbox;

	@FindBy(xpath = "//button[@type='button']")
	public WebElement savebutton;

	@FindBy(xpath = "//i[@class='pi pi-angle-down']")
	public WebElement settingbutton;

	@FindBy(xpath = "(//a[@class='menu-link'])[13]")
	public WebElement emialconfigoption;

	@FindBy(xpath = "(//button[@type='button'])[2]")
	public WebElement emailsuccessokbutton;

	@FindBy(xpath = "//div[@class='message']")
	public WebElement Successmessage;

	@FindBy(xpath = "//a[@class='menu-link']")
	public WebElement dashboard;

	public WebElement getEmailsuccessokbutton() {
		return emailsuccessokbutton;
	}

	public WebElement getSuccessmessage() {
		return Successmessage;
	}

	public WebElement getSettingbutton() {
		return settingbutton;
	}

	public WebElement getEmialconfigoption() {
		return emialconfigoption;
	}

	public WebElement getSmtphost() {
		return smtphost;
	}

	public WebElement getSmtpport() {
		return smtpport;
	}

	public WebElement getSmtpemail() {
		return smtpemail;
	}

	public WebElement getEmailpass() {
		return emailpass;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getSavebutton() {
		return savebutton;
	}

}
