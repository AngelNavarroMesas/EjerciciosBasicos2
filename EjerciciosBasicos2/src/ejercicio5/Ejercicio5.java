package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double tri1, tri2, tri3, calif;
		
		System.out.println("Introduzca las notas del primer trimestre");
		tri1 = sc.nextDouble();
		System.out.println("Introduzca las notas del segundo trimestre");
		tri2 = sc.nextDouble();
		System.out.println("Introduzca las notas del tercer trimestre");
		tri3 = sc.nextDouble();
		
		calif = (tri1+tri2+tri3)/3;
		
		System.out.println("nota calificaciones "+calif);
		System.out.println("nota expediente "+(int)calif);
		
		
		sc.close();
	}

}
