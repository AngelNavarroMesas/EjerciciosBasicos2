package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		boolean par;
		
		System.out.println("Introduzca un numero");
		numero = sc.nextInt();
		
		par = numero%2==0;
		
		System.out.println("Es un numero par? "+par);
		
		sc.close();
	}

}
