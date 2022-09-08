package digital.innovation.dio;

import digital.innovation.dio.Calculadora;

public class Main
{
	public static void main(String[] args) {
		System.out.println("\nExercicio de calculadora.");
		Calculadora.soma(9, 3);
		Calculadora.subtracao(9, 3);
		Calculadora.divisao(36, 6);
		Calculadora.multiplicacao(36, 6);

		System.out.println("\nExercicio da mensagem");
		Mensagem.obterMensagem(9);
		Mensagem.obterMensagem(14);
		Mensagem.obterMensagem(22);

		System.out.println("\nExercicio do emprestimo");
		Emprestimo.Calcular(1000, Emprestimo.getDuasParcelas());
		Emprestimo.Calcular(1000, Emprestimo.getTresParcelas());
		Emprestimo.Calcular(1000, 5);
	}
}