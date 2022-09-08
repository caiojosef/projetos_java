import javax.swing.JOptionPane;

public class exercicioOperador {

	public static void main(String[] args) {
		// Crie um programa que receba 2 números e um operador (+, -. *,
		//) e faça a respectiva operação.
		
		int resultado = 0;
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: "));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo Numero"));
		String operador = JOptionPane.showInputDialog("Digite a operação que deseja fazer \n(Adição +, Subtração -, Multiplicação *, Divisão /): ");
		
		String operador1 = "+";
		if (operador.equals(operador1)) {
			resultado = valor1 + valor2;
			JOptionPane.showMessageDialog(null, resultado);
		}
		
		String operador2 = "-";
		if (operador.equals(operador2)) {
			resultado = valor1 - valor2;
			JOptionPane.showMessageDialog(null, resultado);
		}
		
		String operador3 = "*";
		if (operador.equals(operador3)) {
			resultado = valor1 * valor2;
			JOptionPane.showMessageDialog(null, resultado);
		}
		
		String operador4 = "/";
		if (operador.equals(operador4)) {
			resultado = valor1 / valor2;
			JOptionPane.showMessageDialog(null, resultado);
		}
		
		
	}

}
