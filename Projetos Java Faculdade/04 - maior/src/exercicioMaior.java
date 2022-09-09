import javax.swing.JOptionPane;

public class exercicioMaior {
	public static void main (String [] args) {
		/*Crie um programa que receba 4 números e mostre o maior e o
		menor recebido.*/
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor: "));
		int d = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto valor: "));
		
		int maior = 0;
		if(a > b)
			maior = a;
		if(b > c)
			maior = b;
		if(c > d)
			maior = c;
		if(d > a)
			maior = d;
					
		int menor = a;
			if(b < menor)
				menor = b;
			if(c < menor)
				menor = c;
			if(d < menor)
				menor = d;
		
		
				
		JOptionPane.showMessageDialog(null, "O maior número é: " + maior + "\nO menor número é: " + menor);
	
	}
}
