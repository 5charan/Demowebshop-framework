package PageobjectModel;

	import org.junit.Assert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	 import Utilities.Notepad; 

	public class RegisterPage {

		WebDriver driver;
		
		Notepad reader = new Notepad();
		
		
		By Register = By.xpath("//a[normalize-space()='Register']");

		By gender = By.xpath("//input[@id='gender-male']");

		By fname = By.xpath("//input[@id='FirstName']");

		By lname = By.xpath("//input[@id='LastName']");

		By mail = By.xpath("//input[@id='Email']");

		By password = By.xpath("//input[@id='Password']");

		By confirmpassword = By.xpath("//input[@id='ConfirmPassword']");

		By Registerbutton = By.xpath("//input[@id='register-button']");

		By Logout = By.xpath("//a[normalize-space()='Log out']");

		public RegisterPage(WebDriver driver) 
		{
			this.driver = driver;
		}

		public void register() {
			
			driver.findElement(Register).click();
			
	     try {
		      Assert.assertNotEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com");
		      Thread.sleep(3000);
		      }
	     catch (Exception ex) 
	     {
			System.out.print(ex.getMessage());
		 }
			
	     System.out.println("AssertNotEquals Test Passed\n");
			
			
		}

		public void gender()
		{
			driver.findElement(gender).click();

			Assert.assertTrue(driver.findElement(gender).isSelected());

			System.out.println(driver.findElement(gender).isSelected());
			
			
			
	 		
//			String male = driver.findElement(gender).getText();
//			System.out.println(male);
//			driver.findElement(gender).;
//			Assert.assertEquals("Male", male);
			
		}

		public void firstname(String fsname) throws Exception 
		{
	    driver.findElement(fname).sendKeys(reader.getFirstname());

			 Assert.assertNotNull(driver.findElement(fname).isDisplayed()); 	

			  System.out.println(driver.findElement(fname).isDisplayed());  
			
	 

//			WebElement fn = driver.findElement(fname);
//			fn.sendKeys(Constants.Firstname);
//			Assert.assertNotNull(fn);	
		}

		public void lastname(String lsname) throws Exception 
		{
			WebElement ln=driver.findElement(lname);
			
			ln.sendKeys(reader.getLastname());
			
//			 Assert.assertNotNull(driver.findElement(lname).isDisplayed()); 	
	//
//			  System.out.println(driver.findElement(lname).isDisplayed());  
			  
			  Assert.assertEquals(driver.findElement(lname), ln);
			
		}

		public void mail(String email) throws Exception 
		{
			driver.findElement(mail).sendKeys(reader.getEmail());
			
			 Assert.assertNotNull(driver.findElement(mail).isDisplayed()); 	

			  System.out.println(driver.findElement(mail).isDisplayed());  
		}

		public void password(String pwd) throws Exception {
			
			driver.findElement(password).sendKeys(reader.getpassword());
			
			
			 Assert.assertNotNull(driver.findElement(password).isDisplayed()); 	

			  System.out.println(driver.findElement(password).isDisplayed());  
		}

		public void confirmpassword(String confpwd) throws Exception {
			
//			driver.findElement(confirmpassword).sendKeys(Constants.confirm_password);
			
//			 Assert.assertNotNull(driver.findElement(confirmpassword).isDisplayed()); 	
	//
//			  System.out.println(driver.findElement(confirmpassword).isDisplayed());
			
			
			WebElement pwd= driver.findElement(confirmpassword);
			
			pwd.sendKeys(reader.getconformpassword());
			 
			Assert.assertEquals(driver.findElement(confirmpassword),pwd );
			  
			  
			  
		}

		public void registerbutton() {
			
			driver.findElement(Registerbutton).click();

//			 Assert.assertTrue(driver.findElement(Registerbutton).isEnabled()); 	
	//
//			  System.out.println(driver.findElement(Registerbutton).isEnabled());
			
		}

		public void logout() {
			driver.findElement(Logout).click();

		}

	}
