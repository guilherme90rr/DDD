package entrada_processamento_saida;
import java.util.Scanner;
public class Ex_23_F {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
	for (char sexo = 0; sexo != 'M' && sexo != 'F';) {
		System.out.printf("Informe seu sexo digitando (M ou F):");
		sexo = ler.next().charAt(0);
	}
	System.out.printf("Obrigado pela informação");
			ler.close();
  }
}
