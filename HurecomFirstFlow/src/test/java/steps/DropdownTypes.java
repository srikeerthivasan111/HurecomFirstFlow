package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.Baseclass;
import utility.ControlPanel;
import utility.CustomFieldsMenu;
import utility.cutomizeConfiguration;

public class DropdownTypes extends Baseclass {

	@Given("User should navigate to the Dropdown page")
	public void userShouldNavigateToTheDropdownPage() throws InterruptedException {

		cutomizeConfiguration c = new cutomizeConfiguration();

		CustomFieldsMenu custom = new CustomFieldsMenu();

		ControlPanel control = new ControlPanel();

		Thread.sleep(3000);

		c.getCustomizeConfigurationMenuBt().click();

		Thread.sleep(1000);

	}

	@Given("User click on the add new button and Enter the dropdown type name")
	public void userClickOnTheAddNewButtonAndEnterTheDropdownTypeName() throws InterruptedException {

		CustomFieldsMenu custom = new CustomFieldsMenu();

		custom.getDropDown_Menu_Bt().click();

		Thread.sleep(1000);

		custom.getDropDown_AddNew_Bt().click();

		Thread.sleep(2000);

		custom.getDropDown_Type_Name().sendKeys("Pan");

	}

	@When("User click on the save button")
	public void userClickOnTheSaveButton() throws InterruptedException {

		CustomFieldsMenu custom = new CustomFieldsMenu();

		custom.getDropdown_Save_BT().click();

	}

	@Then("Dropdown success message can be view by the user")
	public void dropdownSuccessMessageCanBeViewByTheUser() throws InterruptedException {

		CustomFieldsMenu custom = new CustomFieldsMenu();

		Thread.sleep(1000);

		String text = custom.getDrodown_save_Success_message().getText();
		 
		String pass = "Dropdown Type saved successfully.";

//		WebElement fail = driver.findElement(By.xpath("//div[text()='Dropdown Type already exists.']"));
//
//		String failure = fail.getText();
//		String fails = "Dropdown Type already exists.";

		if (text.equals(pass)) {

			System.out.println("// Dropdwon type can be created successfully ");
			
		}

	}

	@Given("User click on the created dropdwon type aero button")
	public void userClickOnTheCreatedDropdwonTypeAeroButton() throws InterruptedException {

		CustomFieldsMenu custom = new CustomFieldsMenu();
		Thread.sleep(2000);

		custom.getDropdown_Aero_BT().click();

		Thread.sleep(1000);

	}

	@Given("user click on the add new button")
	public void userClickOnTheAddNewButton() throws InterruptedException {

		CustomFieldsMenu custom = new CustomFieldsMenu();
		
		custom.getAddNew_ValuesBT().click();

	}

	@When("Enter the dropdown values  and click on the save button")
	public void enterTheDropdownValuesAndClickOnTheSaveButton() throws InterruptedException {

		CustomFieldsMenu custom = new CustomFieldsMenu();
		custom.getAddNewValues_Display().sendKeys("Yes");

		Thread.sleep(2000);

		custom.getDropdownValues_SaveBT().click();

		Thread.sleep(1000);

		String text = custom.getDropdown_values_Created_success_message().getText();

		String pass = "Dropdown Value saved successfully.";

		if (pass.equals(text)) {

			System.out.println("// Dropdown values created successfully");
		}


		Thread.sleep(3000);

		custom.getAddNew_ValuesBT().click();

		custom.getAddNewValues_Display().sendKeys("no");

		Thread.sleep(2000);

		custom.getDropdownValues_SaveBT().click();

		Thread.sleep(1000);

	}

	@Then("Success message should be shown")
	public void successMessageShouldBeShown() throws InterruptedException {
		CustomFieldsMenu custom = new CustomFieldsMenu();

		String text = custom.getDropdown_values_Created_success_message().getText();

		String pass = "Dropdown Value saved successfully.";

		if (pass.equals(text)) {

			System.out.println("// Dropdown values created successfully");
		}

		Thread.sleep(3000);

		driver.findElement(By.xpath("//i[@class='p-element pi pi-chevron-down']")).click();
	}

	@Given("User should navigate to the edit dropdown page")
	public void userShouldNavigateToTheEditDropdownPage() {

		CustomFieldsMenu custom = new CustomFieldsMenu();

		driver.findElement(By.xpath("//i[@class='pi pi-pencil pencil']")).click();

	}

	@Given("Edit the dropdown name")
	public void editTheDropdownName() throws InterruptedException {
		CustomFieldsMenu custom = new CustomFieldsMenu();

		Thread.sleep(2000);

		custom.getDropDown_Type_Name().clear();

		Thread.sleep(1000);

		custom.getDropDown_Type_Name().sendKeys("Aadhar");

	}

	@Then("user should view the success message")
	public void userShouldViewTheSuccessMessage() throws InterruptedException {

		CustomFieldsMenu custom = new CustomFieldsMenu();

		custom.getDropdown_Save_BT().click();
		Thread.sleep(1000);

		WebElement text = driver.findElement(By.xpath("//div[text()='Dropdown Type saved successfully.']"));

		String text2 = text.getText();

		String pass = "Dropdown Type saved successfully.";

		if (text2.equals(pass)) {

			System.out.println("// Dropdwon type can be created ");
		}

		else {

			System.out.println("// Dropdwon already exit ");

		}

	}

}
