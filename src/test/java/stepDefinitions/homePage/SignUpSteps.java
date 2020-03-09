package stepDefinitions.homePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Page;
import pages.homePage.SignUpPage;
import utils.WebBrowser;

public class SignUpSteps {
	
	WebBrowser webBrowser = new WebBrowser();
	Page page = new Page();
	SignUpPage signUp = new SignUpPage();
	
	String browser = "firefox";	
	String nome;
	
	
	@Given("user opens browser and navigates to Julio de Lima website")
	public void i_navigate_to_the_Julio_de_Lima_website() {
		webBrowser.abrir(browser);
	}

	@When("user clicks on OK, I Wanna Sign Up Now button")
	public void i_click_on_OK_I_Wanna_Sign_Up_Now_button() {
	    page.clicarElemento("id", "signup");
	}

	@When("fills the Name field with {string}")
	public void i_fill_the_Name_field_with(String string) {
	    page.digitarTexto("xpath", "//input[@name='name']", string);
	    nome = string;
	}

	@When("fills the Login field with {string}")
	public void i_fill_the_Login_field_with(String string) {
		page.digitarTexto("xpath", "//input[@name='login']", string, 0);
	}

	@When("fills the Password field with {string}")
	public void i_fill_the_Password_field_with(String string) {
		page.digitarTexto("xpath", "//input[@name='password']", string, 0);
	}

	@When("clicks on Save button")
	public void i_click_on_Save_button() {
		page.clicarElemento("xpath", "//a[@class='modal-action waves-effect waves-green btn-flat' and contains(text(), 'Save')]");
	}

	@Then("user is signed in")
	public void i_am_signed_in() {
	    signUp.validarLogin(nome);
	}

}
