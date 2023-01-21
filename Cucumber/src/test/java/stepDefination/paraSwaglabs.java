package stepDefination;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class paraSwaglabs {
	WebDriver driver;
	
	@Given("User lounch browser")
	public void user_lounch_browser() throws InterruptedException {
		
		   System.setProperty("WebDriver.Chrome.Driver","E:\\chromedriver.exe");
		   driver= new ChromeDriver();
		   driver.manage().window().maximize();
		   Thread.sleep(3000);

	}

	@When("User opens url")
	public void user_opens_url() {
	driver.get("https://www.saucedemo.com/");   
	}

	@When("user enter username and password")
	public void user_enter_standard_user_and_secret_sauce() {
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
    }

	@When("click on login")
	public void click_on_login() {
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}

	@Then("add product in cart")
	public void add_product_in_cart() {
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
	}

	@Then("click on cart")
	public void click_on_cart() {
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
	}

	@Then("click on checkout")
	public void click_on_checkout() throws IOException {
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destination = new File ("F:\\Project Screenshots\\end.jpeg");
		FileHandler.copy(source, destination);
		}

	@Then("close browser")
	public void close_browser() {
	    driver.close();
	}

}
