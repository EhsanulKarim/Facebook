package stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginToFacebook {
	WebDriver driver;
	
	@Given("^User is in Facebook HomePage$")
	public void user_is_in_Facebook_HomePage() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Readysr_Laptops\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	    
	}

	@When("^User enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and(String arg1, String arg2) throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(arg1);
		
		
	    
	}

	@When("^click on Login button$")
	public void click_on_Login_button() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).clear();
	    
	}

	@Then("^facebook account open$")
	public void facebook_account_open() throws Throwable {
	    
	}


}
