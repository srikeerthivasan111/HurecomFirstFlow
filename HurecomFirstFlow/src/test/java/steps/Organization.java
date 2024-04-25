package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utility.Baseclass;
import utility.ControlPanel;

public class Organization extends Baseclass {

	@Given("User should navigate to the Organization page")
	public void userShouldNavigateToTheOrganizationPage() throws InterruptedException {

		ControlPanel l = new ControlPanel();

		 driver.findElement(By.xpath("(//a[@routerlinkactive='menu-active'] )[2]")).click();
		 
		 Thread.sleep(2000);

	}

	@Given("User click on the Create Organization button")
	public void userClickOnTheCreateOrganizationButton() throws InterruptedException {

		ControlPanel l = new ControlPanel();

		l.getCreateorganizationBt().click();

		l.getOrganizationName().sendKeys("Wibro");
		
		Thread.sleep(1000);

		l.getOrganizationDropDownbutton().click();
		
		Thread.sleep(2000);

		l.getOraganicationActiveStatus().click();

	}

	@Given("Enter the Organization name and click on the create button")
	public void enterTheOrganizationNameAndClickOnTheCreateButton() throws InterruptedException {

		ControlPanel l = new ControlPanel();
		
		l.getCreateorganizationCreateBt().click();
		
		Thread.sleep(1000);

	}

	@Then("User should view the Creating organization successfull message")
	public void userShouldViewTheCreatingOrganizationSuccessfullMessage() throws InterruptedException {

		ControlPanel l = new ControlPanel();

		WebElement successMessage = l.getSuccessMessageForCreateOrganization();

		String text = successMessage.getText();

		String s = "Organization created successfully.";

		if (s.equalsIgnoreCase("Organization created successfully.")) {

			System.out.println("// Success message can be shown to user ");
		}

		l.getSuccessOkBt().click();
		
		Thread.sleep(3000);

	}

}
