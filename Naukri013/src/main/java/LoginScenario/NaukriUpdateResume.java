package LoginScenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NaukriUpdateResume {
	
WebDriver driver;
	
	@FindBy(xpath = "//i[@title='Click here to delete your resume']")
	WebElement deleteIcon;
	
	@FindBy(xpath = "(//button[text()='Delete'])[2]")
	WebElement deleteButton;
	
	@FindBy(xpath = "//input[@id='attachCV']")
	WebElement uploadResume;
	
	@FindBy(xpath = "//img[@alt='naukri user profile img']")
	WebElement profileImg;
	
	@FindBy(xpath = "//a[@title='Logout']")
	WebElement logout;
	
	
	public NaukriUpdateResume(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnDeleteIcon() {
		deleteIcon.click();
	}
	
	public void clickOnDeleteButton() {
		deleteButton.click();
	}
	
	public void clickOnUploadResume() {
		uploadResume.sendKeys("C:\\Users\\Lenovo\\Downloads\\ArvindGaikwad_Resume_2024_3.5.pdf");
	}
	
	public void clickOnProfileIcon() {
		profileImg.click();
	}
	
	public void clickOnLogout() {
		logout.click();
	}

	public String verifyNaukriUpdatePage() {
		// TODO Auto-generated method stub
		return driver.getCurrentUrl();
	}
}
