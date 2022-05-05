package entrada_processamento_saida;

public class Ex_24_F {

	public static void main(String[] args) {
		// Exibir a tabuada do número cinco no intervalo de um a dez.

		int multiplicacao = 0;
		
		for (int i = 0; i <= 10; i++) {
			multiplicacao = i * 5;
			System.out.printf("\n %d x 5 = %d", i, multiplicacao);
		}	
	}
}
