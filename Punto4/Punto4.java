package Punto1;

import java.util.Scanner;

public class Punto4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
	float a,b,c,x;
	
	
	System.out.println("Digite el valor de (a)");
	a = sc.nextFloat();
	System.out.println("Digite el valor de (b)");
	b = sc.nextFloat();
	System.out.println("Digite el valor de (c)");
	c = sc.nextFloat();
	System.out.println("Digite el valor de (x)");
	x = sc.nextFloat();
	
	
	
	float y = (float) (Math.pow((a*x),2)+(b*x)+c);
	
	System.out.println("y = ("+a+"*"+x+"^2)+("+b+"*"+x+")+("+c+")="+y);
	sc.close();
	
	
	
	sc.close();
	
	}

}