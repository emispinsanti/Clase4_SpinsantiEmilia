package ej_2;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class ManejoArchivos {
	String FileName;
	String Path;
	
	public String getFileName() {
		return FileName;
	}
	public void setFileName(String fileName) {
		FileName = fileName;
	}
	
	public String getPath() {
		return Path;
	}
	public void setPath(String path) {
		Path = path;
	}
	
	public void LeerArchivos() 
	{
		try {
			for (String num_archivo : Files.readAllLines(Paths.get(Path))){
				System.out.println("El archivo contiene los numeros: " + num_archivo);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}