package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Jobassigning extends Baseclass {

	 
	public Jobassigning() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@routerlinkactive='menu-active'])[2]")
	public WebElement jobassigned;

	@FindBy(xpath = "(//button[@type='button'])[11]")
	public WebElement addcandidate;

	@FindBy(xpath = "//input[@role='searchbox']")
	public WebElement mobilenumber;

	@FindBy(xpath = "//input[@formcontrolname='name']")
	public WebElement candidatename;

	@FindBy(xpath = "//input[@formcontrolname='email']")
	public WebElement candidateemail;

	@FindBy(xpath = "//div[@role='button']")
	public WebElement genderdrop;

	@FindBy(xpath = "//li[@aria-label='Male']")
	public WebElement malegender;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	public WebElement candidatequlification;

	@FindBy(className = "p-multiselect-trigger")
	public WebElement candidatelanguage;

	@FindBy(xpath = "//li[@aria-label='English']//div[@class='p-checkbox-box']")
	public WebElement englishlan;

	@FindBy(xpath = "//li[@aria-label='Tamil']//div[@class='p-checkbox-box']")
	public WebElement tamillanguage;

	@FindBy(xpath = "//p-checkbox[@inputid='fresher']//div[@class='p-checkbox-box']")
	public WebElement professinaldetails;

	@FindBy(xpath = "( //input[@type='text'])[14]")
	public WebElement candidateskills;

	@FindBy(xpath = "//button[@type='button']")
	public WebElement addresume;

	@FindBy(xpath = "(//div[@role='button'])[3]")
	public WebElement locationdrop;

	@FindBy(xpath = "//li[@role='option']")
	public WebElement locationbt;

	@FindBy(xpath = "(//div[@role='button'])[4]")
	public WebElement statusdropdown;

	@FindBy(xpath = "//li[@aria-label='To be Schedule']")
	public WebElement status;

	@FindBy(xpath = "(//button[@type='button'])[3]")
	public WebElement sumbit;

	@FindBy(xpath = "(//button[@type='button'])[2]")
	public WebElement reset;

	@FindBy(xpath = "(//button[@type='button'])[4]")
	public WebElement okbutton;

	@FindBy(xpath = "//span[normalize-space()='Assigned Jobs']")
	public WebElement assignedjobbt;

	@FindBy(xpath = "(//input[@type='text'])[7]")
	public WebElement companynaem;

	@FindBy(xpath = "(//input[@type='text'])[8]")
	public WebElement designation;

	@FindBy(xpath = "//input[@formcontrolname='totalWorkExperience']")
	public WebElement totalexperienceyears;

	@FindBy(xpath = " //input[@class='p-inputtext p-component p-element ng-untouched ng-pristine ng-valid']")
	public WebElement revelantexperienceinyears;

	@FindBy(xpath = "(//input[@type='text'])[9]")
	public WebElement currentlocation;

	@FindBy(xpath = "(//input[@type='text'])[10]")
	public WebElement preferredlocation;

	@FindBy(xpath = "//input[@formcontrolname='currentCostToCompany']")
	public WebElement currentctcinlakhs;

	@FindBy(xpath = "//input[@formcontrolname='expectedCostToCompany']")
	public WebElement expectedctcclakhs;

	@FindBy(xpath = "//p-dropdown[@placeholder='Select Notice Period']//div[@aria-label='dropdown trigger']")
	public WebElement noticeperioddrop;

	@FindBy(xpath = "//li[@aria-label='Immediate']")
	public WebElement noticeperiodname;

	@FindBy(xpath = "(//input[@type='text'])[12]")
	public WebElement reasontochange;

	@FindBy(xpath = "(//input[@type='text'])[13]")
	public WebElement sourceofhiring;

	@FindBy(xpath = "(//div[@class='p-checkbox-box'])[2]")
	public WebElement checkbox;

	@FindBy(xpath = "(//a[@role='presentation'])[2]")
	public WebElement jobopenings;

	@FindBy(xpath = "/html/body/app-root/div[1]/app-side-bar/div/div/div/div[2]/ul/li[7]/a")
	public WebElement clients;

	@FindBy(xpath = "(//button[@type='button'])[4]")
	public WebElement errormessageobutton;

	@FindBy(xpath = "(//button[@type='button'])[4]")
	public WebElement sharejob;

	@FindBy(xpath = "//span[normalize-space()='Generate Link']")
	public WebElement generatelink;

	@FindBy(xpath = "/html/body/p-dynamicdialog/div/div/div[2]/app-share-requirement/div[8]/div/i")
	public WebElement statuscopybt;

	@FindBy(xpath = " (//button[@type='button'])[13]")
	public WebElement shareclosebt;

	@FindBy(xpath = "//input[@type='text']")
	public WebElement sharemobilenumber;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	public WebElement sharecandidatename;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	public WebElement shareemail;

	@FindBy(xpath = " //div[@role='button']")
	public WebElement sharegenderdrop;

	@FindBy(xpath = "//li[@aria-label='Male']")
	public WebElement sharegendermale;

	@FindBy(xpath = "//input[@formcontrolname='qualification']")
	public WebElement sharequalification;

	@FindBy(xpath = "//div[@class='p-multiselect-trigger']")
	public WebElement sharelanguagedrop;

	@FindBy(xpath = "//li[@aria-label='English']//div[@class='p-checkbox-box']")
	public WebElement sharelaunguageengilish;

	@FindBy(xpath = "//li[@aria-label='Tamil']//div[@class='p-checkbox-box']")
	public WebElement sharelaunguagetamil;

	@FindBy(xpath = "/html/body/app-root/div/app-apply-job/div/div[2]/form/div[4]/p-checkbox/div/div[2]")
	public WebElement shareprofessionalbt;

	@FindBy(xpath = "//li[@class='p-chips-input-token']//input[@type='text']")
	public WebElement shareskills;

	@FindBy(xpath = "//p-dropdown[@placeholder='Select Location']//div[@aria-label='dropdown trigger']")
	public WebElement sharelocationdrop;

	@FindBy(xpath = "//li[@aria-label='kodambakkam, Chennai']")
	public WebElement sharelocationname;

	@FindBy(xpath = " /html/body/app-root/div/app-apply-job/div/div[2]/form/div[6]/div[2]/div/p-button/button/span")
	public WebElement shareapplybutton;

	@FindBy(xpath = "(//button[@type='button'])[2]")
	public WebElement sharesuccessokbt;

	@FindBy(xpath = "/html/body/p-dynamicdialog/div/div/div[1]/span")
	public WebElement sharesuccessmessage;

	@FindBy(xpath = "//button[@type='button']")
	public WebElement Shareaddresumebt;
 
	@FindBy(xpath = "//div[@class='message']")
	public WebElement  candidateaddedmessage;
	
	
	
	

	public WebElement getCandidateaddedmessage() {
		return candidateaddedmessage;
	}
 	 
	public WebElement getShareprofessionalbt() {
		return shareprofessionalbt;
	}

	public WebElement getShareaddresumebt() {
		return Shareaddresumebt;
	}

	public WebElement getSharesuccessokbt() {
		return sharesuccessokbt;
	}

	public WebElement getSharesuccessmessage() {
		return sharesuccessmessage;
	}

	public WebElement getSharemobilenumber() {
		return sharemobilenumber;
	}

	public WebElement getSharecandidatename() {
		return sharecandidatename;
	}

	public WebElement getShareemail() {
		return shareemail;
	}

	public WebElement getSharegenderdrop() {
		return sharegenderdrop;
	}

	public WebElement getSharegendermale() {
		return sharegendermale;
	}

	public WebElement getSharequalification() {
		return sharequalification;
	}

	public WebElement getSharelanguagedrop() {
		return sharelanguagedrop;
	}

	public WebElement getSharelaunguageengilish() {
		return sharelaunguageengilish;
	}

	public WebElement getSharelaunguagetamil() {
		return sharelaunguagetamil;
	}

	public WebElement getShareskills() {
		return shareskills;
	}

	public WebElement getSharelocationdrop() {
		return sharelocationdrop;
	}

	public WebElement getSharelocationname() {
		return sharelocationname;
	}

	public WebElement getShareapplybutton() {
		return shareapplybutton;
	}

	public WebElement getShareclosebt() {
		return shareclosebt;
	}

	public WebElement getStatuscopybt() {
		return statuscopybt;
	}

	public WebElement getSharejob() {
		return sharejob;
	}

	public WebElement getGeneratelink() {
		return generatelink;
	}

	public WebElement getErrormessageobutton() {
		return errormessageobutton;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getJobopenings() {
		return jobopenings;
	}

	public WebElement getClients() {
		return clients;
	}

	public WebElement getAssignedjobbt() {
		return assignedjobbt;
	}

	public WebElement getCompanynaem() {
		return companynaem;
	}

	public WebElement getDesignation() {
		return designation;
	}

	public WebElement getTotalexperienceyears() {
		return totalexperienceyears;
	}

	public WebElement getRevelantexperienceinyears() {
		return revelantexperienceinyears;
	}

	public WebElement getCurrentlocation() {
		return currentlocation;
	}

	public WebElement getPreferredlocation() {
		return preferredlocation;
	}

	public WebElement getCurrentctcinlakhs() {
		return currentctcinlakhs;
	}

	public WebElement getExpectedctcclakhs() {
		return expectedctcclakhs;
	}

	public WebElement getNoticeperioddrop() {
		return noticeperioddrop;
	}

	public WebElement getNoticeperiodname() {
		return noticeperiodname;
	}

	public WebElement getReasontochange() {
		return reasontochange;
	}

	public WebElement getSourceofhiring() {
		return sourceofhiring;
	}

	public WebElement getOkbutton() {
		return okbutton;
	}

	public WebElement getSumbit() {
		return sumbit;
	}

	public WebElement getReset() {
		return reset;
	}

	public WebElement getStatus() {
		return status;
	}

	public WebElement getLocationdrop() {
		return locationdrop;
	}

	public WebElement getLocationbt() {
		return locationbt;
	}

	public WebElement getStatusdropdown() {
		return statusdropdown;
	}

	public WebElement getJobassigned() {
		return jobassigned;
	}

	public WebElement getAddcandidate() {
		return addcandidate;
	}

	public WebElement getMobilenumber() {
		return mobilenumber;
	}

	public WebElement getCandidatename() {
		return candidatename;
	}

	public WebElement getCandidateemail() {
		return candidateemail;
	}

	public WebElement getGenderdrop() {
		return genderdrop;
	}

	public WebElement getMalegender() {
		return malegender;
	}

	public WebElement getCandidatequlification() {
		return candidatequlification;
	}

	public WebElement getCandidatelanguage() {
		return candidatelanguage;
	}

	public WebElement getEnglishlan() {
		return englishlan;
	}

	public WebElement getTamillanguage() {
		return tamillanguage;
	}

	public WebElement getProfessinaldetails() {
		return professinaldetails;
	}

	public WebElement getCandidateskills() {
		return candidateskills;
	}

	public WebElement getAddresume() {
		return addresume;
	}

}
