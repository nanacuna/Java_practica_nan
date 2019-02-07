package d_streams_byte;
import java.io.*;

public class Reading {
	private FileInputStream file_read;
	private boolean final_file = false;
	private int byte_in, counter=0;
	private int[] vec_image = new int[2167751];
			
	public void readFile () {
		try {
			file_read = new FileInputStream("C:/Users/Gonza/Java_Nan/text/Gonza.jpg");
			
			while(!final_file) {
				byte_in = file_read.read();
				
				if (byte_in != -1)
					vec_image[counter] = byte_in;
				else
					final_file = true;
				
				System.out.println(vec_image[counter]);
				counter++;
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				file_read.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("La imagen tiene: "+counter+" bytes");
		
		Writing nan2 = new Writing();
		nan2.writeFile(vec_image);
	}
}
