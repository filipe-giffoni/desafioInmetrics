package stepDefinitions.taskPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Page;
import pages.taskPage.AddTaskPage;
import utils.Date;
import utils.Element;
import utils.Scroll;
import utils.WebBrowser;

public class AddTaskSteps {
	
	Element elem = new Element();
	WebBrowser browser = new WebBrowser();
	Page page = new Page();
	Date date = new Date();
	Scroll scroll = new Scroll();
	AddTaskPage addTask = new AddTaskPage();
	
	String time [];
	static String descricao;
	
	
	@Given("user clicks on Lets Add Some Tasks button")
	public void user_clicks_on_Lets_Add_Some_Tasks_button() {
		page.clicarElemento("xpath", "//a[@class='waves-effect waves-light red darken-2 btn']");
	}

	@When("user clicks on Add A Task button")
	public void user_clicks_on_Add_A_Task_button() {
		page.clicarElemento("xpath", "//button[@class='waves-effect waves-light red darken-2 btn modal-trigger']");
	}

	@When("enters {string} into Title field")
	public void enters_into_Title_field(String string) {
		page.digitarTexto("xpath", "//input[@name='title']", string);
	}

	@When("sets Date Limit for {int} from now")
	public void sets_Date_Limit_for_from_now(Integer int1) {
		page.clicarElemento("xpath", "//input[@class='validate datepicker picker__input']");
		
		if(!elem.encontrarElemento("xpath", "//div[@aria-label='" + date.dataLimite(int1) + "']").isDisplayed())
			page.clicarElemento("className", "picker__nav--next");
			
		page.clicarElemento("xpath", "//div[@aria-label='" + date.dataLimite(int1) + "']");
		page.clicarElemento("xpath", "//button[@class='btn-flat picker__close waves-effect']");
	}

	@When("sets Time Limit for {string}")
	public void sets_Time_Limit_for(String string) {
		page.clicarElemento("xpath", "//input[@class='validate timepicker']");
		time = string.split(":");
		page.clicarElemento("xpath", "//div[@class='clockpicker-tick' and contains(text(), '" + time[0] + "')]", 0);
		page.clicarElemento("xpath", "//div[@class='clockpicker-tick' and contains(text(), '" + time[1] + "')]");
		page.clicarElemento("xpath", "//button[@class='btn-flat picker__close']", 1);
	}

	@When("enters {string} into Tell Us More About It field")
	public void enters_into_Tell_Us_More_About_It_field(String string) {
		descricao = string + " " + date.dataAtual() + " " + date.horaAtual();
		page.digitarTexto("className", "materialize-textarea", descricao);
	}

	@When("selects {string} option on Its Done comboBox")
	public void selects_option_on_Its_Done_comboBox(String string) {
		// ComboBox não respondeu aos comandos abaixo
		//scroll.rolarTelaAteFinal("xpath", "//div[@class='modal-content']/*[last()]");
	    //page.selecionarOpcaoCaixa("className", "browser-default", "visibleText", string);
	}
	
	@When("clicks on the Save button")
	public void clicks_on_the_Save_button() {
		page.clicarElemento("xpath", "//a[@class='modal-action waves-effect waves-green btn-flat']");
	}

	@Then("the task is displayed")
	public void the_task_is_displayed() {
		addTask.validarCriacaoTarefa(descricao);
		page.clicarElemento("className", "brand-logo");
	}

}
