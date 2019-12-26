package stepDefinitions;

import org.openqa.selenium.WebDriver;

import CommonFunctions.CommonFunctions;
import cucumber.api.java.en.When;

public class LoginValidation {
	WebDriver driver;
	@When("^Open Browser$")
	public void open_Browser() throws Throwable {
	   driver=CommonFunctions.startBrowser("chrome");
	}

	@When("^Open Application$")
	public void open_Application() throws Throwable {
	    CommonFunctions.openApplication(driver);
	}

	@When("^Wait For Username$")
	public void wait_For_Username() throws Throwable {
	    CommonFunctions.waitForElement(driver, "id", "username", "10");
	}

	@When("^Enter Username$")
	public void enter_Username() throws Throwable {
	    CommonFunctions.typeAction(driver, "id", "username", "admin");
	}

	@When("^Wait For Password$")
	public void wait_For_Password() throws Throwable {
	    CommonFunctions.waitForElement(driver, "name", "password", "10");
	}

	@When("^Enter Password$")
	public void enter_Password() throws Throwable {
	    CommonFunctions.typeAction(driver, "name", "password", "master");
	}

	@When("^Wait For Login$")
	public void wait_For_Login() throws Throwable {
	    CommonFunctions.waitForElement(driver, "xpath","//button[@id='btnsubmit']" , "10");
	}

	@When("^Click On Login$")
	public void click_On_Login() throws Throwable {
	   CommonFunctions.clickAction(driver, "xpath", "//button[@id='btnsubmit']");
	}

	@When("^Wait For Logout$")
	public void wait_For_Logout() throws Throwable {
	    CommonFunctions.waitForElement(driver, "id", "logout", "10");
	}

	@When("^Click on Logout$")
	public void click_on_Logout() throws Throwable {
	   CommonFunctions.clickAction(driver, "id", "logout");
	}

	@When("^Wait For Ok$")
	public void wait_For_Ok() throws Throwable {
	   CommonFunctions.waitForElement(driver, "xpath", "/html[1]/body[1]/div[17]/div[2]/div[1]/div[4]/div[2]/button[1]", "10");
	}

	@When("^Cick on Ok$")
	public void cick_on_Ok() throws Throwable {
	   CommonFunctions.clickAction(driver, "xpath", "/html[1]/body[1]/div[17]/div[2]/div[1]/div[4]/div[2]/button[1]"); 
	}

	@When("^Close Browser$")
	public void close_Browser() throws Throwable {
	    CommonFunctions.closeBrowser(driver);
	}

}
