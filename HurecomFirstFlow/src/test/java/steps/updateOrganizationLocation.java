package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.Baseclass;
import utility.ControlPanel;

public class updateOrganizationLocation extends Baseclass {

	@Given("user is on the Update organization location page")
	public void userIsOnTheUpdateOrganizationLocationPage() {

		ControlPanel l = new ControlPanel();

		l.getOrganizationUpdateBt().click();

	}

	@When("user click on the Update button")
	public void userClickOnTheUpdateButton() {

		ControlPanel l = new ControlPanel();

		l.getOrganizationLocationUpdateBt().click();

	}

	@When("user Update the Brach name and click on the update button")
	public void userUpdateTheBrachNameAndClickOnTheUpdateButton() throws InterruptedException {

		ControlPanel l = new ControlPanel();

		WebElement OrgLocationBranch = l.getOrganizationBranchName();

		OrgLocationBranch.clear();

		OrgLocationBranch.sendKeys("Guindy");

		Thread.sleep(2000);

		OrgLocationBranch.clear();

		OrgLocationBranch.sendKeys("Nungabakkam");

		Thread.sleep(2000);

		OrgLocationBranch.clear();

		OrgLocationBranch.sendKeys("Kodambakkam");

		l.getUpdatebtForUpdateOrganizationLocation().click();

	}

	@Then("user Should view the update successfull message")
	public void userShouldViewTheUpdateSuccessfullMessage() throws InterruptedException {
		ControlPanel l = new ControlPanel();

		WebElement message = l.getUpdateOrganizationLocationSuccessMessage();

		String text = message.getText();

		String s = "Organization Location updated successfully.";

		if (s.equals(text)) {
			System.out.println("// user can view that success message");
		}

		l.getUpdateOrganizationLocationSuccessOkBt().click();

		Thread.sleep(2000);
		
		 WebElement backbt = driver.findElement(By.xpath("//i[@class='pi pi-arrow-left back-icon']"));

		 backbt.click();
	}

}
