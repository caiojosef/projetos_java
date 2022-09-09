import javax.swing.JOptionPane;

public class exercicioSalario {
	public static void main (String [] args) {
		/*Faça um programa que receba seu salario (double) e mostre o valor do imposto
		  sobre ele, o valor descontado e o valor liquido.
		  Se o seu salario for abaixo de 1000, não desconta nada.
		Se o seu salario for entre 1000 e 2000, desconta 7%
		Se o seu salario for entre 2000 e 3000, desconta 15%
		Se o seu salario for entre 3000 e 4000, desconta 22%
		Se o seu salario for acima de 4000, desconta 29%
		 */
		 
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário: "));
		double desconto = 0, liquido = 0;
		
		if(salario < 1000) 
			JOptionPane.showMessageDialog(null, "Salário sem desconto.");
			if(salario > 1000 && salario < 2000) {
				desconto = (salario * 7) / 100;
				liquido = salario - desconto;
				JOptionPane.showMessageDialog(null, "O seu salario é de: " + salario + 
						"\n O desconto é de 7%\n O valor descontado é de: " + desconto + 
						"\n O salario com desconto: " + liquido);
			}
			
			if(salario > 2000 && salario < 3000) {
				desconto = (salario * 15) / 100;
				liquido = salario - desconto;
				JOptionPane.showMessageDialog(null, "O seu salario é de: " + salario + 
						"\n O desconto é de 15%\n O valor descontado é de: " + desconto + 
						"\n O salario com desconto: " + liquido);
			}
			
			if(salario > 3000 && salario < 4000) {
				desconto = (salario * 22) / 100;
				liquido = salario - desconto;
				JOptionPane.showMessageDialog(null, "O seu salario é de: " + salario + 
						"\n O desconto é de 22%\n O valor descontado é de: " + desconto + 
						"\n O salario com desconto: " + liquido);
			}
			
			if(salario > 4000) {
				desconto = (salario * 29) / 100;
				liquido = salario - desconto;
				JOptionPane.showMessageDialog(null, "O seu salario é de: " + salario + 
						"\n O desconto é de 29%\n O valor descontado é de: " + desconto + 
						"\n O salario com desconto: " + liquido);
			}
			
	}
}

