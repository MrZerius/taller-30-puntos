package Punto5;
import java.util.Scanner;

public class Punto5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int num1,num2,suma,resta,multiplicacion;
		double division;
		
		System.out.println("Ingrese el primer dato: ");
		num1 = sc.nextInt();
		System.out.println("Ingrese el segundo dato: ");
		num2 = sc.nextInt();
		
		suma = num1 + num2 ;
		resta = num1 - num2 ;
		multiplicacion = num1 * num2 ;
		division = num1 / num2;
		
		
		System.out.println("Suma " +num1+ " + " +num2+ " = " +suma++);
		System.out.println("Resta " +num1+ " - " +num2+ " = " +resta++);
		System.out.println("Multiplicacion " +num1+ " * " +num2+ " = " +multiplicacion++);
		
		System.out.println("Division " +num1+ " / " +num2+ " = " +division++);
		
		sc.close();
		
		
	}

}
