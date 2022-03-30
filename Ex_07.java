package Atividades;

import java.util.Scanner;

public class Ex_07 {

     public static void main(String[] args) {
    	 Scanner ler = new Scanner(System.in);
    	 
    	 
    	 double a, b, c, d, e, soma, valor;
    	 
    	 System.out.printf("Digite o valor do primeiro produto: ");
    	 a = ler.nextDouble();
    	 
    	 System.out.printf("Digite o valor do segundo produto: ");
    	 b = ler.nextDouble();
    	 
    	 System.out.printf("Digite o valor do terceiro produto: ");
    	 c = ler.nextDouble();
    	 
    	 System.out.printf("Digite o valor do quarto produto: ");
    	 d = ler.nextDouble();
    	 
    	 System.out.printf("Digite o valor do quinto produto: ");
    	 e = ler.nextDouble();
    	  
    	 
    	 System.out.printf("Valor de Pagamento: ");
    	 valor = ler.nextDouble();
    	   	     	

          soma = valor - (a + b + c + d + e);
    	 
    	 System.out.printf("Troco: %.2f", soma);
    	 
    	 

     }
}
