package entrada_processamento_saida;
import java.util.Scanner;
public class Ex_21_W {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num ;
		
		System.out.printf("Digite um número positivo: ");
			num = ler.nextInt();
		
		while(num <= 0) {
		System.out.printf("Erro, número negativo! Digite um número positivio: ");
			num = ler.nextInt();
			ler.close();
		}
			System.out.printf("Valor aceito!");
	}
	
	
}
