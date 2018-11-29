/*package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class Steps_Login {


	public RemoteWebDriver driver;
	


	@Given("Launch the Browser")
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}


	@And("Load the URL")
	public void url() {
		driver.get("http://leaftaps.com/opentaps");
	}


	@And("set implicitwait")
	public void setWait() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

    @And("maximize the page")
	public void maximizeWindow() {
		driver.manage().window().maximize();
		}

    
    @And("enter username as (.*)")
    public void enterUserName(String data) {
    	driver.findElementById("username").sendKeys(data);
        	
    }
    
    @And("enter password as (.*)")
    public void enterPwdName(String data) {
    	driver.findElementById("password").sendKeys(data);
        	
    }
    
    @And("click the login button")
    public void clickLogin() {
    	driver.findElementByClassName("decorativeSubmit").click();
        	
    }
    
    @And("close the browser")
    public void closeBrowser() {
    	driver.close();
        	
    }
}
*/