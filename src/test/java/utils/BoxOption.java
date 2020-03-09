package utils;

import org.openqa.selenium.support.ui.Select;



public class BoxOption extends WebBrowser {
	
	/**
	 * Método para selecionar uma das opções de uma caixa de listagem ou de lista por VisibleText ou Value
	 * @author filip
	 * @param selecao
	 * @param estrategia
	 * @param texto
	 */
	public void selecionarOpcaoCaixa(Select selecao, String estrategia, String texto) {
		
		switch(estrategia) {
		
			case "visibleText":	selecao.selectByVisibleText(texto);
								break;
		
			case "value":		selecao.selectByValue(texto);
								break;
								
			default:			System.err.println("\n\nESTRATEGIA NÃO ENCONTRADA\n\n");
			
		}	
		
	}
	
	/**
	 * Método para selecionar uma das opções de uma caixa de listagem ou de lista por Index
	 * @author filip
	 * @param selecao
	 * @param index
	 */
	public void selecionarOpcaoCaixa(Select selecao, int index) {
		
		selecao.selectByIndex(index);
		
	}

}
