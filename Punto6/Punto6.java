package Punto1;

import java.util.Scanner;

public class Punto6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
	float lado,area;
	
	
	System.out.println("Digite el tamaño de un lado del cuadrado");
	lado = sc.nextInt();
	
	area = lado * lado;

	
	
	System.out.println("El area del cuadrado es : " +area++);
	
	
	
	sc.close();
	
	}

}