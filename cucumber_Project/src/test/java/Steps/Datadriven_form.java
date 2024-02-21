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

public class Datadriven_form {
	
WebDriver driver;
@Given("User Opens the chrome browser and navigate to form website")
public void user_opens_the_chrome_browser_and_navigate_to_form_website() {
    // Write code here that turns the phrase above into concrete actions
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver(); // Initialize the ChromeDriver object
	driver.get("https://v1.training-support.net/selenium/simple-form");
	driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS); 
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().window().maximize();
}

@When("User is entering {string}, {string}, {string}")
public void user_is_entering(String Firstname, String Lastname, String Email) {
    // Write code here that turns the phrase above into concrete actions
	 driver.findElement(By.id("firstName")).sendKeys(Firstname);
	   driver.findElement(By.id("lastName")).sendKeys(Lastname);
	   
	   driver.findElement(By.id("email")).sendKeys(Email);
}

@When("user is entering  {string}, {string}")
public void user_is_entering(String Number, String Message) {
    // Write code here that turns the phrase above into concrete actions
	 driver.findElement(By.id("number")).sendKeys(Number);
	 driver.findElement(By.xpath("//textarea[@rows='2']")).sendKeys(Message);
}

@When("clicking on submit button")
public void clicking_on_submit_button() {
    // Write code here that turns the phrase above into concrete actions
	 driver.findElement(By.xpath("//input[@type='submit']")).click();
}

@Then("All the data enetered successfully")
public void all_the_data_enetered_successfully() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	 System.out.println("confirmation message is displayed");
	   
	   Alert al=driver.switchTo().alert();
	  System.out.println(al.getText()); 
	   al.accept();
	   
	   Thread.sleep(3000);
	   driver.quit();
}


}
