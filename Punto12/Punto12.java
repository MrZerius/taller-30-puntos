package Punto1;

import java.util.Scanner;

public class Punto12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
double CAT,a,b,c,d,x;
		
		System.out.print("Digite el valor de a ");
		a =sc.nextDouble();
		
		System.out.print("Digite el valor de b");
		b = sc.nextDouble();
		
		System.out.print("Digite el valor de c ");
		c = sc.nextDouble();
		
		System.out.print("Digite el valor de d ");
		d = sc.nextDouble();
		
		System.out.print("Ingrese el valor de x ");
		x = sc.nextDouble();
		
		if(x > 0)
		{
			CAT = (a+b)*(c+d);
		}else if(x == 0)
		{
			CAT = (a+b)/(c+d);
		}else {
			CAT = a+b-c+d;
		}
		System.out.println("El resultado es = "+CAT);
	sc.close();
	
	}

}