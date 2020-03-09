package pages.taskPage;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebElement;

import utils.Element;

public class AddTaskPage {
	
	Element elem = new Element();
	WebElement elemento;
	
	/**
	 * Método para validar a criacao de uma tarefa
	 * @author filip
	 * @param descricao
	 */
	public void validarCriacaoTarefa(String descricao) {
		
		try {
			
//			assertTrue(capturarTexto("xpath", "//small[contains(text(), '" + descricao + "')]").);
			assertTrue(elem.encontrarElemento("xpath", "//small[contains(text(), '" + descricao + "')]").isDisplayed());
			
		}
		catch(AssertionError e) {
			System.out.println("\n\nERRO: TAREFA NÃO CRIADA\n\n");
			e.printStackTrace();
			throw e;
		}
	}

}
