package mgt.segunda.clase;

import java.util.Scanner;

public class DameDatos {
	
	public static double DamePeso () {
		double Peso = 0;
		
		System.out.print("Dame Peso:");
		Scanner sc = new Scanner(System.in);
		Peso = sc.nextDouble();
		System.out.println("");
		
		return Peso;
	} 
	
	public static double DameAltura () {
		double Altura = 0;
		
		System.out.print("Dame Altura:");
		Scanner sc = new Scanner(System.in);
		Altura = sc.nextDouble();
		System.out.println("");
		
		return Altura;
	} 
	
	
}
