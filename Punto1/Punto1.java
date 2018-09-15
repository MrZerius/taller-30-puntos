package Punto1;

import java.util.Scanner;

public class Punto1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
	int num;
	
	
	System.out.println("Digite el numero que desea potenciar");

	System.out.println("Digite el numero: ");
	num = sc.nextInt();
		
	int resultado1 = (int) Math.pow(num, 2);
	int resultado2 = (int) Math.pow(num, 3);
	
	
	System.out.println(num + " al cuadrado " + resultado1 + " al cubo " + resultado2 ++);
	
	
	
	sc.close();
	
	}

}
