package Punto17;

import java.util.Scanner;

public class Punto17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	
	int var;
	
	System.out.println("Determinar si el dato ingresado es una vocal o un numero: ");

	System.out.println("Digite un numero o una vocal: ");
	
	var = sc.next().charAt(0);
	
	if(var == 'a' || var == 'e' || var == 'i' || var == 'o' || var == 'u'){
		
		
		
		System.out.println("El dato digitado  es una vocal: ");
		
	}
	else if(var == '0' || var == '1' || var == '2' || var == '3' || var == '4' || var == '5' || var == '6' || var == '7' || var == '8' || var == '9'){
		
		System.out.println("El dato digitado es un numero: ");
	}
	
	
	
	sc.close();
	

}

}