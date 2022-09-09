import javax.swing.JOptionPane;

public class aumentoSalarial {
	public static void main (String [] args) {
		/*
		 * Faça um programa que receba seu salario (double) e uma nota entre 0 e 10.
		 * Se o valor da nota for igual ou abaixo de 2, o salario permanece o mesmo.
		 * Se o valor da nota for entre 2 e 4, o salario tem um aumento de 5%
		 * Se o valor da nota for entre 4 e 6, o salario tem um aumento de 10%
		 * Se o valor da nota for entre 6 e 8, o salario tem um aumento de 15%
		 * Se o valor da nota for entre 8 e 10, o salario tem um aumento de 20%
		 * No final o salário deverá ser apresentado com o valor de entrada e com o
		 * aumento!
		 */
		
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário: "));
		int nota = Integer.parseInt(JOptionPane.showInputDialog("Digite uma nota entre 0 e 10: "));
		
		double novoSalario = 0;
		if (nota >= 2 && nota < 4) {
			novoSalario = (salario * 5) / 100;	
		}
		if (nota >= 4 && nota < 6) {
			novoSalario = (salario * 10) / 100;	
		}
		if (nota >= 6 && nota < 8) {
			novoSalario = (salario * 15) / 100;	
		}
		if (nota >= 8 && nota < 10) {
			novoSalario = (salario * 20) / 100;	
		}
		
		JOptionPane.showMessageDialog(null, "O salário era: " + salario + 
				"\n Agora passa a ser: " + (novoSalario+salario));
	}
}
