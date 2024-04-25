package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoUpload extends Baseclass {

	public LogoUpload() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@routerlinkactive='menu-active'])[7]")
	public WebElement logoUploads_Menu;

	@FindBy(xpath = "//p-button[@label='Choose Logo']")
	public WebElement chooseLogo_Bt;

	@FindBy(xpath = "(//p-button[@class='p-element'])[2]")
	public WebElement submitBt;

	@FindBy(xpath = "//p-button[@label='Ok']")
	public WebElement Success_Ok_Bt;

	@FindBy(xpath = "//div[@class='message']")
	public WebElement Success_Message;
	
	
	
	
	
	
	

	public WebElement getSuccess_Ok_Bt() {
		return Success_Ok_Bt;
	}

	public WebElement getSuccess_Message() {
		return Success_Message;
	}

	public WebElement getLogoUploads_Menu() {
		return logoUploads_Menu;
	}

	public WebElement getChooseLogo_Bt() {
		return chooseLogo_Bt;
	}

	public WebElement getSubmitBt() {
		return submitBt;
	}

}
