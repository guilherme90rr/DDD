package Atividades;

import java.util.Scanner;

public class Ex_09 {

     public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
    	 
    	 
    	 int primeiro, segundo;
    	 
    	 System.out.printf("Digite o primeiro numero: ");
    	 primeiro = ler.nextInt();
    	 
    	 System.out.printf("Digite o segundo : ");
    	 segundo = ler.nextInt();
    	 
    	 if (primeiro<segundo) {
    	    System.out.printf("O numero menor é %d", primeiro);
    	 }else {
    	 
    	
    		 System.out.printf("O numero menor é %d", segundo);
    	 }
    	
   }
}