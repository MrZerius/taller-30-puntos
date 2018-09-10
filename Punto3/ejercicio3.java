package ejercicio3;
import java.util.Scanner;

public class ejercicio3 {


	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		float base,altura,area;
		
		

		System.out.println("ingresen la base: ");
		base = sc.nextFloat();
		System.out.println("Ingrese la altura ");
		altura = sc.nextFloat();
		System.out.println("Ingrese el Valor de la Hora: ");
		
		area = (base * altura)/2;
		System.out.println("El area es: "+ area);

		sc.close();


		}

		}