package entrada_processamento_saida;
import java.util.Scanner;
public class Ex_25_W {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int r, i, m;
		
		i = 1;
		
		System.out.printf("Escolha um número para exibir a tabuada: ");
			r = ler.nextInt();
		
		while (r <0) {
			System.out.printf("Digite um número positivo: ");
			r = ler.nextInt();
		}
		
		while (i<=10) {
			m = r * i;
			System.out.printf("\n %d x %d = %d", r, i, m);
			i++;
	}		ler.close();
  }
}