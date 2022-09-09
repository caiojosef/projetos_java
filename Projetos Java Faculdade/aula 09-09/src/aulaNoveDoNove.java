
public class aulaNoveDoNove {
	public static void main (String [] args) {
		System.out.println("Contador até 50: ");
		for(int i = 0; i <= 50; i++) {
			System.out.print(" " + i);
		}
		
		System.out.println("\nContador de 50 até 1: ");
		for(int i = 50; i >= 1; i--) {
			System.out.print(" " + i);
		}
		
		System.out.println("\nContador de 3 em 3: ");
		for(int i = 0; i <= 50; i++) {
			System.out.print(" " + i++);
			i++;
		}
		int j = 0;
		System.out.println("\nIncrementando +1 +2 +3 e assim sucessivamente ");
		for(int i = 1; i <= 1000; i++) {
			System.out.print(" " + j);
			j+=i;
			if(j >= 1000)
				break;
		}	
		
		int linha = 4;
		int coluna = 4;
		System.out.println("\nQuadrado");
			
		
		for(int i = 0; i <= linha; i++) {
			System.out.print("*");
			for(int k = 0; k <= coluna; k++) {
				System.out.print("*");
			}
			
		}
			
			
				
		
	}
}
