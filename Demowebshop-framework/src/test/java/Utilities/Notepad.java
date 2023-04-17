package Utilities;



	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties; 
	 
	public class Notepad {

		
		public static Properties getPropertyObject() throws IOException
		{

			FileInputStream fp = new FileInputStream("C:\\Users\\cmunikoti\\eclipse-workspace3\\Demowebshop-framework\\src\\test\\resources\\Config\\Config.properties");

			Properties prop = new Properties();

			prop.load(fp);

			return prop;

		}
		
		public String getUrl() throws Exception
		{
		return getPropertyObject().getProperty("url");
		}
		
		public CharSequence getFirstname() throws Exception
		{
		return getPropertyObject().getProperty("firstname");
		}

		public CharSequence getLastname() throws Exception 
		{
			return getPropertyObject().getProperty("lastname");
		}

		public CharSequence getEmail() throws Exception
		{
		return getPropertyObject().getProperty("email");
		} 

		public CharSequence getpassword() throws Exception 
		{
		return getPropertyObject().getProperty("password");
		}

		public CharSequence getconformpassword() throws Exception 
		{
		return getPropertyObject().getProperty("confirmpassword");
		}

		public CharSequence getrecipientname() throws Exception 
		{
		return getPropertyObject().getProperty("Recipientname");
		}

		public CharSequence getrecipientemail() throws Exception 
		{
		return getPropertyObject().getProperty("Recipientemail");
		}

		public CharSequence getname() throws Exception 
		{
		return getPropertyObject().getProperty("name");
		}

		public CharSequence getcompany() throws IOException
		{
		return getPropertyObject().getProperty("company");
		}
		public CharSequence getcity() throws Exception 
		{
		return getPropertyObject().getProperty("city");
		}

		public CharSequence getaddress() throws Exception 
		{
		return getPropertyObject().getProperty("Address");
		}

		public CharSequence getpostalsode() throws Exception
		{
		return getPropertyObject().getProperty("postalcode");
		}

		public CharSequence getphonenumber() throws Exception
		{
		return getPropertyObject().getProperty("phonenumber");
		}

	
}
