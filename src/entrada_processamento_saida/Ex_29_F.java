package entrada_processamento_saida;

public class Ex_29_F {

	public static void main(String[] args) {
		
		int n1 = 1, n2 = 0;

		System.out.println(n1);
		
		for(int i = 0; i <29; i++) {
			n1 = n1 + n2;
			n2 = n1 - n2;
		}
	}
}
