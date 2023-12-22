package stepdefinations;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.AdminPage;

public class StepDefination extends Base {


@Given("User Lanch Chrome Browser")
public void user_lanch_chrome_browser() {
    driver=new ChromeDriver();
    ad=new AdminPage(driver); //create object of Adminpage  java class
}

@When("User open url {string}")
public void user_open_url(String url) {
	driver.get(url);
    
}

@When("User enter Email as {string} and password as {string}")
public void user_enter_email_as_and_password_as(String email, String password) {
    ad.setUsername(email);
    ad.setPassword(password);
}

@When("User click on Login button")
public void user_click_on_login_button() {
    ad.clickOnLogin();
}

@Then("User verify page title should be {string}")
public void user_verify_page_title_should_be(String title) {
   Assert.assertEquals(driver.getTitle(),title);
}

@Then("close browser")
public void close_browser() {
 
}
	
	
}
