package Punto1;

import java.util.Scanner;

public class Punto8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
	
		
	
	double altura = 1.454 , gravedad = 32;
	
	double resultado;
	
	
	resultado = Math.sqrt(2*gravedad*altura);
	System.out.println(" La velocidad velocidad del impacto es: "+ resultado +" pies/seg 2 ");
	
	
	sc.close();
	
	}

}