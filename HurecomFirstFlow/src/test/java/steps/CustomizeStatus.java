package steps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.Baseclass;
import utility.ControlPanel;
import utility.cutomizeConfiguration;

public class CustomizeStatus extends Baseclass {

	@Given("User should navigate to the custom Configuration page")
	public void userShouldNavigateToTheCustomConfigurationPage() throws InterruptedException {

		cutomizeConfiguration c = new cutomizeConfiguration();
		ControlPanel control = new ControlPanel();

		c.getCustomizeConfigurationMenuBt().click();

	}

	@When("User Click on the status Aero button")
	public void userClickOnTheStatusAeroButton() throws InterruptedException {

		cutomizeConfiguration c = new cutomizeConfiguration();

		Thread.sleep(3000);

		c.NotProcessedAeroBt.click();

	}

	@When("User click on the add button and add the status")
	public void userClickOnTheAddButtonAndAddTheStatus() throws InterruptedException {

		cutomizeConfiguration c = new cutomizeConfiguration();

		Thread.sleep(3000);

		c.AddNewBtForStatus.click();

	}

	@When("User Enter the new Status name and click on the save button")
	public void userEnterTheNewStatusNameAndClickOnTheSaveButton() throws InterruptedException, AWTException {

		Robot r = new Robot();

		cutomizeConfiguration c = new cutomizeConfiguration();

		Thread.sleep(3000);

		WebElement addNewStatusNameTextBox = c.getAddNewStatusNameTextBox();

		addNewStatusNameTextBox.sendKeys("Reject");

		c.getCheckboxSendMail().click();

		Thread.sleep(2000);

		// add button for email
		driver.findElement(By.xpath("//div[@class='small-add-button']")).click();

		// template name
		driver.findElement(By.xpath("//input[@formcontrolname='templateName']")).sendKeys("Rejected");

		WebElement SubjectTextBox = driver.findElement(By.xpath("//input[@formcontrolname='subject']"));

		SubjectTextBox.sendKeys("Hi ");

		Thread.sleep(2000);

		driver.findElement(
				By.xpath("//div[normalize-space()='${Candidate Name}']//i[@class='pi pi-copy ml-2 ng-star-inserted']"))
				.click();

		SubjectTextBox.click();

		r.keyPress(KeyEvent.VK_CONTROL);

		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_V);

		Thread.sleep(2000);

		r.keyRelease(KeyEvent.VK_V);

		Thread.sleep(2000);

		r.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(2000);

		SubjectTextBox.sendKeys(" you were Rejected from this company");

		WebElement messagefortemplate = driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']"));

		messagefortemplate.sendKeys(
				"Greeting from Hurecom\r\n" + "\r\n" + "\r\n" + "\r\n" + "You Were Rejected From This company ");

		driver.findElement(By.xpath("(//p-button[@class='p-element'])[3]")).click();

		Thread.sleep(2000);

		WebElement templatecreated = driver.findElement(By.xpath("//div[text()='Email Template saved successfully.']"));

		String text = templatecreated.getText();

		String s = "Email Template saved successfully.";

		if (text.equalsIgnoreCase(s)) {

			System.out.println("// Template created successfully");
		}

		else {
			System.out.println("// Template is already exited");
		}

		Thread.sleep(2000);

		c.getMailTemplateDropdwonBt().click();

		driver.findElement(By.xpath("//li[@role='option']")).click();

		Thread.sleep(3000);

		c.getCheckBoxSendWhatsApp().click();

		// add button for Whatsapp template
		driver.findElement(By.xpath("(//div[@class='small-add-button'])[2]")).click();

		Thread.sleep(2000);

		WebElement Templatename = driver.findElement(By.xpath("//input[@formcontrolname='templateName']"));

		Templatename.sendKeys("Rejected");

		// canidate namecopy
		driver.findElement(
				By.xpath("//div[normalize-space()='${Candidate Name}']//i[@class='pi pi-copy ml-2 ng-star-inserted']"))
				.click();

		WebElement messageline1 = driver.findElement(By.xpath("//input[@formcontrolname='messageLine1']"));

		messageline1.sendKeys("Hi ");

		messageline1.click();

