package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.Baseclass;
import utility.ControlPanel;

public class MailConfiguration extends Baseclass {

	@Given("Click on the my account drop down button")
	public void clickOnTheMyAccountDropDownButton() throws InterruptedException {

		driver.findElement(By.xpath("//i[@class='pi pi-angle-down']")).click();

	}

	@When("Select the mail configuration options")
	public void selectTheMailConfigurationOptions() throws InterruptedException {

		driver.findElement(By.xpath("//span[normalize-space()='Email Configuration']")).click();

		Thread.sleep(3000);

	}

	@When("Enter the valid Email details")
	public void enterTheValidEmailDetails() throws InterruptedException {

		WebElement Smtphost = driver.findElement(By.xpath("//input[@type='text']"));

		Smtphost.sendKeys("smtp.zoho.in");

		Thread.sleep(2000);

		WebElement Smtpport = driver.findElement(By.xpath(" //input[@formcontrolname='port']"));

		Smtpport.sendKeys("587");

		WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[2]"));

		email.sendKeys("contact@gracefultechnologies.com");

		Thread.sleep(2000);

		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));

		password.sendKeys("Graceful@2020");

		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[@class='p-checkbox-box']")).click();

	}

	@When("click on the save button")
	public void clickOnTheSaveButton() {

		driver.findElement(By.xpath("//button[@type='button']")).click();

	}

	@Then("User should view the configuration mail")
	public void userShouldViewTheConfigurationMail() throws InterruptedException {

		WebElement message = driver.findElement(By.xpath("//div[@class='message']"));

		String text = message.getText();

		String s = "// Email Configuration saved successfully.";

		if (s.equals(text)) {

			System.out.println("// Email configured successfully message should be shown");
		}

		Thread.sleep(3000);

		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@routerlinkactive='menu-active']")).click();

	}

	@Given("User should navigate to the Organization mail configuration page")
	public void userShouldNavigateToTheOrganizationMailConfigurationPage() throws InterruptedException {
		ControlPanel l = new ControlPanel();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//i[@class='pi pi-angle-down']")).click();

		Thread.sleep(2000);

		l.getContropaneOptins().click();

		driver.findElement(By.xpath("(//a[@routerlinkactive='menu-active'])[4]")).click();

	}

	@Given("User Enter the organization mail details")
	public void userEnterTheOrganizationMailDetails() throws InterruptedException {

		Thread.sleep(2000);

		WebElement Smtphost = driver.findElement(By.xpath("//input[@type='text']"));

		Smtphost.sendKeys("smtp.gmail.com");

		Thread.sleep(2000);

		WebElement Smtpport = driver.findElement(By.xpath(" //input[@formcontrolname='port']"));

		Smtpport.sendKeys("587");

		WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[2]"));

		email.sendKeys("srikeerthivasan111@gmail.com");

		Thread.sleep(2000);

		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));

		password.sendKeys("lxsxsdermreanabs");

		driver.findElement(By.xpath("//div[@class='p-checkbox-box']")).click();
	}

	@When("User click on the save button of Organization Mail")
	public void userClickOnTheSaveButtonOfOrganizationMail() {

		driver.findElement(By.xpath("//button[@type='button']")).click();

	}

	@Then("User can view that success message of Organization")
	public void userCanViewThatSuccessMessageOfOrganization() throws InterruptedException {

		WebElement message = driver.findElement(By.xpath("//div[@class='message']"));

		String text = message.getText();

		String s = "// Email Configuration saved successfully.";

		if (s.equals(text)) {

			System.out.println("// Email configured successfully message should be shown");
		}

		Thread.sleep(3000);

		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();

		Thread.sleep(2000);

	}

}
