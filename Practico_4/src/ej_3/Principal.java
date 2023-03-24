package ej_3;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String PathEntrada="C:\\Users\\Emi\\Carpeta Emi\\Documentos\\Programacion\\JAVA\\Practico\\Practico_4\\ruta\\Entrada.txt";
		String PathCodificado="C:\\Users\\Emi\\Carpeta Emi\\Documentos\\Programacion\\JAVA\\Practico\\Practico_4\\ruta\\codificado.txt";
		String PathSalida="C:\\Users\\Emi\\Carpeta Emi\\Documentos\\Programacion\\JAVA\\Practico\\Practico_4\\ruta\\Salida.txt";
		String OpcCodificar;
		String IngresoTxt;
		int IngresoDesp;
		
		System.out.println("Ingrese: 1 para Codificar | 2 para Decodificar");
		Scanner Lectura1 = new Scanner(System.in); 
		OpcCodificar=Lectura1.nextLine();

		System.out.println("Ingrese Desplazamiento:");
		Scanner Lectura3 = new Scanner(System.in);
		IngresoDesp=Integer.parseInt(Lectura3.nextLine());
		
		switch(OpcCodificar) {
			case "1": 
				System.out.println("Ingrese texto a codificar:");// Interactuo con el usuario y seteo la variable de IngresoTxt
				Scanner Lectura2 = new Scanner(System.in);
				IngresoTxt=Lectura2.nextLine();
				ArcSalida EscriboArchivo=new ArcSalida(IngresoTxt,PathEntrada);// Instancio clase ArcSalida, por medio de uno de sus constructores 
				EscriboArchivo.EscribirArchivos(); // uso el objeto y su metodo para escribir en el archivo de entrada
				DeCodificador ClassCod=new DeCodificador(IngresoTxt,IngresoDesp);
				ArcSalida EscriboArchCod=new ArcSalida(ClassCod.Codificar(),PathCodificado);/*uso el objeto ClassCod y escribo el parametro que devuelve */
				EscriboArchCod.EscribirArchivos();/* en un Archivo Creo otro objeto ArcSalida para escribir en el Archivo Codificado */
			break;
			case "2":
				try {
					ArcEntrada LeoArchivo=new ArcEntrada(PathCodificado);
					DeCodificador ClassDeco=new DeCodificador(LeoArchivo.LeerArchivos(),IngresoDesp);
					ArcSalida EscriboArcDeco=new ArcSalida(ClassDeco.Decodificar(),PathSalida);
					EscriboArcDeco.EscribirArchivos();
					System.out.println("Exito - Se ejecutó correctamente");
				} catch(Exception e){
					System.out.println("Error - Hubo problemas y no se ejecutó correctamente: " + e);
				}
			break;
			default: System.out.println("No existe esa opción");
		}
	}
}