		r.keyPress(KeyEvent.VK_CONTROL);

		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_V);

		Thread.sleep(2000);

		r.keyRelease(KeyEvent.VK_V);

		Thread.sleep(2000);

		r.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(2000);

		WebElement messageline2 = driver.findElement(By.xpath("//input[@formcontrolname='messageLine2']"));

		messageline2.sendKeys(" You were rejected from this company ");

		Thread.sleep(2000);

		WebElement savebt = driver.findElement(
				By.xpath("//app-add-edit-whatsapp-template[@class='ng-star-inserted']//button[@type='button']"));

		savebt.click();

		c.getWhatsTemplateDropDown().click();

		driver.findElement(By.xpath("//li[@role='option']")).click();

		Thread.sleep(2000);

		c.getSaveBtForAddNewStatus().click();

		Thread.sleep(3000);

	}

	@Then("User can view the Created status name")
	public void userCanViewTheCreatedStatusName() throws InterruptedException {

		WebElement message = driver.findElement(By.xpath("//div[text()='Status saved successfully.']"));
		String text = message.getText();

		// WebElement ExitMessage = driver.findElement(By.xpath("//div[text()='Status
		// already exists.']"));
		//
		// String Exit = ExitMessage.getText();

		String s = "Status saved successfully.";

		cutomizeConfiguration c = new cutomizeConfiguration();

		if (s.equalsIgnoreCase(text)) {

			System.out.println("// Status can be Created ");

		}

		else {

			WebElement ExitMessage = driver.findElement(By.xpath("//div[text()='Status already exists.']"));

			String Exit = ExitMessage.getText();

			String False = "Status already exists.";

			if (Exit.equalsIgnoreCase(False)) {

				WebElement addNewStatusNameTextBox = c.getAddNewStatusNameTextBox();

				addNewStatusNameTextBox.clear();

				Thread.sleep(2000);

				addNewStatusNameTextBox.sendKeys("Call tomorrow");

				c.getCheckboxSendMail().click();

				Thread.sleep(2000);

				c.getMailTemplateDropdwonBt().click();

				c.getMailTemplateOptions().click();

				Thread.sleep(2000);

				c.getSaveBtForAddNewStatus().click();

				Thread.sleep(2000);

				if (s.equalsIgnoreCase(text)) {

					System.out.println("// Status can be Created ");

				}

				else {
					System.out.println("// status can be already created");

					Thread.sleep(2000);

					c.getExitButton().click();

				}

			}

		}

	}

	@Given("user is on the Customize status page")
	public void userIsOnTheCustomizeStatusPage() {

		System.out.println("// User is on the Customize status page");

	}

	@Given("Click on the Delete buttton")
	public void clickOnTheDeleteButtton() throws InterruptedException {

		Thread.sleep(3000);

		cutomizeConfiguration c = new cutomizeConfiguration();

		driver.findElement(By.xpath("//tbody/tr[6]/td[5]/span[2]/i[1]")).click();

	}

	@When("User click on the yes button on the popup message")
	public void userClickOnTheYesButtonOnThePopupMessage() throws InterruptedException {

		cutomizeConfiguration c = new cutomizeConfiguration();

		c.getDeleteYesBtCustomize().click();
		Thread.sleep(2000);

	}

	@Then("User can view that successfull message")
	public void userCanViewThatSuccessfullMessage() {

		String s = "Status deleted successfully.";

		WebElement message = driver.findElement(By.xpath("//div[text()='Status deleted successfully.']"));

		String text = message.getText();

		if (text.equals(s)) {

			System.out.println("// status deleted successfully");
		}

		else {

			System.out.println("// There are applications linked with this status. Could not delete the status.");
		}

	}

	@Given("user click on the status edit button")
	public void userClickOnTheStatusEditButton() throws InterruptedException {

		cutomizeConfiguration c = new cutomizeConfiguration();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//tbody/tr[3]/td[5]/span[1]/i[1]")).click();

	}

	@Given("Edit the name and Enter the Deatils in the Status")
	public void editTheNameAndEnterTheDeatilsInTheStatus() {

		WebElement Status = driver.findElement(By.xpath("//input[@type='text']"));

		Status.clear();

		Status.sendKeys("Call Back tomorrow ");

	}

	@When("Click on the save button")
	public void clickOnTheSaveButton() throws InterruptedException {

		cutomizeConfiguration c = new cutomizeConfiguration();

		c.getSaveBtForAddNewStatus().click();

	}

	@Then("User can view that success message")
	public void userCanViewThatSuccessMessage() throws InterruptedException {

		Thread.sleep(1000);

		cutomizeConfiguration c = new cutomizeConfiguration();

		WebElement message = driver.findElement(By.xpath("//div[text()='Status saved successfully.']"));
		String text = message.getText();

		String s = "Status saved successfully.";

		if (s.equalsIgnoreCase(text)) {

			System.out.println("// Status can be Created ");

		}

		else {

			WebElement ExitMessage = driver.findElement(By.xpath("//div[text()='Status already exists.']"));

			String Exit = ExitMessage.getText();

			String False = "Status already exists.";

			if (Exit.equals(False)) {

				System.out.println("// status can be already exited");

				Thread.sleep(2000);

				// update status exit button
				driver.findElement(By.xpath("//div[@class='p-dialog-header-icons ng-tns-c6-31']"));

			}

		}

	}

}
