package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean lluvia, tareas, biblioteca, salir;
		
		System.out.println("Esta lloviendo?(true o false)");
		lluvia = sc.nextBoolean();
		System.out.println("Has terminado las tareas?(true o false)");
		tareas = sc.nextBoolean();
		System.out.println("Necesitas ir a la biblioteca?(true o false)");
		biblioteca = sc.nextBoolean();
		
		
		salir = lluvia==false&&tareas==true||biblioteca==true;
		
		System.out.println("Permiso para salir: " +salir);
		
		sc.close();
	}

}
