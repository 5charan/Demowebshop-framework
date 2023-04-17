package Runner;
	import org.junit.runner.RunWith;
	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;
	@RunWith(Cucumber.class)
	@CucumberOptions (features ="src/test/resources/Features",glue= {"Testcases"},
	
	plugin = { "pretty",
	"html:target/HtmlReports.html",
	"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm" },
	monochrome = true)
	
	
public class TestRunner {{

	}}























	//@RunWith(Cucumber.class)
	//@CucumberOptions ( features="src\\test\\resources\\Feature",
	//	
//			glue= {"RegisterTestcase"},
//					plugin = { "pretty", "html:target/cucumber-reports",
//							"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
	//},
	//monochrome = true
	//)
















	//
	//@RunWith(Cucumber.class)
	//@CucumberOptions ( features="src\\test\\resources\\Feature",
	//	
//			glue= {"RegisterTestcases,BooksTestcase,ComputersTEstcases,ElectronicsTestcase,LoginTestcase,ShoppingCartTestcases"},
//					plugin = { "pretty", "html:target/cucumber-reports"},
	//monochrome = true
	//)

