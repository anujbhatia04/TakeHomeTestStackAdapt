package stepDefination;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.StackAdapt_HomePage;

public class Steps_StackAdapt {

	public WebDriver driver ;
	public StackAdapt_HomePage St_home;

	@Given("user launches broswer")
	public void user_launches_broswer() {

		WebDriverManager.firefoxdriver().setup();
		driver =new FirefoxDriver();
		St_home =new StackAdapt_HomePage(driver);
	}

	@When("user opens URL {string}")// URL will be fetched from feature file
	public void user_opens_url(String url) throws InterruptedException {

		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(5000);//Waiting for the page to load properly
		St_home.CookieNotice();// TO close the cookie notice alert at bottom	
	}

	@Then("user clicks on request a demo")
	public void user_clicks_on_request_a_demo() throws InterruptedException {

		St_home.clickOnRequestaDemo();
	}
	@And("user enter customer info")
	public void user_enter_customer_info() throws InterruptedException{


		St_home.EnterFirstName("jane");
		St_home.EnterLastName("Doe");
		St_home.EnterBusinessEmail("jane.doe@advertising.com");
		St_home.PhoneNumber("+1112223344");
		St_home.CompanyName("advertising.com");
		St_home.JobTitle("Chief Executive Officer");
		St_home.CompanyType("publisher");
		St_home.CompanySize("Less than 10");//adding these to script as they are mandatory for form submission
		St_home.SelectCountry("Canada");
		St_home.SelectProvince("Ontario");
		St_home.IAgreeCheckbox();
		St_home.Budget("$100,000 - $250,000");//adding these to script as they are mandatory for form submission
		St_home.WorkwithUs("Run campaigns in StackAdapt");//adding these to script as they are mandatory for form submission
		St_home.ClickSubmit();
		St_home.CloseBrowser();



	}





}
