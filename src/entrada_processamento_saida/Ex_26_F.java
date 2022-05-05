package entrada_processamento_saida;
import java.util.Scanner;
public class Ex_26_F {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			int m = 0, a = 0, b = 0, c= 0;
			
			while (a <= 0) {
				System.out.printf("Digite um número positivo: ");
				a = ler.nextInt();
			}
			
			System.out.printf("Digite o valor de 'b' para calcular a tabuada: ");
			b = ler.nextInt();
			
			while (c <= b) {
				System.out.printf("Digite o valor de 'c'tem que ser maior que 'b': ");
				c = ler.nextInt();
			}
			
			for(int i = c; i >=b; i--) {
				m = a * i;
				System.out.printf("\n %d x %d = %d", a, i, m);
			}
		}
		
		
	}

}
