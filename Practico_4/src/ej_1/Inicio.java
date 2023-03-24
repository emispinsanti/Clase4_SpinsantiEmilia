package ej_1;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		
		Integer [] numeros = new Integer [3];
		Scanner ingreso1 = new Scanner(System.in);
		System.out.println("Ingrese el primer numero");
		numeros[0] = Integer.parseInt(ingreso1.nextLine());
		Scanner ingreso2 = new Scanner(System.in);
		System.out.println("Ingrese el primer numero");
		numeros[1] = Integer.parseInt(ingreso2.nextLine());
		Scanner ingreso3 = new Scanner(System.in);
		System.out.println("Ingrese el primer numero");
		numeros[2] = Integer.parseInt(ingreso3.nextLine());
		
		Scanner letra = new Scanner(System.in);
		System.out.println("Ingrese el orden: \nA (Ascendente) \nD (Descendente)");
		String orden = letra.nextLine();
		
		System.out.println("Ingreso los numeros " +Arrays.toString(numeros)+ " para odenar de manera " +orden.toUpperCase());
		
		if (orden.equalsIgnoreCase("a")) {
			Arrays.sort(numeros);
			System.out.println(Arrays.toString(numeros));
		} else if (orden.equalsIgnoreCase("d")) {
			Arrays.sort(numeros,Collections.reverseOrder());
			System.out.println(Arrays.toString(numeros));
		} else {
			System.out.println("Error!");
		}
	}
}