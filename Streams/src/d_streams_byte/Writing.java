package d_streams_byte;
import java.io.*;

public class Writing {
	private FileOutputStream write_file;
	public void writeFile(int new_file[]) {
		try {
			write_file = new FileOutputStream("C:/Users/Gonza/Java_Nan/text/CopyGonza.jpg");
			
			for (int i=0; i<new_file.length; i++)
				write_file.write(new_file[i]);
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				write_file.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
