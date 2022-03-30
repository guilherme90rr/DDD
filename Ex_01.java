package Atividades;

import java.util.Scanner;

public class Ex_01 {

     public static void main(String[] args) {
    	 Scanner ler = new Scanner(System.in);
    	 
    	 int b, h, soma;
    	 
    	 
    	 System.out.printf("Digite a base do retângulo: ");
    	 b = ler.nextInt();
    	 
    	 System.out.printf("Digite o altura do retângulo: ");
    	 h = ler.nextInt();
    	 

    	     	


    	  soma = b * h;
    	 
    	  System.out.printf("A área do retângulo é: %d", soma);
    	 
    	 

     }
}
