package Punto1;

import java.util.Scanner;

public class Punto10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		

		
		System.out.print("Digite un numero entero ");
		
		int num,res;
		
		System.out.print("Ingrese el numero para hallar su valor absoluto ");
		num = sc.nextInt();
		
		res = num * -1;
		
		System.out.println("El valor absoluto de " +num+ " es: " +res++);
	
	
	
	sc.close();
	
	}

}