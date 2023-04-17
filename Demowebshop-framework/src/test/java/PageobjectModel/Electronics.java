package PageobjectModel;



	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;

	public class Electronics
	{
		WebDriver driver;
		
		By Electronics=By.xpath("//ul[@class='top-menu']//a[normalize-space()='Electronics']");
		
		By cameraAndphoto=By.xpath("//ul[@class='top-menu']//a[normalize-space()='Camera, photo']");
		
		By camera=By.xpath("//img[@title='Show details for Digital SLR Camera 12.2 Mpixel']");
		
		By cart=By.xpath("//input[@id='add-to-cart-button-18']");
		
		By cellphones=By.xpath("//a[@class='hover'][normalize-space()='Cell phones']");
		
		By mobile=By.xpath("//img[@title='Show details for Smartphone']");
		
		By addcart=By.xpath("//input[@id='add-to-cart-button-43']");
		
		public Electronics(WebDriver driver2)
		{
			this.driver=driver2;
	 	}

		public void electonics()
		{
				Actions a=new Actions(driver);
			WebElement Electronic=driver.findElement(Electronics);
			a.moveToElement(Electronic).build().perform();
		}
		
		public void cameraandphoto()
		{
			driver.findElement(cameraAndphoto).click();
		}
		 
		public void camera() 
		{
		driver.findElement(camera).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		}
		
		public void addcart() throws InterruptedException
		{
			driver.findElement(cart).click();
			
			Thread.sleep(3000);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,-250)");
		}
		
		public void cellphones()
		{
	 
			driver.findElement(cellphones).click();		
	 	}
		
		public void mobile()
		{
			driver.findElement(mobile).click();
		}
		public void mobileaddcart()
		{
			driver.findElement(addcart).click();
		}
		
		
		
		
	}
