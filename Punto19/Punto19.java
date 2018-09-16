package Punto19;

import java.util.Scanner;

public class Punto19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		
		double []vector = new double[10];
		
		double  num1 =0, num2 = 0;
		
		int cont =0;
		
		System.out.println("Ingrese 10 numeros: ");
		
		for(int i=0;i<10;i++)
		{
			System.out.print((i+1)+" numero : ");
			
			vector[i] = sc.nextDouble();
			
			if(vector[i] < 0)
			{
				num2 = (num2 + vector[i]);
			}else if(vector[i] == 0)
			{
				cont +=1;
			}else {
				num1 =(num1 + vector[i]);
			}
		}
		System.out.println("La suma de los numeros positivos es : "+num1++);
		System.out.println("La suma de los numeros negativos es :  "+num2++);
		System.out.println("La cantidad de ceros es : "+cont++);
		
		sc.close();
	}

}