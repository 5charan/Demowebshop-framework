package Testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Constants.Constant;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Utilities.StaticWaits;
import Utilities.Screenshots;
import Utilities.Notepad;
import Utilities.ScreenRecording;
import Utilities.Highlights;
import PageobjectModel.Electronics;
import PageobjectModel.LoginPage;

public class Electronicmodule {
	
	WebDriver driver;
	
	StaticWaits st=new StaticWaits();
	Notepad reader= new Notepad();
	@Given("user open the browser")
	public void user_open_the_browser() {
		
		System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
 	    st.staticShortWait();
	    
		
	}

	@When("user enter url {string}")
	public void user_enter_url(String string) throws Exception {
	   ScreenRecording.startRecord("DEMO WEB SHOP");
		driver.get(reader.getUrl());
		driver.manage().window().maximize();

	    Screenshots.capture(driver);
 		st.staticShortWait();

		LoginPage login=new LoginPage(driver); 
		login.login();
		login.email();
		login.password();
		login.loginbutton();
 		
 		
		
	}

	@Then("user Mousehover on the Electronics")
	public void user_mousehover_on_the_electronics() throws Exception {
	  
		Electronics e=new Electronics(driver);
		Highlights h=new Highlights(driver);
		h.Electronics();	
		st.staticShortWait();	
		
		
		e.electonics();
	    Screenshots.capture(driver);
 		st.staticShortWait();
		
	}

	@Then("user click on the Camera and photo")
	public void user_click_on_the_camera_and_photo() throws Exception {
	   
		Electronics e=new Electronics(driver);		
		e.cameraandphoto(); 
	    Screenshots.capture(driver);
	    st.staticShortWait();
		
	}

	@Then("user click any one camera")
	public void user_click_any_one_camera() throws Exception {
	    
		Electronics e=new Electronics(driver);
		e.camera();    
	    Screenshots.capture(driver);
 		st.staticShortWait();
	}

	@Then("user click on the Addtocart")
	public void user_click_on_the_addtocart() throws Exception {

		Electronics e=new Electronics(driver);
		e.addcart(); 
	    Screenshots.capture(driver);
 		st.staticShortWait();
		driver.quit();
		
	}

}
