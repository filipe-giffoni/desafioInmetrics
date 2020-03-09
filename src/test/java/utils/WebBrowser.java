package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebBrowser {
	
	public String url;
	public static WebDriver driver;
	
	
	/**
	 * Método para abrir o navegador e acessar a página Julio de Lima
	 * @author filip
	 */
	public void abrir(String browser) {
		
		url = "http://www.juliodelima.com.br/taskit/";
		
		switch(browser) {
		
			case "chrome":		System.setProperty("webdriver.chrome.driver",
												"./src/test/resources/drivers/chromedriver.exe");
								driver = new ChromeDriver();
								break;
				
			case "firefox":		System.setProperty("webdriver.gecko.driver",
												"./src/test/resources/drivers/geckodriver.exe");
								driver = new FirefoxDriver();
								break;
								
			default:			System.err.println("\n\nNAVEGADOR NÃO ENCONTRADO\n\n");
		
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		
	}
	
	/**
	 * Método para fechar o navegador
	 * @author filip
	 * @throws InterruptedException
	 */
	public void fechar() throws InterruptedException {
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
