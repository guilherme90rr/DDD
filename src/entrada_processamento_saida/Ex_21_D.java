package entrada_processamento_saida;
import java.util.Scanner;
public class Ex_21_D {
	
//21Criar uma rotina de entrada que aceite apenas um valor positivo
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num;
		
		do {  
		System.out.printf("Digite um valor positivo: ");
			num = ler.nextInt();
		
		
	    } while (num <= 0);		
			System.out.printf("valor aceito!");
				ler.close();
					
   }
}

