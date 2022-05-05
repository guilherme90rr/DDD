package entrada_processamento_saida;

public class Ex_30_D {

	public static void main(String[] args) {
		
		int n1 =1 , n2 = 1, n3 =1, n4, i=3;
		
		System.out.printf("%d\n%d\n%d", n1, n2, n3);
		
		do {
			System.out.printf("\n");
			n4 = n1 + n2 + n3;
			System.out.printf("%d", n4);
			n1 = n2;
			n2 = n3;
			n3 = n4;
			i++;
		}while (i <=20);	
	}
}
