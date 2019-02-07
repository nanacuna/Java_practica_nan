package pruebas_2;

import java.io.*;

//Absolute Path || Relative Path

public class DOS {
	public static void main(String[] args) {
		
		File dir = new File("archivos/Agus.html");
		try {
			dir.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		/*
		File f1 = new File(dir, "f1.txt");
		try {
			f1.createNewFile();
		} catch (IOException e) {
			;
		}
		File newDir = new File("newDir");
		dir.renameTo(newDir);
		*/
	}
}
