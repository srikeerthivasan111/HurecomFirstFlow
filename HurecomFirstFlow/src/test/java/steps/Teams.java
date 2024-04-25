package steps;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.Baseclass;
import utility.TeamAndClient;

public class Teams extends Baseclass {

	@Given("User should navigate to the Teams menu")
	public void userShouldNavigateToTheTeamsMenu() throws InterruptedException {

		TeamAndClient team = new TeamAndClient();

		team.getTeams_Menu_BT().click();

		Thread.sleep(2000);

	}

	@Given("User click on the Create User button")
	public void userClickOnTheCreateUserButton() throws InterruptedException {

		TeamAndClient team = new TeamAndClient();

		team.getCreate_UserBt().click();

		Thread.sleep(2000);
	}

	@Given("Enter the users valid credentials")
	public void enterTheUsersValidCredentials() throws InterruptedException {

		TeamAndClient team = new TeamAndClient();

		team.getUser_name().sendKeys("Kutty");

		team.getUser_MobileNuber().sendKeys("9677506192");

		Thread.sleep(2000);

		team.getUser_Email().sendKeys("cutekeerthi111@gmail.com");

		team.getRole_Dropdown_Bt().click();

		Thread.sleep(1000);

		team.getManager_Option().click();
		
		Thread.sleep(1000);

		team.getOrganization_Dropdown_Bt().click();

		driver.findElement(By.xpath("//li[@role='option']")).click();

		Thread.sleep(2000);

		team.getOrganization_Locaiton_dropdown_Bt().click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//li[@role='option']")).click();

		team.getUser_UserName().sendKeys("kutty");

		team.getUser_Password().sendKeys("kutty123");

		team.getStatus_Dropdown_Bt().click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//li[@role='option']")).click();

		team.getCreate_Bt().click();

	}

	@Then("User Can view that Success message")
	public void userCanViewThatSuccessMessage() throws InterruptedException {

		TeamAndClient team = new TeamAndClient();

		String text = team.getPopup_Text_messages().getText();

		String message = "User created successfully.";

		Thread.sleep(1000);
		if (text.equals(message)) {

			System.out.println("// Users can be created Successfully ");

			team.getPopup_Ok_Bt().click();
		}
		Thread.sleep(2000);

	}

	@Given("User should enter the manager details")
	public void userShouldEnterTheManagerDetails() throws InterruptedException {

		TeamAndClient team = new TeamAndClient();

		team.getUser_name().sendKeys("jeeva");

		team.getUser_MobileNuber().sendKeys("8056148722");

		Thread.sleep(2000);

		team.getUser_Email().sendKeys("sumanravi1225@gmail.com");

		team.getRole_Dropdown_Bt().click();

		Thread.sleep(1000);

		team.getLead_Option().click();

		Thread.sleep(1000);

		team.getOrganization_Dropdown_Bt().click();

		driver.findElement(By.xpath("//li[@role='option']")).click();

		Thread.sleep(2000);

		team.getOrganization_Locaiton_dropdown_Bt().click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//li[@role='option']")).click();

		team.getUser_UserName().sendKeys("jeeva");

		team.getUser_Password().sendKeys("jeeva123");

		team.getStatus_Dropdown_Bt().click();

		Thread.sleep(2000);

	}

	@Given("User click on the create button")
	public void userClickOnTheCreateButton() {

		TeamAndClient team = new TeamAndClient();

		team.getCreate_Bt().click();

	}

	@Then("User can view the success message on the users page")
	public void userCanViewTheSuccessMessageOnTheUsersPage() throws InterruptedException {

		TeamAndClient team = new TeamAndClient();

		String text = team.getPopup_Text_messages().getText();

		String message = "User created successfully.";

		Thread.sleep(1000);
		if (text.equals(message)) {

			System.out.println("// Users can be created Successfully ");

			team.getPopup_Ok_Bt().click();
		}
		Thread.sleep(2000);

		driver.findElement(By.xpath("//i[@routerlink='/admin/users']")).click();

	}

	@Given("User should navigate to teams page")
	public void userShouldNavigateToTeamsPage() throws InterruptedException {

		TeamAndClient team = new TeamAndClient();

		Thread.sleep(2000);

		team.getTeams_Menu_Bar().click();

	}

	@Given("user click on the Create team menu")
	public void userClickOnTheCreateTeamMenu() {

		TeamAndClient team = new TeamAndClient();

		team.getCreate_Team_Bt().click();

	}

	@Given("Enter the Teams valid details")
	public void enterTheTeamsValidDetails() throws InterruptedException {

		TeamAndClient team = new TeamAndClient();

		Thread.sleep(2000);

		team.getTeam_Code().sendKeys("A001");

		team.getTeam_name().sendKeys("STAR");

		team.getCreate_Team_Status().click();

		Thread.sleep(2000);

		driver.findElement(By.xpath(" //li[@role='option']")).click();

		team.getCreate_Bt().click();

		String text = driver.findElement(By.xpath("//div[text()='Team created successfully.']")).getText();

		String message = "//div[text()='Team created successfully.']";

		if (text.equals(message)) {

			System.out.println("// Teams can be created successfully ");
		}

		Thread.sleep(3000);
	}

	@Given("Add the users in the team")
	public void addTheUsersInTheTeam() throws InterruptedException {

		// update button of the Teams
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/span[1]/i[1]")).clear();

		Thread.sleep(2000);

	}

	@When("User click on the Update button")
	public void userClickOnTheUpdateButton() throws InterruptedException {

		TeamAndClient team = new TeamAndClient();

		team.getAdd_MembersBt().click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//div[@role='checkbox'])[2]")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("(//div[@role='checkbox'])[3]")).click();

		Thread.sleep(1000);

	}

	@Then("User can view that success message for creating the teams")
	public void userCanViewThatSuccessMessageForCreatingTheTeams() throws InterruptedException {

		// Add bt of creating team
		driver.findElement(By.xpath("(//p-button[@class='p-element'])[3]")).click();

		String text = driver.findElement(By.xpath("//div[text()='Members added to the Team successfully.']")).getText();

		String Msg = "//div[text()='Members added to the Team successfully.']";

		if (text.equals(Msg)) {
			System.out.println("// User can be added the user in the team ");

		}

		Thread.sleep(3000);

		driver.findElement(By.xpath(" //i[@routerlink='/admin/teams']")).click();

	}

}
