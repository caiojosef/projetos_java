import java.util.Scanner;
import javax.swing.JOptionPane;

public class exercicioNota {
	public static void main(String [] args) {
		/*Crie um programa que receba uma nota e partir desta nota ele
		apresente aprovado se nota maior que 5 e reprovado se nota
		menor que 5. */
		
		Scanner input = new Scanner(System.in);
		int nota = input.nextInt();
		
		if(nota >= 5)
			System.out.println("Aluno aprovado");
		if(nota < 5)
			System.out.println("Aluno Reprovado");
		
	}

}
