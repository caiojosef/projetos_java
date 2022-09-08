import javax.swing.JOptionPane;

public class exercicioPar {
	public static void main(String [] args) {
		/*Crie um programa que mostre se o número é par ou impar.
		(numero%2 == 0) //par*/
		
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
		
		if (valor % 2 == 0)
			JOptionPane.showMessageDialog(null, "PAR");
			
		
				
		
	}

}
