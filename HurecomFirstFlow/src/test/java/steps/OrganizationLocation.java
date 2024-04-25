package steps;

import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utility.Baseclass;
import utility.ControlPanel;

public class OrganizationLocation extends Baseclass {

	@Given("user click  on the Create Organization Location button")
	public void userClickOnTheCreateOrganizationLocationButton() {

		ControlPanel l = new ControlPanel();

		l.getCreateOrganizationLocationBt().click();

	}

	@Given("User Enter the Organization Location Details")
	public void userEnterTheOrganizationLocationDetails() throws InterruptedException {

		ControlPanel l = new ControlPanel();

		l.getCountryDropDownBt().click();

		Thread.sleep(2000);
		
		l.getIndianameDropdwonbt().click();

		Thread.sleep(1000);

		l.getStateDropdwonBt().click();

		Thread.sleep(2000);
		
		l.getTamilnaduStatus().click();

		Thread.sleep(1000);

		l.getCityDropdownBt().click();

		Thread.sleep(2000);
		
		l.getChennaiStatus().click();

		Thread.sleep(1000);
		
		l.getOrganizationBranchName().sendKeys("Adambakkam");

		l.getStatusDropDownBt().click();
		
		Thread.sleep(1000);

		l.getActiveStatusBt().click();

	}

	@Then("user can view that created Organization locatoin Success message")
	public void userCanViewThatCreatedOrganizationLocatoinSuccessMessage() throws InterruptedException {

		ControlPanel l = new ControlPanel();

		l.getOrganizationLocationCreateBt().click();

		Thread.sleep(2000);

		WebElement OrgLocationMessage = l.getOrganizationLocationSuccessMessage();

		String text = OrgLocationMessage.getText();

		String s = "Organization Location created successfully.";

		if (s.equals(text)) {
			System.out.println("// Create location successfullt message can be shown");
		}

		Thread.sleep(2000);

		l.getOrganizationLocationSuccessOkBt().click();
		
		Thread.sleep(2000);
		
	    l.getUpdateOrganizationBackBT().click();
	    
		Thread.sleep(2000);

	}

}
