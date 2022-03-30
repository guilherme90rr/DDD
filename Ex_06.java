package Atividades;

import java.util.Scanner;

public class Ex_06 {

     public static void main(String[] args) {
    	 Scanner ler = new Scanner(System.in);
    	 
    	 
    	 double c, multiplicação;
    	 
    	 System.out.printf("Digite o valor em dólar: ");
    	 c = ler.nextDouble();
    	 
    	 
    	 multiplicação = c / 5.04;
    	 
    	 System.out.printf("Convertido em reias fica: %.2f", multiplicação);
    	 
    	 

     }
}

