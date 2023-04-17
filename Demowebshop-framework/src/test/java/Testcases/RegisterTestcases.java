package Testcases;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Utilities.StaticWaits;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Utilities.Highlights;
import Utilities.Screenshots;
import Utilities.Notepad;
import Utilities.ScreenRecording;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import PageobjectModel.RegisterPage;
import Testbase.TestBase;



public class RegisterTestcases {
	WebDriver driver;
	StaticWaits st=new StaticWaits();
	Notepad reader = new Notepad();
	
	@Given("open the browser")
	public void open_the_browser() throws Exception {

		
		
		System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		
		driver.get("https://demowebshop.tricentis.com/");
	}

	@Then("click on the Register")
	public void click_on_the_register() throws IOException {

		 RegisterPage rp=new RegisterPage(driver);
		 Highlights h=new Highlights(driver);
		 h.register();
		 Screenshots.capture(driver);
		 st.staticShortWait();
		 rp.register();
		 Screenshots.capture(driver);
		 st.staticShortWait();
	}

	@When("click on the Gender")
	public void click_on_the_gender() throws Exception {
		 RegisterPage rp=new RegisterPage(driver);
		 rp.gender();
		 Screenshots.capture(driver);
		 st.staticShortWait();
	}

	@Then("Enter a Firstname  {string}")
	public void enter_a_firstname(String string) throws Exception {
		 RegisterPage rp=new RegisterPage(driver);
		 rp.firstname(string);
		 Screenshots.capture(driver);
		 st.staticShortWait();
	}

	@When("enter a Lastname {string}")
	public void enter_a_lastname(String string) throws Exception {
		 RegisterPage rp=new RegisterPage(driver);
		 rp.lastname(string);
		 Screenshots.capture(driver);
		 st.staticShortWait();
	}

	@Then("Enter a Email {string}")
	public void enter_a_email(String string) throws Exception {
		 RegisterPage rp=new RegisterPage(driver);
		 rp.mail(string);
		 Screenshots.capture(driver);
         st.staticShortWait();
	}

	@When("enter the Password\"<password>\"")
	public void enter_the_password_password() throws Exception {
		RegisterPage rp=new RegisterPage(driver);
		 rp.password(null );
		 Screenshots.capture(driver);
        st.staticShortWait();
	}

	@Then("Enter a  ConfirmPassword {string}")
	public void enter_a_confirm_password(String string) throws Exception {
		RegisterPage rp=new RegisterPage(driver);
		rp.confirmpassword(null);
		Screenshots.capture(driver);
		st.staticShortWait();
	}

	@When("click on a Register button")
	public void click_on_a_register_button() throws Exception {
		RegisterPage rp=new RegisterPage(driver);
		rp.registerbutton();
		Screenshots.capture(driver);
		st.staticShortWait();
		ScreenRecording.startRecord("DEMO WEB SHOP");
//		 rp.logout();
//		 Screenshots.capture(driver);
//		 st.staticShortWait();	   	
			
//		ScreenRecorderUtil.stopRecord();
		
		
	}

}
