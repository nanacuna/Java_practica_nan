package a_read_file;
import java.io.*;

public class ReadFile {
	private FileReader input;
	private int c;
	private char letter;
	public void Read () {
		try {
			input = new FileReader("C:/Users/Gonza/Java_Nan/text/Example.txt");
			
			c = input.read();
			while (c != -1) {
				letter = (char) c;
				System.out.print(letter);
				c = input.read();
			}
			
			
			/*
			do {
				c = input.read();
				letter = (char) c;
				System.out.print(letter);
			}while (c != -1);
			*/ 
		} catch (IOException e) {
			System.out.println("No se ha encontrado el archivo");
		}
		finally {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
