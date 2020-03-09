package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Scroll extends WebBrowser {
	
	/**
	 * Método para rolar a tela de um elemento até o seu final
	 * @author filip
	 * @param estrategia
	 * @param valor
	 */
	public void rolarTelaAteFinal(String estrategia, String valor) {
		
		Element elem = new Element();
		
		WebElement element = elem.encontrarElemento(estrategia, valor);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		
	}

}
