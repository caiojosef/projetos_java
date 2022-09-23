
public class aulaNoveDoNove {
	public static void main (String [] args) {
		System.out.println("Contador até 50: ");
		for(int i = 0; i <= 50; i++) {
			System.out.print(" " + i);
		}
		
		System.out.println("\n\nContador de 50 até 1: ");
		for(int i = 50; i >= 1; i--) {
			System.out.print(" " + i);
		}
		
		System.out.println("\n\nContador de 3 em 3: ");
		for(int i = 0; i <= 50; i++) {
			System.out.print(" " + i++);
			i++;
		}
		int j = 0;
		System.out.println("\n\nIncrementando +1 +2 +3 e assim sucessivamente ");
		for(int i = 1; j < 1000; i++) {
			System.out.print(" " + j);
			j += i;
			
		}	
		
		int linha = 6;

		System.out.println("\n\nQuadrado");
			
		
		for(int i = 0; i < linha; i++) {
			for(int k = 0; k < linha; k++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		
		System.out.println("\n\nQuadrado vazado");
		
		int linhas = 10;
		for(int i = 0; i < linhas; i++)
			for(int k = 0; k < linhas; k++) {
				if(i == 0 || i == (linhas - 1)) {
					System.out.print("* ");
				} else {
					if(k == 0 || k == (linhas - 1)) {
						System.out.print("* ");
					}else {
						if(i == k) {
							System.out.print("* ");
						} else {
							System.out.print(" ");
						}
					}
					
				}
					
			}	
	}
}
