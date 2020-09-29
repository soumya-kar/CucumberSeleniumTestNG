package stepDefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstStepDef {
	
	WebDriver driver;
	@Given("Launch the browser")
	public void launch_the_browser() {
	   WebDriverManager.chromedriver().setup();
	   driver= new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	}

	@When("Hit Google on your browser")
	public void hit_Google_on_your_browser() {
	    driver.get("https://www.google.com/");
	}

	@Then("Enter {string} in the search text box.")
	public void enter_in_the_search_text_box(String value) {
	    driver.findElement(By.name("q")).sendKeys(value);
	}

	@Then("Select the first result.")
	public void select_the_first_result() {
	    driver.findElement(By.xpath("//ul[@role='listbox']/li[1]")).click();
	}
	
	@After
	public void tearDown(){
		driver.quit();
	}
}
