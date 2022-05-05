package entrada_processamento_saida;
import java.util.Scanner;
public class Ex_27_W {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a = 1;
		int b = 1;
		int multiplicacao = 0;
		
		while (a <=20) {
			while (b <=10) {
				multiplicacao = b * a;
				System.out.printf("\n %d x %d = %d", b, a, multiplicacao);
				b++;
			}
				System.out.printf("\n Precione enter para exibir a próxima tabuada");
				ler.nextLine();
				b = 1;
				a++;
		}
		
		System.out.printf("Fim!");
	
		
		ler.close();

	}

}
