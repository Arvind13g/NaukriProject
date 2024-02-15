package LoginScenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NaukriLoginpage {
		
	    WebDriver driver;
		
		@FindBy(xpath = "//a[@title='Jobseeker Login']")
		WebElement login;
		
		@FindBy(xpath = "//input[@placeholder='Enter your active Email ID / Username']")
		WebElement userName;
		
		@FindBy(xpath = "//input[@placeholder='Enter your password']")
		WebElement passWord;
		
		@FindBy(xpath = "//button[text()='Login']")
		WebElement loginButton;
		
		
		public NaukriLoginpage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		 
		
		public void clickOnLogin() {
			login.click();	
		}
		
		public void sendNaukriUsername(String username) {
			userName.sendKeys("arvindgaikwad0013@gmail.com");
		}
		
		public void sendNaukriPassword(String password) {
			passWord.sendKeys("arvindgaikwad0013@gmail.com");
		}
		
		public void clickOnLoginButton() {
			loginButton.click();
		}


		public String verifyNaukriLoginpageLink() {
			return driver.getCurrentUrl();
		}
			
}
