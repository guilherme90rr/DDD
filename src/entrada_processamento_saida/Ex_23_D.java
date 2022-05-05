package entrada_processamento_saida;
import java.util.Scanner;
public class Ex_23_D {

	public static void main(String[] args) {
		// Entrar via teclado com o sexo de determinado usuário
		// onde aceita somente "F" ou "M" com respota válida.
		
		Scanner ler = new Scanner(System.in);
		
		String sexo = "";
		
		do {
		System.out.printf("Digite o seu sexo, para (Feminino) aperte F e para (Masculino) apere M:");
			sexo = ler.next(); }
		
		while (!sexo.equals("M") && !sexo.equals("F"));
			
		System.out.printf("Obrigado pela informação!");
						ler.close();
	}
			
}