package Punto7;
import java.util.Scanner;

public class Punto7 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int a,b,c;
		
		
		
		System.out.println("Ingrese el cateto a: ");
		a = sc.nextInt();
		
		System.out.println("Ingrese el cateto b: ");
		b = sc.nextInt();
		

		float res = (float) Math.sqrt((a*a)+(b*b));

		
		System.out.println("La hipotenusa del triangulo es: " +res++);

		sc.close();
		
		
	}

}