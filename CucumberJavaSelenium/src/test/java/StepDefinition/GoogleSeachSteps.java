package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSeachSteps {
	
//	WebDriver driver = null;
//
//	@SuppressWarnings("deprecation")
//	@Given("browser is open")
//	public void browser_is_open() {
//		
//	System.out.println("Inside step- browser is open");
//	    String projectPath = System.getProperty("user.dir");
//	    System.out.println("Project path is : "+projectPath);
//		
//		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
//         
//	    driver = new ChromeDriver();
//	    
//	    driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
//	    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
//	    
//	    //driver.manage().window().maximize();
//	    
//	}
//
//	@And("user is on google is on search page")
//	public void user_is_on_google_is_on_search_page() {
//		System.out.println("Inside step- user is on google search page");
//	    driver.navigate().to("https://google.com");
//	}
//
//	@When("user enters a text in search box")
//	public void user_enters_a_text_in_search_box() throws InterruptedException {
//		System.out.println("Inside step- user enter text in seach page");
//        driver.findElement(By.name("q")).sendKeys("Nihilent Technologies");
//        
//        Thread.sleep(2000);
//       
//	}
//
//	@And("hits enter")
//	public void hits_enter() throws InterruptedException {
//		System.out.println("Inside step- enters the button");
//	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//	    
//	    Thread.sleep(2000);
//	}
//
//	@Then("user is navigated to the page")
//	public void user_is_navigated_to_the_page() {
//		System.out.println("Inside step- user is navigated to the desired web page");
//	    driver.getPageSource().contains("Careers");
//	    
//	    driver.close();
//	    driver.quit();
//}
//}
