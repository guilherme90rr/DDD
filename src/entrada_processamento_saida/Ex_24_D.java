package entrada_processamento_saida;

public class Ex_24_D {

	public static void main(String[] args) {
		// Exibir a tabuada do número cinco no intervalo de um a dez.

		int multiplicacao = 0;
		
		int i = 0;
		
		do {
			multiplicacao = i * 5;
			System.out.printf("\n %d x 5 = %d", i, multiplicacao);
			i++; }
		
		while (i <= 10);
				
	}

}
