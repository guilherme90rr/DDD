package entrada_processamento_saida;
import java.util.Scanner;
public class Ex_22_D {

	public static void main(String[] args) {
		//Entrar com dois valores, 
		//onde o segundo dever? ser maior que o primeiro.
		
		Scanner ler = new Scanner(System.in); {
		
		int Valor_1 , Valor_2;
		
		do {
		System.out.printf("Digite o primeiro valor: ");
			Valor_1 = ler.nextInt();
		
		System.out.printf("Digite o segundo valor: ");
			Valor_2 = ler.nextInt();
		
		} while (Valor_2 <= Valor_1);
			System.out.printf("O segundo valor ? maior que o primeiro!");
						ler.close();
		

	}
  }
}
