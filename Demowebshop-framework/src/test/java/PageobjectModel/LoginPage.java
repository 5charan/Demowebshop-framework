package PageobjectModel;

	

	import org.junit.Assert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import Utilities.Notepad;
	
	public class LoginPage {

		
		WebDriver driver;
		
		Notepad reader=new Notepad();
		
		
		
	 
		By login=By.xpath("//a[normalize-space()='Log in']");
	 
	 
		By email=By.xpath("//input[@id='Email']");

		By password =By.xpath("//input[@id='Password']");

		By Logibutton=By.xpath("//input[@value='Log in']");
		
		 
		public LoginPage(WebDriver driver2) {
			this.driver=driver2;
		}

		public void login()
		{

			driver.findElement(login).click();
			
			Assert.assertTrue(driver.findElement(login).isEnabled());
			
			System.out.println(driver.findElement(login).isEnabled());
		}
		
		public void email() throws Exception
		{
			driver.findElement(email).sendKeys(reader.getEmail());
			
			Assert.assertNotNull(driver.findElement(email).isDisplayed());
			
			System.out.println(driver.findElement(email).isDisplayed());  
			
		}
		
		public void password() throws Exception
		{
			WebElement paswd=driver.findElement(password);
			
			paswd.sendKeys(reader.getpassword());	
			
			Assert.assertEquals(driver.findElement(password), paswd);
			
		}
		public void loginbutton()
		{
			
			
			WebElement logButton= driver.findElement(Logibutton);
			
			logButton.click();
//	         Assert.assertTrue(driver.findElement(Logibutton).isEnabled());
//			
//			System.out.println(driver.findElement(Logibutton).isEnabled()); 
			
		}
	
}
