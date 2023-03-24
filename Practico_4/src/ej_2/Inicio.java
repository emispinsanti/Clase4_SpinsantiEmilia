package ej_2;
import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		String ruta_archivo = "C:\\Users\\Emi\\Carpeta Emi\\Documentos\\Programacion\\JAVA\\Practico\\Practico_4\\ruta\\numeros.txt";
		Scanner ingreso = new Scanner(System.in);
		System.out.println("Que operacion desea realizar? \n1 (Suma) \n2 (Multiplicacion)");
		int operacion = Integer.parseInt(ingreso.nextLine());
		LeerArchivos(ruta_archivo, operacion);
	}
		
	public static void LeerArchivos(String Path, int operacion) {
		int suma = 0;
		int multi = 1;
		String[] array_num= new String [10];
		
		try {
			for (String num_archivo : Files.readAllLines(Paths.get(Path))){
				System.out.println("El archivo contiene los numeros: " + num_archivo);
				array_num = num_archivo.split(" ");                              // convierte el String en un Array. Con un espacio pq estan separados por espacios, toma los numero y desecha los espacios.
			}
			for (int i = 0; i < array_num.length; i++) {
				int numero = Integer.parseInt(array_num[i]);
				if (operacion == 1) {
					suma += numero;
				} else {
					multi *= numero;
				}
			}
				
			if (operacion == 1) {
				System.out.println("La suma de estos numeros es igual a " +suma);
			} else if(operacion == 2)  {
				System.out.println("La multiplicacion de estos numeros es igual a " +multi);
			}else {
				System.out.println("Error!");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
										
	}
		
}
