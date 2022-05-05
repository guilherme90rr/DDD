package entrada_processamento_saida;
import java.util.Scanner;
public class Ex_22_W {

	public static void main(String[] args) {
		//Entrar com dois valores, 
		//onde o segundo deverá ser maior que o primeiro.
		
		Scanner ler = new Scanner(System.in);
		
		int Valor_1 = 0 , Valor_2 = 0;
		
	    while (Valor_2 <= Valor_1) {
	    System.out.printf("Digite o primeiro valor: ");
	    	Valor_1 = ler.nextInt();
	    	
	    System.out.printf("Digite o segundo valor: ");
			Valor_2 = ler.nextInt();
	    }			
	    System.out.printf("O segundo valor é maior que o primeiro");		
	    			ler.close();
	}
}
