package Utilities;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Highlights {
	WebDriver driver;
	
	public Highlights(WebDriver driver2)
	{

    this.driver=driver2;
    }

	public void register()
	{
		WebElement register = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);", register, "color: red; border: 5px solid red;");
		if(register.isDisplayed())
		{
			System.out.println("register is highlighted");
		}
		else 
		{
			System.out.println("register is not highlighted");

		}
}
	
	public void login()
	{
		WebElement login = driver.findElement(By.xpath("//a[normalize-space()='Log in']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);", login, "color: black; border: 5px solid red;");
		if(login.isDisplayed())
		{
		System.out.println("login is highlighted");
		}
		else
		{
		System.out.println("login is not highlighted");

		}
	}
	
	
	
	public void loginbutton()
	{
		
		WebElement login = driver.findElement(By.xpath("//input[@value='Log in']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);", login, "color: black; border: 5px solid red;");
		if(login.isDisplayed())
		{
		System.out.println("login is highlighted");
		}
		else
		{
		System.out.println("login is not highlighted");

		}
	}
	
	
	public void ApparealAndShoes()
	{
		
		{
			WebElement Books = driver.findElement(By.xpath("//ul[@class='top-menu']//a[normalize-space()='Apparel & Shoes']"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', arguments[1]);", Books, "color: white; border: 5px solid red;");
			if(Books.isDisplayed())
			{
			System.out.println("Books is highlighted");
			}
			else
			{
			System.out.println("Books is not highlighted");

			}
		}
	}
	
	
	
	public void books()
	{
		
		{
			WebElement Books = driver.findElement(By.xpath("//ul[@class='top-menu']//a[normalize-space()='Books']"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', arguments[1]);", Books, "color: white; border: 5px solid red;");
			if(Books.isDisplayed())
			{
			System.out.println("Books is highlighted");
			}
			else
			{
			System.out.println("Books is not highlighted");

			}
		}
	}
	
	
	public void computers()
	{
		
		{
			WebElement computers = driver.findElement(By.xpath("//ul[@class='top-menu']//a[normalize-space()='Computers']"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', arguments[1]);", computers, "color: white; border: 5px solid red;");
			if(computers.isDisplayed())
			{
			System.out.println("computers is highlighted");
			}
			else
			{
			System.out.println("computers is not highlighted");
			}
			
		}
	}
	
	
	
	public void  digitaldownloads()
	{
		
		{
			WebElement digitaldownloads = driver.findElement(By.xpath("//ul[@class='top-menu']//a[normalize-space()='Digital downloads']"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', arguments[1]);", digitaldownloads, "color: white; border: 5px solid red;");
			if(digitaldownloads.isDisplayed())
			{
			System.out.println("digitaldownloads is highlighted");
			}
			else
			{
			System.out.println("digitaldownloads is not highlighted");
			}
			
		}
	}
	
	
	
	public void  Electronics()
	{
		
		{
			WebElement Electronics = driver.findElement(By.xpath("//ul[@class='top-menu']//a[normalize-space()='Electronics']"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', arguments[1]);", Electronics, "color: white; border: 5px solid red;");
			if(Electronics.isDisplayed())
			{
			System.out.println("Electronics is highlighted");
			}
			else
			{
			System.out.println("Electronics is not highlighted");
			}
			
		}
	}

	public void giftcards()
	{
		{
			WebElement giftcards = driver.findElement(By.xpath("//ul[@class='top-menu']//li[7]"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', arguments[1]);", giftcards, "color: white; border: 5px solid red;");
			if(giftcards.isDisplayed())
			{
			System.out.println("giftcards is highlighted");
			}
			else
			{
			System.out.println("giftcards is not highlighted");
			}
			
		}
	}

	public void jewelry() {
		{
			WebElement jewelry = driver.findElement(By.xpath("//ul[@class='top-menu']//li[6]"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', arguments[1]);", jewelry, "color: white; border: 5px solid red;");
			if(jewelry.isDisplayed())
			{
			System.out.println("jewelry is highlighted");
			}
			else
			{
			System.out.println("jewelry is not highlighted");
			}
			
		}		
	}

 
	
	public void checkout() {
		{
			WebElement Checkout = driver.findElement(By.xpath("//button[@id='checkout']"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', arguments[1]);", Checkout, "color: white; border: 5px solid red;");
			if(Checkout.isDisplayed())
			{
			System.out.println("Checkout is highlighted");
			}
			else
			{
			System.out.println("Checkout is not highlighted");
			}
			
		}		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}