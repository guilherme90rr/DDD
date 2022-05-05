package entrada_processamento_saida;
import java.util.Scanner;
public class Ex_26_D {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int m = 0, a = 0, b = 0;
		
		do {
			System.out.printf("Digite um número positivo: ");
			a = ler.nextInt();
		} while (a <= 0);
		
		System.out.printf("Digite o número de 'a' para fazer o calculo da tabuada: ");
		a = ler.nextInt();
		
		do {
			System.out.printf("Digite o número de 'b', ele deverá ser maior que 'a': ");
			b = ler.nextInt();
		} while (b <= a);
		
		do {
			m = a * b;
			System.out.printf("\n %d X %d = %d", a, b, m);
			b --;
		} while (b >= a);
			ler.close();			
		
	}
}

