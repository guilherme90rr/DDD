package entrada_processamento_saida;
import java.util.Scanner;
public class Ex_25_D {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, r, i = 1;
		
		do {
			System.out.printf("Digite um número positivo: ");
			n = ler.nextInt();
		}
		
		while (n<0);
		
		do {
			r = n * i;
			System.out.printf("\n%d X %d = %d", n, i, r);
			i++;
		} while (i<=10);
			ler.close();
	}

}
