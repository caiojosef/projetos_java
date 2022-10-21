package View;

import Service.ContatoService;
import Service.IContatoService;

public class Principal {

	public static void main(String[] args) {
		IContatoService ICS = getContatoService();


	}

	
	
	public static IContatoService getContatoService() {
		return new ContatoService(100);
	}
	
}
