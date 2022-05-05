package entrada_processamento_saida;
import java.util.Scanner;
public class Ex_21_F {

	public static void main(String[] args) {
	 Scanner ler = new Scanner(System.in);
		
	 int num ;
	 
	 System.out.printf("Digite um número posisitivo: ");
	 	num = ler.nextInt();
	 	
	 for (int n = 0; num < 0; n++) {
		 System.out.printf("Erro digite um número positivo: ");
		 num = ler.nextInt();
	 }
	 
	 	System.out.printf("Valor aceito!");
	 
	 				ler.close();
  }
}
