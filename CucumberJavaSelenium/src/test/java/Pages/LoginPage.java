package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;


	By Email = By.id("txtRegEmail");
	
	By Password = By.id("txtRegPwd");
	
	By Login = By.id("submitLogin");
	
	public void enterEmail( String mail) {
		
		driver.findElement(Email).sendKeys(mail);
	}
	

	public void enterPassword(String passwd) {
		
		driver.findElement(Password).sendKeys(passwd);
	}
		public void clickLogin() {
			driver.findElement(Login).click();
		}
		

}
