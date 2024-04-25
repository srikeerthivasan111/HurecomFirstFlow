package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.Baseclass;
import utility.Loginpage;

public class Login extends Baseclass {

	@Given("User is on the application login page")
	public void userIsOnTheApplicationLoginPage() {

		System.out.println("// User is on the application home page ");

		browserlauncher();
		maximize();
		time();
		url("http://localhost:4200/#/login");
	}

	@When("User Enter the Login credentials")
	public void userEnterTheLoginCredentials() throws InterruptedException {

		Loginpage login = new Loginpage();

		login.getTxtuser().sendKeys("keerthi");

		login.getTxtpass().sendKeys("keerthi123");

		login.getCode().sendKeys("00014");

		Thread.sleep(2000);

	}

	@When("User Click on the login button")
	public void userClickOnTheLoginButton() {

		Loginpage login = new Loginpage();

		login.getLoginbt().click();

	}

	@Then("User should view the Application Homepage")
	public void userShouldViewTheApplicationHomepage() throws InterruptedException {

		WebElement logo = driver.findElement(By.xpath("//span[@class='p-menuitem-text ng-star-inserted']"));

		String text = logo.getText();

		String s = "Dashboard";

		if (s.equals(text)) {
			System.out.println("// Login into the application successfully ");
		}

		Thread.sleep(3000);
	}

}
