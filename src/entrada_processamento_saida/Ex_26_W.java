package entrada_processamento_saida;
import java.util.Scanner;
public class Ex_26_W {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int m = 0, a = 0, c = 0;
		

		while (a <= 0) {
			System.out.printf("Digite um valor positivo:");
			a = ler.nextInt();
		}
		
		System.out.printf("Digite o valor de 'b' para calcular a tabuada: ");
		ler.nextInt();
		
		while (c <= a) {
			System.out.printf("Digite o valor de 'c', maior que 'a': ");
			c = ler.nextInt();
		}
		
		while (c >= a) {
			m = a * c;
			System.out.printf("\n %d x %d = %d", a, c, m);
		}
		
				ler.close(); 
	}

}
