package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.Baseclass;
import utility.ControlPanel;
import utility.CustomFieldsMenu;
import utility.cutomizeConfiguration;

public class Customfields extends Baseclass {

	@Given("User is on the custom Fields Page")
	public void userIsOnTheCustomFieldsPage() throws InterruptedException {

		cutomizeConfiguration c = new cutomizeConfiguration();

		CustomFieldsMenu custom = new CustomFieldsMenu();

		ControlPanel control = new ControlPanel();

		Thread.sleep(3000);

		c.getCustomizeConfigurationMenuBt().click();

		Thread.sleep(2000);

		custom.getCustomfieldsPageMenuBt().click();

	}

	@When("User click on the Create Custom fields button")
	public void userClickOnTheCreateCustomFieldsButton() throws InterruptedException {

		CustomFieldsMenu custom = new CustomFieldsMenu();

		Thread.sleep(2000);

		custom.getCreateCustomFieldsBt().click();

	}

	@When("User Enter the custom fields details as candidate personal fields")
	public void userEnterTheCustomFieldsDetailsAsCandidatePersonalFields() throws InterruptedException {

		CustomFieldsMenu custom = new CustomFieldsMenu();

		custom.getDisplayCheckBox().click();

		Thread.sleep(2000);

		custom.getSectionDropDownBt().click();

		Thread.sleep(2000);

		custom.getCanidatePersonalOptions().click();

		Thread.sleep(2000);

		custom.getDisplayName().sendKeys("Pan");

		custom.getFieldTypeDropdownbt().click();

		Thread.sleep(2000);

		custom.getCheckBoxFieldsType().click();

	}

	@When("User should click on the save button")
	public void userShouldClickOnTheSaveButton() {

		CustomFieldsMenu custom = new CustomFieldsMenu();

		custom.getSave_BT().click();

	}

	@Then("user can view that successfull message")
	public void userCanViewThatSuccessfullMessage() {

		CustomFieldsMenu custom = new CustomFieldsMenu();

		String text = custom.getCustom_Field_Creating_SuccessMSG().getText();

		String message = "Custom Field saved successfully.";

		if (text.equals(message)) {
			System.out.println("// Custom Fields can be created");
		}

		else {

			System.out.println("// Custom fields can't able to created ");

		}
	}

	@Given("User should navigate to the custom fields edit page")
	public void userShouldNavigateToTheCustomFieldsEditPage() {

		// Edit button of custom fields

		driver.findElement(By.xpath("//tbody/tr[1]/td[6]/span[1]/i[1]")).click();

	}

	@Given("User should edit the name of the custom fields")
	public void userShouldEditTheNameOfTheCustomFields() throws InterruptedException {

		CustomFieldsMenu custom = new CustomFieldsMenu();

		WebElement displayName = custom.getDisplayName();

		displayName.clear();

		Thread.sleep(2000);

		displayName.sendKeys("Aadhar");

		Thread.sleep(2000);

		custom.getSave_BT().click();

		Thread.sleep(1000);
	}

	@Then("User click on the save button and view the message")
	public void userClickOnTheSaveButtonAndViewTheMessage() {

		CustomFieldsMenu custom = new CustomFieldsMenu();

		String text = custom.getCustom_Field_Creating_SuccessMSG().getText();

		String message = "Custom Field saved successfully.";

		if (text.equals(message)) {
			System.out.println("// Custom fields edited successfully ");
		}

		else {

			System.out.println("// Custom fields Can't able to edit ");

			custom.getExit_BT().click();

		}

	}

	@Given("User should navigate to the custom fields page")
	public void userShouldNavigateToTheCustomFieldsPage() throws InterruptedException {

		Thread.sleep(3000);

		System.out.println("// User is on the application custom fields page ");

	}

	@Given("User Click on the delete button")
	public void userClickOnTheDeleteButton() throws InterruptedException {

		CustomFieldsMenu custom = new CustomFieldsMenu();

		// delete button of custom fields
		WebElement delete_Bt = driver.findElement(By.xpath("//tbody/tr[1]/td[6]/span[2]/i[1]"));

		delete_Bt.click();

		Thread.sleep(2000);

	}

	@Given("user should view the delete popup message")
	public void userShouldViewTheDeletePopupMessage() throws InterruptedException {

		CustomFieldsMenu custom = new CustomFieldsMenu();

		String deletepopup = driver.findElement(By.xpath("//span[text()='Delete Custom Field']")).getText();

		String s = "Delete Custom Field";
		if (s.equals(deletepopup)) {
			System.out.println("// Delete popup message can be shown");
		}
		Thread.sleep(2000);

	}

	@When("User click on the yes button")
	public void userClickOnTheYesButton() throws InterruptedException {

		CustomFieldsMenu custom = new CustomFieldsMenu();

		custom.getDelete_BT_Of_Popup().click();
		Thread.sleep(2000);

	}

	@Then("Custom field should be deleted")
	public void customFieldShouldBeDeleted() {

		CustomFieldsMenu custom = new CustomFieldsMenu();

		String text = custom.getDelete_popup_message().getText();

		String message = "Custom Field deleted successfully.";

		if (text.equals(message)) {
			System.out.println("// Custom Fields can be deleted successfully ");
		}

		else {
			System.out.println("// custom fields can't able to create ");
		}

	}

}
