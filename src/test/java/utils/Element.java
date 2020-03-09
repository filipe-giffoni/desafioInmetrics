package utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Element extends WebBrowser {
	
	WebElement elemento;
	List<WebElement> elementos;
	
	
	/**
	 * Método para encontrar elemento na tela
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @return
	 */
	public WebElement encontrarElemento(String estrategia, String valor) {
			
		switch(estrategia) {
		
			case "id":			return driver.findElement(By.id(valor));
		
			case "name":		return driver.findElement(By.name(valor));
						
			case "className":	return driver.findElement(By.className(valor));
						
			case "xpath":		return driver.findElement(By.xpath(valor));
			
			default:			return null;
				
		}
		
	}
	
	/**
	 * Método para encontrar elemento na tela (em caso de múltiplas ocorrêncas com um determinado locator)
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param posicao
	 * @return
	 */
	public WebElement encontrarElemento(String estrategia, String valor, int posicao) {
		
		switch(estrategia) {
		
			case "id":			return driver.findElements(By.id(valor)).get(posicao);
		
			case "name":		return driver.findElements(By.name(valor)).get(posicao);
						
			case "className":	return driver.findElements(By.className(valor)).get(posicao);
						
			case "xpath":		return driver.findElements(By.xpath(valor)).get(posicao);
			
			default:			return null;
			
		}
		
	}

}
