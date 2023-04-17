package Testcases;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Utilities.Highlights;
import Utilities.Notepad;
import Utilities.StaticWaits;
import Utilities.Screenshots;
import PageobjectModel.LoginPage;




public class LoginTestcase {
	WebDriver driver;

	StaticWaits st=new StaticWaits();
	Notepad reader= new Notepad();
	@Given("user should open the browser")
	public void user_should_open_the_browser() throws Exception {
		System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
 	    st.staticShortWait();
 	   driver.get(reader.getUrl());
		driver.manage().window().maximize();
	}

	@Then("user Login to the application")
	public void user_login_to_the_application() throws Exception {
		 LoginPage lp= new LoginPage(driver);
		 Highlights h=new Highlights(driver);
	     h.login();
	     Screenshots.capture(driver);
 	     st.staticShortWait();
		 lp.login();
	     Screenshots.capture(driver);
	     st.staticShortWait();
	}

	@When("enter the valid email")
	public void enter_the_valid_email() throws Exception {
		 LoginPage lp= new LoginPage(driver);		 
		 lp.email();		 
		 Screenshots.capture(driver);		 
		 st.staticShortWait();
	}

	@When("enter the valid password")
	public void enter_the_valid_password() throws Exception {
		LoginPage lp= new LoginPage(driver);		
		lp.password();		
		Screenshots.capture(driver);		
		st.staticShortWait();
	}

	@Then("click on the login button")
	public void click_on_the_login_button() throws Exception {
		 LoginPage lp= new LoginPage(driver);		 
		 Highlights h=new Highlights(driver);
	     h.loginbutton();
		 Screenshots.capture(driver);		 
		 lp.loginbutton( );		 
		 Screenshots.capture(driver);


		
	}
}
