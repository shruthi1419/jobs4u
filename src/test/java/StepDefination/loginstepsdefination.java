package StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginstepsdefination {
	static WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page() {
	   driver=new  ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.get("https://jobsupport4ufrontend-b53ca1d535d9.herokuapp.com/auth/login");
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
	   driver.findElement(By.id("EmailAddress")).sendKeys("sruthisam14@gmail.com");
	   driver.findElement(By.id("password")).sendKeys("Shruthi@123");

	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		driver.findElement(By.id("login-button")).click();
	}
	@Then ("User is navigated to Home page")
	public void user_is_navigated_to_home_page() {
	    Assert.assertTrue(driver.findElements(By.xpath("/html/body/app-root/app-features-modules/div/app-header/header/div/nav/div[1]/a[2]")).size()>0,"User is navigate to Home page");
	}

	@And("close the broswer")
	public void close_the_broswer() {
	driver.close();
	}



}

