package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.Baseclass;

public class CreateAccount extends Baseclass {

	@Given("User click on the hurecom link")
	public void userClickOnTheHurecomLink() {

		browserlauncher();
		maximize();
		time();
		url("http://localhost:4200/#/login");

	}

	@When("User click on the create account button")
	public void userClickOnTheCreateAccountButton() {
		WebElement createbt = driver.findElement(By.className("create-account"));

		createbt.click();

	}

	@When("User Enter the valid credentials")
	public void userEnterTheValidCredentials() throws InterruptedException {

		WebElement name = driver.findElement(By.xpath("//input[@type='text']"));

		name.sendKeys("Srikeerthivasan");

		WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[2]"));

		email.sendKeys("janufer.janu33@gmail.com");

		WebElement mobilenum = driver.findElement(By.xpath("(//input[@type='text'])[3]"));

		mobilenum.sendKeys("9500565326");

		WebElement companyname = driver.findElement(By.xpath("(//input[@type='text'])[4]"));

		companyname.sendKeys("graceful Technology");

		WebElement countrydrp = driver.findElement(By.xpath(" //span[contains(@class,'p-dropdown-label')]"));

		countrydrp.click();

		WebElement india = driver.findElement(By.xpath(" //li[@role='option']"));

		india.click();

		Thread.sleep(3000);

		WebElement statedrp = driver.findElement(By.xpath("( //span[contains(@class,'p-dropdown-label')])[2]"));

		statedrp.click();

		WebElement state = driver.findElement(By.xpath("(//li[@role='option'])[27]"));

		state.click();

		Thread.sleep(3000);

		WebElement citydrp = driver.findElement(By.xpath("(//span[contains(@class,'p-dropdown-label')])[3]"));

		citydrp.click();

		WebElement city = driver.findElement(By.xpath("//li[@role='option']"));

		city.click();

		Thread.sleep(3000);

		WebElement branch = driver.findElement(By.xpath("(//input[@type='text'])[8]"));

		branch.sendKeys("avadi");

		WebElement username = driver.findElement(By.xpath("(//input[@type='text'])[9]"));

		username.sendKeys("keerthi");

		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));

		pass.sendKeys("keerthi123");

	}

	@When("User click on the Create button")
	public void userClickOnTheCreateButton() throws InterruptedException {

		WebElement createbn = driver.findElement(By.xpath(" //button[@type='button']"));
		createbn.click();

		Thread.sleep(7000);

	}

	@Then("Create user successfull message should be shown")
	public void createUserSuccessfullMessageShouldBeShown() throws InterruptedException {

		WebElement successmessage = driver.findElement(By.xpath("//div[@class='message']"));

		String text = successmessage.getText();

		String s = "Your account has been created successfully.";

		if (text.equalsIgnoreCase(s)) {
			System.out.println("Account can be created successfull");
		}

		driver.findElement(By.xpath("//button[@type='button']")).click();

		Thread.sleep(7000);
		
		driver.findElement(By.xpath("//a[@routerlink='/login']")).click();

		Thread.sleep(2000);
		
	}

}
