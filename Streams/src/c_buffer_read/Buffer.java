package c_buffer_read;
import java.io.*;

public class Buffer {
	private FileReader entry;
	private BufferedReader my_buffer;
	private String line=" ";
	
	public void read () {
		try {
			entry = new FileReader("C:/Users/Gonza/Java_Nan/text/Example.txt");
			my_buffer = new BufferedReader(entry);
			
			do {
				line = my_buffer.readLine();
				if (line != null)
					System.out.println(line);
			}while (line != null);
			
		} catch (IOException e) {
			System.out.println("No se ha encontrado el archivo");
		}
		finally {
			try {
				entry.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
