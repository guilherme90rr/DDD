package entrada_processamento_saida;
import java.util.Scanner;
public class Ex_27_D {

	public static void main(String[] args) {
		Scanner capturaTecla = new Scanner(System.in);
		
		int a = 1;
		int b = 1;
		int m = 0;
		
		do {
			do {
				m = b * a;
				System.out.printf("\n %d x %d = %d", b, a, m);
				b++;
				
			} while (b <= 10);
			System.out.printf("\n aperte uma telca para exibir a próxima tabuada");
			capturaTecla.nextLine();
			b = 1;
			a++;
			
		} while (a <= 20);
		
		System.out.println("Acabou!");
		capturaTecla.close();
	}

}