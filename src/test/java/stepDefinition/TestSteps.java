package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSteps {
	
	WebDriver driver;
	
	@Given("User should Open Chrome Browser")
	public void user_should_open_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
		driver = new ChromeDriver();
	}


	@When("User should Enter Url in Browser")
	public void user_should_enter_url_in_browser() {
		driver.get("https://auth.hollandandbarrett.com/u/login");
		driver.manage().window().maximize();
	}


	@When("User Should Navigate Home Page")
	public void user_should_navigate_home_page() {
		System.out.println("Browser of the Title: " + driver.getTitle());
	}


	@When("Enter UserName and Password in Edit Box")
	public void enter_user_name_and_password_in_edit_box() throws Exception {
		driver.findElement(By.id("username")).sendKeys("shourjosenguptaroop@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Kiit@y2j");
		Thread.sleep(10000);
	}


	@When("Click On Login PushButton")
	public void click_on_login_push_button() {
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
	}


	@Then("Message displayed Login Successfully")
	public void message_displayed_login_successfully() throws Exception {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
		System.out.println("Browser of the Title: " + driver.getTitle());
	}


	@Then("User Should Navigate to Dashboard")
	public void user_should_navigate_to_dashboard() {


	}


	@Then("User Should Logout Holland and Barrett Application")
	public void user_should_logout_holland_and_barrett_application() {
		driver.findElement(By.xpath("//a[@class='MyHB-module_container__HkugQ']//*[name()='svg']")).click();
		driver.findElement(By.xpath("//button[@class='jsx-2504483895 secondary size-m with-icon']")).click();
	}


	@Then("Message displayed Logout Successfully")
	public void message_displayed_logout_successfully() {
		driver.quit();
	}
}
