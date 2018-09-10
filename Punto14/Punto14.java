package Punto14;
import java.util.Scanner;

public class Punto14 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int num,result;
		
		
		System.out.println("Ingrese el dato: ");
		num = sc.nextInt();
		
		if(num > 100) {
			
			result = num + 20;
			System.out.println("resultado "+result++);
			
		} else if(num == 100) {
			
			result = num + 1;
			System.out.println("resultado "+result++);
			
		}else if(num < 100) {
			
			result = num - 20;
			System.out.println("resultado: "+result++);
			
		}
		
		
		
		
		sc.close();
		
		
	}

}
