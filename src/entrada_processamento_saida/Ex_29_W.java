package entrada_processamento_saida;

public class Ex_29_W {

	
		public void main(String[] args) {
	        
		int n1 = 1, n2 = 0, i = 0;
	        
	        System.out.println(n1);
	        
	    while(i < 29){
	            n1 = n1 + n2;
	            n2 = n1 - n2;
	            System.out.println(n1);
	            i++;
        }	        
	}
}
