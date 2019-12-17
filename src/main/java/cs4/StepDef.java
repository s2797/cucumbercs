package cs4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class StepDef {
	

		WebDriver driver;
		@Given("Alex has registered in testmeapp")
		public void alex_has_registered_in_testmeapp() {
			  System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2d.02.11\\eclipse-workspace7\\cucumbercs\\src\\test\\java\\chromedriver.exe");
			  driver=new ChromeDriver();
			  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
			  driver.manage().window().maximize();
			  driver.findElement(By.linkText("SignIn")).click();
			  driver.findElement(By.id("userName")).sendKeys("lalitha");
				driver.findElement(By.id("password")).sendKeys("Password123");
				driver.findElement(By.name("Login")).click();
		   
		}

		@And("alex searches a particular product like headphones")
		public void alex_searches_a_particular_product_like_headphones() throws InterruptedException {
			driver.findElement(By.xpath( "//input[@id='myInput']")).sendKeys( "H");
			Thread.sleep(2000);
			driver.findElement(By.xpath( "//input[@id='myInput']")).sendKeys( "e");
			Thread.sleep(2000);
			driver.findElement(By.xpath( "//input[@id='myInput']")).sendKeys( "a");
			Thread.sleep(2000);
			driver.findElement(By.xpath( "//input[@id='myInput']")).sendKeys( "d");
		
				  
		}

		@When("try to procced to payment without adding any item to cart")
		public void try_to_procced_to_payment_without_adding_any_item_to_cart() {
			//Thread.sleep(2000);
			
			//String title=driver.getTitle();
		  
		}

		@Then("testmeapp doesnt display the cart")
		public void testmeapp_doesnt_display_the_cart() {
		    
		}



	}


