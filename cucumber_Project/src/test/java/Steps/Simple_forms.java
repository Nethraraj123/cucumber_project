package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Simple_forms {
	
	
	WebDriver driver;
	@Given("User Opens the browser and navigate to v{int} training form website")
	public void user_Opens_the_browser_and_navigate_to_v_training_form_website(Integer i) {
	    // Write code here that turns the phrase above into concrete actions
	   
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); // Initialize the ChromeDriver object
		driver.get("https://v1.training-support.net/selenium/simple-form");
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
		
	}

	@When("User Enters Firstname, Last name, Email")
	public void user_Enters_Firstname_Last_name_Email() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.id("firstName")).sendKeys("Nethra");
	   driver.findElement(By.id("lastName")).sendKeys("R");
	   
	   driver.findElement(By.id("email")).sendKeys("nethrar1111@gmail.com");
		
	}

	@When("Contact Number, Message")
	public void contact_Number_Message() {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.id("number")).sendKeys("9876543210");
		 driver.findElement(By.xpath("//textarea[@rows='2']")).sendKeys("Nethra");
		
	   
	}

	@When("Users clicks on Submit")
	public void users_clicks_on_Submit() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("A Confirmation popup is Displayed")
	public void a_Confirmation_popup_is_Displayed() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("confirmation message is displayed");
	   
	   Alert al=driver.switchTo().alert();
	  System.out.println(al.getText()); 
	   al.accept();
	   driver.quit();
	   
	}


}
