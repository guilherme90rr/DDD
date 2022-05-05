package entrada_processamento_saida;

public class Ex_29_D {

	public static void main(String[] args) {
        
		
		int n1 = 1, n2 = 0, i = 0;
        System.out.println(n1);
        
        
        do{
            n1 = n1 + n2;
            n2 = n1 - n2;
            System.out.println(n1);
            i++;
            
        }while(i < 29);
        
	}
}