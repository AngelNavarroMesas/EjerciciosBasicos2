package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double ventasM, ventasP, manzanas=2.35, peras=1.95;
		
		System.out.println("Introduzca las ventas en kg de manzanas del ultimo semestre");
		ventasM = sc.nextDouble();
		System.out.println("Introduzca las ventas en kg de peras del ultimo semestre");
		ventasP = sc.nextDouble();
		
		ventasM *= manzanas;
		ventasP *= peras;
		
		System.out.println("Se han vendido "+ventasM+"€ de manzanas");
		System.out.println("Se han vendido "+ventasP+"€ de peras");
		System.out.println("Se han ganado "+(ventasP+ventasM)+"€ en total");
		
		sc.close();
	}

}
