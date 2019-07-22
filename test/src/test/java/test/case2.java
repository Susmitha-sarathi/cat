package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class case2 {
	public static WebDriver driver;
	@Given("launch the browser")
	public void launch_the_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\test\\Downloads\\chromedriver_win32\\chromedriver.exe");
	      driver = new ChromeDriver();
		  
	    
	}
	@Given("i enter the url")
	public void i_enter_the_url() {
		driver.get("http://192.168.40.4:8083/TestMeApp1");
		  driver.manage().window().maximize();
		 
			
	}

	@Given("click on signin button")
	public void click_on_signin_button() {
		driver.findElement(By.partialLinkText("SignIn")).click();
		
	}

	@Given("enter the username {string}")
	public void enter_the_username(String string) {
		driver.findElement(By.id("userName")).sendKeys(string);
		  
		  
		 
	    
	}

	@Given("enter the password {string}")
	public void enter_the_password(String string) {
		driver.findElement(By.id("password")).sendKeys(string);
	    
	}

	@Then("click on login button")
	public void click_on_login_button() {
		 driver.findElement(By.name("Login")).click();
	    
	}

	
}
