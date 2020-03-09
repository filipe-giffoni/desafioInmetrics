package pages.homePage;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebElement;

import pages.Page;
import utils.Element;

public class LogInPage extends Page {
	
	Element elem = new Element();
	WebElement elemento;
	
	/**
	 * Método para validar o sucesso do login
	 * @author filip
	 * @param nome
	 */
	public void validarLogin(String nome) {
		
		try {
		
			assertEquals("Hi, " + nome, capturarTexto("className", "me", 0));
		
		}
		catch(AssertionError e) {
			System.out.println("\n\nERRO: LOGIN NÃO EFETUADO\n\n");
			e.printStackTrace();
			throw e;
		}
		
	}

}
