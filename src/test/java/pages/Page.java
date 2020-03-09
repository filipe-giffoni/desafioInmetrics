package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.BoxOption;
import utils.Element;

public class Page {
	
	Element elem = new Element();
	BoxOption opcao = new BoxOption();
	
	WebElement elemento;
	Select selecao;
	
	
	/**
	 * Método para digitar texto em uma caixa ou área de texto
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param texto
	 */
	public void digitarTexto(String estrategia, String valor, String texto) {
		
		elemento = elem.encontrarElemento(estrategia, valor);
		elemento.sendKeys(texto);
		
	}
	
	/**
	 * Método para digitar texto em uma caixa ou área de texto
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param texto
	 * @param posicao
	 */
	public void digitarTexto(String estrategia, String valor, String texto, int posicao) {
		
		elemento = elem.encontrarElemento(estrategia, valor, posicao);
		elemento.sendKeys(texto);
		
	}
	
	/**
	 * Método para clicar em um elemento
	 * @author filip
	 * @param estrategia
	 * @param valor
	 */
	public void clicarElemento(String estrategia, String valor) {
		
		elemento = elem.encontrarElemento(estrategia, valor);
		elemento.click();
		
	}
	
	/**
	 * Método para clicar em um elemento
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param posicao
	 */
	public void clicarElemento(String estrategia, String valor, int posicao) {
		
		elemento = elem.encontrarElemento(estrategia, valor, posicao);
		elemento.click();
		
	}
	
	/**
	 * Método para encontrar elemento do tipo caixa de checagem (checkbox)
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @return
	 */
	public WebElement encontrarCaixaChecagem(String estrategia, String valor) {
		
		return elem.encontrarElemento(estrategia, valor);
		
	}
	
	/**
	 * Método para encontrar elemento do tipo caixa de checagem (checkbox)
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param posicao
	 * @return
	 */
	public WebElement encontrarCaixaChecagem(String estrategia, String valor, int posicao) {
		
		return elem.encontrarElemento(estrategia, valor, posicao);
		
	}	
	
	/**
	 * Método para selecionar opçăo em uma caixa de listagem ou lista (comboBox ou list box)
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param estrategiaSelect
	 * @param textoSelect
	 */
	public void selecionarOpcaoCaixa(String estrategia, String valor, String estrategiaSelect, String textoSelect) {
		
		selecao = new Select(elem.encontrarElemento(estrategia, valor));
		opcao.selecionarOpcaoCaixa(selecao, estrategiaSelect, textoSelect);
		
	}
	
	/**
	 * Método para selecionar opçăo em uma caixa de listagem ou lista (comboBox ou list box)
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param posicao
	 * @param estrategiaSelect
	 * @param textoSelect
	 */
	public void selecionarOpcaoCaixa(String estrategia, String valor, int posicao, String estrategiaSelect, String textoSelect) {
		
		selecao = new Select(elem.encontrarElemento(estrategia, valor, posicao));
		opcao.selecionarOpcaoCaixa(selecao, estrategiaSelect, textoSelect);
		
	}
	
	/**
	 * Método para selecionar opçăo em uma caixa de listagem ou lista (comboBox ou list box)
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param index
	 */
	public void selecionarOpcaoCaixa(String estrategia, String valor, int index) {
		
		selecao = new Select(elem.encontrarElemento(estrategia, valor));
		opcao.selecionarOpcaoCaixa(selecao, index);
		
	}
	
	/**
	 * Método para selecionar opçăo em uma caixa de listagem ou lista (comboBox ou list box)
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param posicao
	 * @param index
	 */
	public void selecionarOpcaoCaixa(String estrategia, String valor, int posicao, int index) {
		
		selecao = new Select(elem.encontrarElemento(estrategia, valor, posicao));
		opcao.selecionarOpcaoCaixa(selecao, index);
		
	}
	
	/**
	 * Método para encontrar elemento botăo de opçăo (radio box)
	 * @author filip
	 * @param estrategia
	 * @param valor
	 */
	public void encontrarBotaoOpcao(String estrategia, String valor) {
		
		elemento = elem.encontrarElemento(estrategia, valor);
		elemento.click();
		
	}
	
	/**
	 * Método para encontrar elemento botăo de opçăo (radio box)
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param posicao
	 */
	public void encontrarBotaoOpcao(String estrategia, String valor, int posicao) {
		
		elemento = elem.encontrarElemento(estrategia, valor, posicao);
		elemento.click();
		
	}
	
	/**
	 * Método para capturar texto de um elemento
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @return
	 */
	public String capturarTexto(String estrategia, String valor) {
		
		elemento = elem.encontrarElemento(estrategia, valor);
		
		return elemento.getText();
		
	}
	
	/**
	 * Método para capturar texto de um elemento
	 * @author filip
	 * @param estrategia
	 * @param valor
	 * @param posicao
	 * @return
	 */
	public String capturarTexto(String estrategia, String valor, int posicao) {
		
		elemento = elem.encontrarElemento(estrategia, valor, posicao);
		
		return elemento.getText();
		
	}

}
