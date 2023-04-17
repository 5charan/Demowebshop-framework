package Utilities;
	import java.io.ByteArrayInputStream;
	import java.io.IOException;
	import java.util.UUID;

	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;

	import io.qameta.allure.Allure;
	public class Screenshots {
	

		public static void capture(WebDriver driver) throws IOException 
		{
			Allure.addAttachment(UUID.randomUUID().toString(),
			new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));

		}	
	}