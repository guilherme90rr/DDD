package entrada_processamento_saida;
import java.util.Scanner;
public class Ex_25_F {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
	
	int m = 0;
	int n = 0;
	
	while(n <=0) {
		System.out.printf("Digite um número positivo: ");
		n = ler.nextInt();
	}
	for (int i = 1; i <=10; i++) {
		m = i * n;
		System.out.printf("\n %d X %d = %d", i, n, m);
		ler.close();
	}
  }
}
