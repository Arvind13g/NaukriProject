//package LoginScenario;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class NaukriHomepage {
//	
//	WebDriver driver;
//	
//	@FindBy(xpath = "//img[@alt='naukri user profile img']")
//	WebElement profileImg;
//	
//	@FindBy(xpath = "//a[text()='View & Update Profile']")
//	WebElement viewAndUpdate;
//	
//	
//	public NaukriHomepage(WebDriver driver) {
//		this.driver = driver;
//		PageFactory.initElements(driver, this);
//	}
//
//	
//	public void clickOnProfileimg() {
//		profileImg.click();	
//	}
//	
//	public void clickOnViewAndUpdate() {
//		viewAndUpdate.click();
//	}
//
//
//	public String verifyNaukriHomepageLink() {
//		return driver.getCurrentUrl();
//	}
//
//}


package LoginScenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NaukriHomepage {
    
    WebDriver driver;
    
    @FindBy(xpath = "//img[@alt='naukri user profile img']")
    WebElement profileImg;
    
    @FindBy(xpath = "//a[text()='View & Update Profile']")
    WebElement viewAndUpdate;
    
    public NaukriHomepage(WebDriver driver) {
        this.driver = driver; // Initialize the driver
        PageFactory.initElements(driver, this);
    }
    
    public void clickOnProfileimg() {
        profileImg.click();    
    }
    
    public void clickOnViewAndUpdate() {
        viewAndUpdate.click();
    }
    
    public String verifyNaukriHomepageLink() {
        return driver.getCurrentUrl();
    }
}

