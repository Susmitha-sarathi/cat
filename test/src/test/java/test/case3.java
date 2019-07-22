package test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class case3 {
	
	 public static WebDriver driver;
	 
	@When("Alex has registered into TestMeapp")
	public void alex_has_registered_into_TestMeapp() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\test\\Downloads\\chromedriver_win32\\chromedriver.exe");
	      driver = new ChromeDriver();
	      driver.get("http://192.168.40.4:8083/TestMeApp1");
		  driver.manage().window().maximize();
		  driver.findElement(By.partialLinkText("SignIn")).click();
		  driver.findElement(By.id("userName")).sendKeys("AlexUser");
		  driver.findElement(By.id("password")).sendKeys("Alex@123");
		  driver.findElement(By.name("Login")).click();
		  }

	@When("Alex search a particular product like Hearphone")
	public void alex_search_a_particular_product_like_Hearphone() {
		Actions action = new Actions(driver);
		  try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  WebElement All_cat = driver.findElement(By.xpath(".//span[contains(text(),\"Categories\")]"));
		  action.moveToElement(All_cat).click().build().perform();
		  
		  action.moveToElement(driver.findElement(By.xpath(".//span[text()=\"Electronics\"]"))).click().build().perform();
		 
		  try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  action.moveToElement(driver.findElement(By.xpath(".//span[text()=\"Head Phone\"]"))).click().build().perform();
	    
	}

	@When("try to procced to payment without adding any item in the cart")
	public void try_to_procced_to_payment_without_adding_any_item_in_the_cart() {
		if(driver.findElements(By.cssSelector("i.fa.fa-shopping-cart")).size()!=0) {
			driver.findElement(By.cssSelector("i.fa.fa-shopping-cart")).click();
	    
	}
		else
			System.out.println("\n\n cart not visible\n\n");
	}

	@Then("TestMe doesn't display add to cart")
	public void testme_doesn_t_display_add_to_cart() {
		Assert.assertEquals(0,driver.findElements(By.cssSelector("i.fa.fa-shopping-cart")).size());
	    
	}

/*	@Given("Alex register into the TestMeApp")
	public void alex_register_into_the_TestMeApp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\test\\Downloads\\chromedriver_win32\\chromedriver.exe");
	      driver = new ChromeDriver();
	      driver.get("http://192.168.40.4:8083/TestMeApp1");
		  driver.manage().window().maximize();
		  driver.findElement(By.partialLinkText("SignIn")).click();
		  driver.findElement(By.id("userName")).sendKeys("AlexUser");
		  driver.findElement(By.id("password")).sendKeys("Alex@123");
		  driver.findElement(By.name("Login")).click();
	    
		
	}

	@Given("search for Headphone")
	public void search_for_Headphone() {
		Actions action = new Actions(driver);
		  try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  WebElement All_cat = driver.findElement(By.xpath(".//span[contains(text(),\"Categories\")]"));
		  action.moveToElement(All_cat).click().build().perform();
		  
		  action.moveToElement(driver.findElement(By.xpath(".//span[text()=\"Electronics\"]"))).click().build().perform();
		 
		  try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  action.moveToElement(driver.findElement(By.xpath(".//span[text()=\"Head Phone\"]"))).click().build().perform();
	    
		
	    
	}

	@Given("add to cart")
	public void add_to_cart() {driver.findElement(By.xpath(".//a[@class='btn btn-success btn-product']")).click();
	  
	  driver.findElement(By.xpath(".//a[@href='displayCart.htm']")).click();
	  
	  driver.findElement(By.xpath(".//a[@href='checkout.htm']")).click();
	  
	 // driver.findElement(By.xpath(".//input[@value='Proceed to Pay']")).click();
	    
	}

	@Then("proceed to pay")
	public void proceed_to_pay() {
		 driver.findElement(By.xpath(".//input[@value='Proceed to Pay']")).click();
		    
	    
	}*/


}
