package stepDefinitions.homePage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Page;
import pages.homePage.LogInPage;
import utils.WebBrowser;

public class LogInSteps {
	
	WebBrowser webBrowser = new WebBrowser();
	Page page = new Page();
	String date = LocalDate.now().plusDays(0).format(DateTimeFormatter.ofPattern("d MMMM, yyyy", Locale.US));	
	LogInPage logIn = new LogInPage();
	
	String browser = "firefox";
	String nome;
	
	
	@Given("user opens browser and access Julio de Lima website")
	public void user_opens_browser_and_access_Julio_de_Lima_website() {
		webBrowser.abrir(browser);
	}

	@When("user clicks on Sign In")
	public void user_clicks_on_Sign_In() {
		page.clicarElemento("xpath", "//a[@class='modal-trigger']", 0);
	}
	
	@When("enters {string} into Login field")
	public void enters_into_Login_field(String string) {
		page.digitarTexto("xpath", "//input[@name='login']", string, 1);
	}

	@When("enters {string} into Password field")
	public void enters_into_Password_field(String string) {
		page.digitarTexto("xpath", "//input[@name='password']", string, 1);
	}

	@When("clicks on Sign In button")
	public void clicks_on_Sign_In_button() {
		page.clicarElemento("xpath", "//a[@class='modal-action waves-effect waves-green btn-flat' and contains(text(), 'Sign in')]");
	}

	@Then("user is logged in")
	public void user_is_logged_in() throws InterruptedException {
		logIn.validarLogin(nome);
	}

}
