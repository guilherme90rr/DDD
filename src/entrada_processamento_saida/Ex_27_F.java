package entrada_processamento_saida;
import java.util.Scanner;
public class Ex_27_F {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int multiplicacao = 0;
		int a;
		
		for(int i = 1; i <= 20; i++) {
			for(a = 1; a <= 10; a++) {
			
			multiplicacao = a * i;
			System.out.printf("\n %d x %d = %d", a, i, multiplicacao);
	   	}
			System.out.printf("\n Pressione enter para exibir a próxima tabuada");
			ler.nextLine();	
			a = 1;
	  }
		System.out.println("Fim!");
			ler.close();
   }
}
