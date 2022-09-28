package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int edad;
		boolean mayor;
		
		System.out.println("Introduzca su edad");
		edad = sc.nextInt();
		
		mayor = edad>=18;
		
		System.out.println("Es mayor de edad? "+mayor);
		
		sc.close();
	}

}
