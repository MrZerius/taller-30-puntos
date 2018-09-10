package ejercicio11;

import java.util.Scanner;

public class ejercicio11 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		float A,B,C,D,resultado1,resultado2;
		
		

		System.out.println("ingresen el valor de A: ");
		 A = sc.nextFloat();
		System.out.println("ingresen el valor de B: ");
		 B = sc.nextFloat();
		System.out.println("ingresen el valor de C: ");
		 C = sc.nextFloat();
		System.out.println("ingresen el valor de D: ");
		 D = sc.nextFloat();
		
		 resultado1 = (A/B);
		 resultado2 = (C/D);
		 
		 if(B==0 || D==0){
			 System.out.println("indefinido"); 
		 }else if (resultado1 == resultado2) {			 
			 System.out.println("SI"); 			 
		 }else { 
			 System.out.println("NO"); 
		 }
		 
		 
		
		 

		sc.close();


		}

		}

