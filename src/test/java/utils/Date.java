package utils;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Date {
	
	/**
	 * Método para retornar data limite
	 * @author filip
	 * @param dias (dias a mais em relação a data atual)
	 * @return data
	 */
	public String dataLimite(int dias) {
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("d MMMM, yyyy", Locale.US);
		
		String data = LocalDate.now().plusDays(dias).format(formato);
		
		return data;
		
	}
	
	
	/**
	 * Método para retornar a data atual
	 * @author filip
	 * @return data
	 */
	public String dataAtual() {
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("d MMMM, yyyy", Locale.US);
		
		String data = LocalDate.now().format(formato);
		
		return data;
		
	}
	
	/**
	 * Método para retornar a hora atual
	 * @author filip
	 * @return hora
	 */
	public String horaAtual() {
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		String hora = LocalTime.now().format(formato);
		
		return hora;
		
	}

}
