package pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StackAdapt_HomePage {

	
	WebDriver ldriver;
	public StackAdapt_HomePage(WebDriver rDriver) {
		
		ldriver= rDriver;
		PageFactory.initElements(rDriver, this);	
	}
	
	@FindBy(xpath="//button[normalize-space()='×']")
	WebElement CookieNotice;
	
	@FindBy (xpath="(//a[contains(@href, '/get-started')])[4]")
	WebElement requestaDemo;
	
	@FindBy (xpath="//input[@id='first_name']")
	WebElement FirstName;
	
	@FindBy (xpath="//input[@id='last_name']")
	WebElement LastName;
	
	@FindBy (xpath="//input[@id='email']")
	WebElement BusEmail;
	
	@FindBy (xpath="//input[@id='phone']")
	WebElement PhNum;
	
	@FindBy (xpath="//input[@id='company_name']")
	WebElement CompanyName;
	
	@FindBy (xpath="//input[@id='job_title']")
	WebElement JobTitle;
	
	@FindBy (xpath="//select[@id='company_type']")
	WebElement CompanyType ;
	
	@FindBy (xpath="//select[@id='company_size']")
	WebElement CompanySize;
	
	@FindBy(xpath="//select[@id='country']")
	WebElement SelectCountry;
	
	
	@FindBy(xpath="//select[@id='province']")
	WebElement SelectProvince;
	
	@FindBy(xpath="//div[17]/fieldset/label")
	WebElement Iagree;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	@FindBy(xpath="//*[@id='budget']/option[3]")
	WebElement AnualBudget;
	
	@FindBy(xpath ="//select[@id='intention']")
	WebElement WorkingwitUS;

	//ActionMethods

	
	public void CookieNotice()
	{
		CookieNotice.click();
	}
	public void clickOnRequestaDemo()
	{
		requestaDemo.click();
	}
	
	public void EnterFirstName(String name)
	{
		FirstName.sendKeys(name);
	}
	
	public void EnterLastName(String Lname)
	{
		LastName.sendKeys(Lname);
	}
	
	public void EnterBusinessEmail(String Bemail)
	{
		BusEmail.sendKeys(Bemail);
	}
	public void PhoneNumber(String Pnum)
	{
		PhNum.sendKeys(Pnum);
	}
	public void CompanyName(String CompName)
	
	{
		CompanyName.sendKeys(CompName);
		
	}
	
	public void JobTitle(String Job)
	{
		JobTitle.sendKeys(Job);
	
	}
	public void CompanyType(String Company) 
	{
		CompanyType.sendKeys(Company);
		
	}
	
	public void CompanySize(String size)
	{
		CompanySize.sendKeys(size);
	}
	
	public void SelectCountry(String Country)
	{
		SelectCountry.sendKeys(Country);
	}
	public void SelectProvince(String Province)
	{
		SelectProvince.sendKeys(Province);
	}
	public void IAgreeCheckbox() throws InterruptedException 
	{
	
		Thread.sleep(4000);
		Iagree.click();
	}
	
	public void Budget(String budget)
	{
		AnualBudget.sendKeys(budget);
	}
	
	public void WorkwithUs(String Workwith) 
	{
		
		WorkingwitUS.sendKeys(Workwith);
	}
	
	public void ClickSubmit() throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println("Submit clicked");
		submit.click();
		Thread.sleep(5000);
	}
	public void CloseBrowser()
	{
		ldriver.close();
		
	}

}



