package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Datadriventesting {
	
	WebDriver driver;
	@Given("user is open the chrome browser and navigate to the govt form")
	public void user_is_open_the_chrome_browser_and_navigate_to_the_govt_form() {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); // Initialize the ChromeDriver object
		driver.get("https://www.india.gov.in/user/register");
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	}

	@When("user is entering Account information like {string},{string}")
	public void user_is_entering_account_information_like(String Username, String Email) {
		driver.findElement(By.id("edit-name")).sendKeys(Username);
		   driver.findElement(By.id("edit-mail")).sendKeys(Email);
	}

	@When("user is entering Personal Information like {string}, {string}")
	public void user_is_entering_personal_information_like(String First_Name, String Last_Name) {
		driver.findElement(By.id("edit-profile-main-field-first-name-und-0-value")).sendKeys(First_Name);
		   driver.findElement(By.id("edit-profile-main-field-last-name-und-0-value")).sendKeys(Last_Name);
	}

	@When("select the dropdowns user is entering pin code {string}")
	public void select_the_dropdowns_user_is_entering_pin_code(String PIN_Code) {
	    // Write code here that turns the phrase above into concrete actions
		 WebElement country=driver.findElement(By.id("edit-profile-main-field-country-und"));
		 WebElement state=driver.findElement(By.id("edit-profile-main-field-state-und-hierarchical-select-selects-0"));
		 
		 
		 Select select =new Select(country);
		 select.selectByVisibleText("India");
		 
		 Select select1 =new Select(state);
		 select1.selectByVisibleText("Karnataka");
		 
		 driver.findElement(By.id("edit-profile-main-field-pin-code-und-0-value")).sendKeys(PIN_Code);
	}

	@When("select the dropdown as education")
	public void select_the_dropdown_as_education() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement education=driver.findElement(By.id("edit-profile-main-field-education-und"));
		 Select select2 =new Select(education);
		 select2.selectByVisibleText("Vocational");
		 
	}

	@When("click on check box and write a text {string}")
	public void click_on_check_box_and_write_a_text(String text) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("edit-profile-main-field-subscribe-to-our-newslett-und-yes")).click();
		driver.findElement(By.id("edit-captcha-response")).sendKeys(text);
	}

	@When("click on the create new account button")
	public void click_on_the_create_new_account_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("edit-submit")).click();
	}

	@Then("error msg should be displayed")
	public void error_msg_should_be_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("\"error msg should be displayed");
	    Thread.sleep(3000);
	    driver.quit();
	}

}
