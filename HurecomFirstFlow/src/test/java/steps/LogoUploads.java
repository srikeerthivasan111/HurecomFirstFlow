package steps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.Baseclass;
import utility.ControlPanel;
import utility.CustomFieldsMenu;
import utility.LogoUpload;
import utility.cutomizeConfiguration;

public class LogoUploads extends Baseclass {

	@Given("User should navigate to Logo upoloads page")
	public void userShouldNavigateToLogoUpoloadsPage() throws InterruptedException {

		cutomizeConfiguration c = new cutomizeConfiguration();

		CustomFieldsMenu custom = new CustomFieldsMenu();

		ControlPanel control = new ControlPanel();

		LogoUpload logo = new LogoUpload();

		Thread.sleep(3000);

		logo.getLogoUploads_Menu().click();

	}

	@Given("Click on the choose logo button")
	public void clickOnTheChooseLogoButton() throws AWTException, InterruptedException {

		LogoUpload logo = new LogoUpload();

		Robot r = new Robot();

		logo.getChooseLogo_Bt().click();

		Thread.sleep(2000);

		String file = ("C:\\Users\\srike\\Downloads\\Hurecom logo.jpg");

		StringSelection selection = new StringSelection(file);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);

	}

	@When("User select the logo and click on the submit button")
	public void userSelectTheLogoAndClickOnTheSubmitButton() {

		LogoUpload logo = new LogoUpload();

		logo.getSubmitBt().click();
	}

	@Then("User can view the successfull message on logo uploads page")
	public void userCanViewTheSuccessfullMessageOnLogoUploadsPage() throws InterruptedException {

		LogoUpload logo = new LogoUpload();

		String text = logo.getSuccess_Message().getText();

		String msg = "Logo updated successfully.";

		if (text.equals(msg)) {

			Thread.sleep(1000);

			System.out.println("// Logo uploaded successfully ");

			Thread.sleep(2000);

			logo.getSuccess_Ok_Bt().click();

		}

		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[@routerlinkactive='menu-active']")).click();
		
		Thread.sleep(3000);

	}

}
