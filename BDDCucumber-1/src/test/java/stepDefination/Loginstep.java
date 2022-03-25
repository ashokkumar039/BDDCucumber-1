package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Loginstep {
	WebDriver driver;
	
	@Given("^Open chrome and start application$")
	public void open_chrome_and_start_application()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Java-Automation\\BDDCucumber-1\\BrowserDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/V1/index.php");
	}
	
	@When("^I enter valid username and password$")
	public void i_enter_valid_username_and_password()
	{
		driver.findElement(By.name("uid")).sendKeys("mngr394612");
		driver.findElement(By.name("password")).sendKeys("veremUt");
	}
	
	@And("^I click the login button$")
	public void I_click_the_login_button()
	{
		driver.findElement(By.name("btnLogin")).click();
	}
	
	@Then("^User should be able to login successfully$")
	public void User_should_be_able_to_login_successfully()
	{
		String name = driver.getTitle();
		System.out.println(name);
		driver.close();
	}
}



