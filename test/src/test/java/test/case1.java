package test;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class case1 {
	
 public static WebDriver driver;
 

	@Given("I want to launch the brower")
	public void i_want_to_launch_the_brower() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\test\\Downloads\\chromedriver_win32\\chromedriver.exe");
	      driver = new ChromeDriver();
		  
	    
	}

	@Given("enter the url")
	public void enter_the_url() {
		driver.get("http://192.168.40.4:8083/TestMeApp1");
		  driver.manage().window().maximize();
		 
			
	   
	    
	}

	@Given("click on signup button")
	public void click_on_signup_button() {
		driver.findElement(By.linkText("SignUp")).click();
	    
	    
	}

	@Then("enter the valid credentials")
	public void enter_the_valid_credentials(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);
		driver.findElement(By.name("userName")).sendKeys(list.get(0).get("Username"));
		driver.findElement(By.name("firstName")).sendKeys(list.get(0).get("Firstname"));
		driver.findElement(By.name("lastName")).sendKeys(list.get(0).get("Lastname"));
		driver.findElement(By.name("password")).sendKeys(list.get(0).get("Password"));
	    driver.findElement(By.name("confirmPassword")).sendKeys(list.get(0).get("confirm password"));
	    
	    driver.findElement(By.xpath(".//input[@value='Female']")).click();
	    
	    driver.findElement(By.name("emailAddress")).sendKeys(list.get(0).get("Email"));
		
		  driver.findElement(By.name("mobileNumber")).sendKeys(list.get(0).get("Mobile num"));
			 
		 driver.findElement(By.name("dob")).sendKeys(list.get(0).get("DOB"));
			  
		driver.findElement(By.name("address")).sendKeys(list.get(0).get("Address"));
			
		  driver.findElement(By.xpath(".//select[@name='securityQuestion']")).click();
			  
		driver.findElement(By.name("answer")).sendKeys("29/12/1997");
			 
		
			 
		 
	   
	}

	@Then("click on register")
	public void click_on_register() {
		 driver.findElement(By.xpath(".//input[@value='Register']")).click();
	   
	   
	}

}
