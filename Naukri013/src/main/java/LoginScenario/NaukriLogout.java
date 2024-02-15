package LoginScenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NaukriLogout {
	
WebDriver driver;

    @FindBy(xpath = "//img[@alt='naukri user profile img']")
	WebElement profileImg;
	
	@FindBy(xpath = "//a[@title='Logout']")
	WebElement logout;
	
	
	public NaukriLogout(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnProfileIcon() {
		profileImg.click();
	}
	
	public void clickOnLogout() {
		logout.click();
	}
	
}
