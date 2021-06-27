import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferInputStream {

	public static void main(String[] args) {
		BufferedInputStream stream = null;
		
		try {
			stream =  new BufferedInputStream(new FileInputStream("bufferedfile"));
			int data;
			//int data = stream.read(); // returns ascii value of first char in file
			while((data = stream.read()) != -1) {
				System.out.print((char) data);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				stream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		

	}

}
