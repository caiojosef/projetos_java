import javax.swing.JOptionPane;

public class exercicioMedia {
	public static void main (String [] args) {
		/*
		 * Crie um programa que receba duas notas, se a média for maior que 5 mostre
		 * aprovado, se reprovado, recebe mais uma nota, retira a menor das duas notas,
		 * refaz a média e se maior que 5 mostre aprovado, senão, mostre reprovado.
		 */
		
		int nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira nota: "));
		int nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda nota: "));
		
		int media = (nota1 + nota2) / 2;
		
		JOptionPane.showMessageDialog(null,"A nota do aluno foi: " + media);
		
		if(media > 5)
			JOptionPane.showMessageDialog(null, "Aluno Aprovado");
		else{
			int nota3 = Integer.parseInt(JOptionPane.showInputDialog("Aluno de exame, digite a terceira nota: "));
				if (nota1 < nota2)
					nota1 = nota3;
				
				if (nota1 > nota2)
					nota2 = nota3;	
				
				media = (nota1 + nota2) / 2;
				
				JOptionPane.showMessageDialog(null, "A média do aluno foi: " + media);
				
				if(media > 5)
					JOptionPane.showMessageDialog(null, "Aluno Aprovado");
				else
					JOptionPane.showMessageDialog(null, "Aluno Reprovado");
		}
		
		
		
	}
}
