package Punto1;

import java.util.Scanner;

public class Punto2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
	float a,b,d,c,r;
	
	
	System.out.println("Digite el valor de (a)");
	a = sc.nextInt();
	System.out.println("Digite el valor de (b)");
	b = sc.nextInt();
	System.out.println("Digite el valor de (c)");
	c = sc.nextInt();
	System.out.println("Digite el valor de (d)");
	d = sc.nextInt();
	
	r = ((a+b)/c)*d;
	
	
	System.out.println("el resultado es : " +r++);
	
	
	
	sc.close();
	
	}

}