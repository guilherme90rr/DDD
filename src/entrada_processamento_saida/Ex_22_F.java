package entrada_processamento_saida;
import java.util.Scanner;
public class Ex_22_F {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
	int valor_1;
		
		System.out.printf("Digite o primeiro valor: ");
			valor_1 = ler.nextInt();
			
			
	for (int valor_2 = 0; valor_2 < valor_1;) {
		
		System.out.printf("Digite o segundo valor: ");
			valor_2 = ler.nextInt();
	}
		System.out.printf("Segundo valor maior que o primeiro: ");
			
				ler.close();
  }
}
