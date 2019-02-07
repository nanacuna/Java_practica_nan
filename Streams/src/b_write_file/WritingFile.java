package b_write_file;
import java.io.*;

public class WritingFile {
	private FileWriter writing;
	private String sentence = "Algo Personal";
	
	public void Write () {
		try {
			writing = new FileWriter("C:/Users/Gonza/Java_Nan/text/text_new.txt");
			
			writing.write(sentence);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				writing.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
