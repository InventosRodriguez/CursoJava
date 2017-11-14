package mgt.tercera.clase;

import java.util.Scanner;

public class DameCerveza {

	public int DameCantidad(String tipo) {
		int cantidad = 0;
		System.out.println("¿Cuantas " + tipo + " ¿quieres?");
		Scanner sc = new Scanner(System.in);
		cantidad = sc.nextInt();
		
		return cantidad;
	}
	
}
