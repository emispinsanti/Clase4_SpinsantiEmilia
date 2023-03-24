package ej_3;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ArcSalida {
	String Txt;
	String Path;

	public ArcSalida(String Texto, String Ruta) {
		this.Txt=Texto;
		this.Path=Ruta;
	} 
	
	public ArcSalida() {}


	public void EscribirArchivos(){
		try {
			Files.writeString(Paths.get(Path), Txt);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